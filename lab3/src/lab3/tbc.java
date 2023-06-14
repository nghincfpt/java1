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
public class tbc {
    public static void main001(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []mang=new int[10];
      int i=0;    
        do {            
            System.out.printf("nhập mảng %d=",i);
            mang[i]=scanner.nextInt();
            i++;            
        } while (i<10);
    }
}
