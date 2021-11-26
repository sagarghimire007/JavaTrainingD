package com.java.switchcase;

import java.util.Scanner;

public class SwitchCase {
    public void testSwitch() {
        String marks;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the marks : ");
        marks = sn.next();
        switch (marks) {
            case "A": {
                System.out.println("Excellent");
                break;
            }
            case "B": {
                System.out.println("Average");
                break;
            }
            default:
            {
                System.out.println("Poor");
            }
        }
    }
}
