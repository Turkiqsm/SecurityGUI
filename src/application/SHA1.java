package application;

import java.security.*;
import javax.xml.bind.DatatypeConverter;
import java.util.Scanner;

public class SHA1 {
	 public static String Hash(String hash) throws Exception {
		String hashvalue = "";
	    	MessageDigest digest = MessageDigest.getInstance("SHA-1");
	    	hash.getBytes();
	    digest.update(hash.getBytes());
	    	byte[] y = digest.digest();
	    	hashvalue = DatatypeConverter.printHexBinary(y).toLowerCase();
	    	return hashvalue;
	    	}
	 public static void main(String arg[]) throws Exception {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Please enter a message: ");
		 String message = input.next();
		 System.out.println("Hashed message: " + Hash(message));    	
		 }
	 }