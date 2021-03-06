package button;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Ramka z panelem zawierającym przyciski
 */
public class ButtonFrame extends JFrame
{
   private JPanel buttonPanel;
   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 200;

   public ButtonFrame()
   {      
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

      // Tworzenie przycisków
      JButton yellowButton = new JButton("Yellow");
      JButton blueButton = new JButton(new ImageIcon("asd.jpg"));
      JButton redButton = new JButton("Red");

      buttonPanel = new JPanel();

      // Dodanie przycisków do panelu
      buttonPanel.add(yellowButton);
      buttonPanel.add(blueButton);
      buttonPanel.add(redButton);

      // Dodanie panelu do ramki
     add(buttonPanel);

      // Utworzenie akcji przycisków
      ColorAction yellowAction = new ColorAction(Color.YELLOW);
      ColorAction blueAction = new ColorAction(Color.BLUE);
      ColorAction redAction = new ColorAction(Color.RED);

      // Powiązanie akcji z przyciskami
      yellowButton.addActionListener(yellowAction);
      blueButton.addActionListener(blueAction);
      redButton.addActionListener(redAction);
   }

   /**
    * Słuchacz akcji ustawiający kolor tła panelu.
    */
   private class ColorAction implements ActionListener
   {
      private Color backgroundColor;

      public ColorAction(Color c)
      {
         backgroundColor = c;
      }

      public void actionPerformed(ActionEvent event)
      {
         buttonPanel.setBackground(backgroundColor);
      }
   }
}