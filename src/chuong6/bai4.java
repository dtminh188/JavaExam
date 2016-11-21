/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong6;

import java.sql.Array;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Ta Quang Hoang
 */
public class bai4 {

    public static void nhapmang(int n,int[] a) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(scan.nextLine());
        }
    }

    public static void totalodd(int n,int[] a) {
        int totalodd = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                totalodd += a[i];
            }
        }
        System.out.println("Tong so le: " + totalodd);
    }

    public static int f(int n,int k,int[] a) {       
        int i = 0;
        while (i < n && a[i] != k) {
            i++;
            if (i >= n) {
                return -1;
            }
        }
        return i;
    }

    public static void find(int n,int k,int [] a){
        if(f(n,k,a)==-1){
            System.out.println("k khong co trong mang a.");
        }else{
            System.out.println("k co trong mang a.");
            System.out.println("o vi tri dau tien: "+f(n,k,a));
        }
    }
    
//Bubble Sort
    public static void sx(int[] a) {
        //int tmp = 0;
       for(int i = 0; i< a.length; i++){
            for (int j = a.length - 1; j > 0; j--) {
               if(a[j] < a[j-1]){
                   int temp = a[j];
                   a[j] = a[j-1];
                   a[j-1] = temp;
               }
            }    
        }
    }

    public static void xuatmang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");          
        }
        System.out.println("\n");
    }

    public static void chen(int k, int [] a){              
        int [] b = new int[a.length+1];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        for(int j=b.length-1;j>=3;j--){           
           b[j] = b[j-1];       
        
        }
           b[3]=k;
        sx(b);
        xuatmang(b);
    }
    public static void chen1(int k, int []a){
        for(int i=0;i<=a.length;i++){
            a[i+1] = a[i];
        }
        a[0]=k;
       // a.length++;
        xuatmang(a);
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap so phan tu n: ");
        Scanner scan = new Scanner(System.in);
        n = Integer.parseInt(scan.nextLine());
        int[] a = new int[n];
        nhapmang(n,a);
        xuatmang(a);
        Arrays.sort(a);
        xuatmang(a);
       // Arrays.stream(a);
        xuatmang(a);
//        totalodd(n,a);
//        int k;
//        System.out.println("nhap k: ");
//       // Scanner scan = new Scanner(System.in);
//        k = Integer.parseInt(scan.nextLine());
//        find(n,k,a);
  //      sx(a);
//        xuatmang(a);
  //      chen(1, a);
  //      xuatmang(a);
    }
}
