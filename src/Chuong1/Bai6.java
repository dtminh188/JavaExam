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
public class Bai6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int n = scan.nextInt(); 
        float tong = 0;
        if(n==0){
            System.out.println("Vui long nhap n khac 0!");
            n = scan.nextInt();
        }
        for(int i=1;i<=n;i++){
            tong = tong + (float)1/i;
            }
        System.out.println("Tong la: "+tong);
        
    }
}
