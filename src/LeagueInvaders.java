import javax.swing.JFrame;

public class LeagueInvaders {
	int width=500;
	int height=800;
	JFrame frame = new JFrame();
	
public static void main(String[] args) {
	LeagueInvaders window = new LeagueInvaders();
		
}

LeagueInvaders(){
	
	setup();	
}

 void setup(){
	 frame.setVisible(true);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	 frame.setSize(width, height);
 }
 }



