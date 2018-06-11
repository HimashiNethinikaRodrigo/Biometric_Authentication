/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import biometric_authentication_hand.Hand_Detail;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Himashi Nethinika
 */
public class Hand_detail_database {

    public static int addNewUser(Hand_Detail hand_Detail) throws ClassNotFoundException, ClassNotFoundException, ClassNotFoundException, SQLException {
        String query = "insert into User values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getInstance().getConnection();
        int generateId = generateId(conn);
        return DBHandler.setData(query, conn, generateId, hand_Detail.getLength_finger1(), hand_Detail.getLength_finger2(), hand_Detail.getLength_finger3(), hand_Detail.getLength_finger4(), hand_Detail.getLength_finger5(), hand_Detail.getDistal_finger1(), hand_Detail.getDistal_finger2(), hand_Detail.getDistal_finger3(), hand_Detail.getDistal_finger4(), hand_Detail.getDistal_finger5(), hand_Detail.getMiddle_phalanx_finger1(), hand_Detail.getMiddle_phalanx_finger2(), hand_Detail.getMiddle_phalanx_finger3(), hand_Detail.getMiddle_phalanx_finger4(), hand_Detail.getLength1(), hand_Detail.getLength2(), hand_Detail.getUserName());

    }

    public static String searchUser(Hand_Detail hand_Detail) throws SQLException, SQLException, ClassNotFoundException {
        String query = "select username from user where length_finger1=? && length_finger2=? && length_finger3=? && length_finger4=? && length_finger5=? && distal_finger1=? && distal_finger2=? && distal_finger3=? && distal_finger4=? && distal_finger5=? && middle_phalanx_finger1=? && middle_phalanx_finger2=? && middle_phalanx_finger3=? && middle_phalanx_finger4=? && length1=? && length2=?";
        Connection conn = DBConnection.getInstance().getConnection();
        ResultSet rst = DBHandler.getData(query, conn, hand_Detail.getLength_finger1(), hand_Detail.getLength_finger2(), hand_Detail.getLength_finger3(), hand_Detail.getLength_finger4(), hand_Detail.getLength_finger5(), hand_Detail.getDistal_finger1(), hand_Detail.getDistal_finger2(), hand_Detail.getDistal_finger3(), hand_Detail.getDistal_finger4(), hand_Detail.getDistal_finger5(), hand_Detail.getMiddle_phalanx_finger1(), hand_Detail.getMiddle_phalanx_finger2(), hand_Detail.getMiddle_phalanx_finger3(), hand_Detail.getMiddle_phalanx_finger4(), hand_Detail.getLength1(), hand_Detail.getLength2());
        String userName = null;
        if (rst.next()) {
            userName = rst.getString("userName");
        }
        return userName;
    }

    public static int generateId(Connection connection) throws SQLException, ClassNotFoundException {
        String query = "select ID from user order by 1 desc limit 1";
        ResultSet rst = connection.createStatement().executeQuery(query);
        int lastId = 0;
        while (rst.next()) {
            lastId = rst.getInt(1);
        }
        return ++lastId;
    }
}
