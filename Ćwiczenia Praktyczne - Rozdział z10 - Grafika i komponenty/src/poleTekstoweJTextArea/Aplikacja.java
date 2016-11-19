package poleTekstoweJTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Aplikacja extends JFrame implements ActionListener
{
	JButton button;
	JTextField textField;
	JTextArea textArea;
	public Aplikacja()
	{
		super("PRzycisk");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(null);
		
		button = new JButton("Kliknij mnie kufa");
		this.add(button);
		button.setActionCommand("cmdSzukaj");
		button.addActionListener(this);
		button.setBounds(180, 120, 90, 25);

		textField = new JTextField();
		textField.setBounds(10, 120, 150, 25);
		this.add(textField);
		
		textArea= new JTextArea();
		textArea.setBounds(10, 10, 260, 100);
		this.add(textArea);
		
		setVisible(true);

	}
public void szukaj(){
	String tekst = textArea.getText();
	String ciag = textField.getText();
	int index = 0;
	int indexWystapienia = 0;
	int liczbaWystapien = 0;
	if(tekst.equals("")||ciag.equals(""))
	{
		indexWystapienia=-1;
	}
	while(indexWystapienia!=-1){
		indexWystapienia=tekst.indexOf(ciag, index);
		if(indexWystapienia!=-1){
			index=indexWystapienia+1;
			liczbaWystapien++;
		}
	}
	JOptionPane.showMessageDialog(this, "Liczba wystapien: " + liczbaWystapien, "Informacja!",
			JOptionPane.INFORMATION_MESSAGE);
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
		if (e.getActionCommand().equals("cmdSzukaj"))
		{
		
			
			if (e.getActionCommand().equals("cmdSzukaj")){
				szukaj();
			}
		}
	}

		

}
