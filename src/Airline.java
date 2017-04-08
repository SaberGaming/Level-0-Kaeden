
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter and print
 * their boarding pass. You need to collect the following information: First name Last name Destination airport Birthday
 * (for security purposes) Male/female (for security purposes)
 * 
 * Print the boarding pass in this format: LAST NAME / FIRST NAME (BIRTHDAY, M/F) Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/

public class Airline {
	public static void main(String[] args) {
		for (int i = 0; i < 1; i++) {

			String first = JOptionPane.showInputDialog("What is your First Name?");
			String last = JOptionPane.showInputDialog("Please enter your Last Name.");
			String airport = JOptionPane.showInputDialog("What airport are you planning to land at?");
			String birthday = JOptionPane.showInputDialog("Please enter your Birthday. (For security purposes)");
			String gender = JOptionPane.showInputDialog("Please enter your gender. (Male or Female)");
			JOptionPane.showMessageDialog(null, "Boarding pass: " + last + ", " +
					first + " " + "(" + birthday + ", " + gender + ")" + " " + "Traveling to:" + airport);
		}
		JOptionPane.showOptionDialog(null, "Hi", "SOmething", JOptionPane.YES_NO_OPTION, 0, null, null, null);
	}
}
/**
 * Extra Difficult Challenge: have the program repeat until plane is full (10 passenger plan) and print out the number
 * of passengers after each boarding pass.
 */
