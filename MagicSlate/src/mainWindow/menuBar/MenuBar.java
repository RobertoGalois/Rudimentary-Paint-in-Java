package mainWindow.menuBar;

import javax.swing.JMenuBar;

import mainWindow.menuBar.editMenu.EditMenu;
import mainWindow.menuBar.fileMenu.FileMenu;

public class MenuBar extends JMenuBar
{
	protected FileMenu		m_fileMenu;
	protected EditMenu		m_editMenu;
	
	public	MenuBar()
	{
		super();
		
		this.m_fileMenu = new FileMenu();
		this.m_editMenu = new EditMenu();
		
		this.add(this.m_fileMenu);
		this.add(this.m_editMenu);
	}
	
	public FileMenu		getFileMenu()	{ return (this.m_fileMenu);	}
	public EditMenu		getEditMenu()	{ return (this.m_editMenu);	}
}
