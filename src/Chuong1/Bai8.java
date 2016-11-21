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
public class Bai8 {
   public float giaithua(int a){
        float result = 1;
        for(int i=1;i<=a;i++){
            result*=i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bai8 b8 = new Bai8();
        System.out.println("Nhap n: ");
        int n = Integer.parseInt(scan.nextLine());
        float tong =0;
        if(n==0){
            System.out.println("Tong la: "+tong);
        }else{             
            for(int i=1;i<=n;i++){
                tong+=1/b8.giaithua(2*i-1);
            }
        System.out.println("Tong la: "+tong);
        } 
    }
}
