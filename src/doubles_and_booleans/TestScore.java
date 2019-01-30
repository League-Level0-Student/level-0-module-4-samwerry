package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScore {public static void main(String[] args) {
	
	String score = JOptionPane.showInputDialog("what did you get on your test");
	double s = Double.parseDouble(score);
	
	if(s<85) {
		JOptionPane.showMessageDialog(null, "You should study more");
	}
	else if(s>85) {
		JOptionPane.showMessageDialog(null, "Good Job!");
	}
	
	
	
	
	
	
}

}
