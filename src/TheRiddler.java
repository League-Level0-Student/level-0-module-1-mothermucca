import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle = "What can travel around the world while staying in a corner?";
		String answer = "A stamp.";
		
		String response = JOptionPane.showInputDialog(riddle);
		if (response.equals(answer)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong: " + answer);
		}
		
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		riddle = "What has a head and a tail, but no body?";
		answer = "A coin.";
		
		response = JOptionPane.showInputDialog(riddle);
		if (response.equals(answer)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong: " + answer);
		}
		
		riddle = "What has an eye but can not see?";
		answer = "A needle.";
		
		response = JOptionPane.showInputDialog(riddle);
		if (response.equals(answer)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong: " + answer);
		}
		
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is " + score);
	}
}

