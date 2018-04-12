package listeners.toolBarButtonsListener.shapeButtonListeners;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import mainWindow.DrawingBoardPanel;
import mainWindow.mainToolBar.toolBarButtons.SizePointerComboBox;

public class SizeComboBoxListener implements ItemListener
{
	protected DrawingBoardPanel		m_drawingPanel;
	
	public SizeComboBoxListener(DrawingBoardPanel p_panel)
	{
		this.m_drawingPanel = p_panel;
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		JComboBox	signalCombo;
		
		if (e.getStateChange() == ItemEvent.SELECTED)
		{
			signalCombo = (SizePointerComboBox)(e.getSource());
			this.m_drawingPanel.getBoardSettings().setPointerSize((Integer)(signalCombo.getSelectedItem()));
		}
	}
}
