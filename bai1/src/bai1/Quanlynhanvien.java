/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import bai1.NhanVien;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Minh Huy
 */
public class Quanlynhanvien {
    static ArrayList<NhanVien> huy=new ArrayList();
    public void dummydata(){
    huy.add(new NhanVien("PD1100","Nguyễn Can",2000));
    huy.add(new NhanVien("PD2189","Trần Than Tâm",2900));
    huy.add(new NhanVien("PD4596","Lý Phước Hiếu",3100));
    huy.add(new NhanVien("PD6478","La Vân Tuấn",2750));
    huy.add(new NhanVien("PD1639","Đường Yên",1800));
    
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        String choice="y";
        do {            
            NhanVien e=new NhanVien();
            e.input();
            huy.add(e);
            System.out.println("Tiếp tục nhập (Y/N)");
            choice=sc.next();
        } while (choice.equalsIgnoreCase("Y"));
    }
    public void output(){
        for (NhanVien j : huy) {
            j.output();
        }
    }
    public void sortbySalary(){
    for(int i=0;i<huy.size()-1;i++){
    for(int j=i+1;j<huy.size();j++){
    if(huy.get(i).getLuong()<huy.get(j).getLuong()){
    Collections.swap(huy, i, j);
    }
    }
    }
    output();
    }
    public void menu(){
    Scanner sc=new Scanner(System.in);
    int choice=1;
        do {            
            System.out.println("Chương trình quản lý nhân viên"); 
            System.out.println("/-----------------------------/");
            System.out.println("0-- data input");
            System.out.println("1-- input");
            System.out.println("2-- output");
            System.out.println("3-- sắp xếp theo lương");
            System.out.println("/-----------------------------/");
            System.out.println("Mời chọn");
             choice=sc.nextInt();
            switch(choice){
                case 0: dummydata();
                break;
                case 1: input();
                break;
                case 2: output();
                break;
                case 3: sortbySalary();
                break;
            
            }
        } while (true);
    }
    
    public static void main(String[] args) {
        Quanlynhanvien ee=new Quanlynhanvien();
        ee.menu();
    }
}
 

