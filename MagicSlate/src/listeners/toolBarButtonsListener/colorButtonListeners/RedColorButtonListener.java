package listeners.toolBarButtonsListener.colorButtonListeners;

import mainWindow.DrawingBoardPanel;
import drawFeatures.E_PointerColor;

public class RedColorButtonListener extends ColorButtonListener
{
	public	RedColorButtonListener(DrawingBoardPanel p_panel)
	{
		super(p_panel);
		this.m_setColor = E_PointerColor.RED;
	}
}
