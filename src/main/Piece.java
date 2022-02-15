package main;

import java.awt.Color;
import javax.swing.JToggleButton;

public class Piece {
	//initialise
	private Color pieceColour;
	private String pieceType;
	private Integer pieceNumber;
	private JToggleButton square;
	
	//constructor
	public Piece(Color tempPieceColour, String tempPieceType, Integer tempPieceNumber, JToggleButton tempSquare) {
		pieceColour = tempPieceColour;
		pieceType = tempPieceType;
		pieceNumber = tempPieceNumber;
		square = tempSquare;
		placePiece(pieceColour, pieceType, pieceNumber, square);
	}
	
	
	
	
	
	
	/**
	 * Places the piece
	 * @param colour: white or black
	 * @param pieceType: pawn, knight etc
	 * @param square: a2, f5 etc
	 */
	public void placePiece(Color pieceColour, String pieceType, Integer pieceNumber, JToggleButton square)
	{
		BoardWindow.setSquareText(square, pieceType, pieceColour);
	}

	
}
