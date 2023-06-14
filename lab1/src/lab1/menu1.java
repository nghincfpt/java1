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
public class menu1 {
    public static void hocsinh() {
           Scanner scanner = new Scanner(System.in);
        System.out.println("họ và tên: ");
        String hoten= scanner.nextLine();
        System.out.println("điểm trung bình: ");
        double diemtb= scanner.nextDouble();
    }
    public static void hlp(){
           Scanner scanner = new Scanner(System.in);
           System.out.println("nhap canh");
        int canh = scanner.nextInt();
        int dientich =canh*canh*canh;
        System.out.println("diện tích lập phương là: "+ dientich);
    }
  
  
    public static void main(String[] args) {
      
        
        Scanner scanner = new Scanner(System.in);
  int i=1;
  while(i<5){
        System.out.println("=========================================");
        System.out.println("=============1.hoc sinh====================");
        System.out.println("===============2.hlp======================");
        System.out.println("=================3.========================");
        System.out.println("==============0.thoat=====================");
         
        System.out.println("==========chon chuong trinh===============");
        int chon=scanner.nextInt();
        switch(chon){
            case 1:
                hocsinh();
                break;
            case 2:
            hlp();
            case 3:
                break;
            default:
                System.out.println("cam on ban da tham gia chuong trinh!!!!");
                System.exit(0);
                break;
        }
        i++;
         System.out.println("moi ban chon de tiep tuc chuong trinh!!");
  }
    }
}
