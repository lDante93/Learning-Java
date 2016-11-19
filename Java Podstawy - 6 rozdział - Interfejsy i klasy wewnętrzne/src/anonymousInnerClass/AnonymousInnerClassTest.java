package anonymousInnerClass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import timer.TimePrinter;

public class AnonymousInnerClassTest
{

	public static void main(String[] args)
	{
		TalkingClock clock = new TalkingClock();
		clock.start(1000, true);
		JOptionPane.showMessageDialog(null, "Zamkn¹æ program?");
		System.exit(0);
	}

}

class TalkingClock
{

	public void start(int interval, final boolean beep)
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				Date now = new Date();
				System.out.println("Kiedy us³yszysz diêk, bêdzie godzina " + now);
				if (beep)
					Toolkit.getDefaultToolkit().beep();
			}
		};
Timer t = new Timer(interval, listener);
t.start();
	}

}