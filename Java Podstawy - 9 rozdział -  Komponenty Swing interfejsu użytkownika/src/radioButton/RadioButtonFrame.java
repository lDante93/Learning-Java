package radioButton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Ramka z przyk�adow� etykiet� tekstow� i prze��cznikami s�u��cymi do wyboru rozmiaru czcionki
 */
public class RadioButtonFrame extends JFrame
{
   private JPanel buttonPanel;
   private ButtonGroup group;
   private JLabel label;
   private static final int DEFAULT_SIZE = 36;

   public RadioButtonFrame()
   {      
      // Dodanie przyk�adowej etykiety tekstowej

      label = new JLabel("Ko� i ��w grali w ko�ci z pi�kn� �m� u �r�d�a.");
      label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
      add(label, BorderLayout.CENTER);

      // Dodanie prze��cznik�w

      buttonPanel = new JPanel();
      group = new ButtonGroup();

      addRadioButton("Ma�a", 8);
      addRadioButton("�rednia", 12);
      addRadioButton("Du�a", 18);
      addRadioButton("Bardzo du�a", 36);

      add(buttonPanel, BorderLayout.SOUTH);
      pack();
   }

   /**
    * Tworzy prze��cznik ustawiaj�cy rozmiar czcionki przyk�adowego tekstu.
    * @param name �a�cuch identyfikuj�cy prze��cznik
    * @param size rozmiar czcionki ustawiany przez ten prze��cznik
    */

   public void addRadioButton(String name, final int size)
   {
      boolean selected = size == DEFAULT_SIZE;
      JRadioButton button = new JRadioButton(name, selected);
      group.add(button);
      buttonPanel.add(button);

      // Niniejszy s�uchacz ustawia rozmiar czcionki etykiety

      ActionListener listener = new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               // Parametr size odwo�uje si� do ostatniego parametru metody addRadioButton
               label.setFont(new Font("Serif", Font.PLAIN, size));
            }
         };

      button.addActionListener(listener);
   }
}