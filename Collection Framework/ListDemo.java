package com.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListDemo {
	public static void main(String[] args) {

		List<String> mylist = new ArrayList<String>();

		mylist.add("Java");
		mylist.add("Python");
		mylist.add("C++");
		mylist.add(1, "JavaScript");

		System.out.println("List: " + mylist); // [Java, JavaScript, Python, C++]
		
		System.out.println("Get(2): " + mylist.get(2)); // Python
		
		System.out.println("Size: " + mylist.size()); // 4
		System.out.println("Contains Java: " + mylist.contains("Java")); // true

		mylist.remove("C++");
		System.out.println("After removal: " + mylist); // [Java, JavaScript, Python]

		mylist.set(1, "Go");
		System.out.println("After set: " + mylist); // [Java, Go, Python]

		Collections.sort(mylist);
		System.out.println("Sorted: " + mylist); // [Go, Java, Python]

	}

}
