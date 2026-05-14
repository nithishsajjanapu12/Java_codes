package com.collections.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo1 {

	public static void main(String[] args) {
		List<Integer> lt = new ArrayList();
		lt.add(10);
		lt.add(20);
		lt.add(10);
		lt.add(30);
		lt.add(40);
		lt.add(20);
		lt.add(60);
		lt.add(10);

		List<Integer> lt1 = new ArrayList<>();
		System.out.println("List Before Operation :");
		
		System.out.println(lt);
		
		System.out.println("Using for loop ");
		for (int i = 0; i < lt.size(); i++) {

			if (!lt1.contains((lt.get(i)))) {
				lt1.add(lt.get(i));
			}
		}

		System.out.println(lt1);
		System.out.println("Using iterator");
		Iterator it = lt.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Using for each");
		
		for(int l:lt) {
			System.out.println(l);
		}
		
	}

}
