package listeners.menuBarListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import mainWindow.DrawingBoardPanel;

public class SaveMenuItemListener extends MenuItemListener implements ActionListener
{
	public	SaveMenuItemListener(DrawingBoardPanel p_panel)
	{
		super(p_panel);
	}
	
	public void	actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(this.m_drawingBoardPanel, "Oeuvre sauvegardée !", "Sauvegarde de votre Création", JOptionPane.INFORMATION_MESSAGE);
	}
}
