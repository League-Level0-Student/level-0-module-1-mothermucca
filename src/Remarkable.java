import javax.swing.JOptionPane;


public class Remarkable {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What's your name?");
		
		if (name.equals("Isaac")) {
			JOptionPane.showMessageDialog(null, "Isaac is swell");
		} else if (name.equals("Stephanie")) {
			JOptionPane.showMessageDialog(null, "Stephanie is awesome");
		} else if (name.equals("Michael")) {
			JOptionPane.showMessageDialog(null, "Michael is nice");
		} else if (name.equals("Andrea")) {
			JOptionPane.showMessageDialog(null, "Andrea is cool");
		} else {
			JOptionPane.showMessageDialog(null, "I don't know you");
		}

	}

}
