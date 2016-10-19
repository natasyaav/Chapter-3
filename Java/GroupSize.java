import java.util.Optional;
import javafx.application.Application;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

/**
 * Author: Natasya Virgichalia<br>
 * Date: 10/18/2016<br>
 * Contact: nvirgichalia@gmail.com<br>
 * Purpose: An application that can assist athlets in group and team size
 */

public class GroupSize extends Application {
	@Override
	public void start(Stage primarystage) {
		int groupSize = 0;
		int teamSize = 0;
		
		TextInputDialog inputDialog = new TextInputDialog();
		inputDialog.setHeaderText("Group size application");
		inputDialog.setContentText("Enter the number of people");
		Optional<String> result = inputDialog.showAndWait();
		int numPeople = Short.parseShort(result.get());
	
		if(numPeople>=10) {
			groupSize = numPeople/2;
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("The number of people is " + groupSize);
			alert.showAndWait();
		} else if (numPeople>=3) {
			groupSize = numPeople/3;
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("The number of people is " + groupSize);
			alert.showAndWait();
		} else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("The number of people has to be at least 3");
			alert.showAndWait();
		}
		TextInputDialog inputDialog1 = new TextInputDialog();
		inputDialog1.setHeaderText("Team size application");
		inputDialog1.setContentText("Enter the number of players");
		Optional<String> input = inputDialog1.showAndWait();
		int numPlayers = Short.parseShort(input.get());
			
		if(numPeople<=55) {
			teamSize = numPlayers/11;
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("The number of players are " + teamSize);
			alert.showAndWait();
		} else if (numPeople>=11) {
			teamSize = numPlayers/11;
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("The number of players are " + teamSize);
			alert.showAndWait();
		} else {
			teamSize = 1;
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("The number of players are " +teamSize);
			alert.showAndWait();
		}
		
	}
}
