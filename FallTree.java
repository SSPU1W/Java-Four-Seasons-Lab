import java.awt.Color;
import java.awt.Graphics;
 
 
public class FallTree{
    int x;
    int y;
    Color orangeleaves;
     
    public FallTree(){
        x = (int)(Math.random() * 801);//random 0-800
        y = (int)(Math.random() * 601);//random 0-600
        orangeleaves = new Color(255,137,0);
    }
	public void drawMe(Graphics g)
	{
		g.setColor(orangeleaves);
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
