package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
    if (isPalindrome()==true){
        System.out.println("IS PALINDROME");
    }else{
        System.out.println("NOT PALINDROME");
    }
    }

    public static boolean isPalindrome() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your word:");
        String testWord = input.nextLine();
        int length = testWord.length();
        int beginning = 0;
        int ending = length - 1;
        while (ending > beginning) {
            char forwardChar = testWord.charAt(beginning++);
            char backwardChar = testWord.charAt(ending--);
            if (forwardChar == backwardChar) {
                return true;
            }
        }
        return false;
    }
}

