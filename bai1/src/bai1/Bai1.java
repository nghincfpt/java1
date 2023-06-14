/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Minh Huy
 */
public class Bai1 {
   static double A[]= new  double[3];
  public static void input(){
      Scanner sc=new Scanner(System.in);
  for(int i=0;i<A.length;i++){
      System.out.printf("A["+i+"]:");
      A[i]=sc.nextDouble();
  }
  }
  public static void output(){
      System.out.println("Xuất ra mảng:");
  for(int i=0;i<A.length;i++){
      System.out.println("A["+i+"]="+A[i]);
  }
  }
  public static void max(){
      System.out.println("Tìm phần tử lớn nhất");
  int MAX= (int) A[0];
  for(int i=0;i<3;i++){
  if(A[i]>MAX){
  MAX=(int) A[i];
  }
  }
      System.out.println("Max: "+MAX);
  }
    public static void main(String[] args) {
       input();
       output();
       max();
        
    }
    
}

