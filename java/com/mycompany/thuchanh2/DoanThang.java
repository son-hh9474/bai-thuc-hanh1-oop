/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thuchanh2;

/**
 *
 * @author admin
 */
public class DoanThang {
    private Diem toaDo1;
    private Diem toaDo2;
    
    public DoanThang(Diem d1, Diem d2) {
        this.toaDo1 = d1;
        this.toaDo2 = d2;
    }
    
    public void hienThi(){
        System.out.printf("[(%.1f , %.1f), (%.1f , %.1f)]", this.toaDo1.getHoanhDo(), this.toaDo1.getTungDo(), this.toaDo2.getHoanhDo(), this.toaDo2.getTungDo());
    }
    
    public double tinhDoDai(){
        return this.toaDo1.tinhKhoangCach(this.toaDo2);
    }
    
    public Diem timTrungDiem(){
        double x = (this.toaDo1.getHoanhDo() - this.toaDo2.getHoanhDo()) / 2;
        double y = (this.toaDo1.getTungDo()- this.toaDo2.getTungDo()) / 2;
        
        return new Diem(y, x);
    }
    
    public boolean isSongSong(DoanThang ok){
        double v1 = (this.toaDo1.getHoanhDo() - this.toaDo2.getHoanhDo()) * (ok.toaDo1.getTungDo() - ok.toaDo2.getTungDo());
        double v2 = (this.toaDo1.getTungDo() - this.toaDo2.getTungDo()) * (ok.toaDo1.getHoanhDo() - ok.toaDo2.getHoanhDo());
        
        return Double.compare(v1, v2) == 0;
    }
    
    public Diem getterToaDo1(){
        return this.toaDo1;
    }
    
    public Diem getterToaDo2(){
        return this.toaDo2;
    }
    
    public void setterToaDo1(Diem d){
        this.toaDo1 = d;
    }
    
    public void setterToaDo2(Diem d){
        this.toaDo2 = d;
    }
        
}
