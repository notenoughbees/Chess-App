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
	
	
	
	
	public ArrayList<Pair<JToggleButton, String>> findPossibleDestinationsHelper(
			ArrayList<Pair<JToggleButton, String>> possibleDestinations,
			ArrayList<Pair<JToggleButton, String>> allSquares,
			Pair<JToggleButton, String> currentSquare,
			Color opponentColour,
			int nextSquareCalculation)
	{
		for(int i = 0; i < BoardWindow.BOARD_LENGTH; i++)
		{
			try
			{
				Pair<JToggleButton, String> nextSquare = allSquares.get(allSquares.indexOf(currentSquare)+nextSquareCalculation*(i+1));
				if(nextSquare.first.getForeground() == opponentColour)
				{
					possibleDestinations.add(nextSquare);
					//the bishop will not be able to go to any square beyond this one becaue it would have to take the piece on this square and end the turn
					break;
				}
				if(nextSquare.first.getText().isEmpty())
				{
					possibleDestinations.add(nextSquare);
				}
				//if the square isn't empty or has an opponent piece, then it must have a same-colour piece,
				//  so break the loop just as we do for the opposite-colour case.
				else
				{
					break;
				}
			}
			catch (IndexOutOfBoundsException e){
				break;
			}
		}
		return possibleDestinations;
	}
	
	
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
		
		possibleDestinations = (findPossibleDestinationsHelper(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_TOPLEFT_CALCULATION));
		possibleDestinations = (findPossibleDestinationsHelper(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_TOPRIGHT_CALCULATION));
		possibleDestinations = (findPossibleDestinationsHelper(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_BOTTOMLEFT_CALCULATION));
		possibleDestinations = (findPossibleDestinationsHelper(possibleDestinations, allSquares,
				currentSquare, opponentColour, BoardWindow.SQUARE_BOTTOMRIGHT_CALCULATION));
		
		return possibleDestinations;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
