void setup() {
  PImage waldo = loadImage("wheres-waldo.jpg"); // Change this to match your file name.
  size(500, 500);
  image(waldo, 0, 0);
  doh = minim.loadSample("gekyume.wav"); //drag and drop from project onto sketch
  woohoo = minim.loadSample("sickobamba.wav"); //drag and drop from project onto sketch } 
}

void draw() {
      // Use this print statement to find out the coordinates of Waldo
      // println("X: " + mouseX + " Y: " + mouseY); 
println("X: " + mouseX +"Y:" + mouseY);
      // If the mouse is on Waldo, print “Waldo found!”
if(mouseX==182&&mouseY==81){
  println("YOU FOUND WALDO");
  playWoohoo();
}
else if(mousePressed){
  playDoh();
}
      // If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      
        
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;