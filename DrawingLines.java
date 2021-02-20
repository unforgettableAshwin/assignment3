package week2;

import java.awt.event.MouseEvent;
import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class DrawingLines extends GraphicsProgram
{
	public void init()
	{
		addMouseListeners();
	}

	public void mousePressed( MouseEvent e )
	{
		startX = e.getX();
		startY = e.getY();
		currentLine = new GLine( startX, startY, startX, startY );
		add( currentLine );
	}

	public void mouseDragged( MouseEvent e )
	{
		currentLine.setEndPoint( e.getX(), e.getY() );
	}

	// Declaring serialVersionUID prevents the warning:
	// The serializable class DrawingLines does not declare a static final:
	private static final long serialVersionUID = 1L;
	private GLine currentLine; /* The current line */
	private double startX; /* The initial mouse X position */
	private double startY;
}