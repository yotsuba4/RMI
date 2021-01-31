/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyServer;


import bean.ChiTietTaiKhoanBean;
import bean.TaiKhoanBean;
import dao.ChiTietTaiKhoanDao;

import dao.TaiKhoanDao;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DichVu extends UnicastRemoteObject implements IDichVu{
    
    TaiKhoanDao tkd = new TaiKhoanDao();
    ArrayList<TaiKhoanBean> dstk;
    
    ChiTietTaiKhoanDao cttkd = new ChiTietTaiKhoanDao();
    ArrayList<ChiTietTaiKhoanBean> dsct;


    public DichVu() throws Exception{
        dstk = tkd.getTaiKhoan();
        dsct= cttkd.getDsChiTiet();
    }
    
    @Override
    public TaiKhoanBean kiemTraDangNhap(String soTK, String MK) throws Exception {
        for (TaiKhoanBean dstk1 : dstk) {
            if(dstk1.getSoTaiKhoan().equals(soTK)&&dstk1.getMatKhau().equals(MK)){
                return dstk1;
            }
        }
        return null;
    }



    @Override
    public ChiTietTaiKhoanBean layChiTietThanhCong(String soTK) throws Exception{
        for (ChiTietTaiKhoanBean ct : dsct) {
            if(ct.getSoTaiKhoan().equals(soTK)){
                return ct;
            }
        }
        return null;
    }


    
}
