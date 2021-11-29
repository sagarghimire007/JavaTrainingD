package dwitjavaassignment.assignment1.GetWordCount;

/*
method that takes  in strings and returns the word count.
eg.
"This is a java Program" = 5
 */

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        GetWordCount gc = new GetWordCount();
        System.out.println("Enter a sentence : ");
        String sentence = sn.nextLine();
        System.out.println("Words Count : "+gc.countWords(sentence));
    }
}
