package com.adwait.project.employeeservice.service;

import com.adwait.project.employeeservice.dto.*;

public interface EmployeeService {

    public EmployeeDto saveEmployee(EmployeeDto employeeDto);

    public APIResponseDto getEmployeeById(Long employeeId);

}