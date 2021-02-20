package week2;

/*
 * File: Hogwarts.java
 * -------------------
 * This program is just testing your understanding of parameter passing.
 */
import acm.program.*;

public class Hogwarts extends ConsoleProgram
{
	public void run()
	{	println( "In run(), bludger( 2001 ); is called:" );
		bludger( 2001 );
	}

	private void bludger( int y )
	{	indentLine( 1, "bludger() is called with y=" + y + "." );
		int x = y / 1000;
		showResult( 2, "int x = y / 1000;", x );
		int z = ( x + y );
		showResult( 2, "int z = ( x + y );", z );
		x = quaffle( z, y );
		showResult( 2, "x = quaffle( z, y );", z );
		println( "bludger: x = " + x + ", y = " + y + ", z = " + z );
		indentLine( 2, "Return from bludger()." );
	}

	private void showResult( int columns2indent, String line, int result )
	{	line = "The result of: " + line + " is :" + result + ":";
		indentLine( columns2indent, line );
	}

	private void indentLine( int columns2indent, String line )
	{	String tabs = "";
		for( int x = 0; x < columns2indent; x++ )
			tabs += "\t";

		println( tabs + line );
	}

	private int quaffle( int x, int y )
	{	indentLine( 3, "quaffle() is called with x=" + x + ", y=" + y + "." );
		int z = snitch( x + y, y );
		showResult( 3, "int z = snitch( x + y, y );", z );
		y /= z;
		showResult( 3, "y /= z;", y );
		println( "quaffle: x = " + x + ", y = " + y + ", z = " + z );
		indentLine( 3, "Return z from quaffle()." );
		return z;
	}

	private int snitch( int x, int y )
	{	indentLine( 4, "snitch() is called with x=" + x + ", y=" + y + "." );
		y = x / ( x % 10 );
		showResult( 4, "y = x / ( x % 10 );", y );
		println( "snitch: x = " + x + ", y = " + y );
		indentLine( 4, "return y from snitch()." );
		return y;
	}

	static final long serialVersionUID = 0;
}