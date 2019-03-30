

import ddf.minim.*;
AudioSample woohooSound;          
boolean playSound = true; 

PImage donkey;
PImage tail;
int x =430;
int y=60;
int tailx=500;
int taily=500;


void setup(){
  Minim minim = new Minim(this);     
woohooSound = minim.loadSample("homer.wav"); 
   size(486,464);
  donkey = loadImage("donkey.jpg");
  tail = loadImage("download.png");   
  tail.resize(100,100);
}
void draw(){
  textSize(10);
  text("put your mouse in the top left of the screen, and try to pin the tail on the donkey",20,20);
 if(mousePressed==true){
   tailx=mouseX;
 }
 if(mousePressed==true){
   taily=mouseY;
 }
 rect(0,0,30,30);
 rect(430,60,40,40);
 if(dist(0,0, mouseX, mouseY)<30){
   background(donkey);
 }
 else{
   background(34,23,0);
 }
 if(dist(430,60,mouseX,mouseY)<100){
   background(donkey);
   if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
 }
 image(tail,tailx,taily);
}