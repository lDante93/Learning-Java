package rysowanie;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JApplet;

public class Ko³a2_TablicaWsp2_Rozmiar extends JApplet implements MouseListener
{
	private int tabX[], tabY[];
	private int count;
	private Color colors[];
	private Random r;

	public void init()
	{
		count = 0;
		tabX = new int[2];
		tabY = new int[2];
		colors = new Color[2];
		r = new Random();
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
		int x = evt.getX();
		int y = evt.getY();
		tabX[count] = x;
		tabY[count] = y;
		colors[count++] = new Color((int) (r.nextInt()));

		if (count >= tabX.length)
		{
			int tempTabX[], tempTabY[];
			Color tempColors[];
			tempTabX = new int[tabX.length * 2];
			tempTabY = new int[tabY.length * 2];
			tempColors = new Color[colors.length * 2];

			for (int i = 0; i < tabX.length; i++)
			{
				tempTabX[i] = tabX[i];
				tempTabY[i] = tabY[i];
				tempColors[i] = colors[i];
			}
			tabX = tempTabX;
			tabY = tempTabY;
			colors = tempColors;
		}
		repaint();
	}
	public void mouseClicked(MouseEvent evt)
	{

	}
}