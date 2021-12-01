package com.filehandling;

import java.io.*;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("C:\\Users\\sagar\\Desktop\\FileHandling.text");
            BufferedWriter out = new BufferedWriter(file);
            out.write("I am Sagar Ghimire... and  i am learning java right now");
            out.newLine();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



//This justs print the content in the File. Please ask the input from the user and print it in the file. You need to use the Scanner classs inorder to take the input from the user.
