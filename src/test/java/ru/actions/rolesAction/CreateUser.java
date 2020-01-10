package ru.actions.rolesAction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateUser {
        private static final String INSERT_TBUSER =
                "INSERT INTO isod.tbuser(user_id,login,password,create_date,modify_date,last_updator,status)\n" +
                        "VALUES ('41','usertest','usertest',NOW(),NOW(),'isod','1');";
        private static final String INSERT_TBEMPLOYEE =
                "INSERT INTO isod.tbemployee (employee_id,last_name,first_name,middle_name,date_of_birth,email,phone,user_id,department_id,\n" +
                        "                             job_position_id,create_date,modify_date,last_updator,active,temp)\n" +
                        " VALUES ('99','Скриптовый','Скрипт','Скриптович','1972-02-01','sc@script.com','+79999999999','41','-770000','-115075',NOW(),NOW(),'isod','1','0')";
        private static final String INSERT_TBUSER_ROLE =
                "INSERT INTO isod.tbuser_role (user_id,role_id) VALUES ('41','-13');";

        public static void main(String[] args) {
            try (Connection connection = DriverManager.getConnection(ConnectionData.URL, ConnectionData.USER, ConnectionData.PASSWORD);
                 Statement statement = connection.createStatement()) {
                statement.executeUpdate(INSERT_TBEMPLOYEE);
                statement.executeUpdate(INSERT_TBUSER);
                statement.executeUpdate(INSERT_TBUSER_ROLE);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

