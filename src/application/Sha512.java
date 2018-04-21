package application;
import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;
import java.util.Scanner;
	
public class Sha512 {

	
	public static String getHash(String inputBytes){
		String hashValue = "";
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
			messageDigest.update(inputBytes.getBytes());
			byte[] digestedBytes = messageDigest.digest();
			hashValue = DatatypeConverter.printHexBinary(digestedBytes).toLowerCase();
		}
		catch(Exception e){
			
		}
		return hashValue;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner readMessage = new Scanner(System.in);
		System.out.print("Please enter the message that you want to hash it : ");
		String message = readMessage.next();
		System.out.println("This is the hash value: \n"+getHash(message));
		

	}

}
