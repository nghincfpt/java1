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
public class hlp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap canh");
        int canh = scanner.nextInt();
        int dientich =canh*canh*canh;
        System.out.println("diện tích lập phương là: "+ dientich);
    }
}
