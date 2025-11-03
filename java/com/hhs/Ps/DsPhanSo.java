/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hhs.Ps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class DsPhanSo {
    private List<PhanSo> danhSach = new ArrayList<>();
    
    public void themPS(PhanSo p){
        this.danhSach.add(p);
    }
    
    public void themPS(int x, int y){
        this.danhSach.add(new PhanSo(x, y));
    }
    
    public void themPS(PhanSo... a){
        this.danhSach.addAll(Arrays.asList(a));
    }
    
    public void xoaPS(){
        this.danhSach.removeLast();
    }
    
    public void xoaPS(PhanSo ok){
        this.danhSach.removeIf(x -> x == ok);
    }
    
    public void xoaPS(int x, int y){
        
    }
    
    public void hienThi(){
        this.danhSach.forEach(x -> x.hienThi());
    }
    
    
    /**
     * @return the danhSach
     */
    public List<PhanSo> getDanhSach() {
        return danhSach;
    }

    /**
     * @param danhSach the danhSach to set
     */
    public void setDanhSach(List<PhanSo> danhSach) {
        this.danhSach = danhSach;
    }
}
