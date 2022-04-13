package com.BridgeLabz.EmployeePayRollApp.service;

import com.BridgeLabz.EmployeePayRollApp.dto.EmployeeDTO;
import com.BridgeLabz.EmployeePayRollApp.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollServiceImpl implements EmployeePayrollService{

    private List<Employee> employeeList=new ArrayList<>();

    @Override
    public List<Employee> getEmployeePayrollData() {
        return employeeList;
    }

    @Override
    public Employee getEmployeePayrollDataById(int empId) {
        return employeeList.get(empId-1);
    }

    @Override
    public Employee createEmployeePayrollData(EmployeeDTO employeeDTO) {
         Employee employee=null;
         employee=new Employee(employeeList.size()+1,employeeDTO);
         employeeList.add(employee);
         return employee;
    }

    @Override
    public Employee updateEmployeePayrollData(int empId,EmployeeDTO employeeDTO) {
        Employee employee=this.getEmployeePayrollDataById(empId);
        employee.setName(employeeDTO.name);
        employee.setSalary(employeeDTO.salary);
        return employee;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        employeeList.remove(empId-1);
    }
}
