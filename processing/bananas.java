void setup() {
  size(1200, 600);
}

void draw() {
  for (int i = 0; i < 1000; i++) {
    text("banana", ((i / 50) * 50) + 10, (i*10) % 500);
  }
  
}