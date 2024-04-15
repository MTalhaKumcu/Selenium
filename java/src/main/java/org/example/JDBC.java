package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {
    public static void main(String[] args) throws ClassNotFoundException {


        Class.forName("com.mysql.cj.jdbc,Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "Admin");

        String query = "SELECT userlastname FROM users";

    }

}
