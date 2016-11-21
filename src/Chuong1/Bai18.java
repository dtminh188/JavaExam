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
public class Bai18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap a,b: ");
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int uc;
        int bc;
        for(uc=a;uc>=1;uc--){
            if(a%uc==0 && b%uc==0) {
                break;
            }
        }
        System.out.println("UCLN("+a+","+b+")= "+ uc);
        for(bc=a;bc<=a*b;bc++){
            if(bc%a==0 && bc%b==0) {
                break;
            }
       }
        System.out.println("BCNN("+a+","+b+")= "+ bc);
    }
}
