package com.BridgeLabz.EmployeePayRollApp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDTO {
    private String message;
    private Object data;

    public ResponseDTO(String message,Object data){
        this.message=message;
        this.data=data;
    }
    public ResponseDTO(String deleteEmployeePayrollData,String data,int empId){

    }
}
