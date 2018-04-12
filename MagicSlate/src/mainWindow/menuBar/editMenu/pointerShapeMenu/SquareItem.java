package mainWindow.menuBar.editMenu.pointerShapeMenu;

import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class SquareItem extends JRadioButtonMenuItem
{
	public	SquareItem()
	{
		super("Carré");
		
		this.setAccelerator(KeyStroke.getKeyStroke('C'));
	}
}
