/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai11 {
    public boolean snt(int a){
        for(int i=2;i<a;i++){
                if(a%i==0){
                    return false;
                }
            }
         return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bai11 b11 = new Bai11();
        System.out.println("Nhap n: ");
        int n = Integer.parseInt(scan.nextLine());
        if(n==0||n==1){
            System.out.println(n+ " khong phải là so nguyen to");
        }
        if(b11.snt(n)==true){
            System.out.println(n+ " la so nguyen to!");
        }else{
            System.out.println(n+ " khong phai la so nguyen to!");
        }
    }      
}
