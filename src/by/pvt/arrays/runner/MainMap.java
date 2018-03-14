package by.pvt.arrays.runner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "tree");
		map.put(4, "four");

		for (int i = 1; i <= map.size(); i++) {
			System.out.println(map.get(i));
		}

		System.out.println();

		// множество пар значений
		Set<Entry<Integer, String>> set = map.entrySet();
		for (Entry e : set) {
			System.out.println(e.getValue());
		}

		System.out.println();

		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry);
		}
	}

}
// Map - ключ уникальный