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
public class bai1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập số vào bàn phím:");
        int n=scanner.nextInt();
        boolean ok=true;
        for(int i=0;i<n-2;i++){
            if (n%i==0){
              ok =false;
                break;
            }      
        }
        if(ok=true){
            System.out.println("la so nguyen to");
        }else{
            System.out.println("khong phai la so nguen to");
        }
    }
    
}
