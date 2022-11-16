/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.SupDAO;
import model.SupModel;

/**
 *
 * @author hi
 */
public class SupControler {

    private SupDAO dao;
    public SupControler() {
        dao = new SupDAO();
    }
    
     public  ArrayList<SupModel> showSup(){
        return dao.getSupList();
       
    } 
     
     public void addSup( String name , int phone ) {
        dao.addNewSup( name , phone);
    }

    public void updateSup(String name, int phone , String id) {
        System.out.println(id);
        dao.update(name  , phone  , id );
    }
    

     public void delSup( String id) {
        dao.delete(id );
    }
}
