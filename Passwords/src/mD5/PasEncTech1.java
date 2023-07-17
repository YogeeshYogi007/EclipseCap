package mD5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasEncTech1 {
	public static void main(String[] args) {
		
		
		//Pain text password and null encrypted password 
		String password="9141195758@Yogi";
		String encryptedpassword=null;
		
		try {
			//using Message digester to encrypt the given password
			//creating instance of message digester using getInstance method
			MessageDigest m = MessageDigest.getInstance("MD5");
			//adding plain text password into message digester using update method
			//encryption done
			m.update(password.getBytes());
			
			//converting hash value into bytes
			byte[] bytes = m.digest();
			
			//the bytes array has bytes in decimal form converting into hexadecimal form
			StringBuilder s = new StringBuilder();
			for(int i=0;i<bytes.length;i++) {
				s.append(Integer.toString((bytes[i]& 0xff)+ 0x100,16).substring(1));
			}
			encryptedpassword = s.toString();
			
		}
		catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		System.out.println("Plain Text Password: "+ password);
		System.out.println("Encrypted password using MD5: "+encryptedpassword);
	}
	

}
