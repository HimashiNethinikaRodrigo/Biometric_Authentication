/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import database.DBHandler;
import database.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Himashi Nethinika
 */
public class DatabaseController {
    public static String[] getAllDatabases() throws ClassNotFoundException, SQLException {
        String sql = "Show databases ";
        ResultSet rst = DBHandler.getData(sql, DBConnection.getNewInstance().getNewConnection());
        int size = 0;
        while (rst.next()) {
            size++;
        }

        String[] dbList = new String[size];
        rst.beforeFirst();
        for (int i = 0; rst.next(); i++) {
            dbList[i] = rst.getString("Database");
            System.out.println(dbList[i]);
        }
        return dbList;
    }
}
