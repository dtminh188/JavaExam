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
public class Bai10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap m: ");
        long m = Long.parseLong(scan.nextLine());
        int s=0,p=1;
        long tmp;
        do{
            tmp=m%10;
            s+=tmp;
            p*=tmp;
            m/=10;
        }while(m!=0);
        System.out.println("s: "+s );
        System.out.println("p: "+p );
    }
}
