package notHelloWorld;

import java.awt.*;

import javax.swing.*;

public class NotHelloWorld
{

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{

			public void run()
			{
				NotHelloWorldFrame frame = new NotHelloWorldFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setTitle("hello");
				frame.setVisible(true);
			}

		});
	}
}

class NotHelloWorldFrame extends JFrame
{

	public NotHelloWorldFrame()
	{
		add(new NotHelloWorldPanel());
		pack();
	}
}

class NotHelloWorldPanel extends JComponent
{
	public static final int MESSAGE_X = 175;
	public static final int MESSAGE_Y = 100;

	private static final int DEFAULT_WIDTH = 400;

	private static final int DEFAULT_HEIGHT = 200;

	public void paintComponent(Graphics g)
	{
		g.drawString("To nie jest program witaj swiecie", MESSAGE_X, MESSAGE_Y);
	}

	public Dimension getPreferredSize()
	{
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}
