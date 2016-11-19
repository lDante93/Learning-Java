package polaWyboru;

import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Aplikacja extends JFrame
{
	public Aplikacja()
	{
		super("box");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,2));
		setSize(320, 200);
		this.add(new JCheckBox("Opcja 1.1"));
		this.add(new JCheckBox("Opcja 1.2"));
		this.add(new JCheckBox("Opcja 1.3"));
		this.add(new JCheckBox("Opcja 2.1"));
		this.add(new JCheckBox("Opcja 2.2"));
		this.add(new JCheckBox("Opcja 2.3"));
	}

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new Aplikacja();

			}
		});

	}

}
