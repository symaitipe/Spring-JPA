package com.sahan.spring_jpa_example.database;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DBConnection {

    private static DBConnection dbConnection = null;
    private Connection connection = null;


    public DBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "symSQL");
            System.out.print("connected");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Connection Failed..." + ex);
        }

    }


    public static DBConnection getConnectionObj() {

        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

    public Connection getConnection(){
        return connection;
    }
}