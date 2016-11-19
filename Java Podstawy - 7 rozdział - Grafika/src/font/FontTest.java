package font;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * @version 1.33 2007-04-14
 * @author Cay Horstmann
 */
public class FontTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
         {
            public void run()
            {
               JFrame frame = new FontFrame();
               frame.setTitle("FontTest");
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
               
            }
         });
   }
}

/**
 * Ramka z komponentem zawieraj�cym tekst.
 */
class FontFrame extends JFrame
{
   public FontFrame()
   {
      add(new FontComponent());
      pack();
   }
}

/**
 * Komponent z tekstem w ramce na �rodku.
 */
class FontComponent extends JComponent
{
   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 200;

   public void paintComponent(Graphics g)
   {
	  

      Graphics2D g2 = (Graphics2D) g;

      String message = "Witaj, �wiecie!";

      Font f = new Font("Serif", Font.BOLD, 36);
      g2.setFont(f);

      // Sprawdzenie rozmiaru tekstu.

      FontRenderContext context = g2.getFontRenderContext();
      Rectangle2D bounds = f.getStringBounds(message, context);

      // set (x, y) = lewy g�rny r�g tekstu

      double x = (getWidth() - bounds.getWidth()) / 2;
      double y = (getHeight() - bounds.getHeight()) / 2;

      // Dodanie wyd�u�enia g�rnego do y w celu si�gni�cia do linii bazowej.

      double ascent = -bounds.getY();
      double baseY = y + ascent;

      // Rysowanie komunikatu.

      g2.drawString(message, (int) x, (int) baseY);

      g2.setPaint(Color.LIGHT_GRAY);

      // Rysowanie linii bazowej.

      g2.draw(new Line2D.Double(x, baseY, x + bounds.getWidth(), baseY));

      // Rysowanie otaczaj�cego tekst prostok�ta.

      Rectangle2D rect = new Rectangle2D.Double(x, y, bounds.getWidth(), bounds.getHeight());
      g2.draw(rect);
   }
   public Dimension getPreferredSize() { return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT); }
}