package com.BridgeLabz.EmployeePayRollApp.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class EmployeeDTO {

    @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{2,}",message = "enter valid name")
    public String name;
    @Min(value = 5000,message="salary should more than 5000")
    public long salary;


    public EmployeeDTO(String name, long salary){
        this.name=name;
        this.salary=salary;
    }
    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
