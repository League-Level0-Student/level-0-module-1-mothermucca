void setup() {
  PImage face = loadImage("face.jpg");
  size(1920, 1200);
  image(face, 0, 0);

}

void draw() {
  fill(mouseX % 256, mouseY % 256, 0);
  ellipse(750, 220, 300, 300);
  ellipse(1250, 220, 300, 300);
  
  fill(0, 0, 0);
  ellipse(750, 220, 150, 150);
  ellipse(1250, 220, 150, 150);
}