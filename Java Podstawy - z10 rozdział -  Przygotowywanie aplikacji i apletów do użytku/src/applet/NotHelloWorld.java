package applet;

import java.awt.*;
import javax.swing.*;

/**
 * @version 1.23 2012-05-14
 * @author Cay Horstmann
 */
public class NotHelloWorld extends JApplet
{
   public void init()
   {
      EventQueue.invokeLater(new Runnable()
         {
            public void run()
            {
               JLabel label = new JLabel("To nie jest aplet „Witaj, œwiecie”", SwingConstants.CENTER);
               add(label);
            }
         });
   }
}