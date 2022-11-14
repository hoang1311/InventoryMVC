/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.EmployeeDAO;
import model.EmployeeModel;

/**
 *
 * @author huyhoang1311
 */
public class EmployeeController {
     EmployeeDAO dao;

    public EmployeeController() {
        this.dao = new EmployeeDAO();
    }
    
    public  ArrayList<EmployeeModel> showEmployee(){
        return dao.getEmployeeList();
       
    } 

    public void addEmployee(String id , String name , String user , String pass) {
        dao.addEmployee(id, name, user, pass);
    }

    public void deleteEmployee(String id) {
       dao.deleteEmployee(id);
    }

    public void updateEmployee(String id, String name, String user, String pass ) {
       dao.updateEmployee(id ,name , user , pass);
    }

    
}

