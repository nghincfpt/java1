/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.PrintStream;

/**
 *
 * @author ASUS
 */
public class bccvatbc {
    public static void main001(String[] args) {
    int a=7;
    int s=1;
    while(s<10){
            System.out.printf("%d*%d=%d\n",s,a,s*a);
            s++;
}
}
    public static void main(String[] args){
        int i=0;
       int sum=0;
        int count=0;
        while(i<1000){
            if(i%2!=0){
              sum+=i;
                count++;
            }
            i++;
        }
          int tbc= sum/count;
        System.out.printf("các số chia hết cho 3:%d",count);
        System.out.printf("\ntổng các số chia hết cho 3:%d",sum);
        System.out.printf("\ntrung bình cộng là:%d",tbc);
        }
}

