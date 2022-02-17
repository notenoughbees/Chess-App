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
