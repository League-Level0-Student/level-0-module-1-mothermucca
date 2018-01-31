import javax.swing.JOptionPane;


public class Unbirthday {

	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("What's your birthday (MM/DD)?");
		String today = "12/21";
		
		if (birthday.equals(today)) {
			JOptionPane.showMessageDialog(null, "Happy birthday!");
		} else {
			JOptionPane.showMessageDialog(null, "Happy unbirthday!");
		}
	}

}
