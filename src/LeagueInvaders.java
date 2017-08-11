import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class LeagueInvaders {
	int width=500;
	int height=800;
	JFrame frame = new JFrame();
	GamePanel GamePaneel;
public static void main(String[] args) {
	LeagueInvaders window = new LeagueInvaders();
		
		
	
}

LeagueInvaders(){
	GamePaneel = new GamePanel();
	
	setup();	
	
	
}
 void setup(){
	frame.add(GamePaneel);
	frame.addKeyListener(GamePaneel);
	 frame.setVisible(true);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	 frame.setSize(width, height);
	 GamePaneel.startGame();
	 
 }
}
 



