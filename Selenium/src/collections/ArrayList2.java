package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {


		String arr [] = {"asaa, adsads, adsda"};
		for(String str: arr) {
			System.out.println(str);
			
			//convert array into arrayslist
			
			ArrayList al = new ArrayList(Arrays.asList(arr));
			System.out.println(al);
			
			ArrayList Duplicate = new ArrayList();
			Duplicate.add(al);
			System.out.println(Duplicate);
			
			Duplicate.removeAll(Duplicate);
			System.out.println(Duplicate);
			
		}
		
	}
}

