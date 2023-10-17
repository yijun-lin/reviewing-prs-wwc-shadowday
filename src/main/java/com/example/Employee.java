package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employee {
    private String employeeId;
    private String name;
    private String position;
    private double salary;

    public Employee(String employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void promoteEmployee(String newPosition, double newSalary) {
        this.position = newPosition;
        this.salary = newSalary;
    }

    public double calculateYearlySalary() {
        return this.salary * 12;
    }

    public void saveEmployee() {
        String databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        String sqlQuery = "INSERT INTO employees (employeeId, name, position, salary) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(databaseUrl, "user", "password");
             PreparedStatement ps = conn.prepareStatement(sqlQuery)) {

            ps.setString(1, this.employeeId);
            ps.setString(2, this.name);
            ps.setString(3, this.position);
            ps.setDouble(4, this.salary);

            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
