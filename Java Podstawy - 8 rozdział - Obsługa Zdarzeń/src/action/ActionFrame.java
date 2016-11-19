package action;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Ramka z panelem, kt�ry demonstruje akcje zmiany koloru.
 */
public class ActionFrame extends JFrame
{
   private JPanel buttonPanel;
   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 200;

   public ActionFrame()
   {
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

      buttonPanel = new JPanel();

      // Definicje akcji
      Action yellowAction = new ColorAction("��ty", new ImageIcon("yellow-ball.gif"),
            Color.YELLOW);
      Action blueAction = new ColorAction("Blue", new ImageIcon("blue-ball.gif"), Color.BLUE);
      Action redAction = new ColorAction("Red", new ImageIcon("red-ball.gif"), Color.RED);

      // Dodanie przycisk�w dla akcji
      buttonPanel.add(new JButton(yellowAction));
      buttonPanel.add(new JButton(blueAction));
      buttonPanel.add(new JButton(redAction));

      // Dodanie panelu do ramki
      add(buttonPanel);

      // Powi�zanie klawiszy Z, N i C z nazwami
      InputMap imap = buttonPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
      imap.put(KeyStroke.getKeyStroke("ctrl Z"), "panel.yellow");
      imap.put(KeyStroke.getKeyStroke("ctrl N"), "panel.blue");
      imap.put(KeyStroke.getKeyStroke("ctrl C"), "panel.red");

      // Powi�zanie nazw z akcjami
      ActionMap amap = buttonPanel.getActionMap();
      amap.put("panel.yellow", yellowAction);
      amap.put("panel.blue", blueAction);
      amap.put("panel.red", redAction);
   }
   
   public class ColorAction extends AbstractAction
   {
      /**
       * Tworzy akcj� zmiany koloru.
       * @param name nazwa, kt�ra pojawi si� na przycisku
       * @param icon ikona, kt�ra pojawi si� na przycisku
       * @param c kolor t�a
       */
      public ColorAction(String name, Icon icon, Color c)
      {
         putValue(Action.NAME, name);
         putValue(Action.SMALL_ICON, icon);
         putValue(Action.SHORT_DESCRIPTION, "Ustaw kolor panelu na " + name.toLowerCase());
         putValue("color", c);
      }

      public void actionPerformed(ActionEvent event)
      {
         Color c = (Color) getValue("color");
         buttonPanel.setBackground(c);
      }
   }
}
