/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ChiTietTaiKhoanBean;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ChiTietTaiKhoanDao  {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public ArrayList<ChiTietTaiKhoanBean> getDsChiTiet() throws Exception{
        ArrayList<ChiTietTaiKhoanBean> ds = new ArrayList<>();
        FileReader r = new FileReader("ChiTietTaiKhoan.txt");
        BufferedReader g = new BufferedReader(r);
        while(true){
            String st = g.readLine();
            if(st==null||st==""){
                break;
            }
            String[] t = st.split("[;]");
            ChiTietTaiKhoanBean cttk = new ChiTietTaiKhoanBean();
            cttk.setID(t[0]);
            cttk.setNgayRutTien(sdf.parse(t[1]));
            cttk.setSoTienRutRa(Long.parseLong(t[2]));
            cttk.setSoTaiKhoan(t[3]);
            ds.add(cttk);
        }
        g.close();
        return ds;
    }
    
}
