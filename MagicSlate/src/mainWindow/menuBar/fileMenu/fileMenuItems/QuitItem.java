package mainWindow.menuBar.fileMenu.fileMenuItems;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class QuitItem extends JMenuItem
{
	public	QuitItem()
	{
		super("Quitter");
		
		this.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_MASK));
	}
}
