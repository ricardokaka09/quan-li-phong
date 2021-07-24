/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author itsof
 */
public class Phong {
    int id;
    String ten,loai,gia,trangThai;

    public Phong() {
    }

    public Phong(int id, String ten, String loai, String gia, String trangThai) {
        this.id = id;
        this.ten = ten;
        this.loai = loai;
        this.gia = gia;
        this.trangThai = trangThai;
    }

    public Phong(String ten, String loai, String gia, String trangThai) {
        this.ten = ten;
        this.loai = loai;
        this.gia = gia;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
}
