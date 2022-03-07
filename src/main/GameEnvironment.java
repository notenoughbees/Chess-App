package main;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.JToggleButton;

public class GameEnvironment
{
	private static ArrayList<Piece> whitePieces = new ArrayList<Piece>();
	private static ArrayList<Piece> blackPieces = new ArrayList<Piece>();
	private static String currentPlayer;
	
	
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
		ArrayList<Pair<Pair<JToggleButton, String>, ArrayList<Pair<JToggleButton, String>>>> validSquares = findValidSquares();
		
		//
		System.out.println("COMPUTER: VALID MOVES:");
		for(int i = 0; i < validSquares.size(); i++)
		{
			//print the source square
			Pair<Pair<JToggleButton, String>, ArrayList<Pair<JToggleButton, String>>> tuple = validSquares.get(i);
			System.out.println("Possible source:" + "\t" + tuple.first);
			
			//print the list of possible destination squares from this source sqaure
			System.out.println("Possible destination(s):");
			if(tuple.second != null)
			{
				//System.out.println(tuple.second.size());
				for(int j = 0; j < tuple.second.size(); j++)
				{
					Pair<JToggleButton, String> possibleDestination = tuple.second.get(j);
					System.out.println(possibleDestination.second);
				}
			}
		}
		//
		
		//choose one of the valid moves at random
		Random rand = new Random();
		int randSrcSquareAndDestList = rand.nextInt(validSquares.size());
		Pair<Pair<JToggleButton, String>, ArrayList<Pair<JToggleButton, String>>> chosenSrcSquareAndDestList = validSquares.get(randSrcSquareAndDestList);
		Pair<JToggleButton, String> srcSquare = chosenSrcSquareAndDestList.first;
		System.out.println(chosenSrcSquareAndDestList.second.size());
		int randDstSquare = rand.nextInt(chosenSrcSquareAndDestList.second.size());
		Pair<JToggleButton, String> dstSquare = chosenSrcSquareAndDestList.second.get(randDstSquare);
		
