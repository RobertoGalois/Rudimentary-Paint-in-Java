package listeners.toolBarButtonsListener.colorButtonListeners;

import java.awt.event.ActionEvent;

import listeners.toolBarButtonsListener.ToolBarButtonListener;
import mainWindow.DrawingBoardPanel;
import drawFeatures.E_PointerColor;

abstract public class ColorButtonListener extends ToolBarButtonListener 
{
	protected E_PointerColor		m_setColor;
	
	public	ColorButtonListener(DrawingBoardPanel p_panel)
	{
		super(p_panel);
		this.m_setColor = E_PointerColor.RED;
	}
	
	public void	actionPerformed(ActionEvent e)
	{
		this.m_drawingBoardPanel.getBoardSettings().setPointerColor(this.m_setColor);
	}
}
