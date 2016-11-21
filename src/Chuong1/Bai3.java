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
public class Bai3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap a: ");
        int a = Integer.parseInt(scan.nextLine());
        System.out.println("nhap b: ");
        int b = Integer.parseInt(scan.nextLine());
        System.out.println("nhap c: ");
        int c = Integer.parseInt(scan.nextLine());
        
        int max,min;
        max = a; min = a;
        if(b>max) max = b;
        if(b<min) min = b;
        if(c>max) max = c;
        if(c<min) min =c;
        int stg = a+b+c-max-min;
        System.out.println("so trung gian trong 3 so a,b,c la: "+stg);
    }
}
