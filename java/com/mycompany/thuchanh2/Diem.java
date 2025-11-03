/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thuchanh2;

/**
 *
 * @author admin
 */
public class Diem {

    public double getTungDo() {
        return tungDo;
    }

    public void setTungDo(double tungDo) {
        this.tungDo = tungDo;
    }

    public double getHoanhDo() {
        return hoanhDo;
    }

    public void setHoanhDo(double hoanhDo) {
        this.hoanhDo = hoanhDo;
    }
    private double tungDo;
    private double hoanhDo;
    
    public Diem(double t, double h){
        this.tungDo = t;
        this.hoanhDo = h;
    }
    
    public void hienThi(){
        System.out.printf("(%.1f , %.1f)\n", this.hoanhDo, this.tungDo);
    }
    
    public double tinhKhoangCach(Diem d){
        return Math.sqrt(Math.pow(this.hoanhDo - d.hoanhDo, 2) + Math.pow(this.tungDo - d.tungDo, 2));
    }
 
}
