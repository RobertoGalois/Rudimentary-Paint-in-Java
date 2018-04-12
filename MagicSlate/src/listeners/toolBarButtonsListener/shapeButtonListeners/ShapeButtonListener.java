package listeners.toolBarButtonsListener.shapeButtonListeners;

import java.awt.event.ActionEvent;

import listeners.toolBarButtonsListener.ToolBarButtonListener;
import mainWindow.DrawingBoardPanel;
import drawFeatures.E_PointerShape;

abstract public class ShapeButtonListener extends ToolBarButtonListener
{
	protected E_PointerShape		m_setShape;
	
	public	ShapeButtonListener(DrawingBoardPanel p_panel)
	{
		super(p_panel);
		this.m_setShape = E_PointerShape.ROUND;
	}
	
	public void	actionPerformed(ActionEvent e)
	{
		this.m_drawingBoardPanel.getBoardSettings().setPointerShape(this.m_setShape);
	}
}
