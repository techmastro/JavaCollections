package javacollection.main;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * TeeSet implements set, NavigableSet & SortedSet interface containing unique values in sorted order.
 * Retrieval times are quiet fast, does not allow null element.
 * It is non synchronized, and requires elements to be primitive type or in cases of non primitive type 
 * must have implemented compareTo() method of Comparable interface.
 * 
 * 
 * @author Sumant Kumar
 *
 */
public class TreeSetExample {

	void show() {

		TreeSet<String> ts = new TreeSet<>();
		ts.add("Ravi");
		ts.add("Vijay");
		ts.add("Ravi");
		ts.add("Ajay");

		System.out.println("TreeSet is by default sorted: \n"+ts);

		System.out.println("\nTreeSet in descending order:");

		Iterator<String> itr = ts.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		//User ts.pollFirst() to fetch and remove first element same for last element
		System.out.println("\nFirst element in default sorted TreeSet is : "+ts.first());
		System.out.println("\nLast element in default sorted TreeSet is : "+ts.last());

		ts.add("Raju");
		ts.add("Pawan");
		ts.add("Deepak");

		System.out.println("\nFull Set: "+ts);

		System.out.println("\nReverse Set: "+ts.descendingSet());

		System.out.println("\nheadSet(e) Elements from head till the element passed as argument: \n"+ts.headSet("Raju"));
		System.out.println("\nheadSet(e,true) Elements from head till the element passed as argument including the passed element: \n"+ts.headSet("Raju",true));

		System.out.println("\ntailSet(e) Elements from the element passed till tail: \n"+ts.tailSet("Pawan"));
		System.out.println("\ntailSet(e,false) Elements from the element passed not including it till tail: \n"+ts.tailSet("Pawan",false));

		System.out.println("\nsubSet(e1, e2) subset from the first element till second element passed, including first element and not including last element by default: \n"+ts.subSet("Deepak","Ravi"));
		System.out.println("\nsubSet(e1, false, e2, true) subset from the first element till second element passed, not including first element and including last element: \n"+ts.subSet("Deepak", false,"Ravi",true));

		TreeSet<Book> set=new TreeSet<Book>();  
		//Creating Books  
		Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);  
		Book b2=new Book(233,"Operating System","Galvin","Wiley",6);  
		Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		//Adding Books to TreeSet  
		set.add(b1);  
		set.add(b2);  
		set.add(b3);  
		//Traversing TreeSet
		System.out.println("\nBooks added in different order but automatically got sorted by book id as defined in compareTo function of Book class:" );
		for(Book b:set){  
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		}  


	}

	//	class Book implements Comparable<Book>{  
	class Book{  
		int id;  
		String name,author,publisher;  
		int quantity;  
		public Book(int id, String name, String author, String publisher, int quantity) {  
			this.id = id;  
			this.name = name;  
			this.author = author; 
			this.publisher = publisher;  
			this.quantity = quantity;  
		}  
				public int compareTo(Book b) {  
					if(id>b.id){  
						return 1;  
					}else if(id<b.id){  
						return -1;  
					}else{  
						return 0;  
					}  
				}  
	}  


}
