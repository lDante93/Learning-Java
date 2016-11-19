package blockingQueue;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * @version 1.01 2012-01-26
 * @author Cay Horstmann
 */
public class BlockingQueueTest
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Podaj katalog bazowy (np. /usr/local/jdk1.6.0/src): ");
      String directory = in.nextLine();
      System.out.print("Podaj słowo kluczowe (np. volatile): ");
      String keyword = in.nextLine();

      final int FILE_QUEUE_SIZE = 10;
      final int SEARCH_THREADS = 100;

      BlockingQueue<File> queue = new ArrayBlockingQueue<>(FILE_QUEUE_SIZE);

      FileEnumerationTask enumerator = new FileEnumerationTask(queue, new File(directory));
      new Thread(enumerator).start();
      for (int i = 1; i <= SEARCH_THREADS; i++)
         new Thread(new SearchTask(queue, keyword)).start();
   }
}

/**
 * Zadanie tworzące wyliczenie wszystkich plików w katalogu i jego podkatalogach
 */
class FileEnumerationTask implements Runnable
{
   public static File DUMMY = new File("");
   private BlockingQueue<File> queue;
   private File startingDirectory;

   /**
    * Tworzy obiekt klasy FileEnumerationTask.
    * @param queue kolejka blokująca, do której dodawane są pliki
    * @param startingDirectory katalog, od którego ma zacząć się zbieranie plików
    */
   public FileEnumerationTask(BlockingQueue<File> queue, File startingDirectory)
   {
      this.queue = queue;
      this.startingDirectory = startingDirectory;
   }

   public void run()
   {
      try
      {
         enumerate(startingDirectory);
         queue.put(DUMMY);
      }
      catch (InterruptedException e)
      {
      }
   }

   /**
    * Rekursywna enumeracja wszystkich plików znajdujących się w danym katalogu i jego podkatalogach
    * @param directory katalog początkowy
    */
   public void enumerate(File directory) throws InterruptedException
   {
      File[] files = directory.listFiles();
      for (File file : files)
      {
         if (file.isDirectory()) enumerate(file);
         else queue.put(file);
      }
   }
}

/**
 * Zadanie przeszukujące pliki w celu znalezienia określonego słowa kluczowego
 */

class SearchTask implements Runnable
{
   private BlockingQueue<File> queue;
   private String keyword;

   /**
    * Tworzy obiekt klasy SearchTask.
    * @param queue kolejka, z której mają być pobierane pliki
    * @param keyword słowo kluczowe, które ma zostać znalezione
    */
   public SearchTask(BlockingQueue<File> queue, String keyword)
   {
      this.queue = queue;
      this.keyword = keyword;
   }

   public void run()
   {
      try
      {
         boolean done = false;
         while (!done)
         {
            File file = queue.take();
            if (file == FileEnumerationTask.DUMMY)
            {
               queue.put(file);
               done = true;
            }
            else search(file);
         }
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
      catch (InterruptedException e)
      {
      }
   }

   /**
    * Przeszukuje plik w celu znalezienia określonego słowa kluczowego i drukuje wszystkie zawierające je linijki
    * @param file plik do przeszukania
    */

   public void search(File file) throws IOException
   {
      try (Scanner in = new Scanner(file))
      {
         int lineNumber = 0;
         while (in.hasNextLine())
         {
            lineNumber++;
            String line = in.nextLine();
            if (line.contains(keyword)) 
               System.out.printf("%s:%d:%s%n", file.getPath(), lineNumber, line);
         }
      }
   }
}
