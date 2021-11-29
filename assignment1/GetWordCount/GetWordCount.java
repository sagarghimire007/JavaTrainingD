package dwitjavaassignment.assignment1.GetWordCount;

public class GetWordCount {
    public int countWords(String name){
        int count = 0;

         /* split = returns the array of string  computed by splitting
         this string around matches of the given regular expression */
        String[] s = name.split("\\s");
        for (String words : s){
            count++;
        }
        return count;
    }
}
