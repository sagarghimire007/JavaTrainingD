package dwitjavaassignment.assignment1.ReverseString;

import com.java.sumoftwonumbers.SumOutput;
/*
WAP to reverse a given string
 */
import java.util.Scanner;

public class StringReverseOutput {
    public static void main(String[] args) {
        StringReverse sr = new StringReverse();
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a string :");
        String string = sn.nextLine();
        System.out.println("String after reversing : "+sr.reverseString(string));
    }
}
