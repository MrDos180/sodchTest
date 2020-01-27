package ru.actions.rolesAction;



//todo это нужно выносить в проперти файлы, а не в классы
public class ConnectionData {
    public static final String DRIVER = "org.postgresql.Driver";
    public static final String DB = "test1";
    public static final String URL = "jdbc:postgresql://192.168.238.67:5432/" + DB;
    public static final String USER = "isod";
    public static final String PASSWORD = "qwerty";
}
