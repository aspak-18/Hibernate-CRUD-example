package com.infosys.hibernate_simple_project.controller;

import com.infosys.hibernate_simple_project.dao.EmployeeDao;
import com.infosys.hibernate_simple_project.dto.Employee;

public class DisplayEmployeeController {
    public static void main(String[] args) {
        EmployeeDao dao=new EmployeeDao();
        Employee emp=dao.getEmployeeByIdDao(3);
        if (emp!=null)
            System.out.println(emp);
        else
            System.out.println("Something went wrong!!!! Check your Id");
    }
}
