package com.infosys.hibernate_simple_project.controller;

import com.infosys.hibernate_simple_project.dao.EmployeeDao;

public class DeleteByEmailController {
    public static void main(String[] args) {
        EmployeeDao dao=new EmployeeDao();
        int result= dao.deleteEmployeeNameByEmail("asp@gmail.com");
        if (result>0)
            System.out.println("Data Deleted");
        else
            System.out.println("Something Went Wrong");
    }
}
