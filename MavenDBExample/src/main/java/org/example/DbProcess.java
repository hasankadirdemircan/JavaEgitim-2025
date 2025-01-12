package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbProcess {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/test";
        String username = "postgres";
        String password = "123456";
       // insert(jdbcUrl, username, password);
      //  delete(jdbcUrl, username, password, "audi");
       // update(jdbcUrl, username, password, "bmw", "m3", 2020, "black");
        //selectALL(jdbcUrl, username, password);
      //  selectWithCondition(jdbcUrl, username, password, "ford");
    }

    private static void selectWithCondition(String jdbcUrl, String username, String password, String brand) {
        try(Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String selectWithCondition = "SELECT * FROM cars WHERE brand = ?";
            PreparedStatement selectWithConditionStatement = connection.prepareStatement(selectWithCondition);
            selectWithConditionStatement.setString(1, brand);
            ResultSet resultSet = selectWithConditionStatement.executeQuery();
            while(resultSet.next()) {
                String sqlBrand = resultSet.getString("brand");
                String model = resultSet.getString("model");
                int year = resultSet.getInt("year");
                String color = resultSet.getString("color");
                System.out.println("Brand is : " + sqlBrand + "\nModel is : " + model + "\nYear is : " + year + "\nColor is : " + color);
                System.out.println("--------");
            }
        }catch (SQLException e) {
            System.out.println("exception : " + e);
        }
    }
    private static void selectALL(String jdbcUrl, String username, String password) {
        try(Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String selectAllSQL = "SELECT * FROM cars";
            PreparedStatement selectAllPreparedStatement = connection.prepareStatement(selectAllSQL);
            ResultSet resultSet = selectAllPreparedStatement.executeQuery();
            while(resultSet.next()) {
                String brand = resultSet.getString("brand");
                String model = resultSet.getString("model");
                int year = resultSet.getInt("year");
                String color = resultSet.getString("color");
                System.out.println("Brand is : " + brand + "\nModel is : " + model + "\nYear is : " + year + "\nColor is : " + color);
                System.out.println("--------");
            }
        }catch (SQLException e) {
            System.out.println("exception : " + e);
        }
    }

    private static void update(String jdbcUrl, String username, String password, String brand, String model, int updatedYear, String updatedColor) {
        try(Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String updateSQL = "UPDATE cars SET year = ? , color = ? WHERE brand = ? AND model = ?";
            PreparedStatement updateStatement = connection.prepareStatement(updateSQL);
            updateStatement.setInt(1, updatedYear);
            updateStatement.setString(2, updatedColor);
            updateStatement.setString(3, brand);
            updateStatement.setString(4, model);
            int affectedRow = updateStatement.executeUpdate();
            System.out.println("UPDATE affected row count is : " + affectedRow);
        }catch (SQLException e) {
            System.out.println("exception : " + e);
        }
    }

    private static void delete(String jdbcUrl, String username, String password, String brand) {
        try(Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String deleteSQL = "DELETE FROM cars WHERE brand = ? AND model is null";
            PreparedStatement deleteStatement = connection.prepareStatement(deleteSQL);
            deleteStatement.setString(1, brand);
            int affectedRow = deleteStatement.executeUpdate();
            System.out.println("DELETE affected row count is : " + affectedRow);
        }catch (SQLException e) {
            System.out.println("exception : " + e);
        }
    }
    private static void insert(String jdbcUrl, String username, String password) {
        try(Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String insertSQL = "INSERT INTO cars (brand, model, year, color) VALUES (?, ?, ?, ?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertSQL);
            insertStatement.setString(1, "bmw");
            insertStatement.setString(2, "m3");
            insertStatement.setInt(3, 2025);
            insertStatement.setString(4, "white");
            int affectedRow = insertStatement.executeUpdate();
            System.out.println("INSERT affected row count is : " + affectedRow);
        }catch (SQLException e) {
            System.out.println("exception : " + e);
        }
    }
}