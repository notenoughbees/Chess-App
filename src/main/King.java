package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

public class King extends Piece{

	//constructor call
	public King(Color tempPieceColour, ImageIcon pieceType, JToggleButton tempLocation) {
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
		
		possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_TOPLEFT_CALCULATION);
		possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_TOP_CALCULATION);
		possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_TOPRIGHT_CALCULATION);
		possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_LEFT_CALCULATION);
		possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_RIGHT_CALCULATION);
		possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_BOTTOMLEFT_CALCULATION);
		possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_BOTTOM_CALCULATION);
		possibleDests = super.testNewDestSquare(possibleDests, allSquares, 
				currentSquare, opponentColour, BoardWindow.SQUARE_BOTTOMRIGHT_CALCULATION);
		
		return possibleDests;
	}
	
	
	
	
	
	
	
	
	
	
	

}
