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
public class main {
    public static void main(String[] args) {
//       listnhanvien ls = new listnhanvien();
//       ls.input();
//       ls.output();
        menu();
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        listnhanvien ls = new listnhanvien();
        int chon = 0;
     
        while(true){    
            System.out.println("======================MENU=====================================");
            System.out.println("+-----------------0.DANH SÁCH ---------------------------------+");
            System.out.println("+-----------------1.NHẬP DANH SÁCH-----------------------------+");
            System.out.println("+-----------------2.SUẤT DANH SÁCH-----------------------------+");
            System.out.println("+-----------------3.TÌM NHÂN VIÊN THEO MANV---------------------+");
            System.out.println("+-----------------4.XÓA NHÂN VIÊN THEO MANV-------------------+");
            System.out.println("+-----------------5.CẬP NHẬT THÔNG TIN THEO MẢNG---------------+");
            System.out.println("+-----------------6.HIỂN THỊ THÔNG TIN THEO KHOẢNG LƯƠNG----- +");
            System.out.println("+-----------------7.SẮP SẾP THEO TÊN---------------------------+");
            System.out.println("+-----------------8.SẮP XẾP THEO THU NHẬP----------------------+");
            System.out.println("+-----------------9.TOP 5 THU NHẬP------------------+");
            System.out.println(                   "MỜI BẠN CHỌN");
            chon = sc.nextInt();
            switch (chon) {
                case 0:
                    ls.dumydata();
                    break;
                case 1:
                    ls.input();
                    break;
                case 2:
                    ls.output();
                    break;
                case 3:
                    System.out.println("nhap MANV can tim:");
                    String findManv = sc.next();
                    int pos = ls.findbyid(findManv);
                    if(pos <0){
                        System.out.println("khong tim thay nhanvien");
                    }
                    break;
                case 4:
                    System.out.println("nhap manv can xoa:");
                    String delManv =sc.next();
                    ls.delbyid(delManv);
                    break;
                case 5:
                    System.out.println("nhap manv can sủa:");
                    String updateManv =sc.next();
                    ls.update(updateManv);
                    break;
                case 6:
                    System.out.println("nhap khoang lương từ:");
                    double minsalary = sc.nextDouble();
                    System.out.println("nhập khoảng lương đến : ");
                    double maxsalary = sc.nextDouble();
                    ls.getfindsalary(minsalary, maxsalary);
                    break;
                case 7:
                    ls.getsortbyname();
                    ls.output();
                    break;
                case 8:
                    ls.getsortbytn();
                    ls.output();
                    break;
                case 9:
             ls.gettop5thunhap();
                   
                    break;
            }
        }
    }
 
    }

