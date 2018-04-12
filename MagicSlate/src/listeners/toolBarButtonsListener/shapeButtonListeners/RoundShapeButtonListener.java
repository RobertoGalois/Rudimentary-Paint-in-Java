package listeners.toolBarButtonsListener.shapeButtonListeners;

import mainWindow.DrawingBoardPanel;
import drawFeatures.E_PointerShape;

public class RoundShapeButtonListener extends ShapeButtonListener
{
	public		RoundShapeButtonListener(DrawingBoardPanel p_panel)
	{
		super(p_panel);
		this.m_setShape = E_PointerShape.ROUND;
	}
}