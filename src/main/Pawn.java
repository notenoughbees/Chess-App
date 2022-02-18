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
		// ==== check the space ahead of the pawn ====
		//first find out where that space is
		Pair<JToggleButton, String> squareTop = null;
		if(getPieceColour() == Color.white)
			{squareTop = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "top");}
		else
			{squareTop = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "bottom");}
		//now find out if that space is empty - if there is no text in the button. If there is no text, 
		// then that space is a valid destination.
		if(squareTop.first.getText().isEmpty()) //TODO: a square can also be valid if it has an opponent's piece on it
			{possibleDestinations.add(squareTop);}
		
		// ==== check the space ahead and to the left of the pawn ====
		Pair<JToggleButton, String> squareTopLeft;
		if(getPieceColour() == Color.white)
			{squareTopLeft = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "topLeft");}
		else
			{squareTopLeft = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "bottomRight");}
		if(squareTopLeft.first.getText().isEmpty())
			{possibleDestinations.add(squareTopLeft);}
		
		// ==== check the space ahead and to the right of the pawn ====
		Pair<JToggleButton, String> squareTopRight;
		if(getPieceColour() == Color.white)
			{squareTopRight = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "topRight");}
		else
			{squareTopRight = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "bottomLeft");}
		if(squareTopRight.first.getText().isEmpty())
			{possibleDestinations.add(squareTopRight);}
		
		//TODO
//		// ==== if the pawn has not moved yet, also check the space two squares ahead of the pawn ====
//		if(getPieceColour() == Color.white)
//		{
//			if(pawn is on the 2nd rank, pawn is on the <3 rank etc)
//			{
//				
//			}
//		}
//		else
//		{
//			
//		}
		
		return possibleDestinations;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
