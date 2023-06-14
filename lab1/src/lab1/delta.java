/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class delta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
          System.out.println("nhập a là : ");
        int a = scanner.nextInt();
      System.out.println("nhập b là: ");
        int b = scanner.nextInt();
      System.out.println("nhập c là: ");
            int c = scanner.nextInt();
        /*
        Delta = Math.pow(b, 2) – 4 * a * c
 Sử dụng Math.sqrt(delta) để tính căn delta
        */
         int Delta =  (int) (Math.pow(b,2)-(4*a*c));
   
         System.out.println("delta bằng: "+ Delta);
    }
}
