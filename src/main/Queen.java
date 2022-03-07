package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JToggleButton;

public class Queen extends Piece{

	//constructor call
	public Queen(Color tempPieceColour, String tempPieceType, JToggleButton tempLocation) {
		//superclass constructor call: initialise the superclass instance variables (Big Java p318)
		super(tempPieceColour, tempPieceType, tempLocation);
	}
	
	
//	public void SelectPiece(String pieceType)
//	{
//		
//	}
	
	
	
	

	
	
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
		
		possibleDestinations = (findPossibleDestinationsLoop(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_TOPLEFT_CALCULATION));
		possibleDestinations = (findPossibleDestinationsLoop(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_TOPRIGHT_CALCULATION));
		possibleDestinations = (findPossibleDestinationsLoop(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_BOTTOMLEFT_CALCULATION));
		possibleDestinations = (findPossibleDestinationsLoop(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_BOTTOMRIGHT_CALCULATION));
		possibleDestinations = (findPossibleDestinationsLoop(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_TOP_CALCULATION));
		possibleDestinations = (findPossibleDestinationsLoop(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_LEFT_CALCULATION));
		possibleDestinations = (findPossibleDestinationsLoop(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_RIGHT_CALCULATION));
		possibleDestinations = (findPossibleDestinationsLoop(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_BOTTOM_CALCULATION));
		
		return possibleDestinations;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
