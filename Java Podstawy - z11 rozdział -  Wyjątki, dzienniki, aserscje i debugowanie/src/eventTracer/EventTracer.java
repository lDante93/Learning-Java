package eventTracer;

import java.awt.*;
import java.beans.*;
import java.lang.reflect.*;

/**
 * @version 1.31 2004-05-10
 * @author Cay Horstmann
 */
public class EventTracer
{
   private InvocationHandler handler;

   public EventTracer()
   {
      // handler wszystkich obiekt�w po�rednich zdarze�
      handler = new InvocationHandler()
         {
            public Object invoke(Object proxy, Method method, Object[] args)
            {
               System.out.println(method + ":" + args[0]);
               return null;
            }
         };
   }

   /**
    * Dodawanie obiekt�w �ledz�cych zdarzenia dla wszystkich zdarze�, kt�rych ten komponent i jego potomkowie mog� nas�uchiwa�
    * @param c a component
    */
   public void add(Component c)
   {
      try
      {
         // Pobranie wszystkich zdarze�, kt�rych ten komponent mo�e nas�uchiwa�
         BeanInfo info = Introspector.getBeanInfo(c.getClass());

         EventSetDescriptor[] eventSets = info.getEventSetDescriptors();
         for (EventSetDescriptor eventSet : eventSets)
            addListener(c, eventSet);
      }
      catch (IntrospectionException e)
      {
      }
      // W razie wyst�pienia wyj�tku nie dodawa� s�uchaczy

      if (c instanceof Container)
      {
         // Pobranie wszystkich potomk�w i rekursywne wywo�anie metody add
         for (Component comp : ((Container) c).getComponents())
            add(comp);
      }
   }

   /**
    * Dodanie s�uchacza do danego zbioru zdarze�
    * @param c a komponent
    * @param eventSet deskryptor interfejsu nas�uchuj�cego
    */
   public void addListener(Component c, EventSetDescriptor eventSet)
   {
      // Utworzenie obiektu po�redniego dla tego typu s�uchaczy i przekazanie wszystkich wywo�a� do handlera

      Object proxy = Proxy.newProxyInstance(null, new Class[] { eventSet.getListenerType() },
            handler);

      // Dodanie obiektu po�redniego jako s�uchacza do komponentu
      Method addListenerMethod = eventSet.getAddListenerMethod();
      try
      {
         addListenerMethod.invoke(c, proxy);
      }
      catch (ReflectiveOperationException e)
      {
      }
      // W razie wyst�pienia wyj�tku nie dodawa� s�uchaczy
   }
}
