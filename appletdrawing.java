import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class appletdrawing extends Applet implements MouseListener
{
	int x=100,y=100,flag=0;
	public void init()
	{
		addMouseListener(this);
		//setBackground(Color.YELLOW);
	}
	
	public void paint(Graphics g)
	{
		if(flag==0)
		{
				flag=1;
		}
		
		if(flag==1)
		{	
			//g.setColor(Color.RED);
			g.drawOval(x-50, y-50, 100, 100);
			//g.fillOval(x-50, y-50, 100, 100);
		}
	}
	
	public void mouseClicked(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		repaint();
	}
	public void mouseEntered(MouseEvent me) {}
	public void mousePressed(MouseEvent me) {}
	public void mouseReleased(MouseEvent me) {}
	public void mouseExited(MouseEvent me) {}
}
