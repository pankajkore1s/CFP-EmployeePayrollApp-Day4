package com.BridgeLabz.EmployeePayRollApp.controller;

import com.BridgeLabz.EmployeePayRollApp.dto.EmployeeDTO;
import com.BridgeLabz.EmployeePayRollApp.dto.ResponseDTO;
import com.BridgeLabz.EmployeePayRollApp.entity.Employee;
import com.BridgeLabz.EmployeePayRollApp.service.EmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private EmployeePayrollService employeePayrollService;
    @RequestMapping(value={"","/","/get"})
    public  ResponseEntity<ResponseDTO> getEmployeePayrollData(){
        List<Employee> employeeList=null;
        employeeList=employeePayrollService.getEmployeePayrollData();
        ResponseDTO responseDTO=new ResponseDTO("get call success",employeeList);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollDataById(@PathVariable("empId") int empId){
        Employee employee=null;
        employee=employeePayrollService.getEmployeePayrollDataById(empId);
        ResponseDTO responseDTO=new ResponseDTO("get call success for id",employee);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK );
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createEmployeeData(@Valid @RequestBody EmployeeDTO employeeDTO){
        Employee employee=null;
        employee=employeePayrollService.createEmployeePayrollData(employeeDTO);
        ResponseDTO responseDTO=new ResponseDTO("create employee data for id : ",employee);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateEmployeeData(@Valid @RequestBody int empId,EmployeeDTO employeeDTO){
        Employee employee=null;
        employee=employeePayrollService.updateEmployeePayrollData(empId,employeeDTO);
        ResponseDTO responseDTO=new ResponseDTO("updated employeePayroll successfully",employee);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @DeleteMapping("/deleteemployee/{empId}")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId") int empId){
        employeePayrollService.deleteEmployeePayrollData(empId);
        ResponseDTO responseDTO= new ResponseDTO("deleted successfully ","deleted id: "+empId);
        return new ResponseEntity<>("Delete call success for Id: "+ empId,HttpStatus.OK);
    }
}
