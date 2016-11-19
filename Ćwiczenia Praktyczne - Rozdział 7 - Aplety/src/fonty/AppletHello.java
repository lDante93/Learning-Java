package fonty;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.sun.org.apache.regexp.internal.REDebugCompiler;

public class AppletHello extends Applet {
	   public void paint (Graphics g) {
		   Font font = new Font("Sans Serif", Font.ITALIC, 36);
		   g.setFont(font);
		   g.setColor(Color.red);
	      g.drawString ("Hello World", 55, 55);
	   }
	}