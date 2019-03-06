package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};

        int index1;
        int index2;
        for(index1 = 0; index1<array1.length; index1++){
            for(index2 = 0; index2<array2.length; index2++) {
                int difference = array1[index1] - array2[index2];
                if(difference<0){difference *= (-1);}
                System.out.println(difference);
                // all possible differences will display. pick lowest one
            }
        }
    }

}
