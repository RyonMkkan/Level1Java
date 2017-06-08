import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;
public class GamePanel extends JPanel implements ActionListener, KeyListener {
Timer time;


GamePanel(){
	System.out.println("I");
	time = new Timer(1000/60, this);
}
void startGame(){
	System.out.println("lIKE");
	time.start();
}
public void paintComponent(Graphics g){
	g.fillRect(10, 10, 100, 100);
	System.out.println("TO");
}



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	repaint();
	System.out.println("EAT");
}

	
	
	
	
	

}


