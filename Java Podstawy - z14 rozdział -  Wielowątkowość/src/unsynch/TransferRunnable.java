package unsynch;

/**
 * Obiekt Runnable przelewaj�cy pieni�dze z jednego konta bankowego na inne
 * @version 1.30 2004-08-01
 * @author Cay Horstmann
 */
public class TransferRunnable implements Runnable
{
   private Bank bank;
   private int fromAccount;
   private double maxAmount;
   private int DELAY = 10;

   /**
    * Tworzy obiekt Runnable do przelewania �rodk�w
    * @param b bank, na kt�rego kontach wykonywany jest przelew
    * @param from konto, z kt�rego maj� by� przelane pieni�dze
    * @param max maksymalna suma, jaka mo�e zosta� przelana za ka�dym razem
    */
   public TransferRunnable(Bank b, int from, double max)
   {
      bank = b;
      fromAccount = from;
      maxAmount = max;
   }

   public void run()
   {
      try
      {
         while (true)
         {
            int toAccount = (int) (bank.size() * Math.random());
            double amount = maxAmount * Math.random();
            bank.transfer(fromAccount, toAccount, amount);
            Thread.sleep((int) (DELAY * Math.random()));
         }
      }
      catch (InterruptedException e)
      {
      }
   }
}
