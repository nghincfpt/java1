
import java.util.Scanner;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class lab4_1 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner( System.in);
        System.out.println("nhâp sô phần tử");
        int n = sc . nextInt();
        String mang[]= new String[n];
        double diem[]= new double [n];
        // nhập 
        System.out.println("nhập mang");
        for(int i = 0 ; i < n ; i++){
        System.out.println("họ và tên:"+i);
              sc. nextLine();
        mang[i]= sc .nextLine();

            System.out.println("nhập điểm");
            diem[i]= sc. nextDouble ();
        } 
        System.out.println("suất mảng");
        for( int i = 0 ;  i < n  ;i++){
            System.out.println( mang[i]);
            System.out.println(diem[i]);
            
            System.out.println("hoc lưc");
            if ( diem[i]>10 && diem[i] <0){
                System.out.println("xin mời nhập lại (diểm 0 ------>10)");
            }else if ( diem[i]> 9){
                System.out.println("suát sắc");
            }else if ( diem[i]>8){
                System.out.println("giỏi");
            } else if (diem[i]> 6.5 ){
                System.out.println("khá");
            }else if( diem[i] > 5){
                System.out.println("trung bình");
            }else {
                System.out.println("yếu");
            }
        }
        // xắp xếp
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if (diem[i] > diem[j]) {
                    double team = diem[i];
                    diem[i] = diem[j];
                    diem[j] = team;
                   
                    String h = mang[i];
                    mang[i] = mang[j];
                    mang[j] =  h;
                }
        }
    }
    for( int i =0 ; i< n ; i ++){
        System.out.println(mang[i]+ diem[i]);
    }
    }
}
