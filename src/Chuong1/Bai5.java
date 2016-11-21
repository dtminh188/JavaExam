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
public class Bai5 {
    public static void main(String[] args) {
        int[] namthuong = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] namnhuan = {31,29,31,30,31,30,31,31,30,31,30,31};
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap thang, nam: ");       
        int month = scan.nextInt();
        int year = scan.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0))
            System.out.println("so ngay cua thang do la: "+ namnhuan[month-1]);
        else System.out.println("so ngay cua thang do la: "+namthuong[month-1]);
    }
}
