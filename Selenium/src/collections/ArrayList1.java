package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		ArrayList Duplicate = new ArrayList();
		
		al.add('d');
		al.add('c');
		al.add('a');
		al.add('b');
		
		System.out.println(al);
		
		//AddAll

		Duplicate.addAll(al);
		System.out.println(Duplicate);
		
		Duplicate.removeAll(Duplicate);
		System.out.println(Duplicate);
		
		//Collections methods
		Collections.sort(al);
		System.out.println(al);
		
		//Print string in Reverse Order
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
	}

}

