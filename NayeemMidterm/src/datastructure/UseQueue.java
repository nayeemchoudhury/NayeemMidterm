package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<Integer> QueList = new LinkedList<>();

		// add
		QueList.add(10);
		QueList.add(100);
		QueList.add(1000);
		QueList.add(10000);

		System.out.println(QueList);

		// peek
		QueList.peek();
		System.out.println(QueList);

		// remove LIFO
		QueList.remove();
		System.out.println(QueList);

		// pool
		QueList.poll();
		System.out.println(QueList);

		Iterator<Integer> iter = QueList.iterator();
		while (iter.hasNext())
			System.out.print(iter.next() + " ");
	}
}

