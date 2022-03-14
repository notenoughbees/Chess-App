package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JToggleButton;

public class Bishop extends Piece{

	//constructor call
	public Bishop(Color tempPieceColour, String tempPieceType, JToggleButton tempLocation) {
		//superclass constructor call: initialise the superclass instance variables (Big Java p318)
		super(tempPieceColour, tempPieceType, tempLocation);
	}
	
	
	public ArrayList<JToggleButton> findPossibleDestinations()
	{
		ArrayList<JToggleButton> possibleDestinations = new ArrayList<>();
		Color opponentColour;
		ArrayList<JToggleButton> allSquares = BoardWindow.getAllSquares();
		JToggleButton currentSquare = super.getPieceLocation();
		
		if(getPieceColour() == Color.WHITE) {
			opponentColour = Color.red;}
		else {
			opponentColour = Color.orange;}
		
		possibleDestinations = super.findPossibleDestinationsLoop(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_TOPLEFT_CALCULATION);
		possibleDestinations = super.findPossibleDestinationsLoop(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_TOPRIGHT_CALCULATION);
		possibleDestinations = super.findPossibleDestinationsLoop(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_BOTTOMLEFT_CALCULATION);
		possibleDestinations = super.findPossibleDestinationsLoop(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_BOTTOMRIGHT_CALCULATION);
		
		return possibleDestinations;
	}
	
	
	
	
	
	
	
	
	

}
