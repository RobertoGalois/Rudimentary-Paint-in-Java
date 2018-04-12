package drawFeatures;

public class Point 
{
	protected int				m_x;
	protected int				m_y;
	protected int				m_size;
	protected E_PointerColor	m_pointerColor;
	protected E_PointerShape	m_pointerShape;
	
	
	public		Point()
	{
		this.m_x = -10;
		this.m_y = -10;
		this.m_size = 15;
		this.m_pointerColor = E_PointerColor.RED;
		this.m_pointerShape = E_PointerShape.ROUND;
	}
	
	public		Point(int p_x, int p_y, int p_size,
					  E_PointerColor p_color, E_PointerShape p_shape)
	{
		this.m_x = p_x;
		this.m_y = p_y;
		this.m_size = p_size;
		this.m_pointerColor = p_color;
		this.m_pointerShape = p_shape;
	}
	
	public int				getX()				{ return (this.m_x);			}
	public int				getY()				{ return (this.m_y);			}
	public int				getSize()			{ return (this.m_size);			}
	public E_PointerColor	getPointerColor()	{ return (this.m_pointerColor);	}
	public E_PointerShape	getPointerShape()	{ return (this.m_pointerShape);	}
	
	
	public void	setX(int p_x)								{ this.m_x = p_x;					}
	public void	setY(int p_y)								{ this.m_y = p_y;					}
	public void	setSize(int p_size)							{ this.m_size = p_size;				}
	public void	setPointerColor(E_PointerColor p_color) 	{ this.m_pointerColor = p_color;	}
	public void setPointerType(E_PointerShape p_shape)		{ this.m_pointerShape = p_shape;	}
}
