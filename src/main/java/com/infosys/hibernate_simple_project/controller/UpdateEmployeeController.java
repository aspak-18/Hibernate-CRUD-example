package com.infosys.hibernate_simple_project.controller;

import com.infosys.hibernate_simple_project.dao.EmployeeDao;
import com.infosys.hibernate_simple_project.dto.Employee;

public class UpdateEmployeeController {
    public static void main(String[] args) {
        EmployeeDao dao=new EmployeeDao();
        Employee emp =dao.updateEmployeeByIdDao(2,"Sukman");
        if (emp!=null){
            System.out.println(emp);
            System.out.println("Data Updated");
        }
        else
            System.out.println("Something went wrong!!!");
    }
}
