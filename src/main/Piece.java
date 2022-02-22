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
	 * Given a square a piece might be able to move to, checks if that square is a valid destination.
	 * If so, the square is added to possibleDestinations. Returns possibleDestinations.
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
			if(destinationSquare.first.getText().isEmpty() || destinationSquare.first.getForeground() == opponentColour){
				possibleDestinations.add(destinationSquare);}
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
	/**
	 * Returns the location of the piece - the square the piece is currently on, as a JToggleButton.
	 * @return
	 */
	public JToggleButton getPieceLocationButton()
		{return locationButton;}
	
	public String getPieceLocationName()
		{return locationName;}
	
	
	
}
