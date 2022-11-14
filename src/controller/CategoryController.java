/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.CategoryDAO;
import model.CategoryModel;

/**
 *
 * @author huyhoang1311
 */
public class CategoryController {
      CategoryDAO dao;

    public CategoryController() {
        this.dao = new CategoryDAO();
    }
    
    public  ArrayList<CategoryModel> showCategory(){
        return dao.getCategoryList();
       
    }

    public void addCategory(String id, String name) {
       dao.addCategory(id, name);
    }

    public void deleteCategory(String id) {
        dao.deleteCategory(id);
    }

    
}
