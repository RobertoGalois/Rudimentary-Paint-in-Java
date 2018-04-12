package drawFeatures;

import java.awt.Color;

public enum E_PointerColor 
{
	RED(Color.RED),
	GREEN(Color.GREEN),
	BLUE(Color.BLUE);
	
	Color	m_color;
	
	private			E_PointerColor(Color p_color)	{ this.m_color = p_color;	}
	public Color	getColor()						{ return (this.m_color);	}
}
