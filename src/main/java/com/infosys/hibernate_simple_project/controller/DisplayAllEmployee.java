package com.infosys.hibernate_simple_project.controller;

import com.infosys.hibernate_simple_project.dao.EmployeeDao;
import com.infosys.hibernate_simple_project.dto.Employee;

import java.util.List;

public class DisplayAllEmployee {
    public static void main(String[] args) {
        EmployeeDao dao=new EmployeeDao();
        List<Employee> employee=dao.displayAllEmployeeDao();
        employee.forEach(System.out::println);
    }
}
