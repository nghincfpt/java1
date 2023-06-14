/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.util.Scanner;
import java.util.Arrays;

public class sinhvien {
    public static void main(String[] args) {
  String[]mang= new String[5];
  Scanner scanner = new Scanner(System.in);
          for(int i=0;i<5;i++){
            System.out.printf("nhập sinh viên:%d",(i+1));
            mang[i]=scanner.nextLine();
        }
        System.out.println(" mảng sinh viên:"+Arrays.toString(mang));   
    }
}


