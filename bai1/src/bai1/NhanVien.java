/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Minh Huy
 */
public class NhanVien {
    private String manv;
    private String ten;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String manv, String ten, double luong) {
        this.manv = manv;
        this.ten = ten;
        this.luong = luong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập id:");
        setManv(sc.nextLine());
        System.out.println("Nhập name:");
        setTen(sc.nextLine());
        System.out.println("Nhập salary:");
        setLuong(sc.nextDouble());
    }
    public void output(){
        
        System.out.println("ID:"+getManv()+"-Name:"+getTen()+"-Salary:"+getLuong());
    }
}
