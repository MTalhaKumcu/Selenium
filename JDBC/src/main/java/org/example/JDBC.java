package org.example;

import com.mysql.cj.jdbc.Driver;

import java.sql.DriverManager;

public class JDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    DriverManager.getConnection();



}
