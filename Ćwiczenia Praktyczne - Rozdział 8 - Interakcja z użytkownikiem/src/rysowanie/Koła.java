package rysowanie;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;

public class Ko³a extends JApplet implements MouseListener
{
	
	public void init()
	{

		addMouseListener(this);
	}

	public void paint(Graphics g)
	{
//		g.clearRect(0, 0, getSize().width, getSize().height);
//		g.drawString("Wspó³rzêdne klikniêcia: x =" + x + "y = " + y, 10, 10);
	}

	public void mouseClicked(MouseEvent evt)
	{
		int x = evt.getX();
		int y = evt.getY();
		getGraphics().fillOval(x-10, y-10, 20, 20);
		repaint();
	}

	public void mousePressed(MouseEvent evt)
	{
	}

	public void mouseExited(MouseEvent evt)
	{
	}

	public void mouseEntered(MouseEvent evt)
	{
	}

	public void mouseReleased(MouseEvent evt)
	{
	}

}