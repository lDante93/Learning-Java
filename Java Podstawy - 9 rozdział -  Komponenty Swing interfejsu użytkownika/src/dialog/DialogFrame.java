package dialog;

import java.awt.event.*;
import javax.swing.*;

/**
 * Ramka z menu, kt�rego akcja Plik->O programie wy�wietla okno dialogowe
 */
public class DialogFrame extends JFrame
{
   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 200;
   private AboutDialog dialog;

   public DialogFrame()
   {      
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

      // Tworzenie menu Plik

      JMenuBar menuBar = new JMenuBar();
      setJMenuBar(menuBar);
      JMenu fileMenu = new JMenu("Plik");
      menuBar.add(fileMenu);

      // Tworzenie element�w O programie i Zamknij

      // Element O programie wy�wietla okno dialogowe O programie

      JMenuItem aboutItem = new JMenuItem("O programie");
      aboutItem.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               if (dialog == null) // pierwszy raz
               dialog = new AboutDialog(DialogFrame.this);
               dialog.setVisible(true); // wyskakuj�ce okno dialogowe
            }
         });
      fileMenu.add(aboutItem);

      // Element Zamknij powoduje zamkni�cie programu

      JMenuItem exitItem = new JMenuItem("Zamknij");
      exitItem.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               System.exit(0);
            }
         });
      fileMenu.add(exitItem);
   }
}
