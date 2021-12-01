package com.filehandling;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\sagar\\Desktop\\FileHandling.text");
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException exception) {
            System.out.println("File Not Found");
        }
    }
}
