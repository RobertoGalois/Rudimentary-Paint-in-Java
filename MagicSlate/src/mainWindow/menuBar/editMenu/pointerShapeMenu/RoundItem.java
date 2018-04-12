package mainWindow.menuBar.editMenu.pointerShapeMenu;

import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class RoundItem extends JRadioButtonMenuItem
{
	public	RoundItem()
	{
		super("Rond");

		this.setAccelerator(KeyStroke.getKeyStroke('O'));
	}
}
