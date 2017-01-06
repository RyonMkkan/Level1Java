import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class nameGreet implements ActionListener {
	JFrame window = new JFrame();
	JButton button = new JButton("enter name plz");
	JButton buttoon = new JButton ("get greeted m90");
	JPanel panel = new JPanel();
	String name;
public static void main(String[] args) {
nameGreet ng = new nameGreet();
ng.setup();

}

void setup(){
window.setVisible(true);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
panel.add(button);
panel.add(buttoon);
window.add(panel);
window.pack();
button.addActionListener(this);
buttoon.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button){
	 name =JOptionPane.showInputDialog("plz put ur name");}
	else {
		JOptionPane.showMessageDialog(null,  "HELLO" + name );
	}
}
}