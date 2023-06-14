/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gd2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class nhanvien {
    private String manv;
    private String hoten;
    private double luong;
   
    public nhanvien() {
    }

    public nhanvien(String manv, String hoten, double luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.luong = luong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    public void input(){
        Scanner sc= new Scanner (System.in);
        System.out.println("input manv: ");
        setManv(sc.nextLine());
        
        System.out.println("input ho ten");
             sc=new Scanner(System.in);
        setHoten(sc.nextLine());
   
        
        System.out.println("input luong");
        setLuong(sc.nextDouble());
     
      
        }
    

     public void output(){
        System.out.println("MaNV:"+getManv()+"-Name:"+getHoten()+"-Salary:"+getLuong()+"-Thuế:"+ getThuetn(getLuong())+"-Thu Nhập:"+ getthunhap(getLuong()));
       
    }
       public double getThuetn(double salary){
           double  tax=0;
           if(salary <=9000){
               tax=0;
           }else if (salary <=15000){
               tax=(salary-9000)*0.1;
           }else{
               tax = (salary - 15000)*0.12+6000*0.1;
           }
        return tax;
       }
       public double getthunhap(double salary){
           return salary - getThuetn(salary);
       }
    public static void main(String[] args) {
        nhanvien list = new nhanvien();
        list.input();
        list.output();
    }
}
