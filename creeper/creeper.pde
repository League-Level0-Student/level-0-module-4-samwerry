void setup(){
size(500,500);

PImage green = loadImage("green.jpg");     
green.resize(500, 500);          
background(green);

PImage creeper;     
creeper=loadImage("creeper.png");  
creeper.resize(50,50);
image(creeper, 176, 200);


}



void draw(){
  println(mouseX);
  if(mousePressed){
    ellipse(mouseX,mouseY,mousePressed,mousePressed);
  }

}