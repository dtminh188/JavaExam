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
public class Bai7 {
    public float giaithua(int a){
        float result = 1;
        for(int i=1;i<=a;i++){
            result*=i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bai7 b7 =  new Bai7();
        System.out.println("Nhap n: ");
        int n = Integer.parseInt(scan.nextLine());
        float tong =15;
        if(n==0){
            System.out.println("Tong la: "+tong);
        }else{             
            for(int i=1;i<=n;i++){
            if(i%2==0){
                tong+=1/b7.giaithua(i);
            }else{
                tong-=1/b7.giaithua(i);
            }  
        }
        System.out.println("Tong la: "+tong);
        } 
    }
}
