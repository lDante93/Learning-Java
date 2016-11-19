package dialog;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Przyk�adowe modalne okno dialogowe wy�wietlaj�ce komunikat i oczekuj�ce na klikni�cie przycisku OK
 */
public class AboutDialog extends JDialog
{
   public AboutDialog(JFrame owner)
   {
      super(owner, "Test okna O programie", true);

      // add HTML label to center

      add(
            new JLabel(
                  "<html><h1><i>Core Java</i></h1><hr>, Cay Horstmann i Gary Cornell</html>"),
            BorderLayout.CENTER);

      // Przycisk OK zamyka okno

      JButton ok = new JButton("OK");
      ok.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               setVisible(false);
            }
         });

      // Dodanie przycisku OK przy kraw�dzi po�udniowej

      JPanel panel = new JPanel();
      panel.add(ok);
      add(panel, BorderLayout.SOUTH);

      pack();
   }
}
