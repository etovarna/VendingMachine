/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.one;

/**
 *
 * @author etovarna
 */
public class Product {
    
   private String name;
   private int price;
   private int numberOfProducts;
   
   public Product(){
       
   }
   
   public Product(String name, int price, int numberOfProducts){
       this.name=name;
       this.price=price;
       this.numberOfProducts=numberOfProducts;
   }
   
   public int getPrice(){
       return price;
   }
   
   public String getName(){
       return name;
   }
   
   public int getNumberOfProducts(){
       return numberOfProducts;
   }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }
   
   
}
