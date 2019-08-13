package Xercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class SetListTest {

	public static void main(String[] args) {
		
		HashSet<Integer> a = new HashSet<Integer>();
		//ArrayList<Integer> a = new ArrayList<Integer>();
		//Collection<Integer> a = new HashSet<Integer>();
		//Collection<Integer> a = new ArrayList<Integer>();
		
			a.add(1);
			a.add(2);
			a.add(3);	
		
		Iterator hi = (Iterator) a.iterator();
		while (hi.hasNext()) {
			System.out.println(hi.next());	
		}
	}
}