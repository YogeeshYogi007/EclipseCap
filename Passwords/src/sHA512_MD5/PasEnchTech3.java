package sHA512_MD5;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasEnchTech3 {
	
	public static byte[] getSHA(String input) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA512");
		return md.digest(input.getBytes(StandardCharsets.UTF_8));
	}

	public static String toString(byte[] hash) {
		BigInteger number = new BigInteger(1,hash);
		
		StringBuilder hexString = new StringBuilder(number.toString(16));
		
		while(hexString.length()<32) {
			hexString.insert(0, '0');
		}
		
		return hexString.toString();
		
	}
	
	public static void main(String[] args) {
		try {
			String s1 = "thiuhnee3";
			System.out.println("\n"+s1+": "+toString(getSHA(s1)));
			
			
			String s2 = "87t87hd3di";
			System.out.println("\n"+s2+": "+toString(getSHA(s2)));
		}
		catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
}
