package com.springtask.eurekaclien.model;

public class Employee {

    private String empId;
    private String name;
    private String departName;
    private Integer salary;

    public Employee() {
    }

    public Employee(String empId, String name, String departName, Integer salary) {
        this.empId = empId;
        this.name = name;
        this.departName = departName;
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }
}
