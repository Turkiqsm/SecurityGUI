package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;

import com.jfoenix.controls.*;

import javafx.fxml.*;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class MainViewController implements Initializable{
	
	/* 
	 * Go down and find your algorithm then follow the instruction
	 * See the monoAlphabetic algorithm for a complete example of how to add your algorithm 
	 */ 
	
	
	@FXML
	public JFXButton btn_OneTimePad, btn_PlayFair, btn_MonoAlphabetic, btn_Homophones, btn_VigenereCipher, btn_DES, btn_AES, btn_SHA1, btn_SHA521, btn_hmacLayout, btn_RSA, btn_DigitalEnvelopeLayout; 
	@FXML
	public Label mainLable, description, key1_label, key2_label;
	@FXML
	public JFXButton encrypt_btn, decrypt_btn, hash_btn, hmac_btn, DigitalSignature_btn, save_btn , generate_btn;
	@FXML
	public JFXTextArea plainTextArea,cipherTextArea;
	@FXML 
	public JFXTextField key1TextField, key2TextField, nTextlable, PlainTextLable, CipherTextLable;
	AES aes = new AES();
	
	@FXML
	public ChoiceBox choiceBox ;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		save_btn.setVisible(false);
		btn_OneTimePad.fire();
	}
	
	/* look for your algorithm */

	@FXML public void oneTimePad(javafx.event.ActionEvent e) {
		mainLable.setText("One Time Pad");
		/* Put your algorithm description and requirements */
		description.setText("put your description here");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(false);
		decrypt_btn.setVisible(false);
		hash_btn.setVisible(false);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		key1TxtFieldSetVisible(false);
		key2TxtFieldSetVisible(false);
		
		/*
		 *  You can set and get texts from the text fields using [ .setText( String ) - .getText() ]
		 *  There's 4 text fields:
		 *  plainTextArea
		 *  cipherTextArea
		 *  key1TextField
		 *  key2TextField
		 *  
		 */
		
		/* Here create an object of your class so you can use your methods */
		
		// After setting true to the buttons that you'll use set an action for that button(what the button will do after clicking it)
		// Example: 
		encrypt_btn.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	        	 //String cipherText = yourEncryptonMethod(plainTextArea.getText());
	        	 //cipherTextArea.setText(cipherText);
	        }
	    });
	    

		
	}
	
	@FXML public void playFair(javafx.event.ActionEvent e) {
		mainLable.setText("PlayFair");
		/* Put your algorithm description and requirements */
		description.setText("put your description here");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(false);
		decrypt_btn.setVisible(false);
		hash_btn.setVisible(false);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		key1TxtFieldSetVisible(false);
		key2TxtFieldSetVisible(false);
		
		/*
		 *  You can set and get texts from the text fields using [ .setText( String ) - .getText() ]
		 *  There's 4 text fields:
		 *  plainTextArea
		 *  cipherTextArea
		 *  key1TextField
		 *  key2TextField
		 *  
		 */
		
		/* Here create an object of your class so you can use your methods */
		
		// After setting true to the buttons that you'll use set an action for that button(what the button will do after clicking it)
		// Example: 
		encrypt_btn.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	        	 //String cipherText = yourEncryptonMethod(plainTextArea.getText());
	        	 //cipherTextArea.setText(cipherText);
	        }
	    });		
		
		
	}

	@FXML public void monoAlphabetic(javafx.event.ActionEvent e) {
		mainLable.setText("Mono-alphabetic");
		/* Put your algorithm description and requirements */
		description.setText("The key of Mono-alphabetic should be\n26 litter.");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(true);
		decrypt_btn.setVisible(true);
		hash_btn.setVisible(false);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		key1TxtFieldSetVisible(true);
		key2TxtFieldSetVisible(false);
		
		/*
		 *  You can set and get texts from the text fields using [ .setText( String ) - .getText() ]
		 *  There's 4 text fields:
		 *  plainTextArea
		 *  cipherTextArea
		 *  key1TextField
		 *  key2TextField
		 *  
		 */
		
		/* Here create an object of your class so you can use your methods */
		MonoLog m = new MonoLog();
		// After setting true to the buttons that you'll use set an action for that button(what the button will do after clicking it)
		// Example: 
		encrypt_btn.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	        	cipherTextArea.setText(m.encryption(key1TextField.getText(), plainTextArea.getText()));
	        	
	        }
	    });	
		
		decrypt_btn.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	        	plainTextArea.setText(m.decryption(key1TextField.getText(), cipherTextArea.getText()));
	        	
	        }
	    });
	
	}
	
	@FXML public void homophones(javafx.event.ActionEvent e) {	
		mainLable.setText("Homophones");
		/* Put your algorithm description and requirements */
		description.setText("put your description here");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(false);
		decrypt_btn.setVisible(false);
		hash_btn.setVisible(false);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		key1TxtFieldSetVisible(false);
		key2TxtFieldSetVisible(false);
		
		/*
		 *  You can set and get texts from the text fields using [ .setText( String ) - .getText() ]
		 *  There's 4 text fields:
		 *  plainTextArea
		 *  cipherTextArea
		 *  key1TextField
		 *  key2TextField
		 *  
		 */
		
		/* Here create an object of your class so you can use your methods */
		
		// After setting true to the buttons that you'll use set an action for that button(what the button will do after clicking it)
		// Example: 
		encrypt_btn.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	        	 //String cipherText = yourEncryptonMethod(plainTextArea.getText());
	        	 //cipherTextArea.setText(cipherText);
	        }
	    });
		
	
	}

	
	@FXML public void vigenereCipher(javafx.event.ActionEvent e) {
		mainLable.setText("Vigenere cipher");
		/* Put your algorithm description and requirements */
		description.setText("consists of several Caesar ciphers \nin sequence with different shift \nvalues.");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(true);
		decrypt_btn.setVisible(true);
		hash_btn.setVisible(false);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		key1TxtFieldSetVisible(true);
		key2TxtFieldSetVisible(false);
		
		/*
		 *  You can set and get texts from the text fields using [ .setText( String ) - .getText() ]
		 *  There's 4 text fields:
		 *  plainTextArea
		 *  cipherTextArea
		 *  key1TextField
		 *  key2TextField
		 *  
		 */
		
		/* Here create an object of your class so you can use your methods */
		VigenereCipher V = new VigenereCipher();
		
		// After setting true to the buttons that you'll use set an action for that button(what the button will do after clicking it)
		// Example: 
		encrypt_btn.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	        	cipherTextArea.setText(V.encrypt(plainTextArea.getText(), key1TextField.getText()));
	        	plainTextArea.setText("");
	        }
	    });
		
		decrypt_btn.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	        	plainTextArea.setText(V.decrypt(cipherTextArea.getText(), key1TextField.getText()));
	        	cipherTextArea.setText("");
	        }
	    });
		
	
	}
	
	@FXML public void DES(javafx.event.ActionEvent e) {	
		mainLable.setText("DES & triple DES");
		/* Put your algorithm description and requirements */
		description.setText("put your description here");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(false);
		decrypt_btn.setVisible(false);
		hash_btn.setVisible(false);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		key1TxtFieldSetVisible(false);
		key2TxtFieldSetVisible(false);
		
		/*
		 *  You can set and get texts from the text fields using [ .setText( String ) - .getText() ]
		 *  There's 4 text fields:
		 *  plainTextArea
		 *  cipherTextArea
		 *  key1TextField
		 *  key2TextField
		 *  
		 */
		
		/* Here create an object of your class so you can use your methods */
		
		// After setting true to the buttons that you'll use set an action for that button(what the button will do after clicking it)
		// Example: 
		encrypt_btn.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	        	 //String cipherText = yourEncryptonMethod(plainTextArea.getText());
	        	 //cipherTextArea.setText(cipherText);
	        }
	    });
		
	
	}
	
	@FXML public void AES(javafx.event.ActionEvent e) {
		mainLable.setText("AES");
		/* Put your algorithm description and requirements */
		description.setText("*your key must be 16 bytes.");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(true);
		decrypt_btn.setVisible(true);
		hash_btn.setVisible(false);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		key1TxtFieldSetVisible(true);
		key2TxtFieldSetVisible(false);
		
		/*
		 *  You can set and get texts from the text fields using [ .setText( String ) - .getText() ]
		 *  There's 4 text fields:
		 *  plainTextArea
		 *  cipherTextArea
		 *  key1TextField
		 *  key2TextField
		 *  
		 */
		
		/* Here create an object of your class so you can use your methods */

		// After setting true to the buttons that you'll use set an action for that button(what the button will do after clicking it)
		// Example: 
		encrypt_btn.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
                    String key=key1TextField.getText();
                    aes.setKey(key.getBytes());
		    String enc;
			try {
				enc = aes.encrypt(plainTextArea.getText());
				cipherTextArea.setText(enc);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
			    

	        }
	    });	
		decrypt_btn.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
                    String key=key1TextField.getText();
                    aes.setKey(key.getBytes());
		    String dec;
			try {
				dec = aes.decrypt(cipherTextArea.getText());
				plainTextArea.setText(dec);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
			    
	        }
	    });		
	
	}
	
	@FXML public void SHA1(javafx.event.ActionEvent e) {
		mainLable.setText("SHA-1");
		/* Put your algorithm description and requirements */
		description.setText("Message size should be < 2^64");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(false);
		decrypt_btn.setVisible(false);
		hash_btn.setVisible(true);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		key1TxtFieldSetVisible(false);
		key2TxtFieldSetVisible(false);
		
		/*
		 *  You can set and get texts from the text fields using [ .setText( String ) - .getText() ]
		 *  There's 4 text fields:
		 *  plainTextArea
		 *  cipherTextArea
		 *  key1TextField
		 *  key2TextField
		 *  
		 */
		
		/* Here create an object of your class so you can use your methods */
		
		// After setting true to the buttons that you'll use set an action for that button(what the button will do after clicking it)
		// Example: 
		hash_btn.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	        	 try {
					String cipherText = SHA1.Hash(plainTextArea.getText());
					cipherTextArea.setText(cipherText);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	 
	        }
	    });		
	
		
	}
	
	@FXML public void SHA521(javafx.event.ActionEvent e) {
		mainLable.setText("SHA-512");
		/* Put your algorithm description and requirements */
		description.setText("put your description here");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(false);
		decrypt_btn.setVisible(false);
		hash_btn.setVisible(true);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		key1TxtFieldSetVisible(false);
		key2TxtFieldSetVisible(false);
		
		/*
		 *  You can set and get texts from the text fields using [ .setText( String ) - .getText() ]
		 *  There's 4 text fields:
		 *  plainTextArea
		 *  cipherTextArea
		 *  key1TextField
		 *  key2TextField
		 *  
		 */
		
		/* Here create an object of your class so you can use your methods */
		
		// After setting true to the buttons that you'll use set an action for that button(what the button will do after clicking it)
		// Example: 
		hash_btn.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	        	 String hash = Sha512.getHash(plainTextArea.getText());
	        	 cipherTextArea.setText(hash);
	        }
	    });		
	
		
	}
	
	@FXML public void HMAC(javafx.event.ActionEvent e) {
		mainLable.setText("HMAC");
		/* Put your algorithm description and requirements */
		description.setText("put your description here");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(false);
		decrypt_btn.setVisible(false);
		hash_btn.setVisible(false);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		key1TxtFieldSetVisible(false);
		key2TxtFieldSetVisible(false);
		
		/*
		 *  You can set and get texts from the text fields using [ .setText( String ) - .getText() ]
		 *  There's 4 text fields:
		 *  plainTextArea
		 *  cipherTextArea
		 *  key1TextField
		 *  key2TextField
		 *  
		 */
		
		/* Here create an object of your class so you can use your methods */
		
		// After setting true to the buttons that you'll use set an action for that button(what the button will do after clicking it)
		// Example: 
		encrypt_btn.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	        	 //String cipherText = yourEncryptonMethod(plainTextArea.getText());
	        	 //cipherTextArea.setText(cipherText);
	        }
	    });
		
		
	}
	
	@FXML public void RSA(javafx.event.ActionEvent e) {
		mainLable.setText("RSA");
		/* Put your algorithm description and requirements */
		description.setText("put your description here");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(false);
		decrypt_btn.setVisible(false);
		hash_btn.setVisible(false);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		key1TxtFieldSetVisible(false);
		key2TxtFieldSetVisible(false);
		// here you can set your size of bits in the choice box
		ObservableList<String> bits = FXCollections.observableArrayList("1bit","2bit","3bit");
		//set the default value for the choice box
		choiceBox.setValue("1bit");
		choiceBox.setItems(bits);
		/*
		 *  You can set and get texts from the text fields using [ .setText( String ) - .getText() ]
		 *  There's 4 text fields:
		 *  plainTextArea
		 *  cipherTextArea
		 *  key1TextField
		 *  key2TextField
		 *  
		 */
		
		/* Here create an object of your class so you can use your methods */
		
		// After setting true to the buttons that you'll use set an action for that button(what the button will do after clicking it)
		// Example: 
		encrypt_btn.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	        	 //String cipherText = yourEncryptonMethod(plainTextArea.getText());
	        	 //cipherTextArea.setText(cipherText);
	        	///choiceBox.getValue()
	        }
	    });
		
		
	}

	@FXML public void DigitalEnvelope(javafx.event.ActionEvent e) {
		mainLable.setText("Digital Envelope");
		/* Put your algorithm description and requirements */
		description.setText("put your description here");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(false);
		decrypt_btn.setVisible(false);
		hash_btn.setVisible(false);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		key1TxtFieldSetVisible(false);
		key2TxtFieldSetVisible(false);
		
		/*
		 *  You can set and get texts from the text fields using [ .setText( String ) - .getText() ]
		 *  There's 4 text fields:
		 *  plainTextArea
		 *  cipherTextArea
		 *  key1TextField
		 *  key2TextField
		 *  
		 */
		
		/* Here create an object of your class so you can use your methods */
		
		// After setting true to the buttons that you'll use set an action for that button(what the button will do after clicking it)
		// Example: 
		encrypt_btn.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	        	 //String cipherText = yourEncryptonMethod(plainTextArea.getText());
	        	 //cipherTextArea.setText(cipherText);
	        }
	    });
		
		
	}
	
	// Ignore what down from here

	public void key1TxtFieldSetVisible(boolean b) {
		key1_label.setVisible(b);
		key1TextField.setVisible(b);
	}
	public void key2TxtFieldSetVisible(boolean b) {
		key2_label.setVisible(b);
		key2TextField.setVisible(b);
	}


}
