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
		//String squareName = col + row;
		//JToggleButton btn = getButtonFromText(squareName);
		//BoardWindow.setSquareText(squareName);
		//BoardWindow.btn.setText(pieceType);
		
		BoardWindow.setSquareText(square, "p", pieceColour);
	}

	
	
	
	
	
	//public static JToggleButton getButtonFromText(String squareName)
	//{
	//	BoardWindow.
	//}
	
	
	
	
	public static void openBoardWindow() {
		@SuppressWarnings("unused")
		BoardWindow boardWindow = new BoardWindow();
	}

	public static void main(String[] args)
	{
		openBoardWindow();
		Pawn whitePawn1 = new Pawn(Color.white, "pawn", 1, BoardWindow.getA2());
		Pawn whitePawn2 = new Pawn(Color.white, "pawn", 2, BoardWindow.getB2());
		Pawn whitePawn3 = new Pawn(Color.white, "pawn", 3, BoardWindow.getC2());
		Pawn whitePawn4 = new Pawn(Color.white, "pawn", 4, BoardWindow.getD2());
		Pawn whitePawn5 = new Pawn(Color.white, "pawn", 5, BoardWindow.getE2());
		Pawn whitePawn6 = new Pawn(Color.white, "pawn", 6, BoardWindow.getF2());
		Pawn whitePawn7 = new Pawn(Color.white, "pawn", 7, BoardWindow.getG2());
		Pawn whitePawn8 = new Pawn(Color.white, "pawn", 8, BoardWindow.getH2());
		
		
		
		
		
	}
}
