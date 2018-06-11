/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Himashi Nethinika
 */
public class DBHandler {
  public static  int setData(String query, Connection connection,Object... ob) throws SQLException{
        PreparedStatement prepareStatement = connection.prepareStatement(query);
        for (int i = 0; i < ob.length; i++) {
            prepareStatement.setObject(i+1, ob[i]);
        }
        return prepareStatement.executeUpdate();
   }
   public static  ResultSet getData(String query, Connection connection,Object... ob) throws SQLException{
      PreparedStatement prepareStatement = connection.prepareStatement(query);
      for (int i = 0; i < ob.length; i++) {
            prepareStatement.setObject(i+1, ob[i]);
      }
      return prepareStatement.executeQuery();
   }   
}
