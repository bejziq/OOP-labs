package org.example.week3.db;

import java.sql.*;

public class DbConnect {

    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/classicmodels";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "imrbas";

    private Connection connection = null;

    public static void main(String[] args) throws SQLException{
        DbConnect dbConnect = new DbConnect();
        dbConnect.getAllCustomers();
    }

    public DbConnect() {
        try {
            connection = DriverManager.getConnection(
                    CONNECTION_STRING,
                    USERNAME,
                    PASSWORD
            );
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void getAllCustomers() throws SQLException{
        PreparedStatement statement = this.connection.prepareStatement(
                "SELECT * FROM customers"
        );
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("customerNumber"));
            System.out.println(rs.getString("customerName"));
        }
    }

}