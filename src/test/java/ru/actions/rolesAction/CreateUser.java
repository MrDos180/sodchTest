package ru.actions.rolesAction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateUser {
        private static final String Insert_Tbuser =
                "INSERT INTO isod.tbuser(user_id,login,password,create_date,modify_date,last_updator,status)\n" +
                        "VALUES ('41','usertest','usertest',NOW(),NOW(),'isod','1');";
        private static final String Insert_Tbemployee =
                "INSERT INTO isod.tbemployee (employee_id,last_name,first_name,middle_name,date_of_birth,email,phone,user_id,department_id,\n" +
                        "                             job_position_id,create_date,modify_date,last_updator,active,temp,rank_id)\n" +
                        " VALUES ('99','Скриптовый','Скрипт','Скриптович','1972-02-01','sc@script.com','+79999999999','41','-770000','-115075',NOW(),NOW(),'isod','1','0','-54')";
        private static final String Insert_Tbuser_Role =
                "INSERT INTO isod.tbuser_role (user_id,role_id) VALUES ('41','-13');";


        //todo очень много мейнов создал. они не нужны. это точки входа программы. при запуске через мавен ты споткнешься больно.
        public static void main(String[] args) {
            try (Connection connection = DriverManager.getConnection(ConnectionData.URL, ConnectionData.USER, ConnectionData.PASSWORD);
                 Statement statement = connection.createStatement()) {
                statement.executeUpdate(Insert_Tbemployee);
                statement.executeUpdate(Insert_Tbuser);
                statement.executeUpdate(Insert_Tbuser_Role);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

