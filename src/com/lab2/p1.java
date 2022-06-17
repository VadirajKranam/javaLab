package com.lab2;

import java.util.Scanner;

class Calculator{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public int multiply(int a,int b)
    {
        return a*b;
    }
    public int multiply(int a,int b,int c)
    {
        return  a*b*c;
    }
    public float divide(int a,int b) {
        return (float) (a / b);
    }
}

public class p1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Calculator calci=new Calculator();
        String option;
        do {
            System.out.println("Options : ");
            System.out.println("1)add");
            System.out.println("2)multiply");
            System.out.println("3)divide");
            System.out.println("4)exit");
            option=in.next();
            if(option.equals("add"))
            {
                System.out.println("Enter how many numbers you want to add 2 or 3");
                int n=in.nextInt();
                if(n==2)
                {
                    System.out.println("Enter two numbers");
                    int a=in.nextInt();
                    int b=in.nextInt();
                    System.out.println(calci.add(a,b));
                }
                else
                {
                    System.out.println("Enter three numbers");
                    int a=in.nextInt();
                    int b=in.nextInt();
                    int c=in.nextInt();
                    System.out.println(calci.add(a,b,c));
                }
            }
            else if(option.equals("multiply"))
            {
                System.out.println("Enter how many numbers you want to multiply 2 or 3");
                int n=in.nextInt();
                if(n==2)
                {
                    System.out.println("Enter two numbers");
                    int a=in.nextInt();
                    int b=in.nextInt();
                    System.out.println(calci.multiply(a,b));
                }
                else
                {
                    System.out.println("Enter three numbers");
                    int a=in.nextInt();
                    int b=in.nextInt();
                    int c=in.nextInt();
                    System.out.println(calci.multiply(a,b,c));
                }
            }
            else if (option.equals("divide")){
                System.out.println("Enter two number to divide");
                int a=in.nextInt();
                int b=in.nextInt();
                System.out.println(calci.divide(a,b));
            }
            else if(!option.equals("exit")){
                System.out.println("Enter string within the given option");
            }
        }while(!option.equals("exit"));
        System.out.println("BYE!");
    }
}
