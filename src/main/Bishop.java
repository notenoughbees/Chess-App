package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JToggleButton;

public class Bishop extends Piece{

	//constructor call
	public Bishop(Color tempPieceColour, String tempPieceType, Pair<JToggleButton, String> tempLocation) {
		//superclass constructor call: initialise the superclass instance variables (Big Java p318)
		super(tempPieceColour, tempPieceType, tempLocation);
	}
	
	
//	public void SelectPiece(String pieceType)
//	{
//		
//	}
	
	
	public ArrayList<Pair<JToggleButton, String>> findPossibleDestinations()
	{
		//System.out.println("BISHOP =====================================");
		ArrayList<Pair<JToggleButton, String>> possibleDestinations = new ArrayList<>();
		ArrayList<Pair<JToggleButton, String>> allSquares = BoardWindow.getAllSquares();
		Pair<JToggleButton, String> currentSquare = super.getPieceLocation();
		Color opponentColour;
		
		if(getPieceColour() == Color.WHITE) {
			opponentColour = Color.red;}
		else {
			opponentColour = Color.orange;}
		
		//first calculate the possible destinations
		for(int i = 0; i < BoardWindow.getBoardLength(); i++)
		{
			try
			{
				Pair<JToggleButton, String> squareTopLeft = allSquares.get(allSquares.indexOf(currentSquare)-9*(i+1));
				if(squareTopLeft.first.getForeground() == opponentColour)
				{
					possibleDestinations.add(squareTopLeft);
					//the bishop will not be able to go to any square beyond this one becaue it would have to take the piece on this square and end the turn
					break;
				}
				if(squareTopLeft.first.getText().isEmpty())
				{
					possibleDestinations.add(squareTopLeft);
				}
				//if the square isn't empty or has an opponent piece, then it must have a same-colour piece,
				//  so break the loop just as we do for the opposite-colour case.
				else
				{
					break;
				}
			}
			catch (IndexOutOfBoundsException e){
				break;
			}
		}
		for(int i = 0; i < BoardWindow.getBoardLength(); i++)
		{
			try
			{
				Pair<JToggleButton, String> squareTopRight = allSquares.get(allSquares.indexOf(currentSquare)-7*(i+1));
				if(squareTopRight.first.getForeground() == opponentColour)
				{
					possibleDestinations.add(squareTopRight);
					break;
				}
				if(squareTopRight.first.getText().isEmpty())
				{
					possibleDestinations.add(squareTopRight);
				}
				else
				{
					break;
				}
			}
			catch (IndexOutOfBoundsException e){
				break;
			}
		}
		for(int i = 0; i < BoardWindow.getBoardLength(); i++)
		{
			//System.out.println("C" + "\t" + i);
			try
			{
				Pair<JToggleButton, String> squareBottomLeft = allSquares.get(allSquares.indexOf(currentSquare)+7*(i+1));
				//System.out.println(squareBottomLeft.first.getText().isEmpty());
				//System.out.println(squareBottomLeft.first.getForeground() == opponentColour);
				if(squareBottomLeft.first.getForeground() == opponentColour)
				{
					//System.out.println("C1" + "\t" + (7*(i+1)) + "\t" + (allSquares.indexOf(currentSquare)+7*(i+1)));
					possibleDestinations.add(squareBottomLeft);
					break;
				}
				if(squareBottomLeft.first.getText().isEmpty())
				{
					//System.out.println("C2" + "\t" + (7*(i+1)) + "\t" + (allSquares.indexOf(currentSquare)+7*(i+1)));
					possibleDestinations.add(squareBottomLeft);
				}
				else
				{
					break;
				}
			}
			catch (IndexOutOfBoundsException e){
				break;
			}
		}
		for(int i = 0; i < BoardWindow.getBoardLength(); i++)
		{
			try
			{
				Pair<JToggleButton, String> squareBottomRight = allSquares.get(allSquares.indexOf(currentSquare)+9*(i+1));
				if(squareBottomRight.first.getForeground() == opponentColour)
				{
					possibleDestinations.add(squareBottomRight);
					break;
				}
				if(squareBottomRight.first.getText().isEmpty())
				{
					possibleDestinations.add(squareBottomRight);
				}
				else
				{
					break;
				}
			}
			catch (IndexOutOfBoundsException e){
				break;
			}
		}

		
		
		return possibleDestinations;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
