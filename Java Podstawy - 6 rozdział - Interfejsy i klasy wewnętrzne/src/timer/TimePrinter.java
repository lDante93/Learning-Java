package timer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimePrinter implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		Date now = new Date();
		System.out.println("Kiedy us³yszysz diêk, bêdzie godzina " + now);
		Toolkit.getDefaultToolkit().beep();
	}
}
