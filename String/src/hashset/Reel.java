package hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Reel <E>{
	private E id;
	private E name;
	private E salary;
	private E department;
	 
	public void DisplayDetails() {
		System.out.println("Employee detail as follows: ");
		
	}

	public static void main(String[] args) {
		Reel r= new Reel();
		r.DisplayDetails();
		List<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(1);
		lst1.add(20000);
		List<String> lst2 = new ArrayList<String>();
		lst2.add("Yogeesh");
		lst2.add("EEE");
		
		HashSet hs= new HashSet();
		hs.addAll(lst1);
		hs.addAll(lst2);
		for (Object o:lst1 ) {
			System.out.println(o);	
		}
		for (Object o1:lst2) {
			System.out.println(o1);
		}
		
		
	}

}
