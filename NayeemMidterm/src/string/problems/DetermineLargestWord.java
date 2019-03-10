package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s = "Human brain is a biological learning machine";
        //Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        String s2 = s.replace(".", "");// just in case sentence has "." it will not count in word length
        String strArray[] = s2.split(" ");

        int largestWord = strArray [0].length();
        int newIndex = 0;
        for (int i = 0; i < strArray.length; i++)
            if (strArray[i].length() > largestWord) {
                largestWord = strArray[i].length();
                newIndex = i;
            }
        System.out.println(largestWord + " " + strArray[newIndex]);
    }


    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement


        return map;
    }
}
