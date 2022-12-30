package collections;

import java.util.LinkedHashSet;

public class LinkHashSet {

	public static void main(String[] args) {

		LinkedHashSet LHS = new LinkedHashSet();
		
		LHS.add(10);
		LHS.add('R');
		LHS.add("Hey");
		LHS.add(25.22);
		LHS.add(true);
		LHS.add(null);
		LHS.add(null);
		
		System.out.println(LHS);
	}

}
