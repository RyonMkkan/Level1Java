import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class Survey implements ActionListener {
JFrame window= new JFrame();
JButton button= new JButton("roll");
JPasswordField jpf = new JPasswordField(10);
JPanel panel= new JPanel();
JLabel dice1 = new JLabel();
JLabel dice2 = new JLabel();

public static void main(String[] args) {
	Survey s = new Survey();
	s.setup();
}


void setup(){
	window.setVisible(true);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.add(button);
	panel.add(dice1);
	panel.add(dice2);
	
	window.add(panel);
	window.pack();
	button.addActionListener(this);
	
	
	
	
	
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	Random rand= new Random();
	if(e.getSource()==button);
	int d1=rand.nextInt(6)+1;
	int d2=rand.nextInt(6)+1;
	dice1.setText(""+d1);
	dice2.setText(""+d2);
if (d1==d2) {
	JOptionPane.showMessageDialog(panel, "TAA DAA");
}	
}

	
	//int x =Interger.parseint(string);
}




