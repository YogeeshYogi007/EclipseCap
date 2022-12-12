
public class SB1 {

	public static void main(String[] args) {
		
		StringBuffer s1= new StringBuffer ("StringBuffer that provides");
		StringBuffer s2= new StringBuffer("is a peer class of string ");
		StringBuffer s3 = new StringBuffer("that provides much of ");
		StringBuffer s4= new StringBuffer("the functionality of the strings");
		
		s1.append(s2).append(s3).append(s4);
		System.out.println(s1);
		
		
		StringBuffer s5= new StringBuffer("it is used to _ at the specific index positions");
		String s6=new String("insert text");
		
		//s5.insert(15, s6);
		//System.out.println(s5);
		s5.replace(14, 15, s6);
		System.out.println(s5);
		
		s5.reverse();
		System.out.println(s5);
		
		
		
	}

}
