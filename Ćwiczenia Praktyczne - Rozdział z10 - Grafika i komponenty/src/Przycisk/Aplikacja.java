package Przycisk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import rysowanieFigur.FiguryApp;

public class Aplikacja extends JFrame implements ActionListener
{
	JButton button;
	public Aplikacja()
	{
		super("PRzycisk");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLayout(null);
		button = new JButton("Kliknij mnie kufa");
		this.add(button);
		button.setActionCommand("klik");
		button.addActionListener(this);
		button.setBounds(10, 10, 200, 100);
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

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		if(arg0.getActionCommand().equals("klik"))
			dispose();
		
	}

}
