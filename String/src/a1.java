import java.nio.charset.Charset;

public class a1 {

	public static void main(String[] args) {
		String s1="Yogi";
		String s2="Sam";
		if(s1==s2)
		{
			System.out.println("s1==s2");
		}
		else
		{
			System.out.println("s1!=s2");
		}
		
	
		
		String s5 = new String ("sam,yogi,dilip,madhu");
		System.out.println(s5);
		int s=s5.length();
		System.out.println(s);
		System.out.println(s5.charAt(0)+""+s5.charAt(5));
	
		String s6=s5.toUpperCase();
		System.out.println(s6);
		if(s5.contains("yogi")) {
			System.out.println("yes");
		
		}
		
		String s7= s5.substring(10);
		System.out.println(s7);
		
		String s8=s5.substring(3, 20);
		System.out.println(s8);
		
		char[] chr=s5.toCharArray();
		for(char g: chr) {
			System.out.println(g);
		}
		
		String[] str= s5.split(",");
		for(String sg :str) {
			System.out.println(sg.trim());
		}
		String Email=".com";
		String phone="7992928364";
		
		
		if(!Email.isEmpty()) {
			System.out.println("Email here");
			if(Email.contains(".")&& Email.contains("com")) {
				System.out.println("Vaild");
			}
			else {
				System.out.println("not conatins");
			}
			
		}
		else {
			System.out.println("Email not here");
		}
		if(!phone.isEmpty()) {
			if(phone.length()==10) {
				System.out.println("valid");
			}
			
		}
		
	}

}
