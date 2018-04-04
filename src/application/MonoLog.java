package application;

public class MonoLog {
	
	// defghijklmnopqrsTuvwxyzabc
	public String encryption(String secretKey, String plainText) {
		String cipherText = "";
		
		if (secretKey.length() == 26) {
		
			char alpha[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm' ,'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
			char temp;
			plainText = plainText.toLowerCase();
			secretKey = secretKey.toLowerCase();
			for (int i = 0; i < plainText.length(); i++) {
				temp = plainText.charAt(i);
				if ( temp != ' ') {
				int j;
				for (j = 0; j < alpha.length; j++) {
					if (temp == alpha[j])
						break;
				}

				cipherText = cipherText + secretKey.charAt(j);
				}
			}
			cipherText = cipherText.toUpperCase();
			return cipherText;
		}
		
		return null;		
	}
	
	public String decryption(String secretKey, String cipherText) {
		String plainText = "";
		
		if (secretKey.length() == 26) {
			
			char alpha[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm' ,'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
			char temp;
			cipherText = cipherText.toLowerCase();
			secretKey = secretKey.toLowerCase();
			for (int i = 0; i < cipherText.length(); i++) {
				temp = cipherText.charAt(i);
				if ( temp != ' ') {
				int j;
				for (j = 0; j < secretKey.length(); j++) {
					if (temp == secretKey.charAt(j))
						break;
				}

				plainText = plainText + alpha[j];
				}
			}
			plainText = plainText.toUpperCase();
			return plainText;
		}	
		
		return null;
	}
	
	

}
