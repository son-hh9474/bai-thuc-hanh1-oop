/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hhs.bai_thuc_hanh_1;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author admin
 */
public class Bai5 {
    
    public static int[][] inputMatrix(int m, int n) {
        
        int[][] a  = new int[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = (int)(Math.random() * 100);
            }
        }
        return a;
    }
    
    public static void outputMatrix(int m, int n, int a[][]) {
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
    
    public static int tongDong(int row, int n, int a[][]) {
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += a[row][i];
        }
        return sum;
    }
    
    public static int tongCot(int col, int m, int a[][]) {
        
        int sum = 0;
        for(int i = 0; i < m; i++){
            sum += a[i][col];
        }
        return sum;
    }
    
    public static int maxRow(int m, int n, int a[][]) {
        int max = tongDong(0, n, a);
        int index = 0;
        for(int i = 1; i < m; i++){
            if(max < tongDong(i, n, a)){
                max = tongDong(i, n ,a);
                index = i;
            }
        }
        return index;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
             
        int m, n;
        System.out.print("nhap hang: ");
        m = sc.nextInt();
        System.out.print("nhap cot: ");
        n = sc.nextInt();
        int[][] ok = inputMatrix(m, n);
        outputMatrix(m, n, ok);
        int res = tongDongCot(m, n, ok);
        System.out.print("tong mang: ");
        System.out.print(res);
    }
}
