package com.example;

public class EnvVariablesPrinter {

    public static void printEnvVariables() {
        String dbName = System.getenv("DB_NAME");
        String dbUser = System.getenv("DB_USER");
        String dbPwd = System.getenv("DB_PWD");
        String dbServer = System.getenv("DB_SERVER");

//        System.out.println("DB_NAME: " + dbName);
//        System.out.println("DB_USER: " + dbUser);
//        System.out.println("DB_PWD: " + dbPwd);
//        System.out.println("DB_SERVER: " + dbServer);
    }
}

