package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

public class Knight extends Piece{

	//constructor call
	public Knight(Color tempPieceColour, ImageIcon pieceType, JToggleButton tempLocation) {
		//superclass constructor call: initialise the superclass instance variables (Big Java p318)
		super(tempPieceColour, pieceType, tempLocation);
	}
	
	
	public ArrayList<JToggleButton> findValidDests()
	{
		ArrayList<JToggleButton> possibleDests = new ArrayList<>();
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
			possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPRIGHT_CALCULATION);
			possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_UPPERRIGHT_CALCULATION);
			possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_LOWERRIGHT_CALCULATION);
			possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMRIGHT_CALCULATION);
			if(column == 2)
			{
				possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
						currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPLEFT_CALCULATION);
				possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
						currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMLEFT_CALCULATION);
			}
		}
		else
		{
			possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPLEFT_CALCULATION);
			possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_UPPERLEFT_CALCULATION);
			possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_LOWERLEFT_CALCULATION);
			possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMLEFT_CALCULATION);
			//as long as we're not on the far right, we need to check at least 6 destinations here
			if(column <= 7)
			{
				possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
						currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPRIGHT_CALCULATION);
				possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
						currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMRIGHT_CALCULATION);
				//this code runs if the col is one of the middle 4 cols, so all 8 destinations should be checked
				if(column <= 6)
				{
					possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
							currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_UPPERRIGHT_CALCULATION);
					possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
							currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_LOWERRIGHT_CALCULATION);
				}
			}
		}
		return possibleDests;
	}
	
	
	
	
	
	
	
	
	
	

}
