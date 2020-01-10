package ru.actions.rolesAction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteUser {
    private static final String DELETE_TBUSER =
            "DELETE FROM isod.tbuser WHERE user_id='41';";
    private static final String DELETE_TBEMPLOYEE =
            "DELETE FROM isod.tbemployee WHERE user_id='41';";
    private static final String DELETE_TBUSER_ROLE =
            "DELETE from isod.tbuser_role Where user_id='41';";
    private static final String DELETE_TBEBPLOYEE_HISTORY = "DELETE FROM isod.tbemployee_history WHERE user_id='41';";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(ConnectionData.URL, ConnectionData.USER, ConnectionData.PASSWORD);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(DELETE_TBEMPLOYEE);
            statement.executeUpdate(DELETE_TBUSER);
            statement.executeUpdate(DELETE_TBUSER_ROLE);
            statement.executeUpdate(DELETE_TBEBPLOYEE_HISTORY);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

