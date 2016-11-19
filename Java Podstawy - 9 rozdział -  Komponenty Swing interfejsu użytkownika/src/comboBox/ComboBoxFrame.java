package comboBox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Ramka z przyk�adow� etykiet� tekstow� i list� rozwijaln� umo�liwiaj�c� wyb�r kroju czcionki.
 */
public class ComboBoxFrame extends JFrame
{
   private JComboBox<String> faceCombo;
   private JLabel label;
   private static final int DEFAULT_SIZE = 24;

   public ComboBoxFrame()
   {
      // Dodanie tekstu etykiety

      label = new JLabel("Ko� i ��w grali w ko�ci z pi�kn� �m� u �r�d�a.");
      label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
      add(label, BorderLayout.CENTER);

      // Tworzenie listy rozwijalnej i dodawanie nazw czcionek

      faceCombo = new JComboBox<>();
      faceCombo.addItem("Serif");
      faceCombo.addItem("SansSerif");
      faceCombo.addItem("Monospaced");
      faceCombo.addItem("Dialog");
      faceCombo.addItem("DialogInput");

      // S�uchacz listy rozwijalnej zmienia kr�j pisma etykiety na czcionk� wybran� przez u�ytkownika

      faceCombo.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               label.setFont(new Font(faceCombo.getItemAt(faceCombo.getSelectedIndex()), Font.PLAIN,
                     DEFAULT_SIZE));
            }
         });

      // Dodanie listy rozwijalnej do panelu znajduj�cego si� przy po�udniowej kraw�dzi ramki

      JPanel comboPanel = new JPanel();
      comboPanel.add(faceCombo);
      add(comboPanel, BorderLayout.SOUTH);
      pack();
   }
}
