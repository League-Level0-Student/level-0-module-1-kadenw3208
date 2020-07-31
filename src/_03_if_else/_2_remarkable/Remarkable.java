package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String Colby="You are a very good teacher!";
String Ling="You always help me do my stuff. Thank you!";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String input=JOptionPane.showInputDialog("Enter your name, please");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if (input.equals("Ling")) {
	JOptionPane.showMessageDialog(null, Ling);
}
else {
	JOptionPane.showMessageDialog(null, Colby);
}
	}
}

