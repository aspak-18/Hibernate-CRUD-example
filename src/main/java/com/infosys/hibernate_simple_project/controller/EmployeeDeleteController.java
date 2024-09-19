package com.infosys.hibernate_simple_project.controller;

import com.infosys.hibernate_simple_project.dao.EmployeeDao;

public class EmployeeDeleteController {
    public static void main(String[] args) {
        EmployeeDao dao=new EmployeeDao();
        boolean b=dao.deleteEmployeeByIdDao(4);
        if (b)
            System.out.println("Data Deleted");
        else
            System.out.println("Something went wrong!!!! Try again");
    }
}
