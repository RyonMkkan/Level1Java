import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;
public class GamePanel extends JPanel implements ActionListener, KeyListener {
Timer time;

final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState = MENU_STATE;

GamePanel(){
	System.out.println("I");
	time = new Timer(1000/60, this);
	
}
void startGame(){
	System.out.println("lIKE");
	time.start();
}
public void paintComponent(Graphics g){
	if(currentState == MENU_STATE){
		DrawMenuState(g);
	}else if(currentState == GAME_STATE){
		DrawGameState(g);
	}else if(currentState == END_STATE){
		DrawEndState(g);
	}

	
}
void updateMenuState(){
	
}
void updateGameState(){
	
}
void updateEndState(){
	
}
void DrawMenuState(Graphics g){
	g.setColor(Color.BLUE);
	g.fillRect(0, 0, 500 , 800);   

}
void DrawGameState(Graphics g){
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, 500, 800);    

}
void DrawEndState(Graphics g){
	g.setColor(Color.RED);
	g.fillRect(0, 0, 500, 800);    
}




@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	repaint();
	System.out.println("EAT");
	if(currentState == MENU_STATE){
		updateMenuState();
	}else if(currentState == GAME_STATE){
		updateGameState();
	}else if(currentState == END_STATE){
		updateEndState();
	}

	
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if(currentState > END_STATE){
		currentState = MENU_STATE;
	}

}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

	
	
	
	
	

}


