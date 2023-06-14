/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Student {
  private String hoten;
  private double diem;

    public Student() {
    }

    public Student(String hoten, double diem) {
        this.hoten = hoten;
        this.diem = diem;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
  public void input(){
      Scanner sc =  new   Scanner(System.in);
      System.out.println("output hovaten:");
      setHoten(sc  . nextLine());
      System.out.println(" output diem:");
      setDiem(sc  . nextDouble());
      
}
 
      
  
  public void output(){
      System.out.println("otput ten sinh vien:"+getHoten());
      System.out.println("output diem:"+getDiem());
       if (diem>= 9 ){
          System.out.println("sinh vien gioi");
      } else if ( diem >= 7 ){
          System.out.println("sinh vien kha");
      } else if (diem>=5){
          System.out.println("sinh vien trung binh");
      } else {
          System.out.println("sinh vien yeu");
      }
}
  
    public static void main(String[] args) {
        Student  tt  = new Student();
        tt.input();
        tt.output();
                 
    }
}