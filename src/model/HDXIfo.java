/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hi
 */
public class HDXIfo {
    private  String id ;
    private String prId;
    private  String ivId;
    private int amount;

    public HDXIfo( String ivId, String prId, int amount) {
        id  = Math.random()+"";
        this.prId = prId;
        this.ivId = ivId;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrId() {
        return prId;
    }

    public void setPrId(String prId) {
        this.prId = prId;
    }

    public String getIvId() {
        return ivId;
    }

    public void setIvId(String ivId) {
        this.ivId = ivId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
