package application;

import java.math.BigInteger;
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
	public Label mainLable, description, key1_label, key2_label, nTextlable, PlainTextLable, CipherTextLable, bitTextlable;
	@FXML
	public JFXButton encrypt_btn, decrypt_btn, hash_btn, hmac_btn, DigitalSignature_btn, save_btn , generate_btn;
	@FXML
	public JFXTextArea plainTextArea,cipherTextArea;
	@FXML 
	public JFXTextField key1TextField, key2TextField, nTextField;
	AES aes = new AES();
	RSA rsa = new RSA();
	
	@FXML
	public ChoiceBox choiceBox ;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		//save_btn.setVisible(false);
		btn_OneTimePad.fire();
	}
	
	/* look for your algorithm */

	@FXML public void oneTimePad(javafx.event.ActionEvent e) {
		restoreToDefault();
		mainLable.setText("One Time Pad");
		/* Put your algorithm description and requirements */
		description.setText("put your description here");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(false);
		decrypt_btn.setVisible(false);
		hash_btn.setVisible(false);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		generateButtonSetVisible(false);
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
		restoreToDefault();
		mainLable.setText("PlayFair");
		/* Put your algorithm description and requirements */
		description.setText("put your description here");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(false);
		decrypt_btn.setVisible(false);
		hash_btn.setVisible(false);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		generateButtonSetVisible(false);
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
		restoreToDefault();
		mainLable.setText("Mono-alphabetic");
		/* Put your algorithm description and requirements */
		description.setText("The key of Mono-alphabetic should be\n26 litter.");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(true);
		decrypt_btn.setVisible(true);
		hash_btn.setVisible(false);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		generateButtonSetVisible(false);
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
		restoreToDefault();
		mainLable.setText("Homophones");
		/* Put your algorithm description and requirements */
		description.setText("put your description here");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(false);
		decrypt_btn.setVisible(false);
		hash_btn.setVisible(false);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		generateButtonSetVisible(false);
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
		restoreToDefault();
		mainLable.setText("Vigenere cipher");
		/* Put your algorithm description and requirements */
		description.setText("consists of several Caesar ciphers \nin sequence with different shift \nvalues.");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(true);
		decrypt_btn.setVisible(true);
		hash_btn.setVisible(false);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		generateButtonSetVisible(false);
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
		restoreToDefault();
		mainLable.setText("DES & triple DES");
		/* Put your algorithm description and requirements */
		description.setText("put your description here");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(false);
		decrypt_btn.setVisible(false);
		hash_btn.setVisible(false);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		generateButtonSetVisible(false);
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
		restoreToDefault();
		mainLable.setText("AES");
		/* Put your algorithm description and requirements */
		description.setText("*your key must be 16 bytes.");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(true);
		decrypt_btn.setVisible(true);
		hash_btn.setVisible(false);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		generateButtonSetVisible(false);
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
		restoreToDefault();
		mainLable.setText("SHA-1");
		/* Put your algorithm description and requirements */
		description.setText("Message size should be < 2^64");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(false);
		decrypt_btn.setVisible(false);
		hash_btn.setVisible(true);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		generateButtonSetVisible(false);
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
		
		PlainTextLable.setText("Text to be hashed:");
		CipherTextLable.setText("Hshed text:");
		
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
		restoreToDefault();
		mainLable.setText("SHA-512");
		/* Put your algorithm description and requirements */
		description.setText("put your description here");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(false);
		decrypt_btn.setVisible(false);
		hash_btn.setVisible(true);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		generateButtonSetVisible(false);
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
		
		PlainTextLable.setText("Text to be hashed:");
		CipherTextLable.setText("Hshed text:");

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
		restoreToDefault();
		mainLable.setText("HMAC");
		/* Put your algorithm description and requirements */
		description.setText("put your description here");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(false);
		decrypt_btn.setVisible(false);
		hash_btn.setVisible(false);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		generateButtonSetVisible(false);
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
		restoreToDefault();
		mainLable.setText("RSA");
		/* Put your algorithm description and requirements */
		description.setText("put your description here");
		
		/* Show or hide the buttons and text fields your algorithm will use by setting the visibility to true or false */
		encrypt_btn.setVisible(true);
		decrypt_btn.setVisible(true);
		hash_btn.setVisible(false);
		hmac_btn.setVisible(false);
		DigitalSignature_btn.setVisible(false);
		generateButtonSetVisible(true);
		key1TxtFieldSetVisible(true);
		key2TxtFieldSetVisible(true);
		
		key1_label.setText("e:");
		key2_label.setText("d:");

		// here you can set your size of bits in the choice box
		ObservableList<Integer> bits = FXCollections.observableArrayList(512,1024,2048);
		//set the default value for the choice box
		choiceBox.setValue(1);
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
		generate_btn.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	        	rsa.getKeys((int)choiceBox.getValue());
	        	key1TextField.setText(""+rsa.e);
	        	key2TextField.setText(""+rsa.d);
	        	nTextField.setText(""+rsa.n);
	        }
	    });
		
		encrypt_btn.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	        	BigInteger cipherText = rsa.encrypt(new BigInteger(plainTextArea.getText()), new BigInteger(key1TextField.getText()), new BigInteger(nTextField.getText()));
	        	cipherTextArea.setText(""+cipherText);
	        	///choiceBox.getValue()
	        }
	    });
		
		decrypt_btn.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	        	BigInteger plainText = rsa.decrypt(new BigInteger(cipherTextArea.getText()), new BigInteger(key2TextField.getText()), new BigInteger(nTextField.getText()));
	        	plainTextArea.setText(""+plainText);
	        	///choiceBox.getValue()
	        }
	    });
		
	}

    digtal_envelope.Envelope envelope;
	@FXML public void DigitalEnvelope(javafx.event.ActionEvent e) throws Exception{
		restoreToDefault();
		mainLable.setText("Digital Envelope");
		/* Put your algorithm description and requirements */
		description.setText("put your description here");
		key1_label.setText("Bit Size");
		hash_btn.setVisible(true);
		hash_btn.setText("Genrate Key");
		key1TxtFieldSetVisible(true);
		cipherTextArea.setVisible(true);
		
		hash_btn.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	        	int tmp = Integer.parseInt(key1TextField.getText());
	        	plainTextArea.setText(new digtal_envelope().genratekeys(tmp));
	        	encrypt_btn.setVisible(true);
	    		decrypt_btn.setVisible(true);
	    		key1_label.setText("key 1:");
	    		key1TextField.setText("");
	    		hash_btn.setVisible(false);
	    		key2TxtFieldSetVisible(true);
	    		nTextlable.setVisible(true);
	    		nTextField.setVisible(true);
	        }
	    });
		

		encrypt_btn.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	        	try {
	        		cipherTextArea.setVisible(true);
	    			digtal_envelope tmp = new digtal_envelope(plainTextArea.getText(),key1TextField.getText(),key2TextField.getText(),nTextField.getText());
	    			envelope=tmp.Encrypt();
	        		cipherTextArea.setText(envelope.toString());
	        	}
	        	catch(Exception e) {
	        	} 
	        }
	    });
		
		decrypt_btn.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	        	try {
	        		
	        		digtal_envelope tmp2 = new digtal_envelope(cipherTextArea.getText(),key1TextField.getText(),key2TextField.getText(),envelope);  // key value now has cipher key in byte
	        		plainTextArea.setText(tmp2.Decrypt());
	        	}
	        	catch(Exception e) {
	        	} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
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
	public void generateButtonSetVisible(boolean b) {
		choiceBox.setVisible(b);
		generate_btn.setVisible(b);
		nTextlable.setVisible(b);
		nTextField.setVisible(b);
		bitTextlable.setVisible(b);
	}
	public void restoreToDefault() {
		key1_label.setVisible(false);
		key1_label.setText("Key 1:");
		key2_label.setVisible(false);
		key2_label.setText("Key 2:");
		nTextlable.setVisible(false);
		nTextlable.setText("n:");
		PlainTextLable.setVisible(true);
		PlainTextLable.setText("Plain Text:");
		CipherTextLable.setVisible(true);
		CipherTextLable.setText("Cipher Text:");
		bitTextlable.setVisible(false);
		bitTextlable.setText("bits:");

		encrypt_btn.setVisible(false);
		encrypt_btn.setText("Encrypt");
		decrypt_btn.setVisible(false);
		decrypt_btn.setText("Decrypt");
		hash_btn.setVisible(false);
		hash_btn.setText("Hash");
		hmac_btn.setVisible(false);
		hmac_btn.setText("HMAC");
		DigitalSignature_btn.setVisible(false);
		DigitalSignature_btn.setText("Digital signature");
		generate_btn.setVisible(false);
		generate_btn.setText("Generate");
		save_btn.setVisible(false);

		plainTextArea.setVisible(true);
		plainTextArea.setText("");
		cipherTextArea.setVisible(true);
		cipherTextArea.setText("");

		key1TextField.setVisible(false);
		key1TextField.setText("");
		key2TextField.setVisible(false);
		key2TextField.setText("");
		nTextField.setVisible(false);
		nTextField.setText("");
		
		choiceBox.setVisible(false);
	}



}
