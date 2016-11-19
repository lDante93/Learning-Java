package etykietyJLabel;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Aplikacja extends JFrame
{
	JLabel label;

	public Aplikacja()
	{
		super("labele");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(null);
		label = new JLabel("£ukasz jest best");
		label.setBounds(10, 10, 100, 50);
		this.add(label);
		setVisible(true);

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
