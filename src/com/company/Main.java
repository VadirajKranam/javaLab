package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for (int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int sum=0;
        for (int i=0;i<n;i++)
        {
          sum+=arr[i];
        }
        System.out.println("The sum of all elements of array is : "+sum);
    }
}
