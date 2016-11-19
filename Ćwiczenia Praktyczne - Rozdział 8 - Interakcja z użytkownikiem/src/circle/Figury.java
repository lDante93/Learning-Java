package circle;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JApplet;

public class Figury extends JApplet implements MouseListener
{
private CircleDatabase database;
private Random r;
	public void init(){
		database = new CircleDatabase();
		r =new Random();
		addMouseListener(this);
	}
public void paint(Graphics g)
{
	database.drawAll(g);
}
	@Override
	public void mouseClicked(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
	int x = e.getX();
	int y = e.getY();
	Color color = new Color(r.nextInt());
	database.addElement(new Circle(x,y,color));
	repaint();
		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}