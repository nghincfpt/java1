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
public class hcn {
    public static void main(String[] args) {
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
}
