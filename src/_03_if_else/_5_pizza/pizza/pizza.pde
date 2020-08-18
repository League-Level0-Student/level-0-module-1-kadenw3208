PImage pepperoni;
PImage mushroom;
PImage olive;
PImage pizzabox;
void setup() {
  PImage pizzabox=loadImage("download.png");
 size(800, 800);
 pizzabox.resize(800, 800);
 background(pizzabox);
}
void draw() {
  pepperoni=loadImage("pepperoni.png");
  mushroom=loadImage("mushroom.png");
  olive=loadImage("olive.png");
  fill(#efcca2);
    ellipse(400, 400, 500, 500);
    fill(#F00A0A);
    ellipse(50, 50, 100, 100);
    fill(#FEFF24);
    ellipse(400, 400, 450, 450);
    image(pepperoni, 250, 250);
    image(pepperoni, 450, 250);
    image(mushroom, 350, 400);
    olive.resize(50, 50);
    image (olive, 200, 450);
    image(olive, 250, 500);
    image(olive, 300, 550);
    image(olive, 350, 550);
    image(olive, 400, 550);
    image(olive, 450, 500);
    image(olive, 500, 450);
    
}
