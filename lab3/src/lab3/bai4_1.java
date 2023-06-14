/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */ 
public class bai4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("nhap");
        int a = sc .nextInt();
        String hoten[]= new String[a];
        int  diem []= new int  [a];
        //nhập
        System.out.println("nhập");
        
        for( int i=0 ; i < a ; i++){
            System.out.println("nhập họ và tên"+i);
            sc .nextLine();
            hoten[i] = sc.nextLine();
            System.out.println("nhập điểm");
      diem[i] = sc.nextInt();  
        }
        System.out.println("suất");
        for(int  i =0 ; i < a ; i ++){
            System.out.println(hoten[i]);  
            System.out.println(diem[i]);
        }
    }
}
