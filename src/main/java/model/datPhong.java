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
public class datPhong {
    int id;
    String tenKH,sdtKH,tenPhong;
    long timestamp;

    public datPhong() {
    }

    public datPhong(int id, String tenKH, String sdtKH, String tenPhong, long timestamp) {
        this.id = id;
        this.tenKH = tenKH;
        this.sdtKH = sdtKH;
        this.tenPhong = tenPhong;
        this.timestamp = timestamp;
    }

    public datPhong(String tenKH, String sdtKH, String tenPhong, long timestamp) {
        this.tenKH = tenKH;
        this.sdtKH = sdtKH;
        this.tenPhong = tenPhong;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSdtKH() {
        return sdtKH;
    }

    public void setSdtKH(String sdtKH) {
        this.sdtKH = sdtKH;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

  

  
    
}
