package Polymorphism;

import java.util.*;

class YMINS {// Creating a class named as YMINS
    Scanner in = new Scanner(System.in);// Creating an object for Scanner class
    Random rn = new Random();// Creating an object for Random class

    public void Display() {// Creating a method which puts the choice infront of the user
        System.out.println("Welcome to YMINS ATM\n(1) To deposit money\n(2) To withdraw money");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                deposit();// Calls the deposit function
                break;
            case 2:
                withdraw();// Calls the withdraw function
                break;
            default:// A default choice of invalidity
                System.out.println("Invalid choice");
                break;
        }

    }

    public void deposit() {// Creating a method which deposits the money
        System.out.println("Enter the amount of money to be deposited");
        double amt = in.nextDouble();// Input the amount to be deposited
        double balance = rn.nextInt(200000);
        double total = balance + amt;// Total balance of the user
        System.out.println("The amount you have deposited is " + amt + " and your previous balance was " + balance
                + " your current balance is " + total);
    }

    public void withdraw() {// Creating a method which withdraws the money
        System.out.println("Enter the amount of money to be withdrawn");
        double amt = in.nextDouble();
        double balance = rn.nextInt(200000);
        if (balance < amt) {
            System.out.println("You don't have enough balance in your account");
        } else {
            double total = balance + amt;
            System.out.println("The amount you have withdrawn is " + amt + " and your previous balance was " + balance
                    + " Your current balance is " + total);
        }
    }
}

public class ATM {
    public static void main(String[] args) {
        YMINS obj = new YMINS();// Creating an object for YMINS class
        obj.Display();// class the Display metheod to the main metheod
    }
}
