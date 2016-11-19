package rysowanie;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JApplet;

public class Ko³a2_TablicaWsp2_Kolorowe extends JApplet implements MouseListener
{
	private int tabX[], tabY[];
	private int count;
	private Color colors[];
	private Random r;

	public void init()
	{
		count = 0;
		tabX = new int[100];
		tabY = new int[100];
		colors=new Color[100];
		r=new Random();
		addMouseListener(this);
	}

	public void paint(Graphics g)
	{
		for (int i = 0; i < count; i++)
		{
			g.setColor(colors[i]);
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
			colors[count++]=new Color((int) (r.nextDouble()*155));
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