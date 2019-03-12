PImage donkey;
PImage tail;
void setup(){
   size(486,464);
  donkey = loadImage("donkey.jpg");
  tail = loadImage("Donkey-tail.jpg");   
  
}
void draw(){
 background(donkey);
 image(tail,mouseX,mouseY);
}