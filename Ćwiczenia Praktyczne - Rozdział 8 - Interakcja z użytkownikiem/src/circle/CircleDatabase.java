package circle;

import java.awt.Graphics;
import java.util.Vector;

public class CircleDatabase extends Vector
{
	public void drawAll(Graphics g)
	{
		for (int i=0;i<this.size();i++){
			((Circle)this.elementAt(i)).draw(g);
		}
	}
}