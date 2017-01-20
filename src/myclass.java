import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class myclass implements KeyListener{
JFrame j = new JFrame("windows");

public static void main (String [] args){
	myclass mc= new myclass();
	mc.setup();
}
void setup(){
	j.setVisible(true);
	j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	j.addKeyListener(this);
	
	
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	if(e.getKeyCode()==KeyEvent.VK_ENTER);
	{
	System.out.println("Hi");	
	}
	}
}




