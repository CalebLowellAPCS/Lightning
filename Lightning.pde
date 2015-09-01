int startX = 0;
int startY = 150;
int endX = 0;
int endY = 150;


void setup()
{
  size(1000,300);
  strokeWeight(1);
  background(255, 255,255);
}

void draw()
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

void mousePressed()
{
	startX = 0;
	startY = 150;
	endX = 0;
	endY = 150;
}

