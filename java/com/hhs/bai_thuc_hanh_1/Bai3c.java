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
public class Bai3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int dem = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isUpperCase(s.charAt(i)))
                dem++;
        }
        
        System.out.print(dem);
    }
}
