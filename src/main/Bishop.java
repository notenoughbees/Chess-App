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
		//System.out.println("findPossibleDestinations: BISHOP");
		ArrayList<Pair<JToggleButton, String>> possibleDestinations = new ArrayList<>();
		Color opponentColour;
		ArrayList<Pair<JToggleButton, String>> allSquares = BoardWindow.getAllSquares();
		Pair<JToggleButton, String> currentSquare = super.getPieceLocation();
		
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
		
		return possibleDestinations;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
