/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hi
 */
public class SupModel {
    
    private String id ;
    private String  name;
    private  int phone;

    public SupModel(String id, String name, int phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    
       public SupModel( String name, int phone) {
        this.id = Math.random()*10000 + "QSA";
        this.name = name;
        this.phone = phone;
    }
   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

   
    
    
}
