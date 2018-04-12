package mainWindow.mainToolBar;

import java.awt.Dimension;

import javax.swing.JToolBar;

import mainWindow.mainToolBar.toolBarButtons.BlueColorPointerButton;
import mainWindow.mainToolBar.toolBarButtons.GreenColorPointerButton;
import mainWindow.mainToolBar.toolBarButtons.RedColorPointerButton;
import mainWindow.mainToolBar.toolBarButtons.RoundShapePointerButton;
import mainWindow.mainToolBar.toolBarButtons.SizePointerComboBox;
import mainWindow.mainToolBar.toolBarButtons.SquareShapePointerButton;

public class MainToolBar extends JToolBar 
{
	protected RoundShapePointerButton	m_roundShapePointerButton;
	protected SquareShapePointerButton	m_squareShapePointerButton;
	protected RedColorPointerButton		m_redColorPointerButton;
	protected GreenColorPointerButton	m_greenColorPointerButton;
	protected BlueColorPointerButton	m_blueColorPointerButton;
	protected SizePointerComboBox		m_sizePointerComboBox;
	
	public	MainToolBar()
	{
		super();
		
		this.m_roundShapePointerButton = new RoundShapePointerButton();
		this.m_squareShapePointerButton = new SquareShapePointerButton();
		this.m_redColorPointerButton = new  RedColorPointerButton();
		this.m_greenColorPointerButton = new  GreenColorPointerButton();
		this.m_blueColorPointerButton = new  BlueColorPointerButton();
		this.m_sizePointerComboBox = new SizePointerComboBox(); 
		
		this.add(this.m_roundShapePointerButton);
		this.add(this.m_squareShapePointerButton);
		this.addSeparator();
		this.add(this.m_redColorPointerButton);
		this.add(this.m_greenColorPointerButton);
		this.add(this.m_blueColorPointerButton);
		this.add(this.m_sizePointerComboBox);
		
		this.setVisible(true);
	}
	
	public RoundShapePointerButton	getRoundShapePointerButton()	{ return (this.m_roundShapePointerButton);	}
	public SquareShapePointerButton	getSquareShapePointerButton()	{ return (this.m_squareShapePointerButton);	}
	public RedColorPointerButton	getRedColorPointerButton()		{ return (this.m_redColorPointerButton);	}
	public GreenColorPointerButton	getGreenColorPointerButton()	{ return (this.m_greenColorPointerButton);	}
	public BlueColorPointerButton	getBlueColorPointerButton()		{ return (this.m_blueColorPointerButton);	}
	public SizePointerComboBox		getSizePointerComboBox()		{ return (this.m_sizePointerComboBox);		}
}
