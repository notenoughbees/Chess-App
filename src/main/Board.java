package main;

import java.util.ArrayList;

import javax.swing.JToggleButton;

public class Board {
	

	/**
	 * Calculates and returns the square that is on the given side of the given square.
	 * If there is no square on the given side, return None.
	 * @param allSquares
	 * @param currentSquare
	 * @return
	 */
	public static JToggleButton getSideSquare(ArrayList<JToggleButton> allSquares, JToggleButton currentSquare, String side)
	{
		int i = allSquares.indexOf(currentSquare);
		try
		{
			if(side == "topLeft")
			{
				return allSquares.get(i-8-1);
			}
			if(side == "top")
			{
				return allSquares.get(i-8);
			}
			
			if(side == "topRight")
			{
				return allSquares.get(i-8+1);
			}
			if(side == "left")
			{
				return allSquares.get(i-1);
			}
			if(side == "right")
			{
				return allSquares.get(i+1);
			}
			if(side == "bottomLeft")
			{
				return allSquares.get(i+8-1);
			}
			if(side == "bottom")
			{
				return allSquares.get(i+8);
			}
			if(side == "bottomRight")
			{
				return allSquares.get(i+8+1);
			}
			
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			//TODO: is there a better way to handle this than returning a button with special text?
			JToggleButton error = new JToggleButton();
			error.setText("ERROR");
			return error;
		}
		return currentSquare; //this line just prevents the syntax error for "return type must be JToggleButton"
	}
	
	

	
	
}
