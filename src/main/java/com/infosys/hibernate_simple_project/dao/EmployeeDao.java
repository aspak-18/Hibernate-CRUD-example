package com.infosys.hibernate_simple_project.dao;

import com.infosys.hibernate_simple_project.dto.Employee;
import jakarta.persistence.*;

import java.util.List;

public class EmployeeDao {
    // it is used to create connection by providing persistence unit name
    EntityManagerFactory emf =Persistence.createEntityManagerFactory("jpa-hibernate-mysql");

    // it is used to create entity or object
    EntityManager em =emf.createEntityManager();

    // it is used to begin/open or close the session.
    EntityTransaction et =em.getTransaction();

    public Employee saveEmployeeDao(Employee employee){
        et.begin();
        em.persist(employee);
        et.commit();
        return employee;
    }

    public Employee getEmployeeByIdDao(int id){
        Employee employee=em.find(Employee.class,id);
        return employee;
    }

    public boolean deleteEmployeeByIdDao(int id){
        Employee employee=getEmployeeByIdDao(id);
        if (employee!=null){
            et.begin();
            em.remove(employee);
            et.commit();
            return true;
        }
        else {
            return false;
        }
    }

    public Employee updateEmployeeByIdDao(int id, String name){
        Employee employee=getEmployeeByIdDao(id);
        if (employee!=null){
            employee.setName(name);
            et.begin();
            em.merge(employee);
            et.commit();
            return employee;
        }
        else {
            return null;
        }
    }

    public List<Employee> displayAllEmployeeDao(){
        return em.createQuery("FROM Employee").getResultList();
//        Query query=em.createQuery("From Employee");
//        return query.getResultList();
    }

    public List<Employee> displayEmployeeByNameDao(String name){
        Query query=em.createQuery("SELECT e FROM Employee e where e.name=?1");
        query.setParameter(1,name);
        return query.getResultList();
    }

    public  Employee displaySingleEmployeeByName(String name){
        Query query=em.createQuery("SELECT e FROM Employee e where e.name=?1");
        query.setParameter(1,name);

        try {
            return (Employee) query.getSingleResult();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    public int updateEmployeeNameByEmail(String email,String name){
        et.begin();
        Query query=em.createQuery("UPDATE Employee e SET e.name=?1 WHERE e.email=?2");
        query.setParameter(1,name);
        query.setParameter(2,email);

        try{
            int result=query.executeUpdate();
            et.commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }

    public int deleteEmployeeNameByEmail(String email){
        et.begin();
        Query query=em.createQuery("DELETE FROM Employee e WHERE e.email=?1");
        query.setParameter(1,email);

        try{
            int result=query.executeUpdate();
            et.commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }


}
