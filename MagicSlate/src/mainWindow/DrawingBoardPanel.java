package mainWindow;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import drawFeatures.E_PointerShape;
import drawFeatures.Point;

public class DrawingBoardPanel extends JPanel
{
	protected ArrayList<Point>	m_pointsList;
	protected BoardSettings		m_boardSettings;
	
	public	DrawingBoardPanel()
	{
		super();
		
		this.m_pointsList = new ArrayList<Point>();
		this.m_boardSettings = new BoardSettings(); 
				
		this.setBackground(Color.WHITE);
	}
	
	public void		paintPoint(int p_x, int p_y)
	{
		Point newPoint = new Point(p_x, p_y, this.m_boardSettings.getPointerSize(),
								   this.m_boardSettings.getPointerColor(), this.m_boardSettings.getPointerShape());
		
		this.m_pointsList.add(newPoint);
		this.repaint();
	}
	
	public void		paintComponent(Graphics g)
	{
		/* Repaint the background in white */
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		/* Paint all points from this.m_pointsList */
		for (Point point : this.m_pointsList)
		{
			g.setColor(point.getPointerColor().getColor());
			this.drawShape(point, g);
		}
	}
	
	private void	drawShape(Point p_point, Graphics g)
	{
		int		shapePtrX = (p_point.getX() - p_point.getSize()/2);
		int		shapePtrY = (p_point.getY() - p_point.getSize()/2);
		int		shapeSize = (p_point.getSize());
		
		/* Draw Round */
		if (p_point.getPointerShape() == E_PointerShape.ROUND)
			g.fillOval(shapePtrX, shapePtrY, shapeSize, shapeSize);
		
		/* Draw Square */
		else if (p_point.getPointerShape() == E_PointerShape.SQUARE)
			g.fillRect(shapePtrX, shapePtrY, shapeSize, shapeSize);
	}
	
	public void		eraseBoard()
	{
		this.m_pointsList.clear();
		this.repaint();
	}
	
	public ArrayList<Point>		getPointsList()		{ return (this.m_pointsList);		}
	public BoardSettings		getBoardSettings()	{ return (this.m_boardSettings);	}
}
