package listyRozwijane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;



public class Aplikacja extends JFrame implements ActionListener
{
	JComboBox cmb;
	public Aplikacja()
	{
		super("box");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setSize(320, 200);
		cmb = new JComboBox();
		cmb.setBounds(80,40,170,20);
		cmb.addItem("1");
		cmb.addItem("22222");
		cmb.addItem("3344444");
		add(cmb);
		cmb.addActionListener(this);
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
		String tekst = cmb.getSelectedItem().toString();
		JOptionPane.showMessageDialog(this, "Wybrany element: "+ tekst, "Informacja!", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
