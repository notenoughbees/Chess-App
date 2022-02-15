package main;

import java.awt.Color;
import java.util.ArrayList;

public class GameEnvironment
{
	static String currentPlayer;
	
	
	public static void openBoardWindow() {
		@SuppressWarnings("unused")
		BoardWindow boardWindow = new BoardWindow();
	}

	
	////////
	
	
	public static String playGame(String humanPlayer) 
	{
		if (humanPlayer == "white")
			{currentPlayer = humanPlayer;}
		else
			{currentPlayer = "";}
		while(gameOver() == false)
		{
			playOneTurn(currentPlayer, humanPlayer); //pass in humanPlayer for if they are the current player
			currentPlayer = switchPlayers(currentPlayer);
			
		}
			
			
		String outcome = "";
		return outcome;
	}
	
	
	public static boolean gameOver()
	{
		return true;
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
		ArrayList<String> empty_squares = findEmptySquares();
		
	}
	
	
	public static ArrayList<String> findEmptySquares()
	{
		ArrayList<String> emptySquares = new ArrayList<String>();
		//for(row in )
			
			
			
			
			
			
			
		return emptySquares;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@SuppressWarnings("unused")
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
		
		//play the game and get the outcome (win, lose, draw, or stalemate)
		String humanPlayer = "white";
		String outcome = playGame(humanPlayer);
		System.out.println(outcome);
		
		
	}
}
