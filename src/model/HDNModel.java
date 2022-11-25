/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hi
 */
public class HDNModel {
    
    private String id;
    private String SupId;
    private  String date;
    private  boolean  status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public HDNModel(String SupId) {
        this.SupId = SupId;
        id  = Math.random()*1000+"HDN";
        Date date1 = new Date();
        String mmddyyyy1 = new SimpleDateFormat("MM-dd-yyyy").format(date1);
        this.date =  mmddyyyy1;
        this.status = true;
    }

    public HDNModel(String id, String SupId, String date , boolean  status) {
        this.id = id;
        this.SupId = SupId;
        this.date = date;
        this.status= status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSupId() {
        return SupId;
    }

    public void setSupId(String SupId) {
        this.SupId = SupId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
