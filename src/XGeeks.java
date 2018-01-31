//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String mattsPower = "teaching";
		String annsPower = "writing code";
		String davesPower = "being organized";
			

		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog("Enter a name.");

		// 3. Show the superpower in a pop-up, depending on the name entered.
		String message;
		if (name.equals("Matt")) {
			message = "Matt's superpower is " + mattsPower + ".";
		} else if (name.equals("Ann")) {
			message = "Ann's superpower is " + annsPower + ".";			
		} else if (name.equals("Dave")) {
			message = "Dave's superpower is " + davesPower + ".";			
		} else {
			message = "Who?";
		}

		JOptionPane.showMessageDialog(null, message);
	}
}

