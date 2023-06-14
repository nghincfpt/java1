/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gd2;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class listnhanvien {
    static ArrayList < nhanvien> listnv=new ArrayList<>();
    public void input(){
        Scanner sc = new Scanner (System.in);
        String choice = "y";
        do{
           nhanvien nv = new nhanvien();
           nv.input();
           listnv.add(nv);
            System.out.println("bạn muốn tiếp tuc ?y/n");
            choice = sc.next();
        }while(choice.equalsIgnoreCase("y"));
    }
    public void output(){
        for(nhanvien nhanvien :listnv){
            nhanvien.output();
        }
    }
    public int findbyid(String manv){
        for(int i = 0; i < listnv.size();i++){
            nhanvien nv = listnv.get(i);
            if(nv.getManv().equalsIgnoreCase(manv)){
                System.out.println("da tim thay tại vị tri: "+i);
                nv.output();
                return i;
            }
        }
        return -1;
    }
    public void delbyid(String manv){
        int postion = findbyid(manv);
        if(postion<0){
            System.out.println("khong tim thay nhan vien");
        }else{
            listnv.remove(postion);
            System.out.println("da xoa nhan vien tai vi tri: "+postion);
        }
    }
    public void dumydata(){
        listnv.add(new nhanvien("pd05001","nguyễn văn thiên",9000));
        listnv.add(new nhanvien("pd05002","nguyễn thị việt",17000));
        listnv.add(new nhanvien("pd05003","nguyễn thị phương lan",6000));
        listnv.add(new nhanvien("pd05004","nguyên văn thao",8000));
        listnv.add(new nhanvien("pd05005","nguyễn văn minh",21000));
        listnv.add(new nhanvien("pd05006","nguyễn công nghi",12000));
        listnv.add(new nhanvien("pd05007","nguyễn văn khiêm",5000));
        listnv.add(new nhanvien("pd05008","nguyễn đứa dương",17000));
        listnv.add(new nhanvien("pd05009","nguyên thị hương  giang",5000));
        listnv.add(new nhanvien("pd050010","ngyễn thị phương uyên",11000));
     
    }
    public void  update(String manv){
        int pos = findbyid(manv);
        if(pos< 0 ){
            System.out.println(" khong tim thay nhan vien:"+manv);
        }else{
            nhanvien nvnew = new nhanvien();
            nvnew .input();
            listnv.set(pos,nvnew);
            System.out.println("cap nhat thanh cong");
        }
     
    }
    public void getfindsalary(double min,double max){
        for(nhanvien nv : listnv){
            if(nv.getLuong()>= min && nv.getLuong()<=max){
                nv.output();
                
            }
        }
    }
    public void getsortbyname(){
        for(int i =0;i<listnv.size()-1;i++){
            for(int j = i+1;j<listnv.size();j++){
                if(splitname(listnv.get(i).getHoten())
                        .compareTo(splitname(listnv.get(j).getHoten()))>0){
                    Collections.swap(listnv, i, j);
                    
                }
            }
        }
    }
    public String splitname(String fullname){
        String name =fullname.substring(fullname.lastIndexOf(" ")+1);
        return name;
    }
    public void getsortbytn(){
       for(int i=0 ; i<listnv.size()-1;i++){
       for(int j=i+1 ; j<listnv.size();j++){
           nhanvien nvi=listnv.get(i);
           nhanvien nvj=listnv.get(j);
           if(nvi.getthunhap(nvi.getLuong())<nvj.getthunhap(nvj.getLuong())){
             Collections.swap(listnv, i, j);
           }

           
       } 
    }
    }
    public void gettop5thunhap(){
        getsortbytn();
       int top =5;
       if(listnv.size()<5){
           top = listnv.size();
       }
       for(int i =0 ; i<top ;i++){
           nhanvien nv = listnv.get(i);
           nv.output();
       }
    }
    public static void main(String[] args) {
        
    }
     
}
