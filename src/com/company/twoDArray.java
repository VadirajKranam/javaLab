
package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class twoDArray {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long k=in.nextLong();
        long[] studs=new long[(int)n];
        for(long i=0;i<n;i++)
        {
            studs[(int)i]=in.nextLong();
        }
        Arrays.sort(studs);
        long went=0;
        long count=0;
        while(went<n-1)
        {
            long sum=0;
            for(long i=went;i<n;i++)
            {
                sum=sum+studs[(int)i];
                if(sum==k)
                {
                    went=i+1;
                    count++;
                    break;
                }
                else if(sum>k)
                {
                    went=i;
                    count++;
                    break;
                }
            }
        }
        System.out.println(count+1);
    }
}