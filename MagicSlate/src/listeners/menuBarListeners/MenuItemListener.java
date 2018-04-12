package listeners.menuBarListeners;

import mainWindow.DrawingBoardPanel;

abstract public class MenuItemListener 
{
	protected DrawingBoardPanel		m_drawingBoardPanel;

	public	MenuItemListener(DrawingBoardPanel p_panel)
	{
		this.m_drawingBoardPanel = p_panel;
	}
}
