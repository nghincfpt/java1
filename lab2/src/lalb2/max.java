/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lalb2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class max {
    public static void main001(String[] args) {
        Scanner scanner= new Scanner(System.in);
          System.out.println("nhap a");
        int a = scanner.nextInt();
        System.out.println("nhap b");
             int b =scanner.nextInt();
        System.out.println("nhap c");
             int c = scanner.nextInt();
             int max= a>b?a:b;
        if (c>max){
         
            System.out.println("so lon nhat la:"+c);
            
    } else if(c<max){
            System.out.println("so lon nhat la:"+max);
    }
}
    public static void main(String[] args) {
             int j=1;
        for (int i=1;i<=10;i++){
        
                System.out.printf("%d * %d =%d\n",i,j,i*j);
 
        }
        
    }
}