package main;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.JToggleButton;

public class GameEnvironment
{
	private static ArrayList<Piece> whitePieces = new ArrayList<Piece>();
	private static ArrayList<Piece> blackPieces = new ArrayList<Piece>();
	private static String currentPlayer;
	private static boolean gameOver;
	
	
	public static void openBoardWindow() {
		@SuppressWarnings("unused")
		BoardWindow boardWindow = new BoardWindow();
	}

	
	////////
	
	
	public static String playGame(String humanPlayer) 
	{
		//the human plays white, so they start first
		currentPlayer = humanPlayer;
		while(gameOver() == false)
		{
			System.out.println(currentPlayer);
			playOneTurn(currentPlayer, humanPlayer); //pass in humanPlayer for if they are the current player
			currentPlayer = switchPlayers(currentPlayer);
			
		}
			
			
		String outcome = ""; //TODO
		return outcome;
	}
	
	
	public static boolean gameOver()
	{
		return gameOver;
	}
	
	
	public static void playOneTurn(String currentPlayer, String humanPlayer)
	{
		if (currentPlayer == humanPlayer)
		{
			makeHumanMove();
		}
		else
		{
			makeComputerMove();
		}
	}
	
	
	public static String switchPlayers(String currentPlayer)
	{
		if (currentPlayer == "white")
			{return "black";}
		return "white";
	}
	
