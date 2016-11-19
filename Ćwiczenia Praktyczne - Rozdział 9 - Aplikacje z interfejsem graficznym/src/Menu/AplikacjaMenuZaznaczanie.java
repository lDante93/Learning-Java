package Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class AplikacjaMenuZaznaczanie extends JFrame implements ActionListener
{
	public AplikacjaMenuZaznaczanie()
	{
		super("MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		JMenu menu1 = new JMenu("Menu1");
		JCheckBoxMenuItem menu1item1 = new JCheckBoxMenuItem("Pozycja 1");
		JCheckBoxMenuItem menu1item2 = new JCheckBoxMenuItem("Pozycja 2");
		JCheckBoxMenuItem menu1item3 = new JCheckBoxMenuItem("Pozycja 3");
		menu1item1.addActionListener(this);
		menu1item2.addActionListener(this);
		menu1item3.addActionListener(this);
		menu1.add(menu1item1);
		menu1.add(menu1item2);
		menu1.add(menu1item3);
		
		JMenu menu2 = new JMenu("Pozycja 4");
		JCheckBoxMenuItem menu2item1 = new JCheckBoxMenuItem("Zamknij");
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

				new AplikacjaMenuZaznaczanie();
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
