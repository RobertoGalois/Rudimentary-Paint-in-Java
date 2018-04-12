package mainWindow.menuBar.fileMenu.fileMenuItems;

import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class ClearItem extends JMenuItem
{
	public	ClearItem()
	{
		super("Effacer");
		
		this.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
	}
}
