/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Admin
 */
public class MyServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try {
            DichVu dv = new DichVu();
            LocateRegistry.createRegistry(1099);
     //Quang ba doi tuong tt de may khach co the goi phuong thuc trong tt
            //   UnicastRemoteObject.exportObject(tt);
            //Dang ky 1 dia chi de may khach truy cap vao doi tuong tt
            Naming.bind("rmi://127.0.0.1/DichVu", dv);
            System.out.print("Dang cho may khach goi den:");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
