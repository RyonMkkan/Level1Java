import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;


public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";


// 1. Create a frame & make it visible
		JFrame frame= new JFrame();
frame.setVisible(true); 
frame.setSize(1000, 1000);
		// 2. Add the panel to the frame
frame.add(panel);
		// 3. Set the background image of the panel to the Galapagos Islands 
panel.setBackgroundImage(galapagosIslands);

		// 4. Instantiate a Turtle 
Turtle turd = new Turtle();

panel.addTurtle(turd);
turd.setX(500);
turd.setY(500);


// 5. Add the turtle to the panel 
		
		// 6. Put 50 Turtles on the beach
for (int i = 0; i < 10000; i++) {
	Turtle bib = new Turtle();

	panel.addTurtle(bib);
	bib.setX(1 *i);
	bib.setY(1* i);
	
}


	}
}


