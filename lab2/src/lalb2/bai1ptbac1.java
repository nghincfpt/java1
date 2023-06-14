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
public class bai1ptbac1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner= new Scanner(System.in);
           System.out.println("nhap a");
        int a = scanner.nextInt();
        System.out.println("nhap b");
        
        int b= scanner.nextInt();
        System.out.println("nhap c");
     
        if(a==0){
            if(b==0){
                
                System.out.println("phuong trinh vo so nghiem");
                
            }else{
                System.out.println("phuong trinh vo nghiem");
            }
    }
        else{
            System.out.println("nghiem cau pt la:"+(-b/2*a));
        }
    }}
    
    

