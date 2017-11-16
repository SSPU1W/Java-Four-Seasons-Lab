
import java.awt.Color;
import java.awt.Graphics;
 
public class Mountain{
    int x;
    int y;
    Color blue;
	Color grey;
     
    public Mountain(){
        x = (int)(Math.random() * 801);//random 0-800	
		
        blue = new Color(139,139,139);
		grey = new Color(255,255,255);
    }
	public void drawMe(Graphics g)
	{
		int[] xMountain = new int[3];
		int[] yMountain = new int[3];
		xMountain[0] = x;
		yMountain[0] = 350;
		xMountain[1] = x+ 25;
		yMountain[1] = 100;
		xMountain[2] = x+50;
		yMountain[2] = 350;
		g.setColor(blue);
		g.fillPolygon(xMountain, yMountain, 3);
		g.setColor(grey);
		g.fillOval(x,350,20,30);
		g.fillOval(x+10,120,15,20);
		g.fillOval(x+20,120,15,20);
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
