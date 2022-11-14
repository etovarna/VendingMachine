/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.one;

import java.util.ArrayList;

/**
 *
 * @author etovarna
 */
public class VendingMachine {
    
    private ArrayList<Product> products = new ArrayList();
    private int coins;
    
    public VendingMachine(){
        
    }
    
    public VendingMachine(int coins, ArrayList<Product> products){
        this.coins=coins;
        this.products=products;
    }

    public int getCoins(){
        return coins;
    }
    
    public Product getProduct(int index){
        return products.get(index);
    }
    
    public void insertCoins(int insertedCoins){
        coins+=insertedCoins;
    }
    
    protected void returnCoins(){
        System.out.println(coins+" coins will be returned.");
        coins=0;
    }
    
    public void buy(int index){
                
        if (hasEnoughCoins(products.get(index-1))){
            coins-=products.get(index-1).getPrice();
            products.get(index-1).setNumberOfProducts(getProduct(index-1).getNumberOfProducts()-1);
            System.out.println("");
            System.out.println("You have just bought one "+products.get(index-1).getName()+".");
            System.out.println("");
            if (coins>0) returnCoins();
        } else if (!hasEnoughCoins(products.get(index-1))) {
            System.out.println("");
            System.out.println("You have not inserted enough coins. Please introduce more to be able to buy.");
        } else if (hasEnoughCoins(products.get(index-1)) && (products.get(index-1).getNumberOfProducts() == 0)){
            System.out.println("");
            System.out.println("We are sorry to inform you that there are not enough "+products.get(index-1).getName()+" left.");
        }
        
    }
    
    private boolean hasEnoughCoins(Product product){
        return coins >= product.getPrice();
    }
    
}
