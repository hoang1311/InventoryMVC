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
public class CostomerDAO {
    Connection con;
    Statement st;
    ResultSet sr;

    public CostomerDAO() {
        
        String url = new urlDb().getUrl();
        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<CostomerModel> getCostomerList() {
        
       String query ="select * from customer";
      ArrayList<CostomerModel> pr = new ArrayList<>();
        try {
            st = con.createStatement();
            sr= st.executeQuery(query); 
           while( sr.next()){
               CostomerModel model = new CostomerModel(sr.getString("ID"), sr.getString("Name"), sr.getInt("Phone"));
               pr.add(model);        
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return  pr;
    }

    public void updateCostomer(String id, String name, int phone) {
        
             String query = "update customer set Name='" +name + "' , Phone ='" + phone + "'  where ID='" + id + "'";
   
     try {
             st.executeUpdate(query);
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
            }

    public void deleteCostomer(String id) {
                String query = "delete from customer where ID = '"+id+"'";
        try {
             st.executeUpdate(query);
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addNewCustomer(String id, String name, int phone) {
         String query = "insert into customer (ID, Name, Phone) values ('"+id+"','"+name+"','"+phone+"')";
        try {
             st.executeUpdate(query);
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   
    
    
}
