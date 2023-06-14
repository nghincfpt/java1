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
public class menu {
    public static void hocsinh(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("họ và tên: ");
        String hoten= scanner.nextLine();
        System.out.println("điểm trung bình: ");
        double diemtb= scanner.nextDouble();
    }
    public static void hcn() {
         Scanner scanner = new Scanner (System.in);
          System.out.println("nhập chiều dài: ");
        int cd = scanner.nextInt();
        System.out.println("nhập chiều rộng: ");
        int cr= scanner.nextInt();
      
        int chuvi = (cd+cr)*2;
        int dientich= cr *cd;
        // Cạnh nhỏ nhất = Math.min(dai, rong)
        int cnn = Math.min(cr, cr);
        int cn = Math.max(cr,cd);
        System.out.println("chu vi là: "+ chuvi);
        System.out.println("diện tích là: "+ dientich);
        System.out.println("cạnh nhỏ nhất là: "+cnn);
        System.out.println("cạnh lớn nhất là: "+ cn);
    }
    public static void hlp(){
         Scanner scanner = new Scanner(System.in);
          System.out.println("nhap canh vao");
        int canh = scanner.nextInt();
      
              
        int dientich =canh*canh*canh;
        System.out.println("diện tích lập phương là: "+ dientich);
    }
    public static void delta(){
         Scanner scanner = new Scanner( System.in);
          System.out.println("nhập a là : ");
        int a = scanner.nextInt();
      System.out.println("nhập b là: ");
        int b = scanner.nextInt();
      System.out.println("nhập c là: ");
            int c = scanner.nextInt();
        
        //Delta = Math.pow(b, 2) – 4 * a * c
//Sử dụng Math.sqrt(delta) để tính căn delta
         int Delta =  (int) (Math.pow(b,2)-(4*a*c));
         System.out.println("delta bằng: "+ Delta); 
    }
    
    public static void main(String[] args) {  
        Scanner scanner=new Scanner (System.in);
        int i=1;
        while(i<5){
        System.out.println("========menu========");
        System.out.println("=1ghi học sinh=======");
        System.out.println("=2.tinh chu vi dt===");
        System.out.println("=3.tinh hình lp=====");
        System.out.println("=4.delta============");
        System.out.println("=0.thoát chương trình");
        System.out.println("xin mời chọn chương trình");
     
        int chon= scanner.nextInt();
        switch(chon){
        case 1:
            hocsinh();
            break;
        case 2:
            hcn();
            break;
        case 3:
            hlp();
            break;
        case 4:
            delta();
                break;
                default:
                    System.out.println("xin chào và hẹn gặp lại!!!!");
                    System.exit(0);
                   
                break;
                
        }
        i++;
        }
           System.out.println("xin chào và hẹn gặp lại!!!!");
        
    }
}
