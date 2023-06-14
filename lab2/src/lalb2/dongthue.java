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

public class dongthue {
    public static void dongthuethunhap (){
     Scanner scanner= new Scanner(System.in);
         for(int b=1;b<4;b++){
        System.out.println("nhập số lương của bạn:");
    int a=scanner.nextInt();
    if(a<9000){
            System.out.println("không đóng thuế");
}else if(a>=10000 && a <15000){
            System.out.println("đóng thuế 10%");
}else if(a>=15000 && a<30000){
            System.out.println("đóng thuế 15%");
} else{
            System.out.println("đóng thuế 20%");
}
             
}
}    
    public static void nghi() {      
    }
    public static void tung() {
        
    }
    public static void duong() {
        
    }
    public static void main(String[] args) {
        int n=1;
        while(n<6){
        Scanner scanner=new Scanner(System.in);
        System.out.println("==================menu=========");
        System.out.println("========1.dongthue===============");
        System.out.println("==========2.nghi================");
        System.out.println("==========3.tung===============");
        System.out.println("==========4.duong===============");
        System.out.println("mời bạn chọn chương trình");
    int chon= scanner.nextInt();
    switch(chon){
        case 1:
            dongthuethunhap();
            break;
        case 2:
            nghi();
            break;
        case 3:
            tung();
            break;
        case 4:
            duong();
            break;
        default :
            System.out.println("qúy khách đã thoát khỏi chương trình");
            System.exit(0);
            break;
    }   
    n++;
            System.out.println("xin mời bạn chọn tiếp chương trình");
}
    }
}
