package lab4;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class bai3 {
    private String hoten;
    private  double  donggia;
    private double  giamgia;

    public bai3() {
    }

    public bai3(String hoten, double donggia, double giamgia) {
        this.hoten = hoten;
        this.donggia = donggia;
        this.giamgia = giamgia;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getDonggia() {
        return donggia;
    }

    public void setDonggia(double donggia) {
        this.donggia = donggia;
    }

    public double getGiamgia() {
        return giamgia;
    }

    public void setGiamgia(double giamgia) {
        this.giamgia = giamgia;
    }
    public void intput(){
        Scanner sc =  new  Scanner (System.in);
        System.out.println("nhập số phần vào bàn phím");
        int a =  sc . nextInt();
        System.out.println("input hovaten");
        sc= new Scanner ( System.in);
        setHoten(sc.nextLine());
        System.out.println("input donggia");
        setDonggia( sc . nextDouble());
        System.out.println("input giamgia");
        setGiamgia( sc .nextDouble());
    }
    public void output(){
        System.out.println("ten"+getHoten());
        System.out.println("gia"+getDonggia());
        System.out.println("giamgia"+getGiamgia());
        
    }
    
    public static void main(String[] args) {
        bai3 t = new bai3();
        t.intput();
        t.output();
    }
}
