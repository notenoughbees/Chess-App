package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

public class Pawn extends Piece{

	//constructor call
	public Pawn(Color tempPieceColour, ImageIcon pieceType, JToggleButton tempLocation) {
		super(tempPieceColour, pieceType, tempLocation);
	}
	

	public ArrayList<JToggleButton> findValidDestinationsHelper(
			Color opponentColour, ArrayList<JToggleButton> allSquares,
			int calculation1, int calculation2, int calculation3, boolean pawnHasNotMoved)
	{
		ArrayList<JToggleButton> validDestinations = new ArrayList<>();
		JToggleButton currentSquare = super.getPieceLocation();
		
		validDestinations = super.testNewDestinationSquare(validDestinations, allSquares, 
				currentSquare, opponentColour, calculation1);
		validDestinations = super.testNewDestinationSquare(validDestinations, allSquares, 
				currentSquare, opponentColour, calculation2);
		validDestinations = super.testNewDestinationSquare(validDestinations, allSquares, 
				currentSquare, opponentColour, calculation3);
		//if the pawn has not moved yet, also check the space two squares ahead of it
		if(pawnHasNotMoved) //check if it is behind the 3rd rank, aka the index of currentSquare in allSquares is >= 48
		{
			//first check if there is a piece in the way
			JToggleButton squareAhead = allSquares.get(allSquares.indexOf(currentSquare)+BoardWindow.SQUARE_TOP_CALCULATION);
			if(squareAhead.getIcon() == null)
			{
				//the square two spaces ahead is just the square one space ahead minus 8
				validDestinations = super.testNewDestinationSquare(validDestinations, allSquares, 
						currentSquare, opponentColour, BoardWindow.SQUARE_TOP_CALCULATION-8);
			}
		}
		return validDestinations;
	}
	
	
	public ArrayList<JToggleButton> findValidDestinations()
	{
		ArrayList<JToggleButton> validDestinations = new ArrayList<>();
		ArrayList<JToggleButton> allSquares = BoardWindow.getAllSquares();
		int i = allSquares.indexOf(super.getPieceLocation());
		
		if(getPieceColour() == GameEnvironment.WHITE_PIECE_COLOUR)
		{
			boolean hasPieceMovedExpression = (i >= 48);
			validDestinations = findValidDestinationsHelper(GameEnvironment.BLACK_PIECE_COLOUR,
					allSquares, BoardWindow.SQUARE_TOP_CALCULATION,
					BoardWindow.SQUARE_TOPLEFT_CALCULATION,
					BoardWindow.SQUARE_TOPRIGHT_CALCULATION, hasPieceMovedExpression);
		}
		//if the pawn is on the black side, then it moves in the opposite direction
		else
		{
			boolean hasPieceMovedExpression = (i < 16);
			validDestinations = findValidDestinationsHelper(GameEnvironment.WHITE_PIECE_COLOUR,
					allSquares, BoardWindow.SQUARE_BOTTOM_CALCULATION,
					BoardWindow.SQUARE_BOTTOMRIGHT_CALCULATION,
					BoardWindow.SQUARE_BOTTOMLEFT_CALCULATION, hasPieceMovedExpression);
		}
		return validDestinations;
	}
	
	
	
	
	
	
	
	
	

}
