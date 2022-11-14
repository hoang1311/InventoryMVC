/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.ProductDAO;
import model.ProductModel;

/**
 *
 * @author huyhoang1311
 */
public class ProductController {
    ProductDAO dao;

    public ProductController() {
        this.dao = new ProductDAO();
    }
    
    public  ArrayList<ProductModel> showProduct(){
        return dao.getProductList();
       
    } 

    public void addproduct(String id , String name , int quantity , String cat) {
        dao.addNewProduct(id, name, quantity, cat);
    }

    public void deleteProduct(String id) {
       dao.deleteProduct(id);
    }

    public void updateProduct(String id, String name, int qty, String cat ) {
       dao.updateProduct(id ,name , qty , cat);
    }
}
