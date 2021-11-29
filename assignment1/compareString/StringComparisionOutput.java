package dwitjavaassignment.assignment1.compareString;
/*
comparing two String whether they are equals or not
 */
import java.util.Scanner;

public class StringComparisionOutput {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter first String : ");
        String s1  = sn.nextLine();

        System.out.println("Enter Second String : ");
        String s2 = sn.nextLine();

        CompareString cs = new CompareString();
        cs.areStringEquals(s1,s2);
    }
}
