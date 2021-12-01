package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class CreateFile {

    public static void main(String[] args) {
        createFile();
    }

    // creating a file
    public static void createFile(){
        // checks whether file is present in current location or not...
        // if not than throws a File Not Found Exception...
        File file = new File("C:\\Users\\sagar\\Desktop\\FileHandling.text");
        try {
            Scanner scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception");
        }

        // create a new file if not exits
        // if file already exists displays a message of File already exists
        try{
            if(file.createNewFile()){
                System.out.println("File Created : "+file.getName());
            }else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
