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
		ArrayList<String> cashRegister = new ArrayList<String>();
		cashRegister.add("Nayeem");
		cashRegister.add("Urooj");
		cashRegister.add("Arif");
		cashRegister.add("Anika");
		cashRegister.add("Patrick");
		cashRegister.add("Munsur");
		cashRegister.add("Anthony");

		System.out.println("Original ArrayList: " + cashRegister);

		String peek = cashRegister.get(4);
		System.out.println("Peeking at index 4: " + peek);

		cashRegister.add(0, "Mafi");
		System.out.println("Adding value into ArrayList index 0: " + cashRegister);

		cashRegister.remove(1);
		System.out.println("Removing value from ArrayList index 1: " + cashRegister);

		Iterator<String> it = cashRegister.iterator();
		System.out.println("Retrieving ArrayList data using while loop:");
		while (it.hasNext()) {
			System.out.println(it.next() + ", ");
		}

	}
}


