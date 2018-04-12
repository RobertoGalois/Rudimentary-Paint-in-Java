package mainWindow.mainToolBar.toolBarButtons;

import java.awt.Dimension;

import javax.swing.JComboBox;

public class SizePointerComboBox extends JComboBox<Integer>
{
	public	SizePointerComboBox()
	{
		super();
	
		for (Integer i = new Integer(5); i <= 50; i += 5)
			this.addItem(i);
		
		this.setSelectedItem(20);
	}
}
