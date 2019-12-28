/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesson8;

import java.util.Scanner;
import javax.naming.SizeLimitExceededException;

/**
 *
 * @author thang
 */
public class Calculator {
    public static int[] Array1(int size){
        Scanner sc = new Scanner(System.in);
//             size = sc.nextInt();
         int[] intArray = new int[size];
        for(int i = 0;i<size;i++){
            System.out.printf("Nhap vao phan tu %d :\n",i+1);
            intArray[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println("Array: "+ intArray[i]);
        }
        return intArray;
    }
    public static double getAverage(int [] array,int size){
        double avg = 0;
        int sum  = 0;
        for(int i=0;i<size;i++){
            sum += array[i];
            avg = (double)sum/size;
        }
        return avg;
        }
    public static void main(String[] args){
        int n;
         Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu :\n");
         n = sc.nextInt();
       int[] arr;
       arr = new int[n];
       arr = Array1(n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\nGia tri trung binh"+getAverage(arr, n));
        
        
    }
 
}
