import org.jointheleague.graphical.robot.Robot;

public class IIIDquare {
public static void main(String[] args) {
	
//	Robot rob = new Robot();
//	rob.penDown();
//	rob.setPenColor(0, 0, 255);
//	rob.setSpeed(11);
//	for (int i = 0; i < 5; i++) {
//		rob.move(150);
//		rob.turn(90);
//	}
//	rob.turn(45);
//	rob.move(150);
//	rob.turn(45);
//	for (int i = 0; i < 6; i++) {
//		rob.move(150);
//		rob.turn(-90);
//	}
//	rob.turn(-45);
//	rob.move(150);
//	rob.turn(45);
//	rob.move(150);
//	rob.turn(135);
//	rob.move(150);
//	rob.turn(45);
//	rob.move(150);
//	rob.turn(90);
//	rob.move(150);
//	rob.turn(45);
//	rob.move(150);
	//drawsquare(350);		
	drawshape(50,20);
}



static void drawsquare(int l){
	Robot rob = new Robot();
	rob.penDown();
	rob.setSpeed(10);
	for (int i = 0; i < 4; i++) {
	rob.move(l);
	rob.turn(90);
	}	
}


static void drawshape (int L, int s){
	Robot rob = new Robot();
	rob.penDown();
	rob.setSpeed(10);
	for (int i = 0; i < s; i++) {
	rob.move(L);
	rob.turn(360/s);
	}	

}
}