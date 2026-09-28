/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog6112test;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class Eletronics{

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Declaring and populating 
        String[] cities= {"Cape Town","Port Elizabeth","Pretoria"};
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        }
                
          
                
                
                // Accessing and changing values
                
        int x = sales [0],[1],[2]; //row,column
        sales [0][0]= 1000;
        sales [0][1]= 2000;
        sales [0][2]= 3000;
        sales [1][0]= 2000;
        sales [1][1]= 3000;
        sales [1][2]= 4000;
        sales [2][0]= 1500;
        sales [2][1]= 1100;
        sales [2][2]= 1200;
        
        //1D
        for (int i = 0;i < electronics.length; i++){
            System.out.println(cities[i]);
        }
         for (String city : cities){
             System.out.println(city);
         }
         
         for (int row = 0; row < sales.length; row++){
             for (int col= 0; col < sales[row].length; col++){
                 System.out.println();
             }
             
         }
         
         String [] headers = {"PS5", "XBOX", "SWITCH"};
         
         //header row 
         System.out.printf(" %-20s", "");
         for (String h : headers ){
             System.out.printf("%-15s", h);
         }
         System.out.println();
         //data rows 
         for (int row= 0; row < games.length; row++)
              System.out.printf(" %-20s",cities [row]);
         for (int col = 0; col < games [row].length; col ++){
             System.out.println();
         }
         
         System.out.println("---------------------------------------------");
         System.out.println (" GAMING CONSOLE REPORT");
         System.out.println("----------------------------------------------");
         for (int i = 0; i < cities.length; i++){
             totals[i]= games[i][0] + games [i][1];
             System.out.println(cities [i] + "\t" + totals[i]);
         }
         //city with the most sales 
         int highest = 0;
         for (int i = 1; i < totals.length; i++) {
             if (totals [i] > total [highest]){
                 highest = i ;
             }
         }
         System.out.println ("\n CITY WITH THE MOST SALES: " cities[highest]);
         System.out.println("--------------------------------------");
                        
    }
}
