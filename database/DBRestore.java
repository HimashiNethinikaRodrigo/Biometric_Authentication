/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.io.IOException;

/**
 *
 * @author Himashi Nethinika
 */
public class DBRestore {
    public static int restoreDatabase(String password) throws IOException, InterruptedException {
        String dbName = "mysql";
        String dbUserName = "root";
        String dbPassword =password;
        String path="./src/database/database.sql";
        String[] executeCmd = new String[]{"mysql", "--user=" + dbUserName, "--password=" + dbPassword, dbName, "-e", " source " + path};
        Process runtimeProcess = Runtime.getRuntime().exec(executeCmd);

        int processComplete = runtimeProcess.waitFor();

        if (processComplete == 0) {
            System.out.println("Restore Complete");
        } else {
            System.out.println("Restore Failed");
        }
        return processComplete;
    }
}
