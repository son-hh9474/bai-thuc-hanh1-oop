/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hhs.bai_thuc_hanh_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai3 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("src/main/resources/input.txt");
        try(Scanner sc = new Scanner(f)){
            while (sc.hasNext()) {
                String s = sc.nextLine();
                s = s.replaceAll("\\{file}", "Tap Tin");
                System.out.println(s);
            }
        }
    }
}
