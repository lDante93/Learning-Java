package robot;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;

/**
 * @version 1.04 2012-05-17
 * @author Cay Horstmann
 */
public class RobotTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
         {
            public void run()
            {
               // Ramka z panelem zawieraj�cym przycisk

               ButtonFrame frame = new ButtonFrame();
               frame.setTitle("ButtonTest");
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
            }
         });
      
      // Powi�zanie robota z ekranem

      GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice screen = environment.getDefaultScreenDevice();

      try
      {
         final Robot robot = new Robot(screen);
         robot.waitForIdle();
         new Thread()
         {
            public void run() 
            {
               runTest(robot);                        
            };
         }.start();
      }
      catch (AWTException e)
      {
         e.printStackTrace();
      }     
   }

   /**
    * Uruchamia procedur� testow�
    * @param robot robot zwi�zany z ekranem
    */
   public static void runTest(Robot robot)
   {
      // Symulacja naci�ni�cia spacji
      robot.keyPress(' ');
      robot.keyRelease(' ');

      // Symulacja naci�ni�cia klawisza Tab i spacji
      robot.delay(2000);
      robot.keyPress(KeyEvent.VK_TAB);
      robot.keyRelease(KeyEvent.VK_TAB);
      robot.keyPress(' ');
      robot.keyRelease(' ');

      // Symulacja klikni�cia mysz� prawego przycisku w oknie.
      robot.delay(2000);
      robot.mouseMove(220, 40);
      robot.mousePress(InputEvent.BUTTON1_MASK);
      robot.mouseRelease(InputEvent.BUTTON1_MASK);

      // Zrobienie zrzutu ekranu i wy�wietlenie obrazu
      robot.delay(2000);
      BufferedImage image = robot.createScreenCapture(new Rectangle(0, 0, 400, 300));

      ImageFrame frame = new ImageFrame(image);      
      frame.setVisible(true);
   }
}

/**
 * Ramka zawieraj�ca wy�wietlany obraz
 */
class ImageFrame extends JFrame
{
   private static final int DEFAULT_WIDTH = 450;
   private static final int DEFAULT_HEIGHT = 350;

   /**
    * @param image obraz do wy�wietlenia
    */
   public ImageFrame(Image image)
   {
      setTitle("Zrzut ekranu");
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

      JLabel label = new JLabel(new ImageIcon(image));
      add(label);
   }
}
