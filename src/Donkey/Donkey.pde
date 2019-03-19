PImage donkey;
PImage tail;
int x=430;
int y=60;
void setup(){
   size(486,464);
  donkey = loadImage("donkey.jpg");
  tail = loadImage("download.png");   
  tail.resize(100,100);
}
void draw(){
 
 rect(0,0,30,30);
 rect(430,60,40,40);
 if(dist(0,0, mouseX, mouseY)<30){
   background(donkey);
 }
 else{
   background(34,23,0);
 }
 image(tail,mouseX,mouseY);
}