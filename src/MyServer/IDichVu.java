/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyServer;


import bean.ChiTietTaiKhoanBean;
import bean.TaiKhoanBean;
import java.rmi.Remote;


/**
 *
 * @author Admin
 */
public interface IDichVu extends Remote{
    public TaiKhoanBean kiemTraDangNhap(String soTK,String MK) throws Exception;
    public ChiTietTaiKhoanBean layChiTietThanhCong(String soTK) throws Exception;
   
}
