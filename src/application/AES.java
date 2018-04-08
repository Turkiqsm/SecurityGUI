package application;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;


public class AES {

   
    private final SecretKeySpec key;
    private final Cipher cipher;
    private byte[] iv;

    public AES(byte[] key) throws NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException {
        this.key = new SecretKeySpec(key, "AES");
        cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

    }

    public void creaIv() {
        iv = new byte[cipher.getBlockSize()];
        SecureRandom r = new SecureRandom();
        r.nextBytes(iv);
    }

    public byte[] getIv() {
        return iv;
    }

    public void setIv(byte[] Riv) {
        iv = Riv;
    }
    //--------------------------------------------------------------------------------------
    public String encrypt(String data) throws Exception {
        cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(getIv()));
        byte[] Enctypt = cipher.doFinal(data.getBytes(StandardCharsets.UTF_8));
        return new String (Enctypt);
    }

    public String decrypt(String enc) throws Exception {
        cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(getIv()));
        byte[] Decrypt = cipher.doFinal(enc.getBytes());
        String result = new String(Decrypt, StandardCharsets.UTF_8);
        return result;

    }

    public byte[] toByte(Object obj) throws IOException {
        byte[] bytes = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(obj);
            oos.flush();
            bytes = bos.toByteArray();
        } finally {
            if (oos != null) {
                oos.close();
            }
            if (bos != null) {
                bos.close();
            }
        }
        return bytes;
    }
}