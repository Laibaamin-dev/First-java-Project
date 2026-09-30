package com.mycompany.scd.lab2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

    int balance=10000;
    int ch;
    do{
     System.out.println("1. Show balance");
    System.out.println("2. Deposit money ");
    System.out.println("3. Withdraw money");
    System.out.println("4. exit");
    System.out.println("Enter your coice");   
    ch=input.nextInt();
switch(ch){
    case 1:
        System.out.println("Current balance is "+balance);
        break;
    case 2:
        System.out.println("Enter amount for deposit");
//        int numb=input.nextInt();         
            System.out.println("Enter amount want to deoposit");
            int amt=input.nextInt();
            balance+=amt;
            System.out.println("Updated balance "+ balance);
            break;
    case 3:                     
            System.out.println("Enter amount want to withdraw");
            int withdamt=input.nextInt();
            if(withdamt<=0){
                System.out.println("withdraw not possible");               
            }
            else if(balance<withdamt){
            System.out.println("withdraw not possible");         
        }
            else{
            balance-=withdamt;
        }
            System.out.println("Updated balance "+ balance);
            break;
    case 4:
        System.out.println("THank you for using ATM");
        break;
    default:
        System.out.println("Invalid choice");
        
        
}
    }while(ch!=4);
    
  }
   
}
