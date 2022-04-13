package com.BridgeLabz.EmployeePayRollApp.entity;

import com.BridgeLabz.EmployeePayRollApp.dto.EmployeeDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

    public long id;
    public String name;
    public long salary;

    public Employee(long id, EmployeeDTO employeeDTO) {
        this.id = id;
        this.name = employeeDTO.name;
        this.salary = employeeDTO.salary;
    }
}
