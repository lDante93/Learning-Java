package preferences;

import java.awt.EventQueue;
import java.awt.event.*;
import java.io.*;
import java.util.prefs.*;
import javax.swing.*;

/**
 * Program testuj�cy ustawianie preferencji. Zapami�tuje po�o�enie, rozmiar i tytu� ramki.
 * @version 1.02 2007-06-12
 * @author Cay Horstmann
 */
public class PreferencesTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
         {
            public void run()
            {
               PreferencesFrame frame = new PreferencesFrame();
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
            }
         });
   }
}

/**
 * Ramka pobieraj�ca dane dotycz�ce po�o�enia i rozmiaru z preferencji u�ytkownika oraz aktualizuj�ca preferencje w momencie zamykania programu
 */
class PreferencesFrame extends JFrame
{
   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 200;

   public PreferencesFrame()
   {
      // Sprawdzanie po�o�enia, rozmiaru i tytu�u w preferencjach

      Preferences root = Preferences.userRoot();
      final Preferences node = root.node("/com/horstmann/corejava");
      int left = node.getInt("left", 0);
      int top = node.getInt("top", 0);
      int width = node.getInt("width", DEFAULT_WIDTH);
      int height = node.getInt("height", DEFAULT_HEIGHT);
      setBounds(left, top, width, height);

      // Je�li nie ma tytu�u, u�ytkownik zostanie poproszony o jego podanie

      String title = node.get("title", "");
      if (title.equals("")) title = JOptionPane.showInputDialog("Wpisz tytu� ramki:");
      if (title == null) title = "";
      setTitle(title);

      // Utworzenie okna wyboru plik�w wy�wietlaj�cego pliki XML

      final JFileChooser chooser = new JFileChooser();
      chooser.setCurrentDirectory(new File("."));

      // Akceptacja wszystkich plik�w z rozszerzeniem .xml
      chooser.setFileFilter(new javax.swing.filechooser.FileFilter()
         {
            public boolean accept(File f)
            {
               return f.getName().toLowerCase().endsWith(".xml") || f.isDirectory();
            }

            public String getDescription()
            {
               return "XML files";
            }
         });

      // menu
      JMenuBar menuBar = new JMenuBar();
      setJMenuBar(menuBar);
      JMenu menu = new JMenu("Plik");
      menuBar.add(menu);

      JMenuItem exportItem = new JMenuItem("Eksport ustawie�");
      menu.add(exportItem);
      exportItem.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               if (chooser.showSaveDialog(PreferencesFrame.this) == JFileChooser.APPROVE_OPTION)
               {
                  try
                  {
                     OutputStream out = new FileOutputStream(chooser.getSelectedFile());
                     node.exportSubtree(out);
                     out.close();
                  }
                  catch (Exception e)
                  {
                     e.printStackTrace();
                  }
               }
            }
         });

      JMenuItem importItem = new JMenuItem("Import ustawie�");
      menu.add(importItem);
      importItem.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               if (chooser.showOpenDialog(PreferencesFrame.this) == JFileChooser.APPROVE_OPTION)
               {
                  try
                  {
                     InputStream in = new FileInputStream(chooser.getSelectedFile());
                     Preferences.importPreferences(in);
                     in.close();
                  }
                  catch (Exception e)
                  {
                     e.printStackTrace();
                  }
               }
            }
         });

      JMenuItem exitItem = new JMenuItem("Zamknij");
      menu.add(exitItem);
      exitItem.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               node.putInt("left", getX());
               node.putInt("top", getY());
               node.putInt("width", getWidth());
               node.putInt("height", getHeight());
               node.put("title", getTitle());
               System.exit(0);
            }
         });
   }
}
