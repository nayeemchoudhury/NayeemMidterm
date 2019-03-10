package math.problems;

import java.sql.SQLOutput;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int num = 10;
        int x= 1;
        int total = 1;

        if (num > 0){
            for(int numtemp = 1; numtemp <= num; numtemp++){
                total = total * x;
                x++;
            }System.out.println("the Factorial of " + num + " is: " + total);
        }

        else{System.out.println("Factorials can only be done with positive numbers");}

    }
}
