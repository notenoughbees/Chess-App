package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JToggleButton;

public class Pawn extends Piece{

	//constructor call
	public Pawn(Color tempPieceColour, String tempPieceType, JToggleButton tempLocation) {
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
		int i = allSquares.indexOf(super.getPieceLocation());
		
		if(getPieceColour() == GameEnvironment.WHITE_COLOUR)
		{
			opponentColour = GameEnvironment.BLACK_COLOUR;
			possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_TOP_CALCULATION);
			possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_TOPLEFT_CALCULATION);
			possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_TOPRIGHT_CALCULATION);
			//if the pawn has not moved yet, also check the space two squares ahead of it
			if(i >= 48) //check if it is behind the 3rd rank, aka the index of currentSquare in allSquares is >= 48
			{
				//the square two spaces ahead is just the square one space ahead minus 8
				possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
						currentSquare, opponentColour, BoardWindow.SQUARE_TOP_CALCULATION-8);
			}
		}
		//if the pawn is on the black side, then it moves in the opposite direction
		else
		{
			opponentColour = GameEnvironment.WHITE_COLOUR;
			possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_BOTTOM_CALCULATION);
			possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_BOTTOMRIGHT_CALCULATION);
			possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_BOTTOMLEFT_CALCULATION);
			if(i < 16)
			{
				possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
						currentSquare, opponentColour, BoardWindow.SQUARE_BOTTOM_CALCULATION+8);
			}
		}
		return possibleDestinations;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
