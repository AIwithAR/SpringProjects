package com.softwill;

public class Employee {

    private String EmpName;

    private String EmpId;

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getEmpId() {
        return EmpId;
    }

    public void setEmpId(String empId) {
        EmpId = empId;
    }

    public void init(){
        System.out.println("Bean Initialize");
    }
    public void destroy(){
        System.out.println("Bean Destroyed");
    }
}
