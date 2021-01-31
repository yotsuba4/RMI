/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.TaiKhoanBean;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class TaiKhoanDao {
    public ArrayList<TaiKhoanBean> getTaiKhoan() throws Exception{
        ArrayList<TaiKhoanBean> ds = new ArrayList<>();
        
        //mo file
        FileReader f = new FileReader("TaiKhoan.txt");
        BufferedReader g = new BufferedReader(f);
        //duyet file
        while (true) {
            String st = g.readLine();//doc ra 1 dong: st
            if (st == null || st == "") {//neu het file thi dung
                break;
            }
            String[] t = st.split("[;]");//che chuoi st thanh 4 phan
            TaiKhoanBean tkb = new TaiKhoanBean();//tao ra 1 lopbean
            tkb.setHoTen(t[1]);
            tkb.setSoTaiKhoan(t[0]);
            tkb.setMatKhau(t[2]);
            ds.add(tkb);//luu vao ds
        }      
        //dong file
        g.close();

        
        return ds;
    }
}
