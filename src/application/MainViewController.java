package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.*;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import javafx.fxml.*;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class MainViewController implements Initializable{
	
	
	
	
	@FXML
	public JFXButton btn_OneTimePad, btn_PlayFair, btn_MonoAlphabetic, btn_Homophones, btn_VigenereCipher, btn_DES, btn_AES, btn_SHA1, btn_SHA521, btn_hmacLayout, btn_RSA, btn_DigitalEnvelopeLayout  ; 
	
	@FXML
	public Label mainLable , description ;
	
	@FXML
	public JFXButton encrypt_btn, decrypt_btn, hash_btn, hmac_btn, DigitalSignature_btn, save_btn ;

	@FXML
	public JFXTextArea plainTextArea,cipherTextArea;
	
	@FXML 
	public JFXTextField key1TextField, key2TextField ;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML public void encrypt(javafx.event.ActionEvent e) {
		
		//take what you need form these variables as an input for your encrypt function
		String plainText = plainTextArea.getText();
		String key1 = key1TextField.getText();
		String key2 = key2TextField.getText();
		
		
		String cipherText = " ";
		switch (mainLable.getText()) {
		case "One Time Pad":
			//call your functions here then set the cipher text 
			
			
			cipherText = "change this to your cipher text";
			cipherTextArea.setText(cipherText);
			
			break;
		case "PlayFair":
			
			//call your functions here then set the cipher text 
			
			
			cipherText = "change this to your cipher text";
			cipherTextArea.setText(cipherText);
			break;
		case "Mono-alphabetic":
			//call your functions here then set the cipher text 
			
			
			cipherText = "change this to your cipher text";
			cipherTextArea.setText(cipherText);
			break;
		case "Homophones":
			//call your functions here then set the cipher text 
			
			
			cipherText = "change this to your cipher text";
			cipherTextArea.setText(cipherText);
			break;
		case "Vigenere cipher":
			//call your functions here then set the cipher text 
			
			
			cipherText = "change this to your cipher text";
			cipherTextArea.setText(cipherText);
			break;
		case "DES & triple DES":
			//call your functions here then set the cipher text 
			
			
			cipherText = "change this to your cipher text";
			cipherTextArea.setText(cipherText);
			break;
		case "AES":
			//call your functions here then set the cipher text 
			
			
			cipherText = "change this to your cipher text";
			cipherTextArea.setText(cipherText);
			break;
		case "SHA-1":
			//call your functions here then set the cipher text 
			
			
			cipherText = "change this to your cipher text";
			cipherTextArea.setText(cipherText);
			break;
		case "SHA-512":
			//call your functions here then set the cipher text 
			
			
			cipherText = "change this to your cipher text";
			cipherTextArea.setText(cipherText);
			break;
		case "HMAC":
			//call your functions here then set the cipher text 
			
			
			cipherText = "change this to your cipher text";
			cipherTextArea.setText(cipherText);
			break;
		case "RSA":
			//call your functions here then set the cipher text 
			
			
			cipherText = "change this to your cipher text";
			cipherTextArea.setText(cipherText);
			break;
		case "Digital Envelope ":
			//call your functions here then set the cipher text 
			
			
			cipherText = "change this to your cipher text";
			cipherTextArea.setText(cipherText);
			break;
		default:
			break;
		}
	}

@FXML public void decrypt(javafx.event.ActionEvent e) {
		
		//take what you need form these variables as an input for your decrypt function
		String cipherText = cipherTextArea.getText();
		String key1 = key1TextField.getText();
		String key2 = key2TextField.getText();
		
		
		String plainText = " ";
		switch (mainLable.getText()) {
		case "One Time Pad":
			//call your functions here then set the plain Text
			
			
			plainText = "change this to your plain Text";
			plainTextArea.setText(plainText);
			break;
		case "PlayFair":
			//call your functions here then set the plain Text
			
			
			plainText = "change this to your plain Text";
			plainTextArea.setText(plainText);
			break;
		case "Mono-alphabetic":
			//call your functions here then set the plain Text
			
			
			plainText = "change this to your plain Text";
			plainTextArea.setText(plainText);
			break;
		case "Homophones":
			//call your functions here then set the plain Text
			
			
			plainText = "change this to your plain Text";
			plainTextArea.setText(plainText);
			break;
		case "Vigenere cipher":
			//call your functions here then set the plain Text
			
			
			plainText = "change this to your plain Text";
			plainTextArea.setText(plainText);
			break;
		case "DES & triple DES":
			//call your functions here then set the plain Text
			
			
			plainText = "change this to your plain Text";
			plainTextArea.setText(plainText);
			break;
		case "AES":
			//call your functions here then set the plain Text
			
			
			plainText = "change this to your plain Text";
			plainTextArea.setText(plainText);	
			break;
		case "SHA-1":
			//call your functions here then set the plain Text
			
			
			plainText = "change this to your plain Text";
			plainTextArea.setText(plainText);
			break;
		case "SHA-512":
			//call your functions here then set the plain Text
			
			
			plainText = "change this to your plain Text";
			plainTextArea.setText(plainText);
			break;
		case "HMAC":
			//call your functions here then set the plain Text
			
			
			plainText = "change this to your plain Text";
			plainTextArea.setText(plainText);
			break;
		case "RSA":
			//call your functions here then set the plain Text
			
			
			plainText = "change this to your plain Text";
			plainTextArea.setText(plainText);
			break;
		case "Digital Envelope ":
			//call your functions here then set the plain Text
			
			
			plainText = "change this to your plain Text";
			plainTextArea.setText(plainText);
			break;
		default:
			break;
		}
	}
	

	public void setAllnotVisible() {
		
		
		decrypt_btn.setVisible(false);
		encrypt_btn.setVisible(false);
		hash_btn.setVisible(false);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
	}
	
	
	
	
	
	@FXML public void oneTimePad(javafx.event.ActionEvent e) {
		
		mainLable.setText(btn_OneTimePad.getText());
		setAllnotVisible();
		
		
		description.setText("put your description here");
		
	}
	
	@FXML public void playFair(javafx.event.ActionEvent e) {
		
		mainLable.setText(btn_PlayFair.getText());
		
		description.setText("put your description here");
		
		
		
	}

	@FXML public void monoAlphabetic(javafx.event.ActionEvent e) {
	
	mainLable.setText(btn_MonoAlphabetic.getText());
	
	description.setText("put your description here");
	
	
}
	@FXML public void homophones(javafx.event.ActionEvent e) {
		
	mainLable.setText(btn_Homophones.getText());
	
	description.setText("put your description here");
	
	
}

	
	@FXML public void vigenereCipher(javafx.event.ActionEvent e) {
		
	mainLable.setText(btn_VigenereCipher.getText());
	
	description.setText("put your description here");
	
	
}
	
	@FXML public void DES(javafx.event.ActionEvent e) {
		
	mainLable.setText(btn_DES.getText());
	
	description.setText("put your description here");
	
	
}
	
	@FXML public void AES(javafx.event.ActionEvent e) {
		
	mainLable.setText(btn_AES.getText());
	
	description.setText("put your description here");
	
	
}
	
	@FXML public void SHA1(javafx.event.ActionEvent e) {
		
	mainLable.setText(btn_SHA1.getText());
	
	description.setText("put your description here");
	
	
}
	
	@FXML public void SHA521(javafx.event.ActionEvent e) {
		
	mainLable.setText(btn_SHA521.getText());
	
	description.setText("put your description here");
	
	
}
	
	@FXML public void HMAC(javafx.event.ActionEvent e) {
		
		mainLable.setText(btn_hmacLayout.getText());
		
		description.setText("put your description here");
		
		
	}
	
	@FXML public void RSA(javafx.event.ActionEvent e) {
		
		mainLable.setText(btn_RSA.getText());
		
		description.setText("put your description here");
		
		
	}

@FXML public void DigitalEnvelope(javafx.event.ActionEvent e) {
		
		mainLable.setText(btn_DigitalEnvelopeLayout.getText());
		
		description.setText("put your description here");
		
		
	}

	


}
