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
	
	
//	public void SelectPiece(String pieceType)
//	{
//		
//	}
	
	
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
		
		System.out.println(possibleDestinations);
		
		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPLEFT_CALCULATION);
		System.out.println(possibleDestinations);
		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPRIGHT_CALCULATION);
		System.out.println(possibleDestinations);
		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_UPPERLEFT_CALCULATION);
		System.out.println(possibleDestinations);
		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_UPPERRIGHT_CALCULATION);
		System.out.println(possibleDestinations);
		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_LOWERLEFT_CALCULATION);
		System.out.println(possibleDestinations);
		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_LOWERRIGHT_CALCULATION);
		System.out.println(possibleDestinations);
		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMLEFT_CALCULATION);
		System.out.println(possibleDestinations);
		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMRIGHT_CALCULATION);
		System.out.println(possibleDestinations);
		System.out.println("================================");

		return possibleDestinations;
	}
	
	
	
	
	
	
	
	
	
	

}
