package Rysowanie;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.sun.org.apache.regexp.internal.REDebugCompiler;

public class AppletHello extends Applet {
	   public void paint (Graphics g) {
		   Color color1 = new Color(255,0,125);
		   g.setColor(color1);
		g.drawLine(50, 50, 150, 50);
		g.drawLine(50, 50, 50, 150);
		g.drawLine(50, 150, 150, 150);
		g.drawLine(150, 150, 150, 50);
		//g.fillOval(25, 75, 150, 50);
		int tabx[]={10,120,200,240,200,120};
				int taby[]={10,20,20,100,180,180};
			//	g.drawPolygon(tabx,taby,6);
				for(int i=0 ;i<60; i++)
				g.drawOval(15+i, 15+i, 15+i, 15+i);
	   }
	}