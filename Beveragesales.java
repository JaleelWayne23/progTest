/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beveragessalesq2;

/**
 *
 * @author Asmin
 */
public abstract class Beveragesales implements iBeverages {
 
    private String Beveragetype;
    private String store;
    private int totasales;
    private final int totalsales;

    public Beveragesales(String Baveragetype, String store, int totalsales){
        this.Beveragetype = Beveragetype;
        this.store = store;
        this.totalsales = totalsales;
    }
//ovrride method
    @Override
    public String getBeveragestype() {
        return Beveragetype;
    }
@Override
    public String getstore() {
        return store;
    }
@Override    
    public int gettotalsales() {
        int totalsales = 0;
        return totalsales;
    }
  
//end of class
}    

