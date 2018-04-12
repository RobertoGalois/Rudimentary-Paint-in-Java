package mainWindow.mainToolBar.toolBarButtons;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class SquareShapePointerButton extends JButton
{
	public SquareShapePointerButton()
	{
		super();
		
		//this.setIcon(new ImageIcon("./Pictures/Icons/squareButtonIcon.png"));
		this.setIcon(new ImageIcon(this.getClass().getResource("/Pictures/Icons/roundButtonIcon.png")));
		
		this.setToolTipText("Pointeur de forme CARREE");
	}
}
