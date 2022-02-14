package main;

import java.awt.Color;

import javax.swing.JToggleButton;

public class Pawn {
	//initialise
	private Color pieceColour;
	private String pieceType;
	private Integer pieceNumber;
	private JToggleButton square;
	
	//constructor
	public Pawn(Color tempPieceColour, String tempPieceType, Integer tempPieceNumber, JToggleButton tempSquare) {
		pieceColour = tempPieceColour;
		pieceType = tempPieceType;
		pieceNumber = tempPieceNumber;
		square = tempSquare;
		Setup.placePiece(pieceColour, pieceType, pieceNumber, square);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
