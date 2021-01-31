/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class ChiTietTaiKhoanBean implements Serializable{
    private String ID;
    private Date ngayRutTien;
    private long soTienRutRa;
    private String soTaiKhoan;

    public ChiTietTaiKhoanBean() {
    }

    public ChiTietTaiKhoanBean(String ID, Date ngayRutTien, long soTienRutRa, String soTaiKhoan) {
        this.ID = ID;
        this.ngayRutTien = ngayRutTien;
        this.soTienRutRa = soTienRutRa;
        this.soTaiKhoan = soTaiKhoan;
    }

    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getNgayRutTien() {
        return ngayRutTien;
    }

    public void setNgayRutTien(Date ngayRutTien) {
        this.ngayRutTien = ngayRutTien;
    }

    public long getSoTienRutRa() {
        return soTienRutRa;
    }

    public void setSoTienRutRa(long soTienRutRa) {
        this.soTienRutRa = soTienRutRa;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }
    
    
    
}
