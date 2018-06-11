/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.security.Security;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Himashi Nethinika
 */
public class DBConnection {
    private Connection conn;
    private Connection conn1;
    private static DBConnection dbconnection;
    private static DBConnection dbconnection1;
    static String  password; 
    static String driver;

    public DBConnection(String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/biometric", "root", password);

    }

    public DBConnection(String password,String driver1) throws ClassNotFoundException, SQLException {
        
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("pwww : "+password);
            conn1 = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root", password);
            this.password = password;
        
    }  

    public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
        if (dbconnection == null) {
            dbconnection = new DBConnection(password);
        }
        return dbconnection;

    }
    
    public static DBConnection getNewInstance() throws ClassNotFoundException, SQLException {
        if (dbconnection1 == null) {
            dbconnection1 = new DBConnection(password,driver);
        }
        return dbconnection1;

    }
    
    public Connection getConnection() {
        return conn;

    }
    
    public Connection getNewConnection() {
        return conn1;

    }
}
