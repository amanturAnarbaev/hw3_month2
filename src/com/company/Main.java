package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        BankAccount bankAccount= new BankAccount();
        bankAccount.deposit(20000);
        LimitException limitException= new LimitException("you want to take the amount that you don't have ");

        while (true){
            System.out.println("enter the amount that you want to take");
            Double sum=6000.0;
            try {
                bankAccount.withDraw(sum);
                System.out.println("you take " +sum+ "soms from your Bank Account and you left "+ bankAccount.getAmount()+"soms");
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    bankAccount.withDraw(sum);
                } catch (LimitException ex) {
                    System.out.println(limitException.getMessage());
                }
                System.out.println( "you left " + limitException.getRemainingAmount()+" soms"+ " we take " + bankAccount.getAmount()
                        +" from your bank account");
                System.out.println("thank you for choosing us "+
                        "\nBye Bye");
                break;
            }
        }


    }


}


