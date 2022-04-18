package com.BridgeLabz.EmployeePayRollApp.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;

public class EmployeeDTO {

    @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{2,}",message = "enter valid name")
    public String name;
    @Min(value = 5000,message="salary should more than 5000")
    public long salary;
    public String gender;
    public LocalDate startDate;
    public String note;
    public List<String> department;
    public String profilePic;

    public EmployeeDTO(String name, long salary, String gender, LocalDate startDate, String note, String profilePic, List<String>department){
        this.name=name;
        this.salary=salary;
        this.gender=gender;
        this.startDate=startDate;
        this.note=note;
        this.profilePic=profilePic;
        this.department=department;
    }
    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", startDate='" + startDate + '\'' +
                ", note='" + note + '\'' +
                ", department=" + department +
                ", profilePic='" + profilePic + '\'' +
                '}';
    }
}
