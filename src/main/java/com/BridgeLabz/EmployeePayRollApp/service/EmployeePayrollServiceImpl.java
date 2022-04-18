package com.BridgeLabz.EmployeePayRollApp.service;

import com.BridgeLabz.EmployeePayRollApp.dto.EmployeeDTO;
import com.BridgeLabz.EmployeePayRollApp.dto.ResponseDTO;
import com.BridgeLabz.EmployeePayRollApp.entity.Employee;
import com.BridgeLabz.EmployeePayRollApp.exception.EmployeePayrollException;
import com.BridgeLabz.EmployeePayRollApp.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class EmployeePayrollServiceImpl implements EmployeePayrollService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployeePayrollData() {
        //List<Employee> employeeList=new ArrayList<>();
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeePayrollDataById(long empId) {
        return employeeRepository.findById(empId)
                .orElseThrow(()->new EmployeePayrollException("Employee with this ID doesn't exist"));
    }

    @Override
    public Employee createEmployeePayrollData(EmployeeDTO employeeDTO) {
        Employee employee=null;
        employee=new Employee(employeeDTO);
         log.debug("Employee data :"+employee.toString());
         return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployeePayrollData(int empId,EmployeeDTO employeeDTO) {
        Employee employee=this.getEmployeePayrollDataById(empId);
        employee.updateEmployeePayrollData(employeeDTO);
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        Employee employee=this.getEmployeePayrollDataById(empId);
        employeeRepository.delete(employee);
    }
}
