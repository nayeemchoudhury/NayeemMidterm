package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

              *
             * *
            * * *
           * * * *
          * * * * *
         * * * * * *

         */

        int numRows = 6;
        String space = " ";
        //loop that decides how many lines------------
        for (int x = 0; x < numRows; x++) {
            //inner loop that decides spaces
            for (int y = numRows - x; y > 1; y--) {
                System.out.print(space);
            }
            //inner loop that decides stars
            for (int z = 0; z < x; z++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
