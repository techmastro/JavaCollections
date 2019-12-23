package javacollection.main;
import java.util.Iterator;
import java.util.LinkedList;



/**
 * LinkedList implements List interface and adds values in a list, it can add duplicate value. It uses linklist for storage so it is better for add/remove operations.
 * It is non synchronized but can perform stack & queue operations.
 * 
 * @author Sumant Kumar
 *
 */
public class LinkedListExample {

	class Employee implements Cloneable{
		String name;
		Integer age;
		public Employee(String name, Integer age) {
			this.name = name;
			this.age = age;
		}
		
		@Override
		public String toString() {
						
			return "{Name: "+name+", Age: "+age+"}";
		}
		
		@Override
		protected Employee clone(){
			Employee cloneCopy = null;
			
			try {
				
				cloneCopy = (Employee) super.clone();
				
			}catch(CloneNotSupportedException e) {
				throw new RuntimeException(e);
			}
			
			
			return cloneCopy;
		}
	}

	void show() {

		LinkedList<Employee> ll = new LinkedList<>();

		ll.add(new Employee("Ravi",23));
		ll.add(new Employee("Vijay",25));
		ll.add(new Employee("Ravi",23));
		ll.add(new Employee("Ajay",30));
		
		System.out.println("Current LinkedList Elements:");
		
		ll.forEach(a->{
			System.out.println(a);
		});
		
		LinkedList<Employee> l1 = new LinkedList<>();
		
		ll.forEach(a->{
			l1.add(a.clone());
		});
		
//		Iterator<Employee> itr = ll.iterator();
//		while(itr.hasNext()) {
//			l1.add(itr.next().clone());
//		}
		
		ll.get(1).age = 27;
		
		System.out.println("Printing updated ll");
		ll.forEach(a->{
			System.out.println(a);
		});
		
		System.out.println("Printing l1");
		l1.forEach(a->{
			System.out.println(a);
		});
		
	}

}
