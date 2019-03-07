package datastructure;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> array = new ArrayList<>();
		array.add("Nayeem");
		array.add("blahblah");
		System.out.println(array);


//		List<Integer> stack = new ArrayList<Integer>();
//		stack.add(4);
//		stack.add(9);
//		stack.add(10);
//		stack.add(-90);
//		stack.add(2);
//
//		// peek
//		int peek = stack.get(0);
//
//		// add
//		stack.add(0, 3);
//
//		// remove
//		stack.remove(0);
//
//		// retrieves
//		stack.remove(stack.get(0));
//
//		Iterator<Integer> iter = stack.iterator();
//
//		while (iter.hasNext())
//			System.out.print(iter.next() + " ");
//
//		System.out.println();
//
//		// Sorting stack.
//
//		Collections.sort(stack);
//
//		ConnectToSqlDB connect = new ConnectToSqlDB();
//		try {
//			connect.insertDataFromIntegerArrayListToSqlTable(stack, "stack_by_arraylist", "sortedNums");
//		} catch (Exception e) {
//			e.printStackTrace();
		}
	}

