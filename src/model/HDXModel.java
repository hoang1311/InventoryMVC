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
public class HDXModel {
    private  String id;
    private String CusId ;
    private  Date date;

    public HDXModel(String id, String CusId, Date date) {
        this.id = id;
        this.CusId = CusId;
        this.date = date;
    }

    public HDXModel(String CusId) {
        id = Math.random()*3000+"HDX";
        this.CusId = CusId;
        date = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCusId() {
        return CusId;
    }

    public void setCusId(String CusId) {
        this.CusId = CusId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
