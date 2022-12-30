package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {

		int arr[] = new int[10];
		
		ArrayList al = new ArrayList();		// dynamic array + heterogeneous data type
		
		// add elements in array
		
		al.add(10);
		al.add("abcd");
		al.add('R');
		al.add(true);
		al.add(10.4);
		al.add(10);
		al.add(null);
		al.add('f');
		
		System.out.println(al);		//print all arraylist
		
		//print array size
		System.out.println("array size is "+ al.size());	

		System.out.println("");

		//remove element at given Index
		System.out.println(al.remove(5)); 	// removing element at particular index
		System.out.println(al);
		
		System.out.println("");
	
		// removing particular element
		System.out.println(al.remove("abcd"));
		System.out.println(al);
	
		System.out.println("");

		//insert element at particular Index
		
		al.add(1, "hey");
		al.add(100);
		al.add(45.5);
		al.add('@');
		al.add('$');
		al.add('!');
		al.add('#');
		System.out.println(al);
		System.out.println("");

		// retrive element from particular index  ---- get()method
		
		System.out.println(al.get(1));
		System.out.println(al.get(3));
		System.out.println("");

		
		// change/replace element
		al.set(1, "helloo");
		al.set(10, '*');
		System.out.println(al);
		System.out.println("");
		
		// contains - search for element
		
		System.out.println(al.contains("hi"));
		System.out.println(al.contains(100));
		System.out.println("");

		
		
		//read or print element using for loop
		for(int i =0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("");

		//read or print element using for-each/ advance for loop
		for(Object obj : al) {
			System.out.println(obj);
		}
		
		System.out.println("");

		//read or print element using Iterator loop
		
		Iterator IT = al.iterator();
		while(IT.hasNext()) {
			System.out.println(IT.next());
		}
		
		
		
	}

}
