package mainWindow;

import listeners.drawingMouseListeners.DrawMouseListener;
import listeners.menuBarListeners.ClearMenuItemListener;
import listeners.menuBarListeners.QuitMenuItemListener;
import listeners.menuBarListeners.SaveMenuItemListener;
import listeners.toolBarButtonsListener.colorButtonListeners.BlueColorButtonListener;
import listeners.toolBarButtonsListener.colorButtonListeners.GreenColorButtonListener;
import listeners.toolBarButtonsListener.colorButtonListeners.RedColorButtonListener;
import listeners.toolBarButtonsListener.shapeButtonListeners.RoundShapeButtonListener;
import listeners.toolBarButtonsListener.shapeButtonListeners.SizeComboBoxListener;
import listeners.toolBarButtonsListener.shapeButtonListeners.SquareShapeButtonListener;

public class MainListener 
{
	protected MainWindow	m_mainWindow;
	
	public	MainListener(MainWindow p_window)
	{
		DrawingBoardPanel	drawingBoardPanel = null;
		
		this.m_mainWindow = p_window;
		drawingBoardPanel = this.m_mainWindow.getDrawingBoardPanel();
		
		/* MouseDrawListeners */
		this.m_mainWindow.getDrawingBoardPanel().addMouseListener(new DrawMouseListener(drawingBoardPanel));
		this.m_mainWindow.getDrawingBoardPanel().addMouseMotionListener(new DrawMouseListener(drawingBoardPanel));
		
		/* ToolBarButtonsListeners */
		this.m_mainWindow.getMainToolBar().getRedColorPointerButton().addActionListener(new RedColorButtonListener(drawingBoardPanel));
		this.m_mainWindow.getMainToolBar().getGreenColorPointerButton().addActionListener(new GreenColorButtonListener(drawingBoardPanel));
		this.m_mainWindow.getMainToolBar().getBlueColorPointerButton().addActionListener(new BlueColorButtonListener(drawingBoardPanel));
		this.m_mainWindow.getMainToolBar().getRoundShapePointerButton().addActionListener(new RoundShapeButtonListener(drawingBoardPanel));
		this.m_mainWindow.getMainToolBar().getSquareShapePointerButton().addActionListener(new SquareShapeButtonListener(drawingBoardPanel));
		this.m_mainWindow.getMainToolBar().getSizePointerComboBox().addItemListener(new SizeComboBoxListener(drawingBoardPanel));

		/* MenuBarButtonsListeners */
		this.m_mainWindow.getMainMenuBar().getFileMenu().getClearItem().addActionListener(new ClearMenuItemListener(drawingBoardPanel));
		this.m_mainWindow.getMainMenuBar().getFileMenu().getQuitItem().addActionListener(new QuitMenuItemListener(drawingBoardPanel));
		this.m_mainWindow.getMainMenuBar().getFileMenu().getSaveItem().addActionListener(new SaveMenuItemListener(drawingBoardPanel));
	}
}
