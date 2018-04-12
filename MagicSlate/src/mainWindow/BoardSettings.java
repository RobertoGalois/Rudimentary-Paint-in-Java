package mainWindow;

import drawFeatures.E_PointerColor;
import drawFeatures.E_PointerShape;

public class BoardSettings 
{
	protected E_PointerShape	m_pointerShape;
	protected E_PointerColor	m_pointerColor;
	protected Integer			m_pointerSize;
	
	public	BoardSettings()
	{
		this.m_pointerShape = E_PointerShape.ROUND;
		this.m_pointerColor = E_PointerColor.RED;
		this.m_pointerSize = new Integer(20);
	}
	
	public E_PointerShape	getPointerShape()	{ return (this.m_pointerShape);	}
	public E_PointerColor	getPointerColor()	{ return (this.m_pointerColor);	}
	public Integer			getPointerSize()	{ return (this.m_pointerSize);	}
	
	public void	setPointerShape(E_PointerShape p_shape)	{ this.m_pointerShape = p_shape;	}
	public void	setPointerColor(E_PointerColor p_color)	{ this.m_pointerColor = p_color;	}
	public void setPointerSize(Integer p_int)			{ this.m_pointerSize = p_int;		}
}
