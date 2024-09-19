package com.infosys.hibernate_simple_project.controller;

import com.infosys.hibernate_simple_project.dao.EmployeeDao;
import com.infosys.hibernate_simple_project.dto.Employee;

public class EmployeeInsertController {
    public static void main(String[] args) {
        EmployeeDao dao=new EmployeeDao();
        Employee employee=new Employee(4,"Saran","sar@gmail.com",158494);
        Employee emp=dao.saveEmployeeDao(employee);
        if (emp!=null){
            System.out.println(emp);
            System.out.println("Data inserted");
        }
        else
            System.out.println("Something went wrong!!");
    }
}
