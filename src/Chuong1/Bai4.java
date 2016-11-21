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
public class Bai4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap gio bat dau: ");
        int a = scan.nextInt();
        System.out.println("Nhap gio ket thuc: ");
        int b = scan.nextInt();
        int coutH = 0;
        if(a<0 || a>24 || b<0 || b>24){
            System.out.println("Ban da nhap sai thoi gian!");
        }else{
            coutH = b-a;
            if(coutH<18) System.out.println("so tien phai tra: "+(coutH*45000));
            else System.out.println("so tien phai tra: "+(coutH*60000));
        }
    }
}
