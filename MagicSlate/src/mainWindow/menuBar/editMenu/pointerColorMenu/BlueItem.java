package mainWindow.menuBar.editMenu.pointerColorMenu;

import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class BlueItem extends JRadioButtonMenuItem
{
	public	BlueItem()
	{
		super("Bleu");
		
		this.setAccelerator(KeyStroke.getKeyStroke('B'));
	}
}
