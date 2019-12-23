package javacollection.main;

import java.util.LinkedHashSet;


/**
 * LinkedHashSet implements set interface and adds unique values, it ignores duplicate value being added, but can add null value.
 * It maintains the order of insertion of elements. 
 * It uses hash for searching, so its better for search operations.
 * It is non synchronized.
 * 
 * @author Sumant Kumar
 *
 */
public class LinkedHashSetExample {
	
	void show() {
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		hs.add("Five");
		hs.add(null);
		hs.add("One");   //Duplicate entry will not get saved in HashSet because it is a set not list
		
		System.out.println(hs);
		
		System.out.println("\nRemoving an element: Four");
		hs.remove("Four");
		System.out.println(hs);
		
		System.out.println("\nAdding another set with two elements: Jan & Feb");
		LinkedHashSet<String> hs1 = new LinkedHashSet<String>();
		hs1.add("Jan");
		hs1.add("Feb");
		hs.addAll(hs1);
		System.out.println(hs);
		
		System.out.println("\nRemoving another set containing: Jan & Feb");
		hs.removeAll(hs1);
		hs.remove(null);
		System.out.println(hs);
		
		System.out.println("\nRemove element specified by a condition that it contains 'o'");
		hs.removeIf(str->str.contains("o") || str.contains("O")); //Predicate interface required for apply condition in filter function
		System.out.println(hs);
		
		System.out.println("\nClear All elements.");
		hs.clear();
		System.out.println(hs);
	}

}
