package javacollection.main;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


/** 
 * ArrayList implements List interface and adds values in a list, it can add duplicate value. It uses array for storage so it is better for traversing operations.
 * It is non synchronized but can perform stack & queue operations.
 * Manipulations are slow.
 * 
 * @author Sumant Kumar
 *
 */
public class ArrayListExample {
	
	void show() {
		ArrayList<String> al = new ArrayList<>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		
		System.out.println("Traversing ArrayList:");
		
		
		System.out.println("\n1. Using Iterator-");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\n2. Using for-each");
		for(String a: al) {
			System.out.println(a);
		}
		
		System.out.println("\n3. Using ListIterator - Printing in reverse");
		ListIterator<String> li = al.listIterator(al.size());
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		System.out.println("\n4. Using for loop");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("\n5. Using forEach method");
		al.forEach(a->{
			System.out.println(a);
		});
		
		System.out.println("\n6. Using forEachRemaining method");
		Iterator<String> itr1 = al.iterator();
		itr1.forEachRemaining(a->{
			System.out.println(a);
		});
		
		
	}

}
