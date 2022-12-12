package com.cg.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Exercise {
	private static void printAll(List<Person> people) {
		 for (Person p : people) {
			System.out.println(p);
		}
	}
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Sam", "gh", 10),
				new Person("Yogi", "Gowda", 2));

		//sort list by last name(ascending order)
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getlName().compareTo(o2.getlName());
			}
		});
		printAll(people);
		
		//sorting using first name using lambda(Descending)
		Collections.sort(people,(p1,p2)->p2.getfName().compareTo(p1.getfName()));
		printAll(people);
		
		
	}

}
