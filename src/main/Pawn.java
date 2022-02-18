package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JToggleButton;

public class Pawn extends Piece{

	//constructor call
	public Pawn(Color tempPieceColour, String tempPieceType, Pair<JToggleButton, String> tempLocation) {
		//superclass constructor call: initialise the superclass instance variables (Big Java p318)
		super(tempPieceColour, tempPieceType, tempLocation);
	}
	
	
//	public void SelectPiece(String pieceType)
//	{
//		
//	}
	
	
	public ArrayList<Pair<JToggleButton, String>> findPossibleDestinations()
	{
		ArrayList<Pair<JToggleButton, String>> possibleDestinations = new ArrayList<>();
		Pair<JToggleButton, String> squareTop;
		Pair<JToggleButton, String> squareTopLeft;
		Pair<JToggleButton, String> squareTopRight;
		Pair<JToggleButton, String> squareTwoAhead = null;
		
		ArrayList<Pair<JToggleButton, String>> allSquares = BoardWindow.getAllSquares();
		Pair<JToggleButton, String> currentSquare = super.getPieceLocation();
		int i = allSquares.indexOf(currentSquare);
		Color opponentColour;
		
		if(getPieceColour() == Color.WHITE)
		{
			opponentColour = Color.red;
			squareTop = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "top");
			squareTopLeft = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "topLeft");
			squareTopRight = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "topRight");
			//if the pawn has not moved yet, also check the space two squares ahead of the pawn
			//if the pawn is on a square behind the third rank 
			//  (aka, the index of currentSquare in allSquares is 48 or higher)...
			if(i >= 48)
			{
				//the square two spaces ahead is just the square one space ahead minus 8
				squareTwoAhead = allSquares.get(allSquares.indexOf(squareTop)-8);
			}
		}
		//if the pawn is on the black side, then it moves in the opposite direction
		else
		{
			opponentColour = Color.orange;
			squareTop = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "bottom");
			squareTopLeft = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "bottomRight");
			squareTopRight = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "bottomLeft");
			if(i < 16)
			{
				squareTwoAhead = allSquares.get(allSquares.indexOf(squareTop)+8);
			}
		}
		
		//now find out if that space is a valid destination - it is either empty or has an opponent piece on it
		if(squareTop.first.getText().isEmpty())
			{possibleDestinations.add(squareTop);}
		if(squareTopLeft.first.getForeground() == opponentColour) //TODO: check if this line works
			{possibleDestinations.add(squareTopLeft);}
		if(squareTopRight.first.getForeground() == opponentColour)
			{possibleDestinations.add(squareTopRight);}
		if(squareTwoAhead.first.getText().isEmpty())
			{possibleDestinations.add(squareTwoAhead);}
		
		return possibleDestinations;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
