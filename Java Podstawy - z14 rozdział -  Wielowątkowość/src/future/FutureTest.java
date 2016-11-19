package future;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * @version 1.01 2012-01-26
 * @author Cay Horstmann
 */
public class FutureTest
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Podaj katalog bazowy (np. /usr/local/jdk1.6.0/src): ");
      String directory = in.nextLine();
      System.out.print("Podaj s�owo kluczowe (np. volatile): ");
      String keyword = in.nextLine();

      MatchCounter counter = new MatchCounter(new File(directory), keyword);
      FutureTask<Integer> task = new FutureTask<>(counter);
      Thread t = new Thread(task);
      t.start();
      try
      {
         System.out.println("Liczba znalezionych plik�w " + task.get() + ".");
      }
      catch (ExecutionException e)
      {
         e.printStackTrace();
      }
      catch (InterruptedException e)
      {
      }
   }
}

/**
 * Zadanie licz�ce pliki znajduj�ce si� w katalogu i jego podkatalogach, zawieraj�ce dane s�owo kluczowe

 */
class MatchCounter implements Callable<Integer>
{
   private File directory;
   private String keyword;
   private int count;

   /**
    * Tworzy obiekt klasy MatchCounter.
    * @param directory katalog, od kt�rego ma zacz�� si� szukanie
    * @param keyword s�owo kluczowe do znalezienia
    */
   public MatchCounter(File directory, String keyword)
   {
      this.directory = directory;
      this.keyword = keyword;
   }

   public Integer call()
   {
      count = 0;
      try
      {
         File[] files = directory.listFiles();
         List<Future<Integer>> results = new ArrayList<>();

         for (File file : files)
            if (file.isDirectory())
            {
               MatchCounter counter = new MatchCounter(file, keyword);
               FutureTask<Integer> task = new FutureTask<>(counter);
               results.add(task);
               Thread t = new Thread(task);
               t.start();
            }
            else
            {
               if (search(file)) count++;
            }

         for (Future<Integer> result : results)
            try
            {
               count += result.get();
            }
            catch (ExecutionException e)
            {
               e.printStackTrace();
            }
      }
      catch (InterruptedException e)
      {
      }
      return count;
   }

   /**
    * Przeszukuje plik w celu znalezienia danego s�owa kluczowego.
    * @param file plik do przeszukania
    * @return warto�� true, je�li plik zawiera dane s�owo kluczowe
    */
   public boolean search(File file)
   {
      try
      {
         try (Scanner in = new Scanner(file))
         {
            boolean found = false;
            while (!found && in.hasNextLine())
            {
               String line = in.nextLine();
               if (line.contains(keyword)) found = true;
            }
            return found;
         }
      }
      catch (IOException e)
      {
         return false;
      }
   }
}
