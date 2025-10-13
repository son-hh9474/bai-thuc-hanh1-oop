/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hhs.bai_thuc_hanh_1;

import java.util.Scanner;


/**
 *
 * @author admin
 */
public class Bai1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_random = (int)(Math.random()*100);
        int doan; 
        do {           
            System.out.print("guest a number from 1 to 100: ");
            doan = sc.nextInt();
            if(number_random < doan)
                System.out.println("smaller");
            else if(number_random > doan)
                System.out.println("bigger");
            else 
                System.out.println("exactly!!!");
        } while (doan != number_random);
        
    }
}

