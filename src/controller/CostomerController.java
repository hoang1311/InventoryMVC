/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.CostomerDAO;
import model.CostomerModel;


/**
 *
 * @author huyhoang1311
 */
public class CostomerController {
    CostomerDAO dao;
    
    public CostomerController() {
        this.dao = new CostomerDAO();
    }
    public ArrayList<CostomerModel> showCostomer() {
         return dao.getCostomerList();
    }

    public void updateCostomer(String id, String name, int phone) {
         dao.updateCostomer(id ,name , phone);
    }

    public void deleteCostomer(String id) {
         dao.deleteCostomer(id);
    }

    public void addCostomer(String id, String name, int phone) {
         dao.addNewProduct(id, name, phone);
    }

   

    
    
}
