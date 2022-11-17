/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.HDNDao;
import model.HDNModel;

/**
 *
 * @author hi
 */
public class HDNController {
    
    private  HDNDao  dao;

    public HDNController() {
        this.dao = new HDNDao();
    }

  

    public ArrayList<HDNModel> showHDN() {
       return dao.getAllHDN();
    }

    public void deleteIv( String id)  {
              dao.delete(id);
          
    }
        
    
}
