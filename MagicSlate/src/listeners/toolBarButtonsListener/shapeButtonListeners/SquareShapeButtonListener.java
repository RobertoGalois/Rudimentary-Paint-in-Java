package listeners.toolBarButtonsListener.shapeButtonListeners;

import drawFeatures.E_PointerShape;
import mainWindow.DrawingBoardPanel;

public class SquareShapeButtonListener extends ShapeButtonListener
{
	public		SquareShapeButtonListener(DrawingBoardPanel p_panel)
	{
		super(p_panel);
		this.m_setShape = E_PointerShape.SQUARE;
	}
}
