package listeners.toolBarButtonsListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mainWindow.DrawingBoardPanel;

abstract public class ToolBarButtonListener implements ActionListener 
{
	protected DrawingBoardPanel		m_drawingBoardPanel;
	
	public	ToolBarButtonListener(DrawingBoardPanel p_panel)
	{
		this.m_drawingBoardPanel = p_panel;
	}
}
