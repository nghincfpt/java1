/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lalb2;

import java.util.Scanner;
public class bai3tiendien {
    public static void tinhtiendien(){
    Scanner scanner=new Scanner(System.in);
    int a=0;
    do{
    System.out.println("nhập số điện vào");
    int  sodien= scanner.nextInt();
    int tien= sodien*1000;
    int tiendien= 50*1000+(sodien-50)*1200;
    if (sodien<=50){
            System.out.println("số tiền cần trả là:"+tien);
}else{
        System.out.printf("số tiền cần trả là: "+tiendien); 
    }
  
    } while(a<4);
    }
    public static void main(String[] args) {
   tinhtiendien();
     
}
}