package all;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;




public class VectoryInternalworking {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		lst.add(4, 6);
		System.out.println(lst);
		Iterator<Integer> itr= lst.iterator();
		while(itr.hasNext())
		{
			Integer i= itr.next();
			System.out.println(i);
		
		if(i == 5)
		{
			itr.remove();
		}
		}
		
		System.out.println(lst);
		

		//lst.add(7);

		//System.out.println(lst.capacity());

	}

public class CopyonWriteArrayListExample{
		
	
}
}
