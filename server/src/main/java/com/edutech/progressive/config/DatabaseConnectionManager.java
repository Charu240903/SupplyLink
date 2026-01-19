// package com.edutech.progressive.config;

// import java.io.FileInputStream;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.util.Properties;

// public class DatabaseConnectionManager {
//     private static Properties properties = new Properties();

//     public static void loadProperties() {
//         try (FileInputStream fs = new FileInputStream("src/main/resources/application.properties")) {
//             properties.load(fs);
//         } catch (Exception e) {
//             throw new RuntimeException("properties file not found or cannot be read", e);
//         }

//     }

//     public static Connection getConnection() {
//         try {
//             if (properties.isEmpty()) {
//                 loadProperties();
//             }
//             String url = properties.getProperty("spring.datasource.url");
//             String user = properties.getProperty("spring.datasource.username");
//             String pass = properties.getProperty("spring.datasource.password");
//             String driverClass = properties.getProperty("spring.datasource.driver-class-name");

//             Class.forName(driverClass);
//             return DriverManager.getConnection(url, user, pass);

//         } catch (Exception e) {
//             throw new RuntimeException("Failed to create DB Connection", e);
//         }
//     }

// }

package com.edutech.progressive.config;

import java.io.IOException;

import java.io.InputStream;

import java.util.Objects;

import java.util.Properties;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.util.Objects;

public class DatabaseConnectionManager {

    private static final Properties properties = new Properties();

    static {

        loadProperties();

    }

    private static void loadProperties() {

        try (InputStream input = DatabaseConnectionManager.class.getClassLoader()
                .getResourceAsStream("application.properties")) {

            if (input == null) {

                throw new IllegalStateException("resource.properties not found in classpath");

            }

            properties.load(input);

        } catch (IOException e) {

            throw new RuntimeException("Error loading properties file", e);

        }

    }

    public static Connection getConnection() throws SQLException {

        String url = properties.getProperty("spring.datasource.url");

        String user = properties.getProperty("spring.datasource.username");

        String password = properties.getProperty("spring.datasource.password");

        return DriverManager.getConnection(url, user, password);

    }

}
