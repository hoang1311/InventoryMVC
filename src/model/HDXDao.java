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
public class HDXDao {
      Connection con;
    Statement st;
    ResultSet sr;

    public HDXDao() {
        
        String url = new urlDb().getUrl();
        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<HDXModel> getAllHDX() {
             String query ="select * from hoadonxuat";
      ArrayList<HDXModel> iv = new ArrayList<>();
        try {
            st = con.createStatement();
           sr= st.executeQuery(query); 
           while( sr.next()){
               HDXModel model = new HDXModel(sr.getString("id") , sr.getString("cosId") ,  sr.getDate("createdAt"));
               iv.add(model);        
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return  iv;
    }

    public void delete(String id) {
        
        String query = "delete from chitiethoadonxuat  where invoiceId= ? ; delete from hoadonxuat  where id= ?";
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
