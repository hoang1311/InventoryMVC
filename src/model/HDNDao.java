/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class HDNDao {

    
   Connection con;
    Statement st;
    ResultSet sr;

    public HDNDao() {
        
        String url = new urlDb().getUrl();
        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<HDNModel> getAllHDN() {
     String query ="select * from hoadonnhap";
      ArrayList<HDNModel> iv = new ArrayList<>();
        try {
            st = con.createStatement();
           sr= st.executeQuery(query); 
           while( sr.next()){
               HDNModel model = new HDNModel(sr.getString("id") , sr.getString("supplierId") ,  sr.getDate("createdAt"));
               iv.add(model);        
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return  iv;
    }

    public void delete(String id)  {
        
         String query = "delete from chitiethoadonnhap where invoiceId= ? ; delete from hoadonnhap  where id= ?";
        try {
            PreparedStatement pre = con.prepareStatement(query);
            pre.setString(1, id);
            pre.setString(2, id);
            pre.executeUpdate();
        } catch (SQLException e)  {
           e.printStackTrace();
        }
    }
    
    
    
    
    
}
