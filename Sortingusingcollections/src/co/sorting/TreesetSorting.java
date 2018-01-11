package co.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreesetSorting {

	public static void main(String[] args) {
		


		Set set = new TreeSet();

		set.add(10);
		set.add(50);
		set.add(10);
		set.add(5);
		set.add(8);

		System.out.println(set);

		List list = new ArrayList();

		list.add(15);
		list.add(15);
		list.add(25);
		list.add(5);
		list.add(8);
		
		
	
		Collections.sort(list);
		System.out.println(list);

		Map map = new TreeMap();

		map.put(4, 10);
		map.put(2, 20);
		map.put(3, 40);
		map.put(1, 5);

		System.out.println(map);

	}

}
