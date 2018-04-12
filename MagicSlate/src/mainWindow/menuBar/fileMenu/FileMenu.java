package mainWindow.menuBar.fileMenu;

import javax.swing.JMenu;

import mainWindow.menuBar.fileMenu.fileMenuItems.ClearItem;
import mainWindow.menuBar.fileMenu.fileMenuItems.QuitItem;
import mainWindow.menuBar.fileMenu.fileMenuItems.SaveItem;

public class FileMenu extends JMenu
{
	protected SaveItem		m_saveItem;
	protected ClearItem		m_clearItem;
	protected QuitItem		m_quitItem;
	
	public	FileMenu()
	{
		super ("Fichier");
		
		this.m_saveItem = new SaveItem();
		this.m_clearItem = new ClearItem();
		this.m_quitItem = new QuitItem();
		
		this.add(this.m_saveItem);
		this.add(this.m_clearItem);
		this.add(this.m_quitItem);
		this.setMnemonic('F');
	}
	
	public SaveItem		getSaveItem()	{ return (this.m_saveItem);		}
	public ClearItem	getClearItem()	{ return (this.m_clearItem);	}
	public QuitItem		getQuitItem()	{ return (this.m_quitItem);		}
}
