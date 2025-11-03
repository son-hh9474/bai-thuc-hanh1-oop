/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thuchanh2;

/**
 *
 * @author admin
 */
public class HinhChuNhat {
    private Diem DTrenTrai;
    private Diem DDuoiPhai;
    
    public HinhChuNhat(Diem DTT, Diem DDP) throws java.lang.Exception{
        
        if(DTT.getHoanhDo()< DDP.getHoanhDo() && DTT.getTungDo() > DDP.getTungDo()){
            this.DTrenTrai = DTT;
            this.DDuoiPhai = DDP;
        }else
            throw Exception("du lie khong hop le");
        
    }

    public double tinhChieuNgang(){
        return this.DTrenTrai.tinhKhoangCach(new Diem(this.DTrenTrai.getTungDo(), this.DDuoiPhai.getHoanhDo()));
    }
    
    public double tinhChieuDoc(){
        return this.DTrenTrai.tinhKhoangCach(new Diem(this.DDuoiPhai.getTungDo(), this.DTrenTrai.getHoanhDo()));
    }
    
    public double tinhDienTich(){
        return tinhChieuNgang() * tinhChieuDoc();
    }
    
    public double tinhChuVi(){
        return (tinhChieuNgang() + tinhChieuDoc()) * 2;
    }
    
    public void hienThi(){
        System.out.println("toa do diem tren trai:");
        this.DTrenTrai.hienThi();
        System.out.println("toa do diem duoi phai:");
        this.DDuoiPhai.hienThi();
        System.out.println("dien tich hinh chu nhat:" + this.tinhDienTich());
        System.out.println("chu vi hinh chu nhat:" + this.tinhChuVi());
    }
    
    public Diem getDTrenTrai() {
        return DTrenTrai;
    }

    public void setDTrenTrai(Diem DTrenTrai) throws java.lang.Exception {
        if (DTrenTrai.getHoanhDo() < this.DDuoiPhai.getHoanhDo() && DTrenTrai.getTungDo() > this.DDuoiPhai.getTungDo()) {
            this.DTrenTrai = DTrenTrai;
        }else
            throw Exception("du lieu khong hop le");
    }

    public Diem getDDuoiPhai() {
        return DDuoiPhai;
    }

    public void setDDuoiPhai(Diem DDuoiPhai) throws java.lang.Exception {
        if (this.DTrenTrai.getHoanhDo() < this.DDuoiPhai.getHoanhDo() && this.DTrenTrai.getTungDo() > this.DDuoiPhai.getTungDo()) {
            this.DDuoiPhai = DDuoiPhai;
        }else
            throw Exception("du lieu khong hop le");
    }

    private Exception Exception(String du_lie_khong_hop_le) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
