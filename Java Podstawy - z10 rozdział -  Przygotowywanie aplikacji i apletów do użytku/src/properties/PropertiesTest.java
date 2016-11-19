package properties;

import java.awt.EventQueue;
import java.awt.event.*;
import java.io.*;
import java.util.Properties;

import javax.swing.*;

/**
 * Program testujący mechanizm własności. Niniejszy program zapamiętuje położenie, rozmiar i tytuł ramki.
 * @version 1.00 2007-04-29
 * @author Cay Horstmann
 */
public class PropertiesTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
         {
            public void run()
            {
               PropertiesFrame frame = new PropertiesFrame();
               frame.setVisible(true);
            }
         });
   }
}

/**
 * Ramka pobierająca dane dotyczące położenia i rozmiaru z pliku własności oraz aktualizująca ów plik w momencie zamykania programu
 */
class PropertiesFrame extends JFrame
{
   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 200;

   private File propertiesFile;
   private Properties settings;

   public PropertiesFrame()
   {
      // Pobranie informacji o położeniu, rozmiarze i tytule z pliku własności

      String userDir = System.getProperty("user.home");
      File propertiesDir = new File(userDir, ".corejava");
      if (!propertiesDir.exists()) propertiesDir.mkdir();
      propertiesFile = new File(propertiesDir, "program.properties");

      Properties defaultSettings = new Properties();
      defaultSettings.put("left", "0");
      defaultSettings.put("top", "0");
      defaultSettings.put("width", "" + DEFAULT_WIDTH);
      defaultSettings.put("height", "" + DEFAULT_HEIGHT);
      defaultSettings.put("title", "");

      settings = new Properties(defaultSettings);

      if (propertiesFile.exists()) try
      {
         FileInputStream in = new FileInputStream(propertiesFile);
         settings.load(in);
      }
      catch (IOException ex)
      {
         ex.printStackTrace();
      }

      int left = Integer.parseInt(settings.getProperty("left"));
      int top = Integer.parseInt(settings.getProperty("top"));
      int width = Integer.parseInt(settings.getProperty("width"));
      int height = Integer.parseInt(settings.getProperty("height"));
      setBounds(left, top, width, height);

      // Jeśli nie ma tytułu, użytkownik zostanie poproszony o jego podanie

      String title = settings.getProperty("title");
      if (title.equals("")) title = JOptionPane.showInputDialog("Wpisz tytuł ramki:");
      if (title == null) title = "";
      setTitle(title);

      addWindowListener(new WindowAdapter()
         {
            public void windowClosing(WindowEvent event)
            {
               settings.put("left", "" + getX());
               settings.put("top", "" + getY());
               settings.put("width", "" + getWidth());
               settings.put("height", "" + getHeight());
               settings.put("title", getTitle());
               try
               {
                  FileOutputStream out = new FileOutputStream(propertiesFile);
                  settings.store(out, "Ustawienia programu");
               }
               catch (IOException ex)
               {
                  ex.printStackTrace();
               }
               System.exit(0);
            }
         });
   }
}
