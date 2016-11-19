package zapisIodczytTekstu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class Aplikacja extends JFrame implements ActionListener
{
	private JTextArea textArea;

	public Aplikacja()
	{
		super("Aplikacja WOW");
		setVisible(true);
		setLayout(null);
		setSize(320, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Plik");

		JMenuItem miOtwórz = new JMenuItem("Otwórz");
		miOtwórz.addActionListener(this);
		miOtwórz.setActionCommand("Open");

		JMenuItem miZapisz = new JMenuItem("Zapisz");
		miZapisz.addActionListener(this);
		miZapisz.setActionCommand("Save");

		JMenuItem miZamknij = new JMenuItem("Zamknij");
		miZamknij.addActionListener(this);
		miZamknij.setActionCommand("Close");

		menu.add(miOtwórz);
		menu.add(miZapisz);
		menu.add(new JSeparator());
		menu.add(miZamknij);

		textArea = new JTextArea();
		textArea.setBounds(10, 10, 270, 110);
		add(textArea);
		menuBar.add(menu);
		setJMenuBar(menuBar);

	}

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new Aplikacja();
			}
		}

		);

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String command = e.getActionCommand();
		if (command.equals("Close"))
		{
			dispose();
		} else if (command.equals("Open"))
		{
			JFileChooser fc = new JFileChooser();
			if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
			{
				open(fc.getSelectedFile());
			}
		} else if (command.equals("Save"))
		{
			JFileChooser fc = new JFileChooser();
			if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION)
			{
				save(fc.getSelectedFile());
			}
		}

	}

	public void open(File file)
	{

		FileInputStream fin = null;
		try
		{
			fin = new FileInputStream(file);
		} catch (FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(this, "B³¹d przy otwieraniu pliku.", "B³¹d", JOptionPane.ERROR_MESSAGE);
			return;
		}
		DataInputStream out = new DataInputStream(fin);
		BufferedReader inbr = new BufferedReader(new InputStreamReader(fin));
		textArea.setText("");
		String line = "";

		try
		{
			while ((line = inbr.readLine()) != null)
			{
				textArea.append(line + "\n");
			}
		}

		catch (IOException e)
		{
			JOptionPane.showMessageDialog(this, "B³¹d wejœcia-wyjœcia.", "B³¹d", JOptionPane.ERROR_MESSAGE);

		}
	}

	public void save(File file)
	{

	
	
		Scanner input;
		try
		{
			input = new Scanner(file);
			String line = textArea.getText();
			line=input.nextLine();
		

		} catch (FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(this, "B³¹d wejœcia-wyjœcia.", "B³¹d", JOptionPane.ERROR_MESSAGE);

		}
	}

}
