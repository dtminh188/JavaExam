/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong6;

import java.util.Scanner;

/**
 *
 * @author Ta Quang Hoang
 */
public class bai5 {
    public static void nhapmanghaichieu(int n,int m,int [][]a){
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("a["+i+"]"+"["+j+"]:");
                a[i][j] = Integer.parseInt(scan.nextLine());
            }
        }            
    }
    
    public static void xuatmanghaichieu(int n,int m,int [][]a){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void xuatmang1chieu(int []b){
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println("");
    }
    
    public static int tichboi3hangdau(int [][]a){
        int tich = 1;
        for(int j=0;j<a[0].length;j++){
            if(a[0][j]%3==0){
                tich*=a[0][j];
            }
        }
        return tich;
    }
    
    public static int[] mang(int []b,int [][]a,int n,int m){
        int max=0;
        for(int i=0;i<n;i++){
            max=a[i][0];
            for(int j=1;j<m;j++){
                if(max<=a[i][j]){
                    max=a[i][j];
                }
            }
            b[i]=max;
        }
        return b;
    }
    
    public static int[] xoa(int []b,int n){
       for(int i=0;i<n-1;i++){
           b[i]=b[i+1];
           n--;
       }
       return b;
    }
    
    public static void main(String[] args) {
        int n,m;
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap so hang: ");
        n = Integer.parseInt(scan.nextLine());
        System.out.println("Nhap so cot: ");
        m = Integer.parseInt(scan.nextLine());
        int [][]a = new int[n][m];
        int []b = new int[n];
        nhapmanghaichieu(n, m, a);
        xuatmanghaichieu(n, m, a);
        System.out.println(tichboi3hangdau(a));
        mang(b, a, n, m);
        xuatmang1chieu(b);
        xoa(b,n);
        xuatmang1chieu(b);
    }
}
