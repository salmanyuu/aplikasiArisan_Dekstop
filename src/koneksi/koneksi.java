/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Salman
 */
public class koneksi {
   static Connection con;
   public static Connection getConnection() {
       
     try {
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_arisan","root","");
         System.out.println("Berhasil Terkoneksi");
         
     }catch (Exception e) {
         System.out.println("Gagal Konek");
     }
       return con;
   }
}
