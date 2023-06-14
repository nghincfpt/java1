package lab4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Employee {

    private int id;
    private String name;
    private double salyry;

    public Employee() {
    }

    public Employee(int id, String name, double salyry) {
        this.id = id;
        this.name = name;
        this.salyry = salyry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalyry() {
        return salyry;
    }

    public void setSalyry(double salyry) {
        this.salyry = salyry;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input id:");
        setId(sc.nextInt());
        sc = new Scanner (System.in);
        System.out.println("input name:");
        setName(sc.nextLine());
        System.out.println("input salary");
        setSalyry(sc.nextDouble());
    }

    public void output() {
        System.out.println("id" + getId());
        System.out.println("name" + getName());
        System.out.println("salary:" + getSalyry());
    }
    public static void main(String[] args) {
        Employee ee= new Employee();
        ee.input();
        ee.output();
    }
}
