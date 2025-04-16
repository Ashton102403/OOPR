package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class InsertUserToDatabase {
    public static Connection LocalDatabaseConnect() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ToDoList";
        String username = "root";
        String password = "";

        return DriverManager.getConnection(url, username, password);
    }

    public static boolean InsertUserData(String username, String password) {
        String insertSQL = "INSERT INTO users (username, password) VALUES (?, ?);";

        try (Connection connect = LocalDatabaseConnect();
            PreparedStatement query = connect.prepareStatement(insertSQL)) {

            query.setString(1, username);
            query.setString(2, password);

            int rowsAffected = query.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            if (e.getSQLState().equals("23000")) {
                System.out.println("Username already exists. Please choose a different username.");
            } else {
                e.printStackTrace();
            }
            return false;
        }
    }

    public static boolean checkCredentials(String username, String password) {
        String selectSQL = "SELECT * FROM users WHERE username = ? AND password = ?;";

        try (Connection connect = LocalDatabaseConnect();
             PreparedStatement query = connect.prepareStatement(selectSQL)) {

            query.setString(1, username);
            query.setString(2, password);

            try (ResultSet resultSet = query.executeQuery()) {
                return resultSet.next();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
}