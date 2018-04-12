package listeners.toolBarButtonsListener.colorButtonListeners;

import mainWindow.DrawingBoardPanel;
import drawFeatures.E_PointerColor;


public class GreenColorButtonListener extends ColorButtonListener
{
	public	GreenColorButtonListener(DrawingBoardPanel p_panel)
	{
		super(p_panel);
		this.m_setColor = E_PointerColor.GREEN;
	}
}
