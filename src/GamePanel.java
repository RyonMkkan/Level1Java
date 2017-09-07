import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer time;

	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	public static BufferedImage alienImg;
	public static BufferedImage rocketImg;
	public static BufferedImage bulletImg;
	public static BufferedImage spaceImg;
	int currentState = MENU_STATE;
	Font titleFont;
	String score1;
	

	
	Rocketship ship = new Rocketship(250, 700, 50, 50, 9);
	
ObjectManager ObjectManageer;

	GamePanel() {
		System.out.println("I");
		time = new Timer(1000 / 60, this);
		titleFont = new Font("Arial", Font.PLAIN, 48);
		
		ObjectManageer = new ObjectManager();
		ObjectManageer.addObject(ship); 
		try {
			alienImg = ImageIO.read(this.getClass().getResourceAsStream("alien.png"));
			rocketImg = ImageIO.read(this.getClass().getResourceAsStream("rocket.png"));
			bulletImg = ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));
			spaceImg = ImageIO.read(this.getClass().getResourceAsStream("space.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("one of the images is missing");
		System.exit(0);
		}

		


	}

	void keyPressed() {

	}

	void keyReleased() {

	}

	void startGame() {
		System.out.println("lIKE");
		time.start();
	}

	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			DrawMenuState(g);
		} else if (currentState == GAME_STATE) {
			DrawGameState(g);
		} else if (currentState == END_STATE) {
			DrawEndState(g);
		}

	}

	void updateMenuState() {

	}

	void updateGameState() {
		ObjectManageer.update();
		ObjectManageer.manageEnemies();
		ObjectManageer.checkCollision();
		if (ship.isAlive==false) {
			currentState=END_STATE;
			 ObjectManageer.reset();
			 ship = new Rocketship(250, 700, 50, 50, 9);
			 ObjectManageer.addObject(ship);
			 ObjectManageer.setScore(0);
	
		} 
		int scoree = ObjectManageer.getScore();
		score1 = String.valueOf(scoree);
	}

	void updateEndState() {

	}

	void DrawMenuState(Graphics g) {

		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 500, 800);
		g.setColor(Color.CYAN);
		g.setFont(titleFont);
		g.drawString("League Invaders ", 50, 200);
		g.drawString("press ENTER to play ", 25, 400);

	}

	void DrawGameState(Graphics g) {
		g.drawImage(GamePanel.spaceImg, 0, 0, LeagueInvaders.width, LeagueInvaders.height, null);
		g.setColor(Color.CYAN);
		g.setFont(titleFont);
		g.drawString("Score:"+ ObjectManageer.getScore(), LeagueInvaders.width-195,50 );
		ObjectManageer.draw(g);
		ObjectManageer.manageEnemies();
		

	}

	void DrawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, 500, 800);
		g.setColor(Color.CYAN);
		g.setFont(titleFont);
		g.drawString("Game over", 150, 200);
		g.drawString("Press ", 200, 300);
		g.drawString("ENTER to restart", 90, 400);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
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
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState++;
		}
		if (currentState > END_STATE) {
			currentState = MENU_STATE;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			ship.left = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			ship.right = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			ship.up = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			ship.down = true;
		}

		if (e.getKeyCode() == KeyEvent.VK_SPACE){
			
			ObjectManageer.addObject(new Projectile(ship.x + 30, ship.y+50, 10, 10));
			ObjectManageer.addObject(new Projectile(ship.x + 10, ship.y+50, 10, 10));
			ObjectManageer.addObject(new Projectile(ship.x + 30, ship.y, 10, 10));
			ObjectManageer.addObject(new Projectile(ship.x + 10, ship.y, 10, 10));
			

		}
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			ship.left = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			ship.right = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			ship.up = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			ship.down = false;
		}

	}

}
