package mainAssignment;


	import javafx.animation.KeyFrame;
	import javafx.animation.Timeline;
	import javafx.fxml.FXML;
	import javafx.scene.control.ProgressBar;
	import javafx.scene.control.TextArea;
	import javafx.scene.text.Text;
	import javafx.util.Duration;

	public class controller {


		@FXML
		private TextArea typing;
		
		@FXML
		 private ProgressBar progressBar;
		
		@FXML
		private Text tx;
		
		private final int startTime=30;
		 private Integer seconds= startTime;
		
		public void initialize() {
			doTime();
				 }
		
		 private void doTime() {
			  Timeline time= new Timeline();
			  KeyFrame frame= new KeyFrame(Duration.seconds(1),event->{
			    seconds--;
			    
			    double progress = (double) (startTime - seconds) / startTime;
	            progressBar.setProgress(progress);
	            
			    if(seconds<=0){
			     time.stop();
			     tx.setText("Time's up");
			    }else {
			    // perform action when time is up for typing
			    tx.setText("Timer: " + seconds.toString());
			    }
			   });
			   
			  time.setCycleCount(startTime);
			  time.getKeyFrames().add(frame);
			  time.play();
			  
			  
			 }
			 
			 private void stopTyipingTest() {
				 typing.setEditable(false); //Disable typing
			 }
		}



