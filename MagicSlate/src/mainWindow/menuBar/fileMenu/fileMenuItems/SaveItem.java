package mainWindow.menuBar.fileMenu.fileMenuItems;

import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class SaveItem extends JMenuItem
{
	public	SaveItem()
	{
		super("Sauvegarder");
		
		this.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
	}
}
