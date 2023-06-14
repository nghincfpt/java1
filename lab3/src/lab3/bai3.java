/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.util.Scanner;
import java.util.Arrays;

public class bai3{
    public static void main001(String[] args) {
       int mang[]=new int[10];
       Scanner scanner = new Scanner(System.in);
       for(int i=0;i<10;i++){
           System.out.printf("nhạp mảng vào%d:",i);
           mang[i]=scanner.nextInt(); 
       }
// System.out.println("xuất mảng"+Arrays.toString(mang));
            Arrays.sort(mang);
           System.out.println("xuất mảng"+Arrays.toString(mang));
    } 
    public static void main(String[] args) {
     Scanner sc     = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang: ");
        int n   = sc.nextInt();
        int mang[]  = new int[n];
        // nhap mang
        System.out.println("NHAP MANG");
        for(int i = 0; i < n; i++){
        System.out.println("Nhap mang " + i);
         mang[i] = sc.nextInt();
        }
        Arrays.sort(mang);
        // xuat mang
        System.out.println("XUAT MANG");
        for(int x: mang){          
        System.out.println(x);
        }
        // xuat min
        int a = mang[0];
        for(int i = 0; i < n; i++){
         a = Math.min(a, mang[i]);
        }
         System.out.println("Min: " + a);       
    }
}
