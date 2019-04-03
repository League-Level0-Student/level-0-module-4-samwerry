int x=200;
int y=220;


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
    ellipse(mouseX,mouseY,10,10);
  
  }
 if(isNear(mouseX,x)&&isNear(mouseY,y)){
   fill(0,255,0);
   
 }
 else{
   fill(255,0,0);
 }
 if(mouseX==200&&mouseY==220){
  println("YOU FOUND THE CREEPER, BUT FIND IT AGAIN");
  PImage creeper;     
creeper=loadImage("creeper.png");  
creeper.resize(50,50);
  image(creeper,500,500);
 }
 }
 
boolean isNear(int a, int b) {
if (abs(a- b) < 30)
     return true;
else
     return false;
}