package rysowanieFigur;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;




public class FiguryApp extends JFrame implements MouseListener
{
private CircleDatabase database;
private Random r;

public FiguryApp(){
	super("Figury");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		database = new CircleDatabase();
		r =new Random();
		addMouseListener(this);
		setSize(320,200);
		setVisible(true);
	}
public void paint(Graphics g)
{
	g.clearRect(0, 0, getSize().width, getSize().height);
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
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{

				new FiguryApp();
			}
		});
	}
}