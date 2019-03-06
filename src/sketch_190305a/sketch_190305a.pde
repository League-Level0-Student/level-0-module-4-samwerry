 void setup(){
   size(800,600);

PImage face = loadImage("travis.jpg");
face.resize(800,600);
    background(face);
    
    
}

void draw(){
  if(mouseX<460){
    mouseX=445;
  }
    if( mouseX>490){
      mouseX=445;
    }
      if(mouseY<165){
        mouseY=185;
      }
        if(mouseY>205){
          mouseY=185;
        }
  fill(255,255,255);
  ellipse(470,185,50,50);
  
  fill(0,0,0);
  ellipse(mouseX,mouseY,10,10);
  
  
  fill(255,255,255);
  ellipse(585,220,50,50);
  
  fill(0,0,0);
  ellipse(mouseX+115,mouseY+35,10,10);
  
}