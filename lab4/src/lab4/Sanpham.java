/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Sanpham {
    String tensp;
     double  dongia;
    double  giamgia;
  private double getthuenhapkhau(){
        return 0.1*dongia;
  }
  
   Sanpham(String tensp , double dongia  ){
   this.tensp=tensp;
   this.dongia = dongia;
   }
   Sanpham(String tensp , double dongia ,double giamgia ){
   this.tensp=tensp;
   this.dongia = dongia;
   this.giamgia =giamgia;
   }
         
   void xuat(){
      System.out.println(this.tensp);
       System.out.println(this.dongia);
       System.out.println(this.giamgia);
   }
 
    public static void main(String[] args) {
     
        Sanpham sp1 = new Sanpham(" iphone" ,88);
        sp1.xuat();        
     
        Sanpham sp = new Sanpham(" hh" ,88,55);
        sp.xuat();
    }
}
