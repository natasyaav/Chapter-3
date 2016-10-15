import javax.swing.JOptionPane;

/**
* Author: natasya virgichalia<br>
* Date: 10/14/2016<br>
* Email: nvirgichalia@gmail.com<br>
* Purpose: a Java Program to Authenticate a user login for Username and Password
*/

public class Username {
	public static void main(String[] args) {
		String username = "Natasya";
		String password = "papaya";
		
		String inputUser = JOptionPane.showInputDialog("Please enter your username");
		String inputPass = JOptionPane.showInputDialog("Please enter your password");
		if (inputUser.equals(username) && inputPass.equals(password)){
			JOptionPane.showMessageDialog(null, "Welcome Natasya!");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong username or password!");
		
	
		}
	}
}