		//move the piece
		String pieceType = srcSquare.first.getText();
		srcSquare.first.setText("");
		dstSquare.first.setText(pieceType);
		
		
		
		
		int endProgram = 0 / 0;
		System.exit(0);	
	}
	
	/**
	 * Calculates and returns all of the squares that the player could move a piece to.
	 * @return
	 */
	public static ArrayList<Pair<Pair<JToggleButton, String>, ArrayList<Pair<JToggleButton, String>>>> findValidSquares()
	{
		ArrayList<Pair<Pair<JToggleButton, String>, ArrayList<Pair<JToggleButton, String>>>> validSquares = new ArrayList<>();
		/*
		 * Explanation of validSquares' datatype:
		 * ArrayList<Pair<...>>: the list of valid squares contains a pair of the starting square and a list of the possible ending squares
		 * ...Pair<String, ArrayList<>>... - this is that pair
		 * ArrayList<Pair<JToggleButton, String>> - this is the mentioned list of the possible squares. 
		 *   This list contains both the button for that square, and the name of that square, for easy reference,
		 */
		for(int i = 0; i < (blackPieces).size(); i++)
				{
					Piece pieceToCheck = blackPieces.get(i);
					Pair<JToggleButton, String> pieceLocation = pieceToCheck.getPieceLocation();
					
					ArrayList<Pair<JToggleButton, String>> pieceDestinations = null;
					//find out the type of the piece, then cast it as that type to find the possible destinatons
					if(pieceToCheck instanceof Pawn) // https://stackoverflow.com/a/106351/8042538
						{pieceDestinations = ((Pawn) pieceToCheck).findPossibleDestinations();}
					else if(pieceToCheck instanceof Knight)
						{pieceDestinations = ((Knight) pieceToCheck).findPossibleDestinations();}
					else if(pieceToCheck instanceof Bishop)
						{pieceDestinations = ((Bishop) pieceToCheck).findPossibleDestinations();}
					//TODO: uncomment when ready
					else if(pieceToCheck instanceof Rook)
						{pieceDestinations = ((Rook) pieceToCheck).findPossibleDestinations();}
					else if(pieceToCheck instanceof Queen)
						{pieceDestinations = ((Queen) pieceToCheck).findPossibleDestinations();}
					else if(pieceToCheck instanceof King)
						{pieceDestinations = ((King) pieceToCheck).findPossibleDestinations();}
					
					Pair<Pair<JToggleButton, String>, ArrayList<Pair<JToggleButton, String>>> newTuple = new Pair<>(pieceLocation, pieceDestinations);
					newTuple.first = pieceLocation;
					newTuple.second = pieceDestinations;
					
					//System.out.println(pieceLocation);
					//for(int j = 0; j < pieceDestinations.size(); j++)
					//{
					//	Pair<JToggleButton, String> possibleDestination = pieceDestinations.get(j);
					//	System.out.println(possibleDestination.second);
					//}
					
					validSquares.add(newTuple);
				}
			
				
		
			
		return validSquares;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
//		for(int i = 0; i < 64; i++)
//		{
//			System.out.println((int) i/8+1);
//		}
		
		openBoardWindow();
		Pawn whitePawn1 = new Pawn(Color.orange, "p", new Pair<JToggleButton, String>(BoardWindow.getA2(), "a2"));
		Pawn whitePawn2 = new Pawn(Color.orange, "p", new Pair<JToggleButton, String>(BoardWindow.getB2(), "b2"));
		Pawn whitePawn3 = new Pawn(Color.orange, "p", new Pair<JToggleButton, String>(BoardWindow.getC2(), "c2"));
		Pawn whitePawn4 = new Pawn(Color.orange, "p", new Pair<JToggleButton, String>(BoardWindow.getD2(), "d2"));
		Pawn whitePawn5 = new Pawn(Color.orange, "p", new Pair<JToggleButton, String>(BoardWindow.getE2(), "e2"));
		Pawn whitePawn6 = new Pawn(Color.orange, "p", new Pair<JToggleButton, String>(BoardWindow.getF2(), "f2"));
		Pawn whitePawn7 = new Pawn(Color.orange, "p", new Pair<JToggleButton, String>(BoardWindow.getG2(), "g2"));
		Pawn whitePawn8 = new Pawn(Color.orange, "p", new Pair<JToggleButton, String>(BoardWindow.getH2(), "h2"));
		Knight whiteKnight1 = new Knight(Color.orange, "N", new Pair<JToggleButton, String>(BoardWindow.getB1(), "b1"));
		Knight whiteKnight2 = new Knight(Color.orange, "N", new Pair<JToggleButton, String>(BoardWindow.getG1(), "g1"));
		Bishop whiteBishop1 = new Bishop(Color.orange, "B", new Pair<JToggleButton, String>(BoardWindow.getC1(), "c1"));
		Bishop whiteBishop2 = new Bishop(Color.orange, "B", new Pair<JToggleButton, String>(BoardWindow.getF1(), "f1"));
		Rook whiteRook1 = new Rook(Color.orange, "R", new Pair<JToggleButton, String>(BoardWindow.getA1(), "a1"));
		Rook whiteRook2 = new Rook(Color.orange, "R", new Pair<JToggleButton, String>(BoardWindow.getH1(), "h1"));
		Queen whiteQueen = new Queen(Color.orange, "Q", new Pair<JToggleButton, String>(BoardWindow.getD1(), "d1"));
		King whiteKing = new King(Color.orange, "K", new Pair<JToggleButton, String>(BoardWindow.getE1(), "e1"));
		Collections.addAll(whitePieces, whitePawn1, whitePawn2, whitePawn3, whitePawn4, 
				whitePawn5, whitePawn6, whitePawn7, whitePawn8, whiteKnight1, whiteKnight2, 
				whiteBishop1, whiteBishop2, whiteRook1, whiteRook2, whiteQueen, whiteKing); //https://stackoverflow.com/a/43457156/8042538
		Pawn blackPawn1 = new Pawn(Color.red, "p", new Pair<JToggleButton, String>(BoardWindow.getA7(), "a7"));
		Pawn blackPawn2 = new Pawn(Color.red, "p", new Pair<JToggleButton, String>(BoardWindow.getB7(), "b7"));
		Pawn blackPawn3 = new Pawn(Color.red, "p", new Pair<JToggleButton, String>(BoardWindow.getC7(), "c7"));
		Pawn blackPawn4 = new Pawn(Color.red, "p", new Pair<JToggleButton, String>(BoardWindow.getD7(), "d7"));
		Pawn blackPawn5 = new Pawn(Color.red, "p", new Pair<JToggleButton, String>(BoardWindow.getE7(), "e7"));
		Pawn blackPawn6 = new Pawn(Color.red, "p", new Pair<JToggleButton, String>(BoardWindow.getF7(), "f7"));
		Pawn blackPawn7 = new Pawn(Color.red, "p", new Pair<JToggleButton, String>(BoardWindow.getG7(), "g7"));
		Pawn blackPawn8 = new Pawn(Color.red, "p", new Pair<JToggleButton, String>(BoardWindow.getH7(), "h7"));
		Knight blackKnight1 = new Knight(Color.red, "N", new Pair<JToggleButton, String>(BoardWindow.getB8(), "b8"));
		Knight blackKnight2 = new Knight(Color.red, "N", new Pair<JToggleButton, String>(BoardWindow.getG8(), "g8"));
		Bishop blackBishop1 = new Bishop(Color.red, "B", new Pair<JToggleButton, String>(BoardWindow.getC8(), "c8"));
		Bishop blackBishop2 = new Bishop(Color.red, "B", new Pair<JToggleButton, String>(BoardWindow.getF8(), "f8"));
		Rook blackRook1 = new Rook(Color.red, "R", new Pair<JToggleButton, String>(BoardWindow.getA8(), "a8"));
		Rook blackRook2 = new Rook(Color.red, "R", new Pair<JToggleButton, String>(BoardWindow.getH8(), "h8"));
		Queen blackQueen = new Queen(Color.red, "Q", new Pair<JToggleButton, String>(BoardWindow.getD8(), "d8"));
		King blackKing = new King(Color.red, "K", new Pair<JToggleButton, String>(BoardWindow.getE8(), "e8"));
		//TODO
		Collections.addAll(blackPieces, blackPawn1, blackPawn2, blackPawn3, blackPawn4, 
				blackPawn5, blackPawn6, blackPawn7, blackPawn8, blackKnight1, blackKnight2, 
				blackBishop1, blackBishop2, blackRook1, blackRook2, blackQueen, blackKing);
		
		//play the game and get the outcome (win, lose, draw, stalemate)
		String humanPlayer = "white";
		String outcome = playGame(humanPlayer);
		System.out.println(outcome);
		
		
	}
}
