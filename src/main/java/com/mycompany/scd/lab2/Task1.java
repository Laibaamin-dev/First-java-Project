package com.mycompany.scd.lab2;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        System.out.println("Enter name");
        String name = input.nextLine();
        System.out.println("Enter rollnumber");
        int rollNumb = input.nextInt();
        int sum=0;
        for(int i=1;i<=3;i++){
            System.out.println("Enter marks for subject "+ i);
            int marks=input.nextInt();
            sum+=marks;
        }
        double per=(sum/300.0)*100;
        if(per>=85&&per<=100){
            System.out.println("A");         
        }
        else if(per>=70&&per<=84){
            System.out.println("B");         
        }
        else if(per>=50&&per<=69){
            System.out.println("C");         
        }
        else{
            System.out.println("F");         
        }
        
    }
}

