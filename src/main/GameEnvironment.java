package main;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JToggleButton;

public class GameEnvironment
{
	private static ArrayList<Piece> whitePieces = new ArrayList<Piece>();
	private static ArrayList<Piece> blackPieces = new ArrayList<Piece>();
	private static String currentPlayer;
	
	
	public static void openBoardWindow() {
		//@SuppressWarnings("unused")
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
		return false;
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
		
		
		System.out.println("COMPUTER: VALID MOVES:");
		//System.out.println(validSquares);
		
		for(int i = 0; i < validSquares.size(); i++)
		{
			//print the first item
			Pair<JToggleButton, ArrayList<JToggleButton>> pair = validSquares.get(i);
			System.out.println(pair.first.getText());
			//print the second item - which is a list
			for(int j = 0; j < pair.second.size(); j++)
			{
				JToggleButton square = pair.second.get(j);
				System.out.println(square.getText());
			}
		}
		
		
			
	}
	
	
	public static ArrayList<Pair<JToggleButton, ArrayList<JToggleButton>>> findValidSquares()
	{
		ArrayList<Pair<JToggleButton, ArrayList<JToggleButton>>> validSquares = new ArrayList<Pair<JToggleButton, ArrayList<JToggleButton>>>();
		for(int i = 0; i < (blackPieces).size(); i++)
				{
					Piece pieceToCheck = blackPieces.get(i);
					JToggleButton pieceLocation = pieceToCheck.getPieceLocation();
					
					ArrayList<JToggleButton> pieceDestinations = null;
					//find out the type of the piece, then cast it as that type to find the possible destinatons
					if(pieceToCheck instanceof Pawn) // https://stackoverflow.com/a/106351/8042538
						{pieceDestinations = ((Pawn) pieceToCheck).findPossibleDestinations();}
//					else if(pieceToCheck instanceof Knight)
//						{pieceDestinations = ((Knight) pieceToCheck).findPossibleDestinations();}
//					else if(pieceToCheck instanceof Bishop)
//						{pieceDestinations = ((Bishop) pieceToCheck).findPossibleDestinations();}
//					else if(pieceToCheck instanceof Rook)
//						{pieceDestinations = ((Rook) pieceToCheck).findPossibleDestinations();}
//					else if(pieceToCheck instanceof Queen)
//						{pieceDestinations = ((Queen) pieceToCheck).findPossibleDestinations();}
//					else if(pieceToCheck instanceof King)
//						{pieceDestinations = ((King) pieceToCheck).findPossibleDestinations();}
					
					//one entry in validSqaures = (pieceLocation, [<pieceDestions>]).
					
					Pair<JToggleButton, ArrayList<JToggleButton>> newTuple = new Pair<JToggleButton, ArrayList<JToggleButton>>(pieceLocation, pieceDestinations);
					newTuple.first = pieceLocation;
					newTuple.second = pieceDestinations;
					validSquares.add(newTuple);
				}
			
			
			
			
			
			
			
		return validSquares;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		openBoardWindow();
		Pawn whitePawn1 = new Pawn(Color.orange, "p", 1, BoardWindow.getA2());
		Pawn whitePawn2 = new Pawn(Color.orange, "p", 2, BoardWindow.getB2());
		Pawn whitePawn3 = new Pawn(Color.orange, "p", 3, BoardWindow.getC2());
		Pawn whitePawn4 = new Pawn(Color.orange, "p", 4, BoardWindow.getD2());
		Pawn whitePawn5 = new Pawn(Color.orange, "p", 5, BoardWindow.getE2());
		Pawn whitePawn6 = new Pawn(Color.orange, "p", 6, BoardWindow.getF2());
		Pawn whitePawn7 = new Pawn(Color.orange, "p", 7, BoardWindow.getG2());
		Pawn whitePawn8 = new Pawn(Color.orange, "p", 8, BoardWindow.getH2());
		Knight whiteKnight1 = new Knight(Color.orange, "N", 1, BoardWindow.getB1());
		Knight whiteKnight2 = new Knight(Color.orange, "N", 2, BoardWindow.getG1());
		Bishop whiteBishop1 = new Bishop(Color.orange, "B", 1, BoardWindow.getC1());
		Bishop whiteBishop2 = new Bishop(Color.orange, "B", 2, BoardWindow.getF1());
		Rook whiteRook1 = new Rook(Color.orange, "R", 1, BoardWindow.getA1());
		Rook whiteRook2 = new Rook(Color.orange, "R", 2, BoardWindow.getH1());
		Queen whiteQueen = new Queen(Color.orange, "Q", 1, BoardWindow.getD1());
		King whiteKing = new King(Color.orange, "K", 1, BoardWindow.getE1());
		Collections.addAll(whitePieces, whitePawn1, whitePawn2, whitePawn3, whitePawn4, 
				whitePawn5, whitePawn6, whitePawn7, whitePawn8, whiteKnight1, whiteKnight2, 
				whiteBishop1, whiteBishop2, whiteRook1, whiteRook2, whiteQueen, whiteKing); //https://stackoverflow.com/a/43457156/8042538
		Pawn blackPawn1 = new Pawn(Color.red, "p", 1, BoardWindow.getA7());
		Pawn blackPawn2 = new Pawn(Color.red, "p", 2, BoardWindow.getB7());
		Pawn blackPawn3 = new Pawn(Color.red, "p", 3, BoardWindow.getC7());
		Pawn blackPawn4 = new Pawn(Color.red, "p", 4, BoardWindow.getD7());
		Pawn blackPawn5 = new Pawn(Color.red, "p", 5, BoardWindow.getE7());
		Pawn blackPawn6 = new Pawn(Color.red, "p", 6, BoardWindow.getF7());
		Pawn blackPawn7 = new Pawn(Color.red, "p", 7, BoardWindow.getG7());
		Pawn blackPawn8 = new Pawn(Color.red, "p", 8, BoardWindow.getH7());
		Knight blackKnight1 = new Knight(Color.red, "N", 1, BoardWindow.getB8());
		Knight blackKnight2 = new Knight(Color.red, "N", 2, BoardWindow.getG8());
		Bishop blackBishop1 = new Bishop(Color.red, "B", 1, BoardWindow.getC8());
		Bishop blackBishop2 = new Bishop(Color.red, "B", 2, BoardWindow.getF8());
		Rook blackRook1 = new Rook(Color.red, "R", 1, BoardWindow.getA8());
		Rook blackRook2 = new Rook(Color.red, "R", 2, BoardWindow.getH8());
		Queen blackQueen = new Queen(Color.red, "Q", 1, BoardWindow.getD8());
		King blackKing = new King(Color.red, "K", 1, BoardWindow.getE8());
		//Collections.addAll(blackPieces, blackPawn1, blackPawn2, blackPawn3, blackPawn4, 
		//		blackPawn5, blackPawn6, blackPawn7, blackPawn8, blackKnight1, blackKnight2, 
		//		blackBishop1, blackBishop2, blackRook1, blackRook2, blackQueen, blackKing);
		Collections.addAll(blackPieces, blackPawn1);
		
		//play the game and get the outcome (win, lose, draw, or stalemate)
		String humanPlayer = "white";
		String outcome = playGame(humanPlayer);
		System.out.println(outcome);
		
		
	}
}
