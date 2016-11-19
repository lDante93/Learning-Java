package Menu;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class AplikacjaMenu extends JFrame implements ActionListener
{
	public AplikacjaMenu()
	{
		super("MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		JMenu menu1 = new JMenu("Plik");
		JMenu menu2 = new JMenu("Dupa");
		
		JMenuItem item1 = new JMenuItem("Zamknij");
		JMenuItem item11 = new JMenuItem("Napis");
		item1.setActionCommand("Zamknij");
		item1.addActionListener(this);		
		item11.setActionCommand("Napis");
		item11.addActionListener(this);	
		menu1.add(item1);		
		menu1.add(item11);
		menu1.add(new JMenuItem("XD"));
		
		menu2.add(new JMenuItem("YOLO"));
		
		menuBar.add(menu1);
		menuBar.add(menu2);
		setJMenuBar(menuBar);
		
		
		setSize(320, 200);
		setVisible(true);
	}

	

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{

				new AplikacjaMenu();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String cmd = e.getActionCommand();
		if ("Zamknij".equals(cmd))
		{
			dispose();
		}
		if ("Napis".equals(cmd))
		{
			//this.
		}
	}

}
