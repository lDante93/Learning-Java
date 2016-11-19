package wyswietlenieOknaWyboruPlików;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Aplikacja extends JFrame implements ActionListener
{
	public Aplikacja()
	{
		super("MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		JMenu menu1 = new JMenu("Plik");
		JMenu menu2 = new JMenu("Dupa");
		
		JMenuItem menu1item1 = new JMenuItem("Wybierz plik");
		JMenuItem menu1item2 = new JMenuItem("Zamknij");
		menu1item1.setActionCommand("chooseFile");
		menu1item1.addActionListener(this);		
		menu1item2.setActionCommand("Close");
		menu1item2.addActionListener(this);	
		menu1.add(menu1item1);		
		menu1.add(menu1item2);
		
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

				new Aplikacja();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String cmd = e.getActionCommand();
		if ("chooseFile".equals(cmd))
		{
			JFileChooser fc = new JFileChooser();
			if(fc.showOpenDialog(this)==JFileChooser.APPROVE_OPTION)
			{
				String nazwaPliku = fc.getSelectedFile().getName();
				JOptionPane.showMessageDialog(this, "Wybrano plik: " + nazwaPliku, "Informacja!", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else if ("Close".equals(cmd))
		{
			dispose();
		}
	
	}

}

