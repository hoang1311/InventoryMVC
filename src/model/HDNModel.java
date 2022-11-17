/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author hi
 */
public class HDNModel {
    
    private String id;
    private String SupId;
    private  Date date;

    public HDNModel(String SupId) {
        this.SupId = SupId;
        id  = Math.random()*1000+"HDN";
        date = new  Date();
    }

    public HDNModel(String id, String SupId, Date date) {
        this.id = id;
        this.SupId = SupId;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}