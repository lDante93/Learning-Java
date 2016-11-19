import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class HelloWorld extends JFrame implements WindowListener
{

	public HelloWorld()
	{
		super("HelloxD");
		setSize(500, 500);
		setVisible(true);
		addWindowListener(this);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void paint(Graphics g)
	{
		// g.clearRect(0, 0, getSize().width, getSize().height);
		
		g.drawString("Siemka œwiecie", 100, 100);
	
	}

	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable(){
		public void run(){

			new HelloWorld();
		}
		});
	}

	@Override
	public void windowActivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		dispose();
		
	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}
