package rysowanie;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;

public class Ko³a2_TablicaWsp extends JApplet implements MouseListener
{
	private int tabX[], tabY[];
	private int count;

	public void init()
	{
		count = 0;
		tabX = new int[100];
		tabY = new int[100];
		addMouseListener(this);
	}

	public void paint(Graphics g)
	{
		for (int i = 0; i < count; i++)
		{
			g.fillOval(tabX[i] - 10, tabY[i] - 10, 20, 20);
		}
	}

	public void mouseClicked(MouseEvent evt)
	{
		int x = evt.getX();
		int y = evt.getY();
		if (count < tabX.length)
		{

			tabX[count] = x;
			tabY[count] = y;
			count++;
		}
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