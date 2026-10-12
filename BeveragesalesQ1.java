/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beveragesalesq1;

/**
 *
 * @author Asmin
 */
public class BeveragesalesQ1 {

    public static void main(String[] args) {
          
              //DECLARe ARRYS
        String [] months = {"CapeTown","Port Elizabeth","Pretoria"};
        String [] consoles = {"Coffee","tea","Boba Tea"};
        //2d arrays
        int [][]sales = {
            {500,300,125},
            {450,250,100},
            {480,175,120},
        };
        
        //title
        System.out.println("******************************");
                          System.out.println("Total of each city");
        System.out.println("*********************************");
        
        for (int rowIndex = 0;rowIndex < months.length;rowIndex++ ){
         System.out.print("\t\t\t" +  months[rowIndex] );
        }
       System.out.println("");
        //declaring total
        int rowTotal = 0;
        
        //nested for loop
        for (int rowIndex = 0 ;rowIndex < consoles .length; rowIndex++);{
           rowTotal = 0; 
            int rowIndex = 0;
           System.out.print(consoles [rowIndex] + "\t\t");
           
         System.out.print(consoles[rowIndex] + "\t\t");
         rowTotal = 0; 

         //nested loop
        for (int colIndex = 0; colIndex < sales [rowIndex].length;colIndex++){
           rowTotal = 0;  
            System.out.print(sales[rowIndex][colIndex] + "\t\t\t");
            } 
         System.out.println(rowTotal);
          System.out.println("");
    }
    }
}