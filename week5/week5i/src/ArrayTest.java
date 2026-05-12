package com.example.demo;
import java.util.*;

public class ArrayTest {
    public static void main(String[] args) {

        String[] student = new String[5];
        double[] scores = new double[5];

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int num=input.nextInt();
        for (int i=1;i<=num;i++) {

            System.out.print("Enter the name : ");
            student[i] = input.next();

            System.out.print("Enter the mark : ");
            scores[i]= input.nextDouble();
        }

        double total=0.0;
        for (double mark:scores){
            total=total+mark;
        }
        double avg=total/student.length;
        System.out.println("Average Mark: "+avg);

        for (int i = 0; i<student.length; i++){
            System.out.println(student[i]+scores[i]+(scores[i]-avg));
        }
    }
}
