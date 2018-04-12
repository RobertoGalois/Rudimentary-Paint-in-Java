package mainWindow.menuBar.editMenu.pointerColorMenu;

import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class RedItem extends JRadioButtonMenuItem
{
	public	RedItem()
	{
		super("Rouge");
		
		this.setAccelerator(KeyStroke.getKeyStroke('R'));
	}
}
