import java.awt.Color;
import java.awt.Graphics;
 
public class Clouds{
    int x;
    int y;
	int x1;
	int y1;
    Color blue;
     
    public Clouds(){
        x = (int)(Math.random() * 801);//random 0-800
        y = (int)(Math.random() *5 + 5);//random 0-600
		x1 = (int) (Math.random() * 125);
		y1 = (int) (Math.random() * 125);
		
        blue = new Color(255,255,255);
    }
	public void drawMe(Graphics g)
	{
		g.setColor(blue);
		g.fillOval(x,y,60,40);
	}
	
	public void move()
	{
		y++;
		if(y> 600)
		{
			y =-5;
		}
	}
     
}
