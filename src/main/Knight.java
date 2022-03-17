package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JToggleButton;

public class Knight extends Piece{

	//constructor call
	public Knight(Color tempPieceColour, String tempPieceType, JToggleButton tempLocation) {
		//superclass constructor call: initialise the superclass instance variables (Big Java p318)
		super(tempPieceColour, tempPieceType, tempLocation);
	}
	
	
	public ArrayList<JToggleButton> findPossibleDestinations()
	{
		ArrayList<JToggleButton> possibleDestinations = new ArrayList<>();
		Color opponentColour;
		ArrayList<JToggleButton> allSquares = BoardWindow.getAllSquares();
		JToggleButton currentSquare = super.getPieceLocation();
		
		if(getPieceColour() == GameEnvironment.WHITE_PIECE_COLOUR) {
			opponentColour = GameEnvironment.BLACK_PIECE_COLOUR;}
		else {
			opponentColour = GameEnvironment.WHITE_PIECE_COLOUR;}
		
		int i = allSquares.indexOf(currentSquare);
		int column = (i % 8) + 1;
		if(column <= 2)
		{
			possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPRIGHT_CALCULATION);
			possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_UPPERRIGHT_CALCULATION);
			possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_LOWERRIGHT_CALCULATION);
			possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMRIGHT_CALCULATION);
			if(column == 2)
			{
				possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
						currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPLEFT_CALCULATION);
				possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
						currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMLEFT_CALCULATION);
			}
		}
		else if(column >= 7)
		{
			possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPLEFT_CALCULATION);
			possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_UPPERLEFT_CALCULATION);
			possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_LOWERLEFT_CALCULATION);
			possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMLEFT_CALCULATION);
			if(column == 7)
			{
				possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
						currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPRIGHT_CALCULATION);
				possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
						currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMRIGHT_CALCULATION);
			}
		}
		return possibleDestinations;
	}
	
	
	
	
	
	
	
	
	
	

}
