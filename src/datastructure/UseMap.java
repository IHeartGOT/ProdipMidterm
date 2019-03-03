package datastructure;
import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<String,String> map = new HashMap<>();
		map.put ("USA", "New York");
		map.put ("CANADA", "Montreal");
		map.put ("BANGLADESH", "Dhaka");
		map.put ("AUSTRALIA", "Malborn");

		System.out.println(map.get("USA"));
		System.out.println(map.get("CANADA"));
		System.out.println(map.get("BANGLADESH"));
		System.out.println(map.get("AUSTRALIA"));


	}
}

