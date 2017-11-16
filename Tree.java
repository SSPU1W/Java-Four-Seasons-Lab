import java.awt.Color;
import java.awt.Graphics;
 
public class Tree{
    int x;
    int y;
	int x1;
	int y1;
    Color blue;
	Color brown;
     
    public Tree(){
        x = (int)(Math.random() * 801);//random 0-800
        y = (int)(Math.random() *46 + 375);//random 0-600
		x1 = (int) (Math.random() * 125);
		y1 = (int) (Math.random() * 125);
		
        blue = new Color(0,255,0);
		brown = new Color(222,184,135);
    }
	public void drawMe(Graphics g)
	{
		g.setColor(blue);
		g.fillOval(x,y-50,40,50);
		g.setColor(brown);
		g.fillRect(x,y,40,50);
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
