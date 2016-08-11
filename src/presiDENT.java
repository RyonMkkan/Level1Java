

import javax.swing.JOptionPane;

public class presiDENT {
public static void main(String[] args) {
	String age =JOptionPane.showInputDialog("How old are you, kid?");
	int yearsold=Integer.parseInt(age);
	if (yearsold>=18) {
		JOptionPane.showMessageDialog(null, "who do you want to destroy the world?");
	}
	else {
		JOptionPane.showMessageDialog(null, "who gives a turd");
	}
}
}
