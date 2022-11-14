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
public class CategoryDAO {
      
    Connection con;
    Statement st;
    ResultSet sr;

    public CategoryDAO() {
        String url = new urlDb().getUrl();
        try {
            con = DriverManager.getConnection(url);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public  ArrayList<CategoryModel> getCategoryList (){
    String query ="select * from category";
      ArrayList<CategoryModel> cat = new ArrayList<>();
        try {
            st = con.createStatement();
            sr= st.executeQuery(query); 
           while( sr.next()){
               CategoryModel model = new CategoryModel(sr.getString("ID"), sr.getString("Name"));
               cat.add(model);        
           }
          
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return  cat;
    }  

    public void addCategory(String id, String name) {
        String query = "insert into category (ID , Name ) values ('"+id+"','"+name+"')";
        try {
             st.executeUpdate(query);
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCategory(String id) {
         String query = "delete from category where ID = '"+id+"'";
        try {
             st.executeUpdate(query);
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
