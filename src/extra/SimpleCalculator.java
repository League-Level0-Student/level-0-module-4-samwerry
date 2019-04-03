package extra;


import javax.swing.JOptionPane;
import javax.xml.bind.helpers.ParseConversionEventImpl;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String int1= JOptionPane.showInputDialog("Type a number");
String int2 =JOptionPane.showInputDialog("type another number");
int h = Integer.parseInt(int1);
int g =Integer.parseInt(int2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "", "Choose a method", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "addition", "subraction", "multiplacation", "division" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.
}

static void Add() {
	 2 + 3 =5;
}