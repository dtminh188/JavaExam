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
public class Bai17 {
    public boolean fibonaci(int a){
        if(a==0||a==1){
            return true;
        }
        int n1=0,n2=1;
        int n3=0;
        while(n3<a){
            n3=n1+n2;
            if(n3==a) return true;
            n1=n2;
            n2=n3;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bai17 b17 = new Bai17(); 
        System.out.println("Nhap n: ");
        int n = scan.nextInt();
        if(b17.fibonaci(n)) System.out.println(n+ " thuoc day fibonaci!");
        else System.out.println(n+ " khong thuoc day fibonaci!");
    }
}
