package string.problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first word")
        ;
        String wordA = input.nextLine();
        System.out.println("Please enter second word:")
        ;
        String wordB = input.nextLine();

        if (wordA.length() != wordB.length()) {
            System.out.println("Not an Anagram");
        }
        char wordAarray[] = wordA.toCharArray();
        char wordBarray[] = wordB.toCharArray();
        Arrays.sort(wordAarray);
        Arrays.sort(wordBarray);
        if (Arrays.equals(wordAarray, wordBarray)) {
            System.out.println("Anagram");
        } else{
            System.out.println("Not an Anagram");
        }
    }
}
