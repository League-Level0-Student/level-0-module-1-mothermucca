int clickX;
int clickY;

void setup() {
    size(500, 500);
    clickX = 0;
    clickY = 0;
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(255, 0, 0);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(0, 128, 0);
    rect(176, 103, 12, 32);
    fill(200, 200, 200);
    
    if (clickX != 0 ) {
      ellipse(clickX, clickY, 40, 40);
    }

}

void mouseClicked() {
  clickX = mouseX;
  clickY = mouseY;
}
