package rysowanieFigur;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;

public class Circle 
{
	public int x , y;
	public Color color;
	public Circle(int x, int y, Color color){
		this.x=x;
		this.y=y;
		this.color=color;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(color);
		g.drawOval(x-10,y-10,20,20);
		
	}

}