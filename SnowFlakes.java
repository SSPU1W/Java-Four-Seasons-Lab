import java.awt.Color;
import java.awt.Graphics;
 
 
public class SnowFlakes{
    int x;
    int y;
    Color white;
     
    public SnowFlakes(){
        x = (int)(Math.random() * 801);//random 0-800
        y = (int)(Math.random() * 601);//random 0-600
        white = new Color(255,255,255);
    }
	public void drawMe(Graphics g)
	{
		g.setColor(white);
		g.fillRect(x,y,2,5);
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
