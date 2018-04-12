package mainWindow.mainToolBar.toolBarButtons;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class RoundShapePointerButton extends JButton
{
	public	RoundShapePointerButton()
	{
		super();
		
		//this.setIcon(new ImageIcon("./Pictures/Icons/roundButtonIcon.png"));
		this.setIcon(new ImageIcon(this.getClass().getResource("/Pictures/Icons/roundButtonIcon.png")));
		this.setToolTipText("Pointeur de forme RONDE");
	}
}
