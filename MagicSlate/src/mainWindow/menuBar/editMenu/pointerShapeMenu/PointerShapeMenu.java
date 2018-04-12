package mainWindow.menuBar.editMenu.pointerShapeMenu;

import javax.swing.ButtonGroup;
import javax.swing.JMenu;

public class PointerShapeMenu extends JMenu
{
	protected RoundItem		m_roundItem;
	protected SquareItem	m_squareItem;
	
	public	PointerShapeMenu()
	{
		super("Forme du pointeur");
		
		ButtonGroup		buttonGroup = new ButtonGroup();
		
		this.m_roundItem = new RoundItem();
		this.m_squareItem = new SquareItem();
		
		buttonGroup.add(this.m_roundItem);
		buttonGroup.add(this.m_squareItem);
		
		this.add(this.m_roundItem);
		this.add(this.m_squareItem);
	}
}
