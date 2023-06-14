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
public class bai3_1 {
    public static void main(String[] args) {
        Scanner   sc = new Scanner  ( System.in);
        System.out.println("nhập số phần tử của mảng");
        int a = sc .nextInt();
        int mang[]  =  new  int [a];
        // nhập mảng
        System.out.println("nhập mảng");
         for( int i =0 ; i < a ; i++){
             System.out.println("nhập mảng"+ i);
             mang[i] =  sc . nextInt();
         }
         // xuất 
         Arrays.sort(mang);
         System.out.println("suất mảng");
         for( int x : mang){
             System.out.println(x);
         }
         // min 
         int n = mang[0];
         for( int i =0 ; i < a ;i ++){
             n=Math.min(n,mang[i]);
         }
              System.out.println("min="+n);       
         // tbc : 3
         int sum = 0 ;
         int count = 0 ;
         for( int  x : mang){
             if( x %3==0){
                 sum = sum +x;
                 count++;
             }}
             System.out.println("tổng các số chia hêt cho 3:"+sum);
         int avg = sum/ count;
         System.out.println("avg"+ avg);
    }
}
