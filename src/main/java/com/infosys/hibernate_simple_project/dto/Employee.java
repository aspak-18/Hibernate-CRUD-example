package com.infosys.hibernate_simple_project.dto;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emp")
public class Employee {
    @Id
    private int id;
    @Column(name="emp_name",length=20,nullable = false)
    private String name;
    private String email;
    private long phone;
}
