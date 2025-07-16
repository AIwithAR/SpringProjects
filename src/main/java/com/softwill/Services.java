package com.softwill;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Services {

    public static void main(String[] args) {

        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Employee employee=(Employee) applicationContext.getBean("emp");
        employee.setEmpId("101");
        employee.setEmpName("Rushi");


        System.out.println("EmployeeName "+employee.getEmpName()+"\n Employee Id "+employee.getEmpId());
    }
}
