/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author huyhoang1311
 */
public class EmployeeDAO {
    Connection con;
    Statement st;
    ResultSet sr;

    public EmployeeDAO() {
        String url = new urlDb().getUrl();
        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public  ArrayList<EmployeeModel> getEmployeeList (){
        String query ="select * from employee";
        ArrayList<EmployeeModel> pr = new ArrayList<>();
        try {
            st = con.createStatement();
           sr= st.executeQuery(query); 
           while( sr.next()){
               EmployeeModel model = new EmployeeModel(sr.getString("ID"), sr.getString("Name"), sr.getString("UserName"), sr.getString("Password"));
               pr.add(model);        
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return  pr;
    }    
    
    public  void addEmployee(String id, String name, String user, String pass) {
        
        String query = "insert into employee (ID , Name , UserName , Password) values ('"+id+"','"+name+"','"+user+"','"+pass+"')";
        try {
             st.executeUpdate(query);
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        
    }

    public void deleteEmployee(String id) {
        String query = "delete from employee where id = '"+id+"'";
        try {
             st.executeUpdate(query);
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateEmployee(String id, String name, String user, String pass) {
          String query = "update employee set Name='" +name + "' , UserName ='" + user + "',Password =" +pass + "  where ID='" + id + "'";
   
     try {
             st.executeUpdate(query);
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
