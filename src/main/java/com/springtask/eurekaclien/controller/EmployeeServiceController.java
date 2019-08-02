package com.springtask.eurekaclien.controller;


import com.springtask.eurekaclien.exception.DepartmentNameNotFoundException;
import com.springtask.eurekaclien.model.Employee;
import com.springtask.eurekaclien.payload.EmployeeRequest;
import com.springtask.eurekaclien.services.EmployeeServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeServiceController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceController.class);

    @Autowired
    private EmployeeServices employeeServices;

    @GetMapping("/getEmployeeDetailsfordepartment/{id}")
    public Employee getEmployees(@PathVariable String id){

        if(id.equals("") || !id.startsWith("S")){
            String message = String.format("empty department name");
            throw new DepartmentNameNotFoundException(message);
        }
        return employeeServices.getEmployee(id);

    }

    @GetMapping("/getEmployeeDetails")
    public List<Employee> getEmployeeList(){
        return employeeServices.getEmployeeList();
    }

    @PostMapping("/addEmployees")
    public ResponseEntity<?> addEmployee(@RequestBody EmployeeRequest employeeRequest){
        if(employeeRequest == null) {
            throw new DepartmentNameNotFoundException("not found");
        }
        logger.debug("Data {}", employeeRequest.getEmpId());
        employeeServices.addEmployee(employeeRequest);
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.add("heades","controllerService");
        return new ResponseEntity(httpHeaders,HttpStatus.CREATED);
    }

}
