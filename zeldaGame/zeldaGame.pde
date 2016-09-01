void setup(){
  
  size (1000,1000);
 
  
  
  
  
  
  
}
void draw(){
 PImage zelda = loadImage("zelda.jpg"); // 2. Change this to match your file name.
  size(zelda.width, zelda.height);
  image(zelda, 0, 0);

   ellipse(mouseX,mouseY,100,400);
  
  
  
}
