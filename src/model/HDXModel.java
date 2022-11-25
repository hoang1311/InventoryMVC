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
public class HDXModel {
    private  String id;
    private String CusId ;
     private  String date;
    private  boolean  status;

    public HDXModel(String id, String CusId, String date , boolean  status) {
        this.id = id;
        this.CusId = CusId;
         this.date = date;
        this.status= status;
    }

    public HDXModel(String CusId) {
        id = Math.random()*3000+"HDX";
        this.CusId = CusId;
         Date date1 = new Date();
        String mmddyyyy1 = new SimpleDateFormat("MM-dd-yyyy").format(date1);
        this.date =  mmddyyyy1;
        this.status = true;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    
      public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
    
}
