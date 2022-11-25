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
        String query = "select * from hoadonxuat where status = 1";
        ArrayList<HDXModel> iv = new ArrayList<>();
        try {
            st = con.createStatement();
            sr = st.executeQuery(query);
            while (sr.next()) {
                HDXModel model = new HDXModel(sr.getString("id"), sr.getString("cosId"), sr.getDate("createdAt").toString(), sr.getBoolean("status"));
                iv.add(model);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return iv;
    }

    public void delete(String id) {

        String query = "update hoadonxuat set status = 0 where id = ?";
        try {
            PreparedStatement pre = con.prepareStatement(query);
            pre.setString(1, id);

            pre.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }        
                   

    public void addnewHDX(ArrayList<HDXIfo> buy, HDXModel y) {
        String query = "insert into hoadonxuat(id ,cosId , createdAt) values('" + y.getId() + "' ,'" + y.getCusId()+ "' ,'" + y.getDate() + "')";

        try {
            st = con.createStatement();
            st.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (HDXIfo x : buy) {
            String query2 = "insert into chitiethoadonxuat(id ,invoiceId , productId ,amount) values('" + x.getId() + "' ,'" + x.getIvId() + "' ,'" + x.getPrId() + "'," + x.getAmount() + ")";
            try {

                st.execute(query2);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

}
