package timer;

import java.awt.event.ActionListener;

import javax.swing.*;



public class TimerTest
{

	public static void main(String[] args)
	{
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(10000, listener);
		t.start();
		JOptionPane.showMessageDialog(null,  "Zamkn¹æ program?");

	}

}
