package mainWindow;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import mainWindow.mainToolBar.MainToolBar;
import mainWindow.menuBar.MenuBar;

public class MainWindow extends JFrame 
{
	protected MenuBar				m_menuBar;
	protected DrawingBoardPanel		m_mainPanel;
	protected MainToolBar			m_mainToolBar;
	protected MainListener			m_mainListener;
	
	public	MainWindow()
	{
		this.m_menuBar = new MenuBar();
		this.m_mainPanel = new DrawingBoardPanel();
		this.m_mainToolBar = new MainToolBar();
		this.m_mainListener = new MainListener(this);
		
		this.setSize(800, 600);
		this.setTitle("Ardoise Magique");
		this.setLocationRelativeTo(null);
		
		this.setJMenuBar(this.m_menuBar);
		this.add(this.m_mainPanel, BorderLayout.CENTER);
		this.add(this.m_mainToolBar, BorderLayout.NORTH);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public MenuBar				getMainMenuBar()		{ return (this.m_menuBar);		}
	public DrawingBoardPanel	getDrawingBoardPanel()	{ return (this.m_mainPanel);	}
	public MainToolBar			getMainToolBar()		{ return (this.m_mainToolBar);	}
}