package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JToggleButton;

public class Knight extends Piece{

	//constructor call
	public Knight(Color tempPieceColour, String tempPieceType, Pair<JToggleButton, String> tempLocation) {
		//superclass constructor call: initialise the superclass instance variables (Big Java p318)
		super(tempPieceColour, tempPieceType, tempLocation);
	}
	
	
	public ArrayList<Pair<JToggleButton, String>> findPossibleDestinations()
	{
		ArrayList<Pair<JToggleButton, String>> possibleDestinations = new ArrayList<>();
		// ==== check the space ahead of the pawn ====
		Pair<JToggleButton, String> squareTopLeft;
		if(getPieceColour() == Color.white)
			{squareTopLeft = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "top");}
		else
			{squareTopLeft = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "bottom");}
		if(squareTopLeft.first.getText().isEmpty())
			{possibleDestinations.add(squareTopLeft);}
		
		
		
		return possibleDestinations;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
