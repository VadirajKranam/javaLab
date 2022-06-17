package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Student{
 String usn,name,branch,phone;

    public Student(String usn, String name, String branch, String phone) {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
    }
    public void display()
    {
        System.out.println("USN : "+this.usn+" name: "+this.name+" branch : "+this.branch+" phone number: "+this
                .phone);
    }
}
public class main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the  number of students");
        int n=in.nextInt();
        Student[] students=new Student[n];
        System.out.println("Enter the student details");
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the details of student number : "+(i+1));
            System.out.println("Enter USN");
            String usn=in.next();
            System.out.println("Enter name");
            String name=in.next();
            System.out.println("Enter branch");
            String branch=in.next();
            System.out.println("Enter phone number ");
            String phone=in.next();
            students[i]=new Student(usn,name,branch,phone);
        }

        System.out.println("The entered students details are : ");
        for (int i=0;i<n;i++)
        {
            students[i].display();
        }
        int[] a={1,2,3,4,5};
        System.out.println(Arrays.toString(a));
    }
}
