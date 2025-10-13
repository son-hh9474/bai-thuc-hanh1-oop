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
public class Bai4 {
    
    public static int[] nhapMAng(int n) {
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
                
        for(int i = 0; i < n; i++){
            System.out.printf("a[%d]", i);
            a[i] = sc.nextInt();
        }
        return a;
    }
    
    public static void main(String[] args) {
        
        
    }
}
