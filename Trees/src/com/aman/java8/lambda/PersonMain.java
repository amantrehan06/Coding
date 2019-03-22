package com.aman.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {

	public static void main(String args[]) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("Amandeep", "Trehan", 29));
		list.add(new Person("Yashpreet", "Kaur", 29));
		list.add(new Person("Avreeta", "Kaur", 35));
		list.add(new Person("Supreet", "Juneja", 38));

		Collections.sort(list, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));

		System.out.println("Sorted on first name");
		for(Person p: list) {
			System.out.println(p);
		}
	}
}
