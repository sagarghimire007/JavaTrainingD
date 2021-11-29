package dwitjavaassignment.assignment1.MinimunNumber;
/*
find out minimum of two number using math class
 */
import java.lang.Math;
import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter any two intger number : ");
        int a = sn.nextInt();
        int b = sn.nextInt();
        System.out.println("Minimum Number : "+Math.min(a,b));
    }

}
