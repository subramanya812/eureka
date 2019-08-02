package com.springtask.eurekaclien.services;


import com.springtask.eurekaclien.exception.DepartmentNameNotFoundException;
import com.springtask.eurekaclien.model.Employee;
import com.springtask.eurekaclien.payload.EmployeeRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeServices {

    private List<Employee> employeeList=new ArrayList<>(Arrays.asList(
            new Employee("S01","subramanya L","apple-ocd",10000)
    ));


    public List<Employee> getEmployeeList(){
        return employeeList;
    }

    public Employee getEmployee(String id){
        return employeeList.stream().filter(t->t.getEmpId().equals(id)).findFirst().get();
    }

    public void addEmployee(EmployeeRequest employeeRequest){

        if(employeeRequest == null){

            throw new DepartmentNameNotFoundException("not found");
        }
        Employee employee=new Employee();
        System.out.println(employeeRequest.getEmpId());
        employee.setEmpId(employeeRequest.getEmpId());
        employee.setName(employeeRequest.getDepartName());
        employee.setDepartName(employeeRequest.getDepartName());
        employee.setSalary(employeeRequest.getSalary());
        employeeList.add(employee);
    }

}
