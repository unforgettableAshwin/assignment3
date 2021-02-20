package week2;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.*;

public class RandomCircles extends GraphicsProgram
{
	public void run()
	{
		double canvasWidth = getWidth();
		double canvasHeight = getHeight();
		double circleWidth;
		double totalWidth;

		int xRandom;
		int yRandom;

		GOval circle;

		for( int x = 0; x < 10; x++ )
		{
			circleWidth = rgen.nextDouble( 10, 100 );
			totalWidth = circleWidth + EDGE;
			xRandom = rgen.nextInt( 0, (int)( canvasWidth - totalWidth ) );
			yRandom = rgen.nextInt( 0, (int)( canvasHeight - totalWidth ) );
			circle = new GOval( circleWidth, circleWidth );
			circle.setFilled( true );
			circle.setColor( rgen.nextColor() );
			add( circle, xRandom, yRandom );
		}
	}

	// Not factoring in this offset can make a circle appear to have flat edges.
	// Set to zero and place circle in the farthest bottom right position to see:
	static final int EDGE = 2;

	static final long serialVersionUID = 0;

	private RandomGenerator rgen = RandomGenerator.getInstance();
}
