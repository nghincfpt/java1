/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class bai4 {
    public static void main(String[] args) {
        
        String hoTen[];
        double diem[];
        int n;  // ho ten va diem cung phan tu
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        n   = sc.nextInt();
        hoTen   = new String[n];
        diem    = new double[n];
        
        // nhap mang
        System.out.println("NHAP MANG: ");
        for(int i = 0; i < n; i++){
            System.out.println("Nhap sv " + i);
            sc.nextLine();
            hoTen[i]    = sc.nextLine();
            System.out.println("Nhap diem: ");
            diem[i] = sc.nextDouble();
        }
        
        // xuat
        for(int i = 0; i < n; i++){
            System.out.println(hoTen[i] + " diem " + diem[i]);
            
            if( diem[i] <0 || diem[i] >10){
            System.out.println("xin moi nhap lai(diem >= 0 va diem <=10)");
        }else if  (diem[i] > 9 ){
            System.out.println("hoc luc suat sac");
            } else if(diem[i]>8){
            System.out.println("hoc luc gioi");
        }else if(diem[i]>6){
        System.out.println("hoc sinh kha");
    }else if ( diem[i]>5){
            System.out.println("hoc sinh trung binh");
    }else if (diem[i]>3){
            System.out.println("hoc sinh yeu");
    }else{
            System.out.println("hoc sinh kem");
    }
    }       
            
        
        
        // xap xep
        for(int i = 0; i < n-1; i++){
            for(int j = i; j < n; j++){
                if(diem[i] > diem[j]){
                    double abs = diem[i];
                    diem[i] = diem[j];
                    diem[j] = abs;
                    
                    String abss = hoTen[i];
                    hoTen[i]    = hoTen[j];
                    hoTen[j]    = abss;
                }
            }
        }
        System.out.println("xap xep");
        for(int i = 0; i < n; i++){
            System.out.println(hoTen[i] + " diem " + diem[i]);
    }
    }
    
    
    
    
    public static void main008(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so sinh vien");
    int a = sc . nextInt();
    
        String mang[]  = new String[a];
        System.out.println("nhap mang");
       for( int i =0 ; i < a ; i ++){
           System.out.println( "nhap mang"+i);
           mang[i] = sc .nextLine();
               System.out.println("nhap diem");
               int diem= sc  . nextInt();
        System.out.println("xuat mang"+Arrays.toString(mang));
        if( diem <0 || diem >10){
            System.out.println("xin moi nhap lai(diem >= 0 va diem <=10)");
        }else if  (diem > 9 ){
            System.out.println("hoc luc suat sac");
            } else if(diem>8){
            System.out.println("hoc luc gioi");
        }else if(diem>6){
        System.out.println("hoc sinh kha");
    }else if ( diem>5){
            System.out.println("hoc sinh trung binh");
    }else if (diem>3){
            System.out.println("hoc sinh yeu");
    }else{
            System.out.println("hoc sinh kem");
    }
    }       
    }
    
    
 
}
