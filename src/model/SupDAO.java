/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class SupDAO {

    Connection con;
    Statement st;
    ResultSet sr;

    public SupDAO() {
        String url = new urlDb().getUrl();
        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<SupModel> getSupList() {
        String query = "select * from supplier";
        ArrayList<SupModel> pr = new ArrayList<>();
        try {
            st = con.createStatement();
            sr = st.executeQuery(query);
            while (sr.next()) {
                SupModel model = new SupModel(sr.getString("id"), sr.getString("name"), sr.getInt("phone"));
                pr.add(model);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pr;
    }

    public void addNewSup(String name, int phone) {
        SupModel sup = new SupModel(name, phone);
        String query = "insert into supplier (id , name ,phone  ) values (? , ? , ?)";
        try {

            PreparedStatement pre = con.prepareStatement(query);
            pre.setString(1, sup.getId());
            pre.setString(2, sup.getName());
            pre.setInt(3, sup.getPhone());
            pre.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(String name, int phone, String id) {
        String query = "update supplier set name=? , phone=? where id= ?";

        try {
            PreparedStatement pre = con.prepareStatement(query);
            pre.setString(1, name);
            pre.setInt(2, phone);
            pre.setString(3, id);
            pre.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(String id) {
        String query = "delete from supplier where id = ?";
        try {
            PreparedStatement pre = con.prepareStatement(query);
            pre.setString(1, id);
            pre.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
