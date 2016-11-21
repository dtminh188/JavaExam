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
public class Bai13 {
    
    public boolean sdx(String n){
        String n1="";
        char c;
        int a,b;
        for(int i= n.length()-1;i>=0;i--){
            c = n.charAt(i);
            n1 = n1+c;
        }
        a = Integer.parseInt(n);
        b = Integer.parseInt(n1);
        if(a==b) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bai13 b13 = new Bai13();
        System.out.println("Nhap so m: ");
        String m = scan.nextLine();
        if(b13.sdx(m))System.out.println(m+ " la so doi xung!");
        else System.out.println(m+ " khong phai la so doi xung!");
    }
}
