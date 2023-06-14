/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lalb2;

import java.util.Scanner;
import static lalb2.lab4menu.giaiphuongtrinhbac1;

/**
 *
 * @author ASUS
 */
public class lab4menu {
    public static void giaiphuongtrinhbac1() {
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
    }   
    public static void giaiphuongtrinhbac2(){
        Scanner scanner=new Scanner(System.in);
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
        if(a==0){
              if(a==0){
            if(b==0){      
                System.out.println("phuong trinh vo so nghiem");   
            }else{
                System.out.println("phuong trinh vo nghiem");
            } }
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
             }}
    public static void tinhtiendien(){
           Scanner scanner=new Scanner(System.in);
    System.out.println("nhập số điện vào");
    int  sodien= scanner.nextInt();
    int tien= sodien*1000;
    int tiendien= 50*1000+(sodien-50)*1200;
    if (sodien<=50){
            System.out.println("số tiền cần trả là:"+tien);
}else{
        System.out.printf("số tiền cần trả là: "+tiendien); 
    }
  
    }
   
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
   int i =1;
   while(i<7){
        System.out.println("+----------------------------------------+");
        System.out.println("+------1.giải phương trình bậc 1---------+");
        System.out.println("+------2.giải phương trình bậc 2---------+");
        System.out.println("+------3.tính tiền điện------------------+");
        System.out.println("+------0. thoát chương trình-------------+");
        System.out.println("+----------------------------------------+");  
        System.out.println("xin mời chọn chương trình mà bạn muốn nhập");
        int chon=scanner.nextInt();
        switch(chon){
            case 1:
                giaiphuongtrinhbac1();
                break;
            case 2:
                giaiphuongtrinhbac2();
                break;
            case 3:
                tinhtiendien();
                break;
            default:
                System.out.println("xin chào và hẹn gặp lại");
                System.exit(0);
                break;     
        }
        System.out.println("\n xin mời chọn tiếp chương trình!!!");
   i++;
   }
    }

}
          

