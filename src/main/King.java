package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JToggleButton;

public class King extends Piece{

	//constructor call
	public King(Color tempPieceColour, String tempPieceType, Pair<JToggleButton, String> tempLocation) {
		//superclass constructor call: initialise the superclass instance variables (Big Java p318)
		super(tempPieceColour, tempPieceType, tempLocation);
	}
	
	
	public ArrayList<Pair<JToggleButton, String>> findPossibleDestinations()
	{
		ArrayList<Pair<JToggleButton, String>> possibleDestinations = new ArrayList<>();
		Color opponentColour;
		ArrayList<Pair<JToggleButton, String>> allSquares = BoardWindow.getAllSquares();
		Pair<JToggleButton, String> currentSquare = super.getPieceLocation();
		
		if(getPieceColour() == Color.WHITE) {
			opponentColour = Color.red;}
		else {
			opponentColour = Color.orange;}
		
		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_TOPLEFT_CALCULATION);
		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_TOP_CALCULATION);
		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_TOPRIGHT_CALCULATION);
		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_LEFT_CALCULATION);
		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_RIGHT_CALCULATION);
		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_BOTTOMLEFT_CALCULATION);
		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_BOTTOM_CALCULATION);
		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_BOTTOMRIGHT_CALCULATION);
		
		return possibleDestinations;
	}
	
	
	
	
	
	
	
	
	
	
	

}
