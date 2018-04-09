package application;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

public class AES {
   
    private  SecretKeySpec key;
    private  Cipher cipher;
    private byte[] iv;
    
    public AES(){
        try{
        cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        creaIv();}
        catch(Exception e){System.out.println(e.getMessage());}
    }
    
    public void setKey(byte[] key){    
            this.key = new SecretKeySpec(key, "AES");
    }
    
    private void creaIv() {
        iv = new byte[cipher.getBlockSize()];
        SecureRandom r = new SecureRandom();
        r.nextBytes(iv);
    }
    
    public String encrypt(String data) throws Exception {
        cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(iv));
        byte[] Enctypt = cipher.doFinal(data.getBytes(StandardCharsets.UTF_8));
        return     DatatypeConverter.printBase64Binary(Enctypt);

    }

    public String decrypt(String enc) throws Exception {
        cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(iv));
                byte[] encrypted = DatatypeConverter.parseBase64Binary(enc);
        byte[] Decrypt = cipher.doFinal(encrypted);
        String result = new String(Decrypt, StandardCharsets.UTF_8);
        return result;


    }
}