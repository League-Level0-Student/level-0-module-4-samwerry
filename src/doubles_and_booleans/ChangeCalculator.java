package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickel = JOptionPane.showInputDialog("how many nickels do you have");
		// Convert their answer to an int using Integer.parseInt()
int n = Integer.parseInt(nickel);
		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog("how many dimes do you have");
int d = Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
String quaters = JOptionPane.showInputDialog("how many quaters do you have");
int q = Integer.parseInt(quaters);
		// Calculate how much money the user has and save it in a double variable 
 double total = q*0.25+d*0.10+n*0.5;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "$" +total);
	}
}

