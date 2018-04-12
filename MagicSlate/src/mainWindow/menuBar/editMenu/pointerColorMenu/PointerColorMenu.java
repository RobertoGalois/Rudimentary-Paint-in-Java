package mainWindow.menuBar.editMenu.pointerColorMenu;

import javax.swing.ButtonGroup;
import javax.swing.JMenu;

public class PointerColorMenu extends JMenu
{
	protected RedItem		m_redItem;
	protected GreenItem		m_greenItem;
	protected BlueItem		m_blueItem;
	
	public	PointerColorMenu()
	{
		super("Couleur du pointeur");
		
		ButtonGroup		buttonGroup = new ButtonGroup(); 
		
		this.m_redItem = new RedItem();
		this.m_greenItem = new GreenItem();
		this.m_blueItem = new BlueItem();
	
		buttonGroup.add(this.m_redItem);
		buttonGroup.add(this.m_greenItem);
		buttonGroup.add(this.m_blueItem);
		
		this.add(this.m_redItem);
		this.add(this.m_greenItem);
		this.add(this.m_blueItem);
	}
}
