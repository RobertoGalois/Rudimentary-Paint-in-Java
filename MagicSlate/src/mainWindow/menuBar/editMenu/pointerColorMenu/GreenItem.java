package mainWindow.menuBar.editMenu.pointerColorMenu;

import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class GreenItem extends JRadioButtonMenuItem
{
	public	GreenItem()
	{
		super("Vert");
		
		this.setAccelerator(KeyStroke.getKeyStroke('V'));
	}
}
