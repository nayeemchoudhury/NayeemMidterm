package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
//int sub; //this variable is the one that will count the amount being subtracted. (must increase 1 after each 10 iterations)
//int count; //this variable counts up to 10 and on the eleventh resets back to 1
		int displayNum = 100;/*<----- change value of a to set start point*/
		int amtSub = 1;
		System.out.print(displayNum + ",");
		for (int count = 1; count <= 10; count++) {
			if (displayNum >= 0)/*<---- change the conditional of a to set end point*/ {
				System.out.print((displayNum = displayNum - amtSub) + ",");
			}
			if (count == 10) {
				count = 1;
				amtSub++;
			}

		}
	}
}
