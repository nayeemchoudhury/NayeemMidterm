package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<String> RegisterLine = new ArrayList<String>();
		RegisterLine.add("Nayeem");
		RegisterLine.add("Urooj");
		RegisterLine.add("Arif");
		RegisterLine.add("Anika");
		RegisterLine.add("Patrick");
		RegisterLine.add("Munsur");
		RegisterLine.add("Anthony");

		System.out.println("Original ArrayList: " + RegisterLine);

		String peek = RegisterLine.get(4);
		System.out.println("Peeking at index 4: " + peek);

		RegisterLine.add(0, "Mafi");
		System.out.println("Adding value into ArrayList index 0: " + RegisterLine);

		RegisterLine.remove(1);
		System.out.println("Removing value from ArrayList index 1: " + RegisterLine);

		Iterator<String> it = RegisterLine.iterator();
		System.out.println("Retrieving ArrayList data using while loop:");
		while (it.hasNext()) {
			System.out.println(it.next() + ", ");
		}

	}
}


