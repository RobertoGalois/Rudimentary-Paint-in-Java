package mainWindow.mainToolBar.toolBarButtons;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BlueColorPointerButton extends JButton
{
	public	BlueColorPointerButton()
	{
		super();
		
		//this.setIcon(new ImageIcon("./Pictures/Icons/blueButtonIcon.png"));
		this.setIcon(new ImageIcon(this.getClass().getResource("/Pictures/Icons/blueButtonIcon.png")));

		this.setToolTipText("Peinture de couleur BLEUE");
	}
}
