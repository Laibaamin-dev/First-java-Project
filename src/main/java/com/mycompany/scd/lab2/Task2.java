package com.mycompany.scd.lab2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name");
        String stuname = input.nextLine();
        System.out.println("Enter Distance");
        int dist = input.nextInt();
        if (dist > 0 && dist <= 5) {
            System.out.println("Monthly fee is Rs. 2000");
        } else if (dist > 5 && dist <= 10) {
            System.out.println("Monthly fee is Rs. 3500");
        } else if (dist > 10 && dist <= 20) {
            System.out.println("Monthly fee is Rs. 5000");
        } else {
            System.out.println("Monthly fee is Rs. 7000");
        }
    }
    
}
