package listeners.menuBarListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import mainWindow.DrawingBoardPanel;

public class ClearMenuItemListener extends MenuItemListener implements ActionListener
{	
	public ClearMenuItemListener(DrawingBoardPanel p_panel)
	{
		super(p_panel);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int		answer = 0;
		
		if (!this.m_drawingBoardPanel.getPointsList().isEmpty())
		{
			answer = JOptionPane.showConfirmDialog(this.m_drawingBoardPanel, "Réinitialiser sans sauvegarder ?", "Effacer l'ardoise", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			
			if (answer == JOptionPane.YES_OPTION)
			{
				this.m_drawingBoardPanel.eraseBoard();
			}
		}
	}
}
