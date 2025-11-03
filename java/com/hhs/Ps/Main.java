/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hhs.Ps;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo(1,2);
        PhanSo p2 = new PhanSo(3,4);
        PhanSo p3 = new PhanSo(5,6);
        PhanSo p4 = new PhanSo(7,8);
        
        DsPhanSo ok = new DsPhanSo();
        ok.themPS(p1);
        ok.themPS(9,10);
        ok.themPS(p2,p3,p4);
        ok.hienThi();
    }
}
