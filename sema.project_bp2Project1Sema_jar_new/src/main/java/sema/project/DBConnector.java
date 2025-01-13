/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sema.project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author semao
 */

public class DBConnector {
    private static final String URL = "jdbc:mysql://localhost:3306/mailsystem";
    private static final String USER = "root";
    private static final String PASSWORD = "Magconboys1+";

    public static Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new SQLException("Database connection error: " + e.getMessage());
        }
    }
}
