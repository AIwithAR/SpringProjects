package com.softwill;

public class Employee {

    private String EmpName;
    //this is test comment
    private String EmpId;
    private String EmpAddress;

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

    public String getEmpAddress(){
        return EmpAddress;
    }

    public void setEmpAddress(String empAddress){
        EmpAddress=empAddress;
    }

    public void init(){
        System.out.println("Bean Initialize");
    }
    public void destroy(){
        System.out.println("Bean Destroyed");
    }
}
