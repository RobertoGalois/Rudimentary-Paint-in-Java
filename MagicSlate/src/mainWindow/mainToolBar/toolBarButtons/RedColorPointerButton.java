package mainWindow.mainToolBar.toolBarButtons;

import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class RedColorPointerButton extends JButton
{
	public	RedColorPointerButton()
	{
		super();
		 
		//this.setIcon(new ImageIcon("./Pictures/Icons/redButtonIcon.png"));
		this.setIcon(new ImageIcon(this.getClass().getResource("/Pictures/Icons/redButtonIcon.png")));
		
		this.setToolTipText("Peinture de couleur ROUGE");
	}
}
