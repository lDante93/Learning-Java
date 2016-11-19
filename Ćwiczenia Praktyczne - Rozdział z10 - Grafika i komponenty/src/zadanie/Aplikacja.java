package zadanie;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Aplikacja extends JFrame implements ActionListener
{
	JLabel label,label2,label3;
Font font;
JTextField textField;
JButton button;
JDialog dialog;
	public Aplikacja()
	{
		super("Zadanie");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		label = new JLabel();
		label.setText("Rozwi¹¿ poni¿sze równanie: ");
		label.setBounds(10, 10, 200, 20);
		
		this.add(label);
	     
		font = new Font("Sans Serif", Font.ITALIC, 36);
		
		label2 = new JLabel();
		label2.setText("2 + 2 * 2 = ?");
		label2.setBounds(10, 50, 200, 35);
		label2.setFont(font);
		this.add(label2);
		
		textField = new JTextField();
		textField.setBounds(10, 120, 200, 30);
		this.add(textField);
		
		
		button = new JButton("Akceptuj");
		button.setBounds(10,190,150,40);
		this.add(button);
		button.setActionCommand("klik");
		button.addActionListener(this);
	 dialog = new JDialog();
		dialog.setUndecorated(true);
		label3 = new JLabel( new ImageIcon("..\\2.jpg") );
		dialog.add( label3 );
		dialog.pack();
		dialog.setLocation(100, 100);
		
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
		if(e.getActionCommand().equals("klik"))
		{
			String odpowiedz=textField.getText();
			if(odpowiedz.equals("6")){
				JOptionPane.showMessageDialog(this, "BRAWO  !!! " , ":)",
						JOptionPane.PLAIN_MESSAGE);
				int dialogResult =	JOptionPane.showConfirmDialog(this, "Chcesz odebraæ nagrodê? " , ":)",
						JOptionPane.INFORMATION_MESSAGE);
						if(dialogResult == JOptionPane.YES_OPTION){
							dialog.setVisible(true);
						}

			System.out.print(odpowiedz);
			}
			else{
				JOptionPane.showMessageDialog(this, "JESTEŒ GUPI  !!! " , "LOL!",
						JOptionPane.ERROR_MESSAGE);
			}
		//	dispose();
		}

	}

}
