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
public class ba2ptbac2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for(int i=1;i<3;i++){
           System.out.println("nhap a");
        int a  = scanner.nextInt();
        System.out.println("nhap b");
        
              int b  = scanner.nextInt();
        System.out.println("nhap c");
        
              int c  = scanner.nextInt();
        int delta = b*b-4*a*c;
        int x= -b/2*a;
        int x1= (int) ((-b - Math.sqrt(delta))/(2*a));
        int x2= (int) ((-b+ Math.sqrt(delta))/(2*a));
        if(a==0)
        {
              if(a==0){
            if(b==0){
                
                System.out.println("phuong trinh vo so nghiem");
                
            }else{
                System.out.println("phuong trinh vo nghiem");
            }
    }
        else{
            System.out.println("nghiem của phương trình là:"+(-b/2*a));
        }
        }
            else if(delta<0){
                 System.out.println("phuong trinh vo nghiem"+ delta);
             }
             else if  (delta==0){
                 System.out.println("phuong trinh co nghiem kep"+x);
             } else {
                 System.out.println("phhuong trinh co 2 nghiem phan biet la:"+x1 +"nghiem 2 " +x2);
                 
                
             }
            System.out.println("xin mơi bạn phương trinh bạn muốn nhập ");
        }
}
}
             

         
    
    

