package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class EmployeeTest {

    @Mock
    Connection mockConnection;

    @Mock
    PreparedStatement mockStatement;

    private Employee employee;

    @BeforeEach
    public void setUp() {
        employee = new Employee("E001", "John", "Developer", 5000);
    }

    @Test
    public void testPromoteEmployee() {
        employee.promoteEmployee("Senior Developer", 7500);
        assertEquals("Senior Developer", employee.getPosition());
        assertEquals(7500, employee.getSalary(), 0.001);
    }

    @Test
    public void testCalculateYearlySalary() {
        assertEquals(60000, employee.calculateYearlySalary(), 0.001);
    }

    @Test
    public void testSaveEmployee() throws SQLException {
        when(mockConnection.prepareStatement(any(String.class))).thenReturn(mockStatement);
        when(mockStatement.executeUpdate()).thenReturn(1);

        employee.saveEmployee();

        verify(mockStatement).setString(1, employee.getEmployeeId());
        verify(mockStatement).setString(2, employee.getName());
        verify(mockStatement).setString(3, employee.getPosition());
        verify(mockStatement).setDouble(4, employee.getSalary());
        verify(mockStatement).executeUpdate();
    }
}
