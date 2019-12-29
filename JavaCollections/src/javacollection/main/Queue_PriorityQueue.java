package javacollection.main;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * LinkList is also an implementation of Queue interface so can be used as Queue.
 * PriorityQueue is another object implementing Queue interface.
 * PriorityQueue also inherits AbstractQueue class.
 * Only poll() method returns in correct sorted order.
 * 
 * @author Sumant Kumar
 *
 */
public class Queue_PriorityQueue {

	void show() {
		
		Queue<Integer> q = new PriorityQueue<>();
		q.add(3);
		q.add(1);
		q.add(2);
		
		System.out.println(q);
		for(int i=0;i<3;i++) {
			System.out.println(q.poll());
		}
		
	    PriorityQueue<Book> queue=new PriorityQueue<Book>();
	    
	    //Creating Books  
	    Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(233,"Operating System","Galvin","Wiley",6);  
	    Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
	    
	    //Adding Books to the queue  
	    queue.add(b1);  
	    queue.add(b2);  
	    queue.add(b3);  
	    System.out.println("\nTraversing the queue elements:");
	    
	    //Traversing queue elements  
	    for(Book b:queue){  
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }
	    
	    queue.remove();  
	    System.out.println("\nAfter removing one book record:");  
	    for(Book b:queue){  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	        }  
		
	}
	
}

class Book implements Comparable<Book>{
	
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