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
		ArrayList<Pair<JToggleButton, ArrayList<JToggleButton>>> validSquares = findValidSquares();
		
		//
		System.out.println("COMPUTER: VALID MOVES:");
		for(int i = 0; i < validSquares.size(); i++)
		{
			//print the source square
			Pair<JToggleButton, ArrayList<JToggleButton>> tuple = validSquares.get(i);
			System.out.println("Possible source:" + "\t" + BoardWindow.getAllSquares().indexOf(tuple.first));
			
			//print the list of possible destination squares from this source sqaure
			System.out.println("Possible destination(s):");
			if(tuple.second != null)
			{
				//System.out.println(tuple.second.size());
				for(int j = 0; j < tuple.second.size(); j++)
				{
					int possibleDestination = BoardWindow.getAllSquares().indexOf(tuple.second.get(j));
					System.out.println(possibleDestination);
				}
			}
		}
		//
		
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
		String pieceType = srcSquare.getText();
		srcSquare.setText("");
		dstSquare.setText(pieceType);
		
		
		
		
		int endProgram = 0 / 0;
		System.exit(0);	
	}
	
	/**
	 * Calculates and returns all of the squares that the player could move a piece to.
	 * @return
	 */
	public static ArrayList<Pair<JToggleButton, ArrayList<JToggleButton>>> findValidSquares()
	{
		ArrayList<Pair<JToggleButton, ArrayList<JToggleButton>>> validSquares = new ArrayList<>();
		/*
		 * Explanation of validSquares' datatype:
		 * ArrayList<Pair<...>>: the list of valid squares contains a pair of the starting square and a list of the possible ending squares
		 * ...Pair<String, ArrayList<>>... - this is that pair
		 * ArrayList<JToggleButton> - this is the mentioned list of the possible squares. 
		 *   This list contains both the button for that square, and the name of that square, for easy reference,
		 */
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
					//TODO: uncomment when ready
					else if(pieceToCheck instanceof Rook)
						{pieceDestinations = ((Rook) pieceToCheck).findPossibleDestinations();}
					else if(pieceToCheck instanceof Queen)
						{pieceDestinations = ((Queen) pieceToCheck).findPossibleDestinations();}
					else if(pieceToCheck instanceof King)
						{pieceDestinations = ((King) pieceToCheck).findPossibleDestinations();}
					
					Pair<JToggleButton, ArrayList<JToggleButton>> newTuple = new Pair<>(pieceLocation, pieceDestinations);
					newTuple.first = pieceLocation;
					newTuple.second = pieceDestinations;
					
					//System.out.println(pieceLocation);
					//for(int j = 0; j < pieceDestinations.size(); j++)
					//{
					//	JToggleButton possibleDestination = pieceDestinations.get(j);
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
		Pawn whitePawn1 = new Pawn(Color.orange, "p", BoardWindow.getA2());
		Pawn whitePawn2 = new Pawn(Color.orange, "p", BoardWindow.getB2());
		Pawn whitePawn3 = new Pawn(Color.orange, "p", BoardWindow.getC2());
		Pawn whitePawn4 = new Pawn(Color.orange, "p", BoardWindow.getD2());
		Pawn whitePawn5 = new Pawn(Color.orange, "p", BoardWindow.getE2());
		Pawn whitePawn6 = new Pawn(Color.orange, "p", BoardWindow.getF2());
		Pawn whitePawn7 = new Pawn(Color.orange, "p", BoardWindow.getG2());
		Pawn whitePawn8 = new Pawn(Color.orange, "p", BoardWindow.getH2());
		Knight whiteKnight1 = new Knight(Color.orange, "N", BoardWindow.getB1());
		Knight whiteKnight2 = new Knight(Color.orange, "N", BoardWindow.getG1());
		Bishop whiteBishop1 = new Bishop(Color.orange, "B", BoardWindow.getC1());
		Bishop whiteBishop2 = new Bishop(Color.orange, "B", BoardWindow.getF1());
		Rook whiteRook1 = new Rook(Color.orange, "R", BoardWindow.getA1());
		Rook whiteRook2 = new Rook(Color.orange, "R", BoardWindow.getH1());
		Queen whiteQueen = new Queen(Color.orange, "Q", BoardWindow.getD1());
		King whiteKing = new King(Color.orange, "K", BoardWindow.getE1());
		Collections.addAll(whitePieces, whitePawn1, whitePawn2, whitePawn3, whitePawn4, 
				whitePawn5, whitePawn6, whitePawn7, whitePawn8, whiteKnight1, whiteKnight2, 
				whiteBishop1, whiteBishop2, whiteRook1, whiteRook2, whiteQueen, whiteKing); //https://stackoverflow.com/a/43457156/8042538
		Pawn blackPawn1 = new Pawn(Color.red, "p", BoardWindow.getA7());
		Pawn blackPawn2 = new Pawn(Color.red, "p", BoardWindow.getB7());
		Pawn blackPawn3 = new Pawn(Color.red, "p", BoardWindow.getC7());
		Pawn blackPawn4 = new Pawn(Color.red, "p", BoardWindow.getD7());
		Pawn blackPawn5 = new Pawn(Color.red, "p", BoardWindow.getE7());
		Pawn blackPawn6 = new Pawn(Color.red, "p", BoardWindow.getF7());
		Pawn blackPawn7 = new Pawn(Color.red, "p", BoardWindow.getG7());
		Pawn blackPawn8 = new Pawn(Color.red, "p", BoardWindow.getH7());
		Knight blackKnight1 = new Knight(Color.red, "N", BoardWindow.getB8());
		Knight blackKnight2 = new Knight(Color.red, "N", BoardWindow.getG8());
		Bishop blackBishop1 = new Bishop(Color.red, "B", BoardWindow.getC8());
		Bishop blackBishop2 = new Bishop(Color.red, "B", BoardWindow.getF8());
		Rook blackRook1 = new Rook(Color.red, "R", BoardWindow.getA8());
		Rook blackRook2 = new Rook(Color.red, "R", BoardWindow.getH8());
		Queen blackQueen = new Queen(Color.red, "Q", BoardWindow.getD8());
		King blackKing = new King(Color.red, "K", BoardWindow.getE8());
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
