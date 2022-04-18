package com.BridgeLabz.EmployeePayRollApp.service;

import com.BridgeLabz.EmployeePayRollApp.dto.EmployeeDTO;
import com.BridgeLabz.EmployeePayRollApp.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public interface EmployeePayrollService {

  List<Employee> getEmployeePayrollData();

  Employee getEmployeePayrollDataById(long empId);

  Employee createEmployeePayrollData(EmployeeDTO responseDTO);

  Employee updateEmployeePayrollData(int empId,EmployeeDTO employeeDTO);

  void deleteEmployeePayrollData(int empId);
}
