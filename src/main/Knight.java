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
		
		
		int i = allSquares.indexOf(currentSquare);
		int column = (i % 8) + 1;
		if(column <= 2)
		{
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPRIGHT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_UPPERRIGHT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_LOWERRIGHT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMRIGHT_CALCULATION);
			if(column == 2)
			{
				possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
						currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPLEFT_CALCULATION);
				possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
						currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMLEFT_CALCULATION);
			}
		}
		else if(column >= 7)
		{
			System.out.println("==== second if");
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPLEFT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_UPPERLEFT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_LOWERLEFT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMLEFT_CALCULATION);
			if(column == 7)
			{
				System.out.println("==== second nested if");
				possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
						currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPRIGHT_CALCULATION);
				possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
						currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMRIGHT_CALCULATION);
			}
		}
		return possibleDestinations;
	}
	
	
	
	
	
	
	
	
	
	

}
