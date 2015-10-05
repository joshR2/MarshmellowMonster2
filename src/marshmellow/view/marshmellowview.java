package marshmellow.view;

import javax.swing.JOptionPane;

public class marshmellowview
{
	
	public void displayMonsterInfo(String info)
	{
		System.out.println("My monster info is" + info);
	}
	
	public void displayMonsterGUI(String info)
	{
		JOptionPane.showMessageDialog(null,"My monster information is:" + info);
	}
}
