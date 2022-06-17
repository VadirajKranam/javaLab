package com.lab2;

import java.util.Scanner;

class teacher{
    String name;
    int number;
    String department;

    public teacher(String name, int number, String department) {
        this.name = name;
        this.number = number;
        this.department = department;
    }
}
class student extends teacher{
    int[] marks;
    float avg;

    public student(String name, int number, String department, int[] marks) {
        super(name, number, department);
        this.marks = marks;
    }

    void calculateAverage()
    {
        int sum=0;
        for (int i=0;i<marks.length;i++)
        {
            sum+=marks[i];
        }
        this.avg=(float) sum/6;
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of teachers");
        int n1=in.nextInt();
        System.out.println("Enter number of students");
        int n2=in.nextInt();
        teacher[] teachers=new teacher[n1];
        student[] students=new student[n2];
        System.out.println("Enter the details of teachers");
        for (int i=0;i<n1;i++)
        {
            System.out.println("Enter teacher name : ");
            String name=in.next();
            System.out.println("Enter staff number : ");
            int number=in.nextInt();
            System.out.println("Enter department : ");
            String department=in.next();
            teachers[i]=new teacher(name,number,department);
        }
        System.out.println("Enter student details");
        for (int i=0;i<n2;i++)
        {
            System.out.println("Enter teacher name : ");
            String name=in.next();
            System.out.println("Enter staff number : ");
            int number=in.nextInt();
            System.out.println("Enter department : ");
            String department=in.next();
            System.out.println("Enter student marks in 6 subjects");
            int[] marks=new int[6];
            for (int j=0;j<6;j++)
            {
                marks[j]=in.nextInt();
            }
            students[i]=new student(name,number,department,marks);
        }
        for (int i=0;i<n1;i++) {
           students[i].calculateAverage();
        }
        System.out.println("Enter 1 to view teachers details 2 to view student details");
        int choice=in.nextInt();

    }
}
