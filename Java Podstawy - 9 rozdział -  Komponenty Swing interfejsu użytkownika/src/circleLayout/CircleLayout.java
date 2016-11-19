package circleLayout;

import java.awt.*;

/**
 * Ramka zawieraj�ca komponenty u�o�one w k�ko
 */
public class CircleLayout implements LayoutManager
{
   private int minWidth = 0;
   private int minHeight = 0;
   private int preferredWidth = 0;
   private int preferredHeight = 0;
   private boolean sizesSet = false;
   private int maxComponentWidth = 0;
   private int maxComponentHeight = 0;

   public void addLayoutComponent(String name, Component comp)
   {
   }

   public void removeLayoutComponent(Component comp)
   {
   }

   public void setSizes(Container parent)
   {
      if (sizesSet) return;
      int n = parent.getComponentCount();

      preferredWidth = 0;
      preferredHeight = 0;
      minWidth = 0;
      minHeight = 0;
      maxComponentWidth = 0;
      maxComponentHeight = 0;

      // Obliczanie maksymalnych szeroko�ci i wysoko�ci komponent�w
      // oraz ustawianie preferowanego rozmiaru na sum� rozmiar�w komponent�w
      for (int i = 0; i < n; i++)
      {
         Component c = parent.getComponent(i);
         if (c.isVisible())
         {
            Dimension d = c.getPreferredSize();
            maxComponentWidth = Math.max(maxComponentWidth, d.width);
            maxComponentHeight = Math.max(maxComponentHeight, d.height);
            preferredWidth += d.width;
            preferredHeight += d.height;
         }
      }
      minWidth = preferredWidth / 2;
      minHeight = preferredHeight / 2;
      sizesSet = true;
   }

   public Dimension preferredLayoutSize(Container parent)
   {
      setSizes(parent);
      Insets insets = parent.getInsets();
      int width = preferredWidth + insets.left + insets.right;
      int height = preferredHeight + insets.top + insets.bottom;
      return new Dimension(width, height);
   }

   public Dimension minimumLayoutSize(Container parent)
   {
      setSizes(parent);
      Insets insets = parent.getInsets();
      int width = minWidth + insets.left + insets.right;
      int height = minHeight + insets.top + insets.bottom;
      return new Dimension(width, height);
   }

   public void layoutContainer(Container parent)
   {
      setSizes(parent);

      // Obliczenie �rodka okr�gu

      Insets insets = parent.getInsets();
      int containerWidth = parent.getSize().width - insets.left - insets.right;
      int containerHeight = parent.getSize().height - insets.top - insets.bottom;

      int xcenter = insets.left + containerWidth / 2;
      int ycenter = insets.top + containerHeight / 2;

      // Obliczenie promienia okr�gu

      int xradius = (containerWidth - maxComponentWidth) / 2;
      int yradius = (containerHeight - maxComponentHeight) / 2;
      int radius = Math.min(xradius, yradius);

      // Uk�adanie komponent�w na okr�gu

      int n = parent.getComponentCount();
      for (int i = 0; i < n; i++)
      {
         Component c = parent.getComponent(i);
         if (c.isVisible())
         {
            double angle = 2 * Math.PI * i / n;

            // �rodek komponentu
            int x = xcenter + (int) (Math.cos(angle) * radius);
            int y = ycenter + (int) (Math.sin(angle) * radius);

            // Przesuni�cie komponentu, aby jego �rodek znajdowa� si� w punkcie (x, y),
            // a jego rozmiar by� rozmiarem preferowanym
            Dimension d = c.getPreferredSize();
            c.setBounds(x - d.width / 2, y - d.height / 2, d.width, d.height);
         }
      }
   }
}
