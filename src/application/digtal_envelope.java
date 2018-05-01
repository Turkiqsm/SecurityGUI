package application;

import java.math.BigInteger;
//import java.util.Arrays;
import java.util.Base64;
//import java.util.Base64.Encoder;
import java.util.Random;
import java.security.Key;
//import java.security.KeyFactory;
//import java.security.PublicKey;

import javax.crypto.Cipher;
//import javax.crypto.KeyGenerator;
//import javax.crypto.SecretKey;
//import Decoder.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
//import java.security.spec.RSAPublicKeySpec;


public class digtal_envelope {

	
	private static BigInteger keyPublic;
	private static BigInteger keyPrivate;
	private BigInteger  Key_Randome;
	private BigInteger  RKEY; //RSA Encreption
	private static String massege,cipher ;
	private  static byte[] keyValue;
	private AES aes;
	private RSA rsa;
	//public static JavaRSAAlgorithm rSA_A;
    
	public digtal_envelope (String m,String pu, String n,String c) {
    this.massege=m;
	this.keyPublic=new BigInteger(pu);
    this.keyPrivate=new BigInteger(n);
    this.cipher=c;                                        
    rsa = new RSA(keyPublic,keyPrivate);
    aes = new AES();
	}

	public digtal_envelope (String m,String pu, String n,Envelope s) {
	    this.massege=m;
		this.keyPublic=new BigInteger(pu);
	    this.keyPrivate=new BigInteger(n);
	    this.cipher=s.c;
	    RKEY =s.RKEY;
	    rsa = new RSA(keyPublic,keyPrivate);
	    aes = new AES();
		}
	digtal_envelope(){}

	String genratekeys(int bit ) {
		JavaRSAAlgorithm e = new JavaRSAAlgorithm(bit);
		return "Your e =" +e.e+"\n"+"Your d="+e.d+"\n"+"Your n="+e.N;
	}
	
	private BigInteger keycipher(String x){
		int i=0;
		String tmp="";
		while((x.charAt(i))!='\n') {
			tmp+=x.charAt(i++);
		}
		cipher=tmp;
		tmp="";
		i++;
		for(int j=i;j<x.length();j++)
			tmp +=x.charAt(j);
		return new BigInteger(tmp);
	}
	public class Envelope {
		private String c;
		private BigInteger RKEY;
		Envelope(String a,BigInteger e){
			this.c=a;
			this.RKEY=e;
		}
		Envelope(){}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return c+""+RKEY.toString();
		}
		
	}
	public Envelope Encrypt() throws Exception {
		   String tmp = aes.encrypt(massege);
		   RKEY =rsa.encrypt(); // encrept the key 
		return  new Envelope(tmp,RKEY);
	}
	
	public String Decrypt() throws Exception {
		BigInteger tmp = rsa.decrypt();	//	
		keyValue = tmp.toByteArray();
		return aes.decrypt(cipher);
	}
	private class AES {
		private static final String ALGO = "AES";
		public AES() {
		}
	  //step1
		
	    public String encrypt(String data) throws Exception {
	    	byte[] encVal= {};
	        Key key = generateKey();
	        Cipher c = Cipher.getInstance(ALGO);
	        c.init(Cipher.ENCRYPT_MODE, key);
	        encVal = c.doFinal(data.getBytes());
	        return Base64.getEncoder().encodeToString(encVal);
	    	 //return new BASE64Encoder().encode(encVal);//
	    }
	    //step3
	    public String decrypt(String encryptedData) throws Exception {
	        Cipher c = Cipher.getInstance(ALGO);
	       SecretKeySpec  s= new SecretKeySpec(keyValue, ALGO);//key value = is 
	        c.init(Cipher.DECRYPT_MODE,s);
	        byte[] decordedValue = Base64.getDecoder().decode(encryptedData);
	        //byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
	        byte[] decValue = c.doFinal(decordedValue);
	        return new String(decValue);
	    }
	    
	    private Key generateKey() throws Exception {
			SecureRandom d = new SecureRandom();
	    	BigInteger a = new BigInteger(127,d);
	    	Key_Randome =a;
	    	keyValue = a.toByteArray();
            return new SecretKeySpec(keyValue,ALGO); 
	        }	
	    }

	private class RSA 
	{
		   private final  BigInteger one  = new BigInteger("1");
		   private BigInteger  key;
		   private BigInteger  modulus;

		   RSA(BigInteger e,BigInteger n) {
		      modulus =n;                                  
		      key  =e;     
		   }

	BigInteger encrypt() throws Exception 
	{
	return Key_Randome.modPow(key, modulus);
		 }
		 
	BigInteger decrypt() throws Exception 
	
	{	return RKEY.modPow(key, modulus);
		 }
	
	}
	
	class JavaRSAAlgorithm {
		private BigInteger p;
		private BigInteger q;
		private BigInteger N;
		private BigInteger phi;
		private BigInteger e;
		private BigInteger d;
		private int bitlength;
		private Random r;
		public JavaRSAAlgorithm(int bit) {
			bitlength=bit;
			r = new Random();
			p = BigInteger.probablePrime(bitlength, r);
			q = BigInteger.probablePrime(bitlength, r);
			N = p.multiply(q);
			phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
			e = BigInteger.probablePrime(bitlength / 2, r);

			while (phi.gcd(e).compareTo(BigInteger.ONE) > 0 && e.compareTo(phi) < 0) {
				e.add(BigInteger.ONE);
			}
			d = e.modInverse(phi);
		}
		
	}
}
	

