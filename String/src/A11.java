
public class A11 {

	public static void main(String[] args) {
		String s1=new String("yogeesh.g.h");
		System.out.println(s1.length());
		String s2=new String ("Yogi");
		s1+=s2;
		System.out.println(s1);
		String s3= "Java pool Strig refers to collection of Strings which are stored in heap memory";
		String s4=s3.toLowerCase();
		System.out.println(s4);
		String s5=s4.toUpperCase();
		System.out.println(s5);
		String s6=s3.replace("a","$");
		System.out.println(s6);
		if (s3.contains("collection")) {
			System.out.println("yes it Contains");
		}
		else {
			System.out.println("No it doesnot Contain");
		}
	String s7="Java pool Strig refers to collection of strings which are stored in heap memory";
	if(s7==s3) {
		System.out.println("both are equal");
	}
	else{
		System.out.println("not equal");
	}
	if(s7.compareTo(s3)!=0) {
		System.out.println(" equal");
		
	}
	else {
		System.out.println("equal");
	}
	}
	

}
