package mouse;

import javax.swing.*;

/**
 * Ramka zawieraj�ca okienko do testowania myszy
 */
public class MouseFrame extends JFrame
{
   public MouseFrame()
   {
      add(new MouseComponent());
      pack();
   }
}