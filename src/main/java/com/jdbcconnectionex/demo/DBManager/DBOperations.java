package com.jdbcconnectionex.demo.DBManager;

import java.sql.*;
import java.util.List;
import com.jdbcconnectionex.demo.DAOs.Person;
import com.jdbcconnectionex.demo.Requests.CreateRequest;

public class DBOperations {

    public static boolean isConnected = false;
    public static volatile Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection != null) {
            synchronized (DBOperations.class) {
                if (connection != null) {
                    connection = DriverManager.getConnection("jdbc:mysql://kjgw349856fklg.mysql.database.azure.com:3306/mysql", "gokul@kjgw349856fklg", "Password@123");
                    isConnected = true;
                }
            }
        }
        return connection;
    }

    public static void closeConnection() throws SQLException {
        if (connection != null) {
            synchronized (DBOperations.class) {
                if (connection != null) {
                    connection.close();
                }
            }
        }
    }

    public static void createTable(String name) throws SQLException {

        getConnection();
        System.out.println("DB Connection: " + isConnected);
        Statement statement = connection.createStatement();
        boolean isCreated = statement.execute("CREATE TABLE" + name + "(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR (20), age INT, address VARCHAR(50))");
        System.out.println("Test" + isCreated);
        if(isCreated) {
            System.out.println("table " + name + " is successfully created.");
        }

        closeConnection();
    }



    public static Person createPerson(CreateRequest request) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO person VALUES (null, ?, ?, ?)");
        preparedStatement.setString(1, request.getName());
        preparedStatement.setInt(2, request.getAge());
        preparedStatement.setString(3, request.getAddress());

        int rows_affected = preparedStatement.executeUpdate();
        System.out.println("rows_affected : " + rows_affected);

        return null;
    }

    public Person getPersonById() {
        return null;
    }

    public static List<Person> getPersons() {
        return null;
    }

    public static void deletePerson(int id) {

    }

    public static void updatePerson(Person person) {

    }
}
