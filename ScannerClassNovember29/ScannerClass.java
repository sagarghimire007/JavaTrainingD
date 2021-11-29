package com.java.ScannerClassNovember29;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        // user input
        System.out.println("Enter your password :");
        String password = sn.nextLine();
        // condition check
        if(password.equals("Java")){ // true
            System.out.println("Welcome to Java Programming");
        }
        else{ // false
            System.out.println("Password Incorrect!!");
        }
    }
}
