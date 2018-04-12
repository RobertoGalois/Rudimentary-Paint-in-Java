package listeners.menuBarListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mainWindow.DrawingBoardPanel;

public class QuitMenuItemListener extends MenuItemListener implements ActionListener
{
	public QuitMenuItemListener(DrawingBoardPanel p_panel)
	{
		super(p_panel);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		JFrame	mainWindow = (JFrame)(this.m_drawingBoardPanel.getRootPane().getParent());
		int		answer = 0;
		
		if (this.m_drawingBoardPanel.getPointsList().isEmpty())
		{
			mainWindow.dispose();
		}
		else
		{
			answer = JOptionPane.showConfirmDialog(this.m_drawingBoardPanel, "Quitter sans sauvegarder ?", "Fermer l'ardoise magique", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			
			if (answer == JOptionPane.OK_OPTION)
				mainWindow.dispose();
		}
		
		
	}
}
