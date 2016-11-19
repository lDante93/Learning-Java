package pierwszy;

import java.awt.Graphics;

import javax.swing.JApplet;

public class AppletHello extends JApplet
{
	public void paint(Graphics gDC)
	{
		gDC.drawString("Pierwszy aplet w Javie", 100, 100);
	}
}
