package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JToggleButton;

public class Queen extends Piece{

	//constructor call
	public Queen(Color tempPieceColour, char tempPieceType, JToggleButton tempLocation) {
		//superclass constructor call: initialise the superclass instance variables (Big Java p318)
		super(tempPieceColour, tempPieceType, tempLocation);
	}
	
	
	public ArrayList<JToggleButton> findValidDestinations()
	{
		ArrayList<JToggleButton> possibleDestinations = new ArrayList<>();
		Color opponentColour;
		ArrayList<JToggleButton> allSquares = BoardWindow.getAllSquares();
		JToggleButton currentSquare = super.getPieceLocation();
		
		if(getPieceColour() == GameEnvironment.WHITE_PIECE_COLOUR) {
			opponentColour = GameEnvironment.BLACK_PIECE_COLOUR;}
		else {
			opponentColour = GameEnvironment.WHITE_PIECE_COLOUR;}
		
		possibleDestinations = super.findValidDestinationsLoop(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_TOPLEFT_CALCULATION);
		possibleDestinations = super.findValidDestinationsLoop(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_TOPRIGHT_CALCULATION);
		possibleDestinations = super.findValidDestinationsLoop(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_BOTTOMLEFT_CALCULATION);
		possibleDestinations = super.findValidDestinationsLoop(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_BOTTOMRIGHT_CALCULATION);
		possibleDestinations = super.findValidDestinationsLoop(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_TOP_CALCULATION);
		possibleDestinations = super.findValidDestinationsLoop(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_LEFT_CALCULATION);
		possibleDestinations = super.findValidDestinationsLoop(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_RIGHT_CALCULATION);
		possibleDestinations = super.findValidDestinationsLoop(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_BOTTOM_CALCULATION);
		
		return possibleDestinations;
	}
	
	
	
	
	
	
	
	
	
	
	

}
