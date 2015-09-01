import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX = 0;
int startY = 150;
int endX = 0;
int endY = 150;


public void setup()
{
  size(1000,300);
  strokeWeight(1);
  background(255, 255,255);
}

public void draw()
{

	while (endX <= 1000) 
	{

		int rd = (int)(Math.random()*256);
		int gr = (int)(Math.random()*256);
		int bl = (int)(Math.random()*256);
		int yo = (int)(Math.random()*256);

		stroke(rd, gr, bl, yo);

		int coin = (int)(Math.random()*9);
		int electromagnet = (int)((Math.random()*18) - 9);

		
		endX = startX + coin;
		endY = startY + electromagnet;

		line(startX, startY, endX, endY);

		startX = endX;
		startY = endY;
	}
}

public void mousePressed()
{
	startX = 0;
	startY = 150;
	endX = 0;
	endY = 150;
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
