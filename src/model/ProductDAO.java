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
public class ProductDAO {
      
    Connection con;
    Statement st;
    ResultSet sr;

    public ProductDAO() {
        String url = new urlDb().getUrl();
        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public  ArrayList<ProductModel> getProductList (){
    String query ="select * from product";
      ArrayList<ProductModel> pr = new ArrayList<>();
        try {
            st = con.createStatement();
           sr= st.executeQuery(query); 
           while( sr.next()){
               ProductModel model = new ProductModel(sr.getString("id"), sr.getString("name"), sr.getInt("quantity"), sr.getString("category"), sr.getInt("price"));
               pr.add(model);        
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return  pr;
    }    
    
    public  void addNewProduct(String id, String name, int quantity, String cat , int price) {
        
        String query = "insert into product (id , name ,category  , quantity ,price ) values ('"+id+"','"+name+"','"+cat+"','"+quantity+"','"+price+"')";
        try {
             st.executeUpdate(query);
   
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        
    }

    public void deleteProduct(String id) {
        String query = "delete from product where ID = '"+id+"'";
        try {
             st.executeUpdate(query);
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateProduct(String id, String name, int qty, String cat , int price) {
          String query = "update product set name='" +name + "' , price ='" + price + "' , category ='" + cat + "',quantity =" +qty + "  where id='" + id + "'";
    
          System.err.println(query);
     try {
             st.executeUpdate(query);
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
