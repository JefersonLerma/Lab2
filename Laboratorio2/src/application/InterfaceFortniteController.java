package application;

import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
public class InterfaceFortniteController {
	
	@FXML
	private Button opcion1;
	@FXML
	private Button opcion2;
	
	
	public InterfaceFortniteController() {
}
	public void initialize() {
	imagesBT();	
	}
	
	public void imagesBT() {
		
		URL imgButton1 = getClass().getResource("/data/armas5.png");
		Image imageBtn1 = new Image(imgButton1.toString(),50,20, false,true);
		opcion1.setGraphic((new ImageView(imageBtn1)));
		//opcion1.setText("asdasd");
		
		
	}
	
	public void openCampo(ActionEvent event) throws Exception {
		try {
			Parent showBegginer = FXMLLoader.load(getClass().getResource("newWindow.fxml"));
			Scene sceneBegginer = new Scene(showBegginer);
			Stage windowBegginer = (Stage)((Node) event.getSource()).getScene().getWindow();
			windowBegginer.setScene(sceneBegginer);
			windowBegginer.show();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}