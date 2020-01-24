package ru.actions.rolesAction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteUser {
    private static final String Delete_Tbuser  =
            "DELETE FROM isod.tbuser WHERE user_id='41';";
    private static final String Delete_Tbemployee =
            "DELETE FROM isod.tbemployee WHERE user_id='41';";
    private static final String Delete_Tbuser_Role =
            "DELETE from isod.tbuser_role Where user_id='41';";
    private static final String Delete_Tbemployee_History = "DELETE FROM isod.tbemployee_history WHERE user_id='41';";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(ConnectionData.URL, ConnectionData.USER, ConnectionData.PASSWORD);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(Delete_Tbemployee);
            statement.executeUpdate(Delete_Tbuser);
            statement.executeUpdate(Delete_Tbuser_Role);
            statement.executeUpdate(Delete_Tbemployee_History);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

