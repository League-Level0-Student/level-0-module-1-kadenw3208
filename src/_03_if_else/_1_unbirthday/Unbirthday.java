package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String unbirthday=JOptionPane.showInputDialog("When is your birthday? Please answer in the format (month) (day)");
	if(unbirthday.equals("July 31")) {
		JOptionPane.showMessageDialog(null, "I wish you a happy birthday!");}
		else {
			JOptionPane.showMessageDialog(null, "I wish you a happy UNbirthday!");
	}
}
}