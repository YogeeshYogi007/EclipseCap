package hashset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P2 {
	

	public static <k,v> void main(String[] args) 
	{
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(4);
		l1.add(6);
		l1.add(8);
		l1.add(9);
		l1.add(3);
		System.out.println(l1);
		
	List<Double> l2=new ArrayList<>();
		l2.add(2.99);
		l2.add(8.77);
		l2.add(8.73);
		l2.add(2.05);
		l2.add(2.62);
		l2.add(9.77);
		System.out.println(l2);
		
		Map<List<Integer>,List<Double>> m=new HashMap<>();
		
		m.put(l1, l2);

		Set<Entry<List<Integer>, List<Double>>> a = m.entrySet();

		
		  for (Entry<List<Integer>, List<Double>> entry : a) {
		  System.out.println("Key is: "+entry.getKey()+" value is: "+entry.getValue()); 
		  }
		 
	}

}
