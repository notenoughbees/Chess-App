package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JToggleButton;

public class Piece {
	//initialise
	private Color pieceColour;
	private String pieceType;
	private Pair<JToggleButton, String> location;
	private JToggleButton locationButton;
	private String locationName;
	//these instance variables get used in findPossibleDestinations():
	//ArrayList<Pair<JToggleButton, String>> allSquares = BoardWindow.getAllSquares();
	//Pair<JToggleButton, String> currentSquare = super.getPieceLocation();
	//Color opponentColour;
	
	//constructor
	public Piece(Color tempPieceColour, String tempPieceType, Pair<JToggleButton, String> tempLocation) {
		pieceColour = tempPieceColour;
		pieceType = tempPieceType;
		location = tempLocation;
		locationButton = location.first;
		locationName = location.second;
		placePiece(pieceColour, pieceType, location);
	}
	
	
	/**
	 * Gets called by findPossibleDestinations(). Helps find the possible destinations for pieces that
	 * have a range greater than one and so require a loop (aka bishops, rooks and queens).
	 * @param possibleDestinations
	 * @param allSquares
	 * @param currentSquare
	 * @param opponentColour
	 * @param nextSquareCalculation
	 * @return
	 */
	public ArrayList<Pair<JToggleButton, String>> findPossibleDestinationsLoop(
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
				//int column = (int) Math.ceil(allSquares.indexOf(currentSquare) % 8);
				int column = (int) Math.ceil((allSquares.indexOf(currentSquare)) % 8);
				//these variables check if the pieces is headed for a square that requires *wrap-around* on the board
				boolean is_headed_left = nextSquareCalculation == -9 || nextSquareCalculation == -1 || (nextSquareCalculation == 7);
				boolean is_headed_right = nextSquareCalculation == -7 || nextSquareCalculation == 1 || (nextSquareCalculation == 9); 
				//if the piece is not headed out-of-bounds, continue looking for destinations
				//if we are NOT on the 1st col headed left, or the 8th col headed right, then 
				//  we are not headed out-of-bounds, so continue looking for destinations
				//System.out.println(allSquares.indexOf(currentSquare) + "\t" + column + "\t" + is_headed_left + "\t" + is_headed_right);
				if(!((column == 0 && (is_headed_left)) || (column == 7 && is_headed_right)))
				{
					Pair<JToggleButton, String> nextSquare = allSquares.get(allSquares.indexOf(currentSquare)+nextSquareCalculation);
					//System.out.println(allSquares.indexOf(currentSquare) + "\t" + allSquares.indexOf(nextSquare));
					if(nextSquare.first.getForeground() == opponentColour)
					{
						possibleDestinations.add(nextSquare);
						//System.out.println("ADDED1:" + nextSquare.second);
						//the piece won't be able to go to any square beyond this one because 
						//  would have to take the piece on this square, which ends the turn
						break;
					}
					if(nextSquare.first.getText().isEmpty())
					{
						possibleDestinations.add(nextSquare);
						//System.out.println("ADDED2:" + nextSquare.second);
						currentSquare = nextSquare; 
					}
					//if the square isn't empty or has an opponent piece, then it must have a same-colour piece,
					//  so break the loop just as we do for the opposite-colour case.
					else
					{
						break;
					}
				}
			}
			catch (IndexOutOfBoundsException e){
				break;
			}
		}
		return possibleDestinations;
	}
	
	
	/**
	 * Given a square a piece might be able to move to, checks if that square is a valid destination.
	 * If so, the square is added to possibleDestinations. Returns possibleDestinations.
	 * Used for the following pieces: pawn, knight, king
	 * @param possibleDestinations
	 * @param allSquares
	 * @param currentSquare
	 * @param opponentColour
	 * @param destinationSquare
	 * @return possibleDestinations
	 */
	public ArrayList<Pair<JToggleButton, String>> testNewDestinationSquare(
			ArrayList<Pair<JToggleButton, String>> possibleDestinations, 
			ArrayList<Pair<JToggleButton, String>> allSquares, Pair<JToggleButton, String> currentSquare, 
			Color opponentColour, int destinationSquareCalculation)
	{
		//[1] surround in a try-catch block for the case the piece is on the edge of the board
		//[2] put each possible destination in a seperate try-catch block because 
		//  if one position is out of bounds, we don't want to skip every single position
		try 
		{   
			//first calculate the possible destination
			Pair<JToggleButton, String> destinationSquare = allSquares.get(allSquares.indexOf(currentSquare)+destinationSquareCalculation);
			//now find out if that space is a valid destination - it is either empty or has an opponent piece on it
			if(!(this instanceof Pawn))
			{
				if(destinationSquare.first.getText().isEmpty() || destinationSquare.first.getForeground() == opponentColour){
					possibleDestinations.add(destinationSquare);
				}
			}
			else //if the piece is a pawn, then it can only move into an opponent's square if it is moving diagonally
			{
				boolean is_moving_forward = (destinationSquareCalculation == BoardWindow.SQUARE_TOP_CALCULATION 
						|| destinationSquareCalculation == BoardWindow.SQUARE_BOTTOM_CALCULATION);
				boolean is_moving_diagonally = (destinationSquareCalculation != BoardWindow.SQUARE_TOP_CALCULATION 
						&& destinationSquareCalculation != BoardWindow.SQUARE_BOTTOM_CALCULATION);
				if(destinationSquare.first.getText().isEmpty() && is_moving_forward
						|| destinationSquare.first.getForeground() == opponentColour && is_moving_diagonally){
					possibleDestinations.add(destinationSquare);
				}
			}
			
			
		}
		catch (IndexOutOfBoundsException e){
		}
		return possibleDestinations;
	}
	
	
	/**
	 * Places the piece
	 * @param colour: white or black
	 * @param pieceType: pawn, knight etc
	 * @param square: a2, f5 etc
	 */
	public void placePiece(Color pieceColour, String pieceType, Pair<JToggleButton, String> location)
	{
		BoardWindow.setSquareText(locationButton, pieceType, pieceColour);
	}
	
	
	public Color getPieceColour()
		{return pieceColour;}
	public String getPieceType()
		{return pieceType;}
	public Pair<JToggleButton, String> getPieceLocation()
	{return location;}
	
	
	
}
