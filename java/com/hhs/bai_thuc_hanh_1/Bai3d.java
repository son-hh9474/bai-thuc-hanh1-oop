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
public class Bai3d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        String[] a = s.split("[\\s, ;]+");
        System.out.print(a.length);
    }
}
