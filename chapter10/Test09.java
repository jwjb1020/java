package chapter10;

import java.util.Map;
import java.util.TreeMap;

public class Test09 {
	public static void main(String[] args) {
		TreeMap<String, String> users = new TreeMap<>();

		users.put("12", "john");
		users.put("14", "john2");
		users.put("62", "john3");
		users.put("17", "john4");
		users.put("31", "john5");

		System.out.println("" + users.toString());
		System.out.println(users);

		Map.Entry<String, String> entry = null;
		entry = users.firstEntry();
		System.out.println(entry);
	}

}
