package main;

import java.awt.Color;

import javax.swing.JToggleButton;

public class Setup
{
	/**
	 * Places the piece
	 * @param colour: white or black
	 * @param pieceType: pawn, knight etc
	 * @param square: a2, f5 etc
	 */
	public static void placePiece(Color pieceColour, String pieceType, Integer pieceNumber, JToggleButton square)
	{
		BoardWindow.setSquareText(square, pieceType, pieceColour);
	}

	
	
	
	
	
	
	public static void openBoardWindow() {
		@SuppressWarnings("unused")
		BoardWindow boardWindow = new BoardWindow();
	}

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		openBoardWindow();
		Pawn whitePawn1 = new Pawn(Color.white, "p", 1, BoardWindow.getA2());
		Pawn whitePawn2 = new Pawn(Color.white, "p", 2, BoardWindow.getB2());
		Pawn whitePawn3 = new Pawn(Color.white, "p", 3, BoardWindow.getC2());
		Pawn whitePawn4 = new Pawn(Color.white, "p", 4, BoardWindow.getD2());
		Pawn whitePawn5 = new Pawn(Color.white, "p", 5, BoardWindow.getE2());
		Pawn whitePawn6 = new Pawn(Color.white, "p", 6, BoardWindow.getF2());
		Pawn whitePawn7 = new Pawn(Color.white, "p", 7, BoardWindow.getG2());
		Pawn whitePawn8 = new Pawn(Color.white, "p", 8, BoardWindow.getH2());
		//Knight whiteKnight1 = new Knight(Color.white, "N", 1, BoardWindow.getB1());
		//Knight whiteKnight2 = new Knight(Color.white, "N", 2, BoardWindow.getG1());
		//Bishop whiteBishop1 = new Bishop(Color.white, "B", 1, BoardWindow.getC1());
		//Bishop whiteBishop2 = new Bishop(Color.white, "B", 2, BoardWindow.getF1());
		//Rook whiteRook1 = new Rook(Color.white, "R", 1, BoardWindow.getA1());
		//Rook whiteRook2 = new Rook(Color.white, "R", 2, BoardWindow.getH1());
		//Queen whiteQueen = new Queen(Color.white, "Q", 1, BoardWindow.getD1());
		//King whiteKing = new King(Color.white, "K", 1, BoardWindow.getE1());
		Pawn blackPawn1 = new Pawn(Color.black, "p", 1, BoardWindow.getA7());
		Pawn blackPawn2 = new Pawn(Color.black, "p", 2, BoardWindow.getB7());
		Pawn blackPawn3 = new Pawn(Color.black, "p", 3, BoardWindow.getC7());
		Pawn blackPawn4 = new Pawn(Color.black, "p", 4, BoardWindow.getD7());
		Pawn blackPawn5 = new Pawn(Color.black, "p", 5, BoardWindow.getE7());
		Pawn blackPawn6 = new Pawn(Color.black, "p", 6, BoardWindow.getF7());
		Pawn blackPawn7 = new Pawn(Color.black, "p", 7, BoardWindow.getG7());
		Pawn blackPawn8 = new Pawn(Color.black, "p", 8, BoardWindow.getH7());
		//Knight blackKnight1 = new Knight(Color.black, "N", 1, BoardWindow.getB8());
		//Knight blackKnight2 = new Knight(Color.black, "N", 2, BoardWindow.getG8());
		//Bishop blackBishop1 = new Bishop(Color.black, "B", 1, BoardWindow.getC8());
		//Bishop blackBishop2 = new Bishop(Color.black, "B", 2, BoardWindow.getF8());
		//Rook blackRook1 = new Rook(Color.black, "R", 1, BoardWindow.getA8());
		//Rook blackRook2 = new Rook(Color.black, "R", 2, BoardWindow.getH8());
		//Queen blackQueen = new Queen(Color.black, "Q", 1, BoardWindow.getD8());
		//King blackKing = new King(Color.black, "K", 1, BoardWindow.getE8());
		
		
		
		
	}
}
