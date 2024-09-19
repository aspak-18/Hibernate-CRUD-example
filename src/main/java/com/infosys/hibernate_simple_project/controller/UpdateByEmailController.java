package com.infosys.hibernate_simple_project.controller;

import com.infosys.hibernate_simple_project.dao.EmployeeDao;
import com.infosys.hibernate_simple_project.dto.Employee;

public class UpdateByEmailController {
    public static void main(String[] args) {
        EmployeeDao dao=new EmployeeDao();
        int result=dao.updateEmployeeNameByEmail("asp@gmail.com","Aspak");
        if (result>0)
            System.out.println("Name Updated By email");
        else
            System.out.println("Something went wrong");
    }
}
