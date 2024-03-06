import processing.core.PApplet;
import processing.core.PFont;

public class Sketch extends PApplet {
	
PFont f;
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);

  
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 120, 255);
    f = createFont("Arial", 24, true);
    noLoop();

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  
	
  public void draw() {
    
    float random1 = random(0, 400);
    float random2 = random(0, 200);
    float random3 = random(0, 400);
    float random4 = random(0, 400);
	// sample code, delete this stuff
    if (random1 < 200) {
      background(0,120,255);
    }
    if (random1 > 200) {
      background(255, 165, 0);
    }
    fill(255, 100, 0);
    ellipse(random1, 20, 400, 400);
    fill(255, 140, 0);
    ellipse(random1, 20, 350, 350);
    fill(255, 180, 0);
    ellipse(random1, 20, 300, 300);
    fill(255, 200, 0);
    ellipse(random1, 20, 250, 250);
    fill(255, 220, 0);
    ellipse(random1, 20, 200, 200);
    fill(255, 255, 0);
    ellipse(random1, 20, 150, 150);
    fill(120);
    rect(random2 - 100, 250, 150, 400);
    rect(random2 + 100, 250, 150, 400);
    rect(random2, 200, 150, 400);
    textFont(f);
    fill(0);
    textAlign(LEFT);
    String time = (hour() + ":" + minute() + ":" + second());
    text(time, 0, 350);

    

    
    
  }
}