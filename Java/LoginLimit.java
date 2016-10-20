import java.util.Optional;
import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

/**
 * Author: Natasya Virgichalia<br>
 * Date: 10/18/2016<br>
 * Contact: nvirgichalia@gmail.com<br>
 * Purpose: An application to authorize username and password 
 */

public class LoginLimit extends Application{
	@Override
	public void start(Stage primaryStage) {
	
	TextInputDialog inputUser = new TextInputDialog();
	inputUser.setHeaderText("Enter username");
	TextInputDialog inputPass = new TextInputDialog();
	inputPass.setHeaderText("Enter password");
	int counter = 3;

	do {
	Alert instructions = new Alert(AlertType.INFORMATION);
	instructions.setTitle("Login account");
	instructions.setContentText("Enter your username and password to login your account");
	instructions.showAndWait();
	Optional<String> result = inputUser.showAndWait();
	String username = result.get();
	counter--;

		if (username.equals("natasya")) {
		Optional<String> resultPass = inputPass.showAndWait();
		String password = resultPass.get();
			if (password.equals("papaya")) {
			Alert login = new Alert(AlertType.INFORMATION);
			login.setContentText("Welcome Natasya!");
			login.showAndWait();
			break;
			}
			else {
			Alert failedpass = new Alert(AlertType.INFORMATION);
			failedpass.setContentText("Invalid password");
			failedpass.showAndWait();
			}
		} else {
		Alert faileduser = new Alert(AlertType.INFORMATION);
		faileduser.setContentText("Invalid username");
		faileduser.showAndWait();
		}
		}

	while (counter>0); {
		if (counter<=0) {
		Alert limit = new Alert(AlertType.INFORMATION);
		limit.setContentText("Contact Administration");
		limit.showAndWait();
		}
	}
}
}
		
