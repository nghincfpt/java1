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
public class bai2 {
     private String tensp;
     private double dongia;
     private double giamgia;

    public bai2() {
    }

    public bai2(String tensp, double dongia, double giamgia) {
        this.tensp = tensp;
        this.dongia = dongia;
        this.giamgia = giamgia;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getGiamgia() {
        return giamgia;
    }

    public void setGiamgia(double giamgia) {
        this.giamgia = giamgia;
    }
   public void input(){
       Scanner sc   = new   Scanner (System.in);
       
        sc  = new Scanner( System.in);
       System.out.println("input tensp");
       setTensp(sc .nextLine());

       System.out.println("input dongia");
       setDongia( sc. nextDouble());
       System.out.println("input giamgia");
       setGiamgia(sc.nextDouble());
   }
   public void output(){
       System.out.println("output  sap pham");
       System.out.println("output"+getTensp());
       System.out.println("output"+getDongia());
       System.out.println("output"+getGiamgia());
}
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
           System.out.println("nhap so phan tu tu ban phim");
       int  n = sc . nextInt();
        for(int i = 0 ; i < n ; i++){
        bai2 nghi = new bai2();
        nghi.input();
        nghi.output();
    }
}
}