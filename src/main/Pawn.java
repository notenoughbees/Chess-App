package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JToggleButton;

public class Pawn extends Piece{

	//constructor call
	public Pawn(Color tempPieceColour, String tempPieceType, Integer tempPieceNumber,
			JToggleButton tempSquare) {
		//superclass constructor call: initialise the superclass instance variables (Big Java p318)
		super(tempPieceColour, tempPieceType, tempPieceNumber, tempSquare);
	}
	
//	public void SelectPiece(String pieceType)
//	{
//		
//	}
	
	
	
	
	
	public ArrayList<JToggleButton> findPossibleDestinations()
	{
		ArrayList<JToggleButton> possibleDestinations = new ArrayList<JToggleButton>();
		// ==== check the space ahead of the pawn ====
		//first find out where that space is
		JToggleButton squareAhead;
		if(getPieceColour() == Color.white)
			{squareAhead = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "top");}
		else
			{squareAhead = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "bottom");}
		//now find out if that space is empty - if there is no text in the button. If there is no text, 
		// then that space is a valid destionation.
		if(squareAhead.getText() == "")
			{possibleDestinations.add(squareAhead);}
		
		// ==== check the space ahead and to the left of the pawn ====
		JToggleButton squareTopLeft;
		if(getPieceColour() == Color.white)
			{squareTopLeft = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "topLeft");}
		else
			{squareTopLeft = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "bottomRight");}
		if(squareTopLeft.getText() == "")
			{possibleDestinations.add(squareTopLeft);}
		
		// ==== check the space ahead and to the right of the pawn ====
		JToggleButton squareTopRight;
		if(getPieceColour() == Color.white)
			{squareTopRight = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "topRight");}
		else
			{squareTopRight = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "bottomLeft");}
		if(squareTopRight.getText() == "")
			{possibleDestinations.add(squareTopRight);}
		
		return possibleDestinations;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
