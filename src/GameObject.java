import java.awt.Graphics;

public class GameObject {
	int x = 10;    
	int y = 10;
	int width;
	int height;
	
	GameObject(){
		
	}
	 void update(){
		 x =x+10;
		 y=y+10;
		 
	 }
	void draw(Graphics g){
		g.fillRect(10, 10, 100, 100);
		System.out.println("TO");
		
		
	}
	private void fillRect(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
	}
}
