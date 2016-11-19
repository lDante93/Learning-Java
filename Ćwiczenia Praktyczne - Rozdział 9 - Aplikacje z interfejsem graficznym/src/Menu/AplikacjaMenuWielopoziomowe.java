package Menu;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class AplikacjaMenuWielopoziomowe extends JFrame implements ActionListener
{
	public AplikacjaMenuWielopoziomowe()
	{
		super("MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		JMenu menu1 = new JMenu("Menu1");
		JMenuItem menu1item1 = new JMenuItem("Pozycja 1");
		menu1item1.addActionListener(this);
		menu1.add(menu1item1);
		
		JMenu menu2 = new JMenu("Pozycja 4");
		JMenuItem menu2item1 = new JMenuItem("Zamknij");
		menu2item1.addActionListener(this);
		menu2.add(menu2item1);
		
		menu1.add(menu2);
		
		menuBar.add(menu1);
	//	menuBar.add(menu2);
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

				new AplikacjaMenuWielopoziomowe();
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
	
	}

}
