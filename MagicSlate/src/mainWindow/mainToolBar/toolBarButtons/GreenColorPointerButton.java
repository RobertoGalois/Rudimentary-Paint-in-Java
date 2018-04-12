package mainWindow.mainToolBar.toolBarButtons;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GreenColorPointerButton extends JButton
{
	public	GreenColorPointerButton()
	{
		super();
		
		//this.setIcon(new ImageIcon("./Pictures/Icons/greenButtonIcon.png"));
		this.setIcon(new ImageIcon(this.getClass().getResource("/Pictures/Icons/greenButtonIcon.png")));
		
		this.setToolTipText("Peinture de couleur VERTE");
	}
}
