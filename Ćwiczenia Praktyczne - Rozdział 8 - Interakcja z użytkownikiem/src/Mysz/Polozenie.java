package Mysz;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;

public class Polozenie extends JApplet implements MouseListener
{
	private int x, y;

	public void init()
	{

		addMouseListener(this);
	}

	public void paint(Graphics g)
	{
		g.clearRect(0, 0, getSize().width, getSize().height);
		g.drawString("Wspó³rzêdne klikniêcia: x =" + x + "y = " + y, 10, 10);
	}

	public void mouseClicked(MouseEvent evt)
	{
		x = evt.getX();
		y = evt.getY();
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