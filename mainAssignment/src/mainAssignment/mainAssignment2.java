package mainAssignment;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class main2 extends Application {

	 
	 @Override
	 public void start(Stage primaryStage) {
		 try {
		        FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
		        VBox root = loader.load();	        

	 
	  Scene scene= new Scene(root, 300,200, Color.DODGERBLUE);
	  primaryStage.setScene(scene);
	  primaryStage.show();
	  
	 }catch(Exception e) {
			 e.printStackTrace();}
	 }
	 

	 public static void main(String[] args) {
	  launch(args);
	 }
	}