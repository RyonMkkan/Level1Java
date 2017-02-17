import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
public static void main(String[] args) {
	World star = new World(); 
	Flower flo = new Flower();
	
	star.show();
	Location us = new Location(9,1);
	Location can = new Location(9,1);
	Bug Barry = new Bug();
	Bug timbs = new Bug(Color.BLUE);
	timbs.turn();
	
	star.add(us, Barry );
	star.add(new Location(5,5), timbs );
	
	
	
}
}
