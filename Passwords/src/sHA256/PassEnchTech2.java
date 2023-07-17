package sHA256;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PassEnchTech2 {

	
	public static byte[] getSHA(String input) throws NoSuchAlgorithmException{
		
		//Creating MessageDigest instance for hashing using SHA256
		MessageDigest md = MessageDigest.getInstance("SHA256");
		//digest() method called to calculate message digest of input and return array of byte 
		return md.digest(input.getBytes(StandardCharsets.UTF_8));
	}
	
	public static String toHexString(byte[] hash) {
		//converting byte array of hash into digits
		BigInteger number = new BigInteger(1,hash);
		
		//converting digest into hex value
		StringBuilder hexString = new StringBuilder(number.toString(16));
		
		while(hexString.length()<32) {
			hexString.insert(0,'0');
		}
		return hexString.toString();
	}
	
			public static void main(String[] args) {
				
				try {
					String s1="Mypassword";
					System.out.println("\n"+s1+":"+toHexString(getSHA(s1)));
					
					String s2 = "OtherPassword2";
					System.out.println("\n"+s2+": "+toHexString(getSHA(s2)));
				}
				catch(NoSuchAlgorithmException e) {
					e.printStackTrace();
				}
			}
}
