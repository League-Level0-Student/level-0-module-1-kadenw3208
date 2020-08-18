PImage face;
void setup() {
  size (600, 600);
face=loadImage("face.png");
face.resize(600, 600);
background(face);
}
void draw() {
  fill(mouseX%255, mouseY%255, mouseX+mouseY%255);
ellipse(165, 300, 200, 300);
fill(mouseY%255, mouseX%255, mouseY+mouseX%255);
ellipse(425, 300, 200, 300);
fill(0, 0, 0);
ellipse(165, 275, 75, 150);
ellipse(425, 275, 75, 150);
}
