import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {

	boolean left = false;
	boolean right = false;
	boolean up = false;
	boolean down = false;
	int speed;

	Rocketship(int x, int y, int width, int height,int spd) {
		super(x, y, width, height);
		speed=spd;
	}

	void update() {
		super.update();
		if (right) {
			x = x + 10;
		}
		if (left) {
			x = x - 10;
		}
		if (up) {
			y = y - 10;
		}
		if (down) {
			y = y + 10;
		}

	}

	void draw(Graphics g) {
		
		g.drawImage(GamePanel.rocketImg, x, y, width, height, null);

		
	}

}
