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
public class bai1_1 {
    private String tensp;
    private double dongia;
    private double giamgia;
    double getthuenhapkhau(){
        return dongia * 0.1;
    }

    public bai1_1() {
    }

    public bai1_1(String tensp, double dongia, double giamgia) {
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
        Scanner sc = new Scanner (System.in);
        System.out.println("input tensp");
        setTensp( sc.  nextLine());
        System.out.println("input dongia");
        setDongia(sc. nextDouble());
        System.out.println("input giamgia");
        setGiamgia(sc . nextDouble());
    }
    public void output(){
        System.out.println("tensp"+getTensp());
        System.out.println("dongia"+getDongia());
        System.out.println("giamgia"+getGiamgia());
        System.out.println("thue thu nhap"+getthuenhapkhau());
    }
    public static void main(String[] args) {
      bai1_1 hh= new bai1_1 ();
      hh.input();
      hh.output();
   
    }
}
