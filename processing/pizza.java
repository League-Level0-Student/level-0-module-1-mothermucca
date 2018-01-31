import java.util.ArrayList;
import ddf.minim.*;     //at the top of the sketch

Minim minim;     //at the top of the sketch
AudioPlayer sound;    //at the top of the sketch

class Topping {
  public int x;
  public int y;
  public String imageName;
  
  public Topping(int x, int y, String imageName) {
    this.x = x;
    this.y = y;
    this.imageName = imageName;
  }
}

class Pepperoni extends Topping {
  public Pepperoni(int x, int y) {
    super(x, y, "pepperoni.gif");
  }
}

class Mushroom extends Topping {
  public Mushroom(int x, int y) {
    super(x, y, "mushroom.gif");
  }
}

ArrayList<Topping> toppings;

void setup() {
    minim = new Minim(this);
    sound = minim.loadFile("snap.wav");
    size(500, 500);
    toppings = new ArrayList<Topping>();
}

void draw() {
    background(200, 200, 200);
    noStroke();
    fill(245, 222, 179);
    ellipse(150, 200, 150, 150);
    
    fill(255, 10, 10);
    ellipse(150, 200, 140, 140);
    
    fill(255, 215, 0);
    ellipse(150, 200, 135, 135);
    
    for (Topping topping : toppings) {
      PImage image = loadImage(topping.imageName);
      image.resize(10, 10);
      image(image, topping.x, topping.y);
    }

}

void mouseClicked() {
  if (mouseButton == LEFT) {
    toppings.add(new Pepperoni(mouseX, mouseY));
    sound.rewind();
    sound.play();
  } else if (mouseButton == RIGHT) {
    toppings.add(new Mushroom(mouseX, mouseY));
    sound.rewind();
    sound.play();    
  }
}