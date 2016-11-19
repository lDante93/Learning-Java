package zadaniePoleTekstoweEtykietaPrzycisk;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Aplikacja extends JFrame implements ActionListener
{
	JLabel label;
	JButton button;
	JTextField textField;

	public Aplikacja()
	{
		super("Nag³ówek");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setSize(320, 200);
		setVisible(true);

		label = new JLabel("Napis jakiœ");
		label.setBounds(10, 10, 100, 20);
		this.add(label);
		button = new JButton("Przycisk");
		button.setBounds(10, 50, 100, 50);
		this.add(button);
		button.setActionCommand("1");
		button.addActionListener(this);
		textField = new JTextField();
		textField.setBounds(10, 100, 100, 50);
		this.add(textField);
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
		if (e.getActionCommand().equals("1"))
		{
			String tekst = textField.getText();
			label.setText(tekst);
		}
	}

}
