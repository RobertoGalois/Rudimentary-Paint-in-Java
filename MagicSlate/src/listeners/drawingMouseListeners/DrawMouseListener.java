package listeners.drawingMouseListeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import mainWindow.DrawingBoardPanel;

public class DrawMouseListener implements MouseMotionListener, MouseListener
{
	protected DrawingBoardPanel		m_drawingBoardPanel;
	
	public		DrawMouseListener(DrawingBoardPanel p_panel)
	{
		this.m_drawingBoardPanel = p_panel;
	}
	
	public void mouseDragged(MouseEvent e)
	{
		this.m_drawingBoardPanel.paintPoint(e.getX(), e.getY());
	}
	
	public void	mousePressed(MouseEvent e)
	{
		this.m_drawingBoardPanel.paintPoint(e.getX(), e.getY());
	}
	
	public void	mouseClicked(MouseEvent e)	{}
	public void	mouseExited(MouseEvent e)	{}
	public void	mouseReleased(MouseEvent e)	{}
	public void	mouseEntered(MouseEvent e)	{}
	public void mouseMoved(MouseEvent e)	{}
}
