/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.HDNIfo;
import model.HDNModel;
import model.HDXDao;
import model.HDXIfo;
import model.HDXModel;

/**
 *
 * @author hi
 */
public class HDXContoller {
    private  HDXDao  dao;

    public HDXContoller() {
        this.dao = new HDXDao();
    }

  

    public ArrayList<HDXModel> showHDX() {
       return dao.getAllHDX();
    }

    public void deleteIv( String id)  {
              dao.delete(id); 
    }
       public void addHDX(ArrayList<HDXIfo> buy, HDXModel y) {
        dao.addnewHDX(buy, y);
    }
}
