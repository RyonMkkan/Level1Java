import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JokeTeller implements ActionListener{
	JFrame window=new JFrame ("jokes");
	JButton Jokebutton=new JButton ("jokes");
	JButton Jokebuttoon=new JButton ("punch Line");
	JPanel panel = new JPanel();
public static void main(String[] args) {
	JokeTeller jt =new JokeTeller();
	jt. setup();
}
void setup(){
	window.setVisible(true);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.add(Jokebutton);
	panel.add(Jokebuttoon);
	window.add(panel);
	window.pack();
	Jokebutton.addActionListener(this);
	Jokebuttoon.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()==Jokebutton) {
		JOptionPane.showMessageDialog(null, "ma name jeff");
	}
	else {
		JOptionPane.showMessageDialog(null, "21");
	}
	
}

}