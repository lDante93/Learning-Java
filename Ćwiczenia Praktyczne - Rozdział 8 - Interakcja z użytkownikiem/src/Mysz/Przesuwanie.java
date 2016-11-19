package Mysz;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;

public class Przesuwanie extends JApplet implements MouseMotionListener
{
	private int x, y;
String str;
	public void init()
	{
str ="";
		addMouseMotionListener(this);
	}

	public void paint(Graphics g)
	{
		g.clearRect(0, 0, getSize().width, getSize().height);
		g.drawString(str,90,100);
	}

	

	@Override
	public void mouseDragged(MouseEvent arg0)
	{
		int x =arg0.getX();
		int y =arg0.getY();
		str="Dragged: x = "+ x+ " y = "+ y;
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0)
	{
		int x =arg0.getX();
		int y =arg0.getY();
		str="Moved: x = "+ x+ " y = "+ y;
		repaint();
		
	}

}