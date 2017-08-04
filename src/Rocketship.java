import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {

	boolean left = false;
	boolean right = false;
	int speed;

	Rocketship(int x, int y, int width, int height,int spd) {
		super(x, y, width, height);
		speed=spd;
	}

	void update() {

		if (right) {
			System.out.println(x + " " + y);
			x = x + 5;
		}
		if (left) {
			x = x - 5;
		}

	}

	void draw(Graphics g) {
		
		g.setColor(Color.BLUE);
		g.fillRect(x, y, 80, 80);

	}

}
