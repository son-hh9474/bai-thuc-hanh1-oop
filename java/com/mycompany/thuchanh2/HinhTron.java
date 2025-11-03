/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thuchanh2;

import javax.swing.border.MatteBorder;

/**
 *
 * @author admin
 */
public class HinhTron {
    private Diem toaDo;
    private double banKinh;
    
    public HinhTron(Diem d, double r) throws java.lang.Exception {
        if (r >= 0) {
            this.toaDo = d;
            this.banKinh = r;
        } else {
            throw Exception("du lieu khong hop le");
        }
    }

    public Diem getToaDo() {
        return toaDo;
    }

    public void setToaDo(Diem toaDo) {
        this.toaDo = toaDo;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) throws java.lang.Exception {
        
        if (banKinh >= 0) {
            this.banKinh = banKinh;
        } else {
            throw Exception("du lieu khong hop le");
        }
    }
    
    public double tinhDienTich(){
        return Math.pow(this.banKinh, 2) * Math.PI;
    }
    
    public double tinhChuVi(){
        return (2 * Math.PI * this.banKinh);
    }
    
    public int xacTuongDoiDiemVaDT(Diem d){
        double khoangCach = this.toaDo.tinhKhoangCach(d);
        
        return Double.compare(khoangCach, banKinh);
    }
    
    public int xacTuongDoiDTVaDT(HinhTron ok){
        double khoangCach = this.toaDo.tinhKhoangCach(ok.toaDo);
        double distance = this.banKinh + ok.banKinh;
        
        return Double.compare(distance, khoangCach);
    }

    private Exception Exception(String du_lieu_khong_hop_le) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}