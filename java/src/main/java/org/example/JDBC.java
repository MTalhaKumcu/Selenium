package org.example;

import java.sql.*;

public class JDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1.STEP
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.STEP have to
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "Admin");
        //3.STEP have to
        String query = "SELECT * FROM users";

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        //4.STEP have to
        ResultSet resultSet = statement.executeQuery(query);
        //5.STEP
        resultSet.next();//Iterator

        System.out.println(resultSet.getString("username"));
        //John
        resultSet.next();
        System.out.println(resultSet.getString("username"));
        //John
        //Jane
        resultSet.next();
        System.out.println(resultSet.getString("email"));
        //John
        //Jane
        //alice.smith@example.com
        resultSet.absolute(6);
        System.out.println(resultSet.getString("email"));
        //John
        //Jane
        //alice.smith@example.com
        //michael.wilson@example.com

        resultSet.first();
        System.out.println(resultSet.getString("userlastname"));

        resultSet.first();
        System.out.println(resultSet.getInt("user_id"));
    }

}
