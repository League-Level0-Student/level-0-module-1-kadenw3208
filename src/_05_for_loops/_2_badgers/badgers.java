package _05_for_loops._2_badgers;

import javax.swing.JOptionPane;

public class badgers {
public static void main(String[] args) {
	for( int h=0; h<2; h++) {
		String b="Badger";
		for(int f=0; f<12; f++) {
			JOptionPane.showMessageDialog(null, b);
		}
		String m="Mushroom";
		for( int i=0; i<3; i++)
		JOptionPane.showMessageDialog(null, m);
	}
	JOptionPane.showMessageDialog(null, "A Snake!");
}
}
