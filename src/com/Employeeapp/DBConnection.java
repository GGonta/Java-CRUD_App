package com.Employeeapp;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static Connection con;

    public static Connection createDBConnection() {

        //load driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //get connection
            String url = "jdbc:mysql://localhost:3306/employeedb?useSSL=false";
            String username = "root";
            String password = "1234";
            con = DriverManager.getConnection(url, username, password);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return con;
    }
}
