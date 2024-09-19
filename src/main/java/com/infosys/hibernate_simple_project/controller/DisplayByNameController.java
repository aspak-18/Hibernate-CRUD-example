package com.infosys.hibernate_simple_project.controller;

import com.infosys.hibernate_simple_project.dao.EmployeeDao;
import com.infosys.hibernate_simple_project.dto.Employee;

import java.util.List;

public class DisplayByNameController {
    public static void main(String[] args) {
        EmployeeDao dao=new EmployeeDao();
        List<Employee> employee =dao.displayEmployeeByNameDao("Ashfaque");
        employee.forEach(e-> System.out.println(e));

        Employee employee1 = dao.displaySingleEmployeeByName("sukman");
        System.out.println(employee1);
    }
}
