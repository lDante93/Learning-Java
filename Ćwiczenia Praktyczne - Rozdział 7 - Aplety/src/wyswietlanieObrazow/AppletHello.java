package wyswietlanieObrazow;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JApplet;

public class AppletHello extends JApplet {
	   public void paint (Graphics g) {
		Image img = getImage(getDocumentBase(), "C:\\Users\\Dante\\Desktop\\d.jpg");
		g.drawImage(img, 0, 0, this);
	   }
	}