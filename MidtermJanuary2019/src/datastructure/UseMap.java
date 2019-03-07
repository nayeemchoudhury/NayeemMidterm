package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */


		List<String> headParts = new ArrayList<String>();
		headParts.add("eyes");
		headParts.add("nose");
		headParts.add("mouth");
		headParts.add("ears");

		List<String> torsoParts = new ArrayList<String>();
		torsoParts.add("heart");
		torsoParts.add("lungs");
		torsoParts.add("chest");
		torsoParts.add("ribs");

		List<String> armParts = new ArrayList<String>();
		armParts.add("bicep");
		armParts.add("forearms");
		armParts.add("hands");
		armParts.add("fingers");

		List<String> legParts = new ArrayList<String>();
		legParts.add("thighs");
		legParts.add("calves");
		legParts.add("foot");
		legParts.add("toes");


		Map<String, List<String>> bodyParts = new HashMap<String, List<String>>();
		bodyParts.put("head", headParts);
		bodyParts.put("arms", armParts);
		bodyParts.put("torso", torsoParts);
		bodyParts.put("legs", legParts);

		for(Map.Entry<String, List<String>> Body :  bodyParts.entrySet()){
			System.out.println("My " + Body.getKey() + " is made up of " + Body.getValue());
		}
	}
}
