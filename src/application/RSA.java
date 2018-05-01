package application;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Scanner;
    

public class RSA {
   private final static BigInteger one      = new BigInteger("1"); // Shortcut
   private final static SecureRandom random = new SecureRandom();
   
   public BigInteger e,d,n;


   // generate an N-bit public and private key
   public String getKeys(int N) {
	      BigInteger p = BigInteger.probablePrime(N/2, random);
	      BigInteger q = BigInteger.probablePrime(N/2, random);
	      BigInteger n = p.multiply(q);
	      BigInteger phi = (p.subtract(one)).multiply(q.subtract(one));

	      BigInteger e = null;
	      do {
	    	  e = BigInteger.probablePrime(N/2, random);
	      }while(phi.gcd(e).compareTo(one) != 0); //Until gcd(phi, e) equals 1
	      
	      String publicKey = "(" + e + ", " + n + ")";
	      
	      
	      BigInteger d = e.modInverse(phi);
	      
	      String privateKey = "(" + d + ", " + n + ")";
	      
	      this.e = e;
	      this.d = d;
	      this.n = n;
	      
	      String output = "Public key:\n"
	      		+ publicKey + "\n"
	      		+ "Private Key:\n"
	      		+ privateKey;
	      
	      return output;
   }


   public BigInteger encrypt(BigInteger message, BigInteger publicKey, BigInteger n) {
      return message.modPow(publicKey, n);
   }

   public BigInteger decrypt(BigInteger encrypted, BigInteger privateKey, BigInteger n) {
      return encrypted.modPow(privateKey, n);
   }
 
   public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
      RSA key = new RSA();
      
      String action = "";
      do {
    	  System.out.println("Enter 1 to generate keys.\n"
    	  				   + "Enter 2 to encrypt a message.\n"
    	  		           + "Enter 3 to decrypt a message.\n"
    	  				   + "Enter -1 to exit.");
    	  
    	  action = in.nextLine();
    	  
    	  switch(action) {
    	  case "1": { // Generate keys
    		 System.out.println("Enter number of bytes for the keys:");
    		 System.out.println(key.getKeys(in.nextInt()));
    		 break;
    	  }
    	  case "2": { // Encrypt message
    		  System.out.println("Enter the message:");
    		  byte[] inBytes = in.nextLine().getBytes();
    	      BigInteger message = new BigInteger(inBytes);
    	      
    	      System.out.println("Enter the public key (e):");
    	      BigInteger e = in.nextBigInteger();
    	      
    	      System.out.println("Enter the public key (n):");
    	      BigInteger n = in.nextBigInteger();
    	      
    	      System.out.println("Cipher text: " + key.encrypt(message, e, n));
    	      break;
    	  }
    	  case "3": { // Decrypt message
    		  System.out.println("Enter the cipher:");
    	      BigInteger cipher = in.nextBigInteger();
    	      
    	      System.out.println("Enter the private key (d):");
    	      BigInteger d = in.nextBigInteger();
    	      
    	      System.out.println("Enter the private key (n):");
    	      BigInteger n = in.nextBigInteger();
    	      
    	      String message = new String(key.decrypt(cipher, d, n).toByteArray()); // Turn BigInteger to String
    	      System.out.println("Plain text: " + message);
    	      break;
    	  }
    	  } // End switch
    	  
      }while(!action.equals("-1"));
      
      in.close(); // Close Scanner.

   }
}
