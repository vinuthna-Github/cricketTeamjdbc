package com.example.employee.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee>{
    public Employee mapRow(ResultSet rs, int rowNum)throws SQLException{
        return new Employee(rs.getInt("employeeId"), rs.getString("employeeName"),rs.getString("email"),rs.getString("department"));
    }
}