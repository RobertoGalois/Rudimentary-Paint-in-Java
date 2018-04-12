package mainWindow.menuBar.editMenu;

import javax.swing.JMenu;

import mainWindow.menuBar.editMenu.pointerColorMenu.PointerColorMenu;
import mainWindow.menuBar.editMenu.pointerShapeMenu.PointerShapeMenu;

public class EditMenu extends JMenu
{	
	protected PointerShapeMenu	m_pointerShapeMenu;
	protected PointerColorMenu	m_pointerColorMenu;
	
	public	EditMenu()
	{
		super("Edition");
		
		this.m_pointerShapeMenu = new PointerShapeMenu();
		this.m_pointerColorMenu = new PointerColorMenu();
		
		this.add(this.m_pointerShapeMenu);
		this.add(this.m_pointerColorMenu);
		this.setMnemonic('E');
	}
}
