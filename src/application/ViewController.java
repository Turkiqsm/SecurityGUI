package application;

import javafx.*;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
public class ViewController {
	
	
	
	@FXML
	Button b ;
	
	@FXML
	public void buttonAction(Event e) {
		System.out.println("event");
	}
	
	
	
}
