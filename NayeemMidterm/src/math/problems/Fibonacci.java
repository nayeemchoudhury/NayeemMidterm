package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int num = 40;
        int next = 0;
        int prev = 1;

        for(int i=0; i<num; i++) {
            System.out.print(next + ",");
            next = next + prev;
            prev = next - prev;
        }
    }
}
