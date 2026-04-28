package com.javacollection;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Python");
		list.add("C");
		list.add("C++");
		list.add("Python");

		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("Python")) {
				list.add(i + 1, "java");
			}
		}
		System.out.println(list);
	}
}
