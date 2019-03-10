package string.problems;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String st2 = st.toLowerCase();
        String st3 = st2.replace(".", "");
        String[] stringArray = st3.split(" ");

        //NUMBER OF OCCURRENCES-----------------------
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : stringArray) {
            Integer occur = wordMap.get(word);
            if (occur == null) {
                occur = 0;
            }
            wordMap.put(word, occur + 1);
        }
        wordMap.forEach((String, Integer)-> System.out.println("(" + Integer + ")-->" + String));

        //AVERAGE------------------------------------
        int x = 0;
        int sum = 0;

        for (int i = 1; i <= stringArray.length; i++) {
            sum += stringArray[x].length();
            x++;
        }
        double avLength = sum / stringArray.length;
        System.out.println("The average length of the words is: " + avLength);
    }
}


