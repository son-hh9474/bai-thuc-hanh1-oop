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
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap x: ");
        double x = sc.nextDouble(); // gia tri bien
        System.out.print("nhap n: ");
        int n = sc.nextInt(); // bac da thuc
        double result = 0; // ket qua 
        for(int i = 0; i <= n; i++){
            System.out.printf("a[%d]: ", i);
            double a = sc.nextDouble();
        
            result += a * Math.pow(x, i);
        }
        
        System.out.printf("gia tri da thuc = % .1f", result);
    }
}