	public static void makeHumanMove()
	{
		
	}
	
	
	public static void makeComputerMove()
	{
		ArrayList<Pair<JToggleButton, ArrayList<JToggleButton>>> validSquares = findValidSquares();
		
//		//
//		System.out.println("COMPUTER: VALID MOVES:");
//		for(int i = 0; i < validSquares.size(); i++)
//		{
//			//print the source square
//			Pair<JToggleButton, ArrayList<JToggleButton>> tuple = validSquares.get(i);
//			System.out.println("Possible source:" + "\t" + BoardWindow.getAllSquares().indexOf(tuple.first));
//			
//			//print the list of possible destination squares from this source sqaure
//			System.out.println("Possible destination(s):");
//			if(tuple.second != null)
//			{
//				//System.out.println(tuple.second.size());
//				for(int j = 0; j < tuple.second.size(); j++)
//				{
//					int possibleDestination = BoardWindow.getAllSquares().indexOf(tuple.second.get(j));
//					System.out.println(possibleDestination);
//				}
//			}
//		}
//		//
		
		//choose one of the valid moves at random
		Random rand = new Random();
		int randSrcSquareAndDestList = rand.nextInt(validSquares.size());
		System.out.println("=================================");
		//System.out.println(randSrcSquareAndDestList);
		Pair<JToggleButton, ArrayList<JToggleButton>> chosenSrcSquareAndDestList = validSquares.get(randSrcSquareAndDestList);
		JToggleButton srcSquare = chosenSrcSquareAndDestList.first;
		System.out.println(BoardWindow.getAllSquares().indexOf(srcSquare)); //print src square's index
		System.out.println(chosenSrcSquareAndDestList.second.size());
		int randDstSquare = rand.nextInt(chosenSrcSquareAndDestList.second.size());
		JToggleButton dstSquare = chosenSrcSquareAndDestList.second.get(randDstSquare);
		System.out.println(BoardWindow.getAllSquares().indexOf(dstSquare)); //print sdstrc square's index
		
		//move the piece
		//	create an array list of all pieces
		//TODO: for the computer, we actually ONLY need blackPieces
		//	maybe leave this here tho in case we need to reuse this code?
		ArrayList<Piece> allPieces = new ArrayList<Piece>();
		Piece piece = null;
		for(int i=0; i < whitePieces.size(); i++)
		{
			piece = whitePieces.get(i);
			allPieces.add(piece);
			piece = blackPieces.get(i);
			allPieces.add(piece);
		}
		
		//	remove it from the source square
		piece = piece.findPiece(allPieces, srcSquare);
		System.out.println(piece.getPieceColour() + "\t" + srcSquare.getText());
		srcSquare.setText("");

		//	put it on the destination square
		System.out.println(piece.getPieceColour());
		System.out.println(piece.getPieceType());
		System.out.println(piece.getPieceLocation());
		piece.placePiece(piece.getPieceColour(), piece.getPieceType(), dstSquare);
		
		
		
		
		gameOver = true;
	}
	
	
	/**
	 * Calculates and returns all of the squares that the player could move a piece to.
	 * @return pieceDestinations: an ArrayList containing pairs of the location (a JToggleButton) 
	 * and the destinations (a further ArrayList of JToggleButtons)
	 */
	public static ArrayList<Pair<JToggleButton, ArrayList<JToggleButton>>> findValidSquares()
	{
		ArrayList<Pair<JToggleButton, ArrayList<JToggleButton>>> validSquares = new ArrayList<>();
		for(int i = 0; i < (blackPieces).size(); i++)
				{
					Piece pieceToCheck = blackPieces.get(i);
					JToggleButton pieceLocation = pieceToCheck.getPieceLocation();
					
					ArrayList<JToggleButton> pieceDestinations = null;
					//find out the type of the piece, then cast it as that type to find the possible destinatons
					if(pieceToCheck instanceof Pawn) // https://stackoverflow.com/a/106351/8042538
						{pieceDestinations = ((Pawn) pieceToCheck).findPossibleDestinations();}
					else if(pieceToCheck instanceof Knight)
						{pieceDestinations = ((Knight) pieceToCheck).findPossibleDestinations();}
					else if(pieceToCheck instanceof Bishop)
						{pieceDestinations = ((Bishop) pieceToCheck).findPossibleDestinations();}
					else if(pieceToCheck instanceof Rook)
						{pieceDestinations = ((Rook) pieceToCheck).findPossibleDestinations();}
					else if(pieceToCheck instanceof Queen)
						{pieceDestinations = ((Queen) pieceToCheck).findPossibleDestinations();}
					else if(pieceToCheck instanceof King)
						{pieceDestinations = ((King) pieceToCheck).findPossibleDestinations();}
					
					if(pieceDestinations.size() > 0) //pieceDestinations will be null if no destionations were found
					{
						Pair<JToggleButton, ArrayList<JToggleButton>> newTuple = new Pair<>(pieceLocation, pieceDestinations);
						validSquares.add(newTuple);
					}
				}
		return validSquares;
	}
	
	

	
	
	
	
	
	
	
	public static void main(String[] args)
	{	
		openBoardWindow();
		Pawn whitePawn1 = new Pawn(Color.orange, "p1.", BoardWindow.getA2());
		Pawn whitePawn2 = new Pawn(Color.orange, "p2.", BoardWindow.getB2());
		Pawn whitePawn3 = new Pawn(Color.orange, "p3.", BoardWindow.getC2());
		Pawn whitePawn4 = new Pawn(Color.orange, "p4.", BoardWindow.getD2());
		Pawn whitePawn5 = new Pawn(Color.orange, "p5.", BoardWindow.getE2());
		Pawn whitePawn6 = new Pawn(Color.orange, "p6.", BoardWindow.getF2());
		Pawn whitePawn7 = new Pawn(Color.orange, "p7.", BoardWindow.getG2());
		Pawn whitePawn8 = new Pawn(Color.orange, "p8.", BoardWindow.getH2());
		Knight whiteKnight1 = new Knight(Color.orange, "N1.", BoardWindow.getB1());
		Knight whiteKnight2 = new Knight(Color.orange, "N2.", BoardWindow.getG1());
		Bishop whiteBishop1 = new Bishop(Color.orange, "B1.", BoardWindow.getC1());
		Bishop whiteBishop2 = new Bishop(Color.orange, "B2.", BoardWindow.getF1());
		Rook whiteRook1 = new Rook(Color.orange, "R1.", BoardWindow.getA1());
		Rook whiteRook2 = new Rook(Color.orange, "R2.", BoardWindow.getH1());
		Queen whiteQueen = new Queen(Color.orange, "Q.", BoardWindow.getD1());
		King whiteKing = new King(Color.orange, "K.", BoardWindow.getE1());
		Collections.addAll(whitePieces, whitePawn1, whitePawn2, whitePawn3, whitePawn4, 
				whitePawn5, whitePawn6, whitePawn7, whitePawn8, whiteKnight1, whiteKnight2, 
				whiteBishop1, whiteBishop2, whiteRook1, whiteRook2, whiteQueen, whiteKing); //https://stackoverflow.com/a/43457156/8042538
		Pawn blackPawn1 = new Pawn(Color.red, "p1", BoardWindow.getA7());
		Pawn blackPawn2 = new Pawn(Color.red, "p2", BoardWindow.getB7());
		Pawn blackPawn3 = new Pawn(Color.red, "p3", BoardWindow.getC7());
		Pawn blackPawn4 = new Pawn(Color.red, "p4", BoardWindow.getD7());
		Pawn blackPawn5 = new Pawn(Color.red, "p5", BoardWindow.getE7());
		Pawn blackPawn6 = new Pawn(Color.red, "p6", BoardWindow.getF7());
		Pawn blackPawn7 = new Pawn(Color.red, "p7", BoardWindow.getG7());
		Pawn blackPawn8 = new Pawn(Color.red, "p8", BoardWindow.getH7());
		Knight blackKnight1 = new Knight(Color.red, "N1", BoardWindow.getB8());
		Knight blackKnight2 = new Knight(Color.red, "N2", BoardWindow.getG8());
		Bishop blackBishop1 = new Bishop(Color.red, "B1", BoardWindow.getC8());
		Bishop blackBishop2 = new Bishop(Color.red, "B2", BoardWindow.getF8());
		Rook blackRook1 = new Rook(Color.red, "R1", BoardWindow.getA8());
		Rook blackRook2 = new Rook(Color.red, "R2", BoardWindow.getH8());
		Queen blackQueen = new Queen(Color.red, "Q", BoardWindow.getD8());
		King blackKing = new King(Color.red, "K", BoardWindow.getE8());
		Collections.addAll(blackPieces, blackPawn1, blackPawn2, blackPawn3, blackPawn4, 
				blackPawn5, blackPawn6, blackPawn7, blackPawn8, blackKnight1, blackKnight2, 
				blackBishop1, blackBishop2, blackRook1, blackRook2, blackQueen, blackKing);
		
		//play the game and get the outcome (win, lose, draw, stalemate)
		String humanPlayer = "white";
		String outcome = playGame(humanPlayer);
		System.out.println(outcome);
		
		
	}
}
