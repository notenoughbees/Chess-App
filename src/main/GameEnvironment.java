package main;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;

public class GameEnvironment
{
	public final static Color WHITE_COLOUR = Color.orange;
	public final static Color BLACK_COLOUR = Color.red;
	private static ArrayList<Piece> whitePieces = new ArrayList<Piece>();
	private static ArrayList<Piece> blackPieces = new ArrayList<Piece>();
	private static ArrayList<Piece> allPieces = new ArrayList<Piece>();
	private static String currentPlayer;
	private static boolean gameOver;
	
	
	/**
	 * Instantiates BoardWindow, which will show the chess board window.
	 */
	public static void openBoardWindow() {
		@SuppressWarnings("unused")
		BoardWindow boardWindow = new BoardWindow();
	}
	
	
	/**
	 * Start a loop of player turns (switching the player after every turn) until the game is over
	 */
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
	
	
	/**
	 * Checks if the game is over yet. 
	 * Runs prior to a turn, where the turn will only start if gameOver = false.
	 * @return
	 */
	public static boolean gameOver()
	{
		return gameOver;
	}
	
	
	/**
	 * Lets one turn happen, whether the player is the human or the computer.
	 * @param currentPlayer
	 * @param humanPlayer
	 */
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
	
	
	/**
	 * Changes the current player.
	 * @param currentPlayer
	 * @return
	 */
	public static String switchPlayers(String currentPlayer)
	{
		if (currentPlayer == "white")
			{return "black";}
		return "white";
	}
	
	
	/**
	 * Runs when it is the human player's turn.
	 */
	public static void makeHumanMove()
	{
		//ArrayList<JToggleButton> whitePieceButtons = selectWhitePieceButtons();
		toggleSelectWhitePieceButtons(true, false); //enable the buttons with white pieces on them
	}
	
	
	/**
	 * Runs when it is the computer player's turn.
	 */
	public static void makeComputerMove()
	{
		ArrayList<Pair<JToggleButton, ArrayList<JToggleButton>>> validSquares = findValidSquaresComputer();
		
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
		//(https://www.codegrepper.com/code-examples/java/how+to+select+a+random+element+from+an+array+in+java)
		Random rand = new Random();
		int randSrcSquareAndDestList = rand.nextInt(validSquares.size());
		System.out.println("=================================");
		Pair<JToggleButton, ArrayList<JToggleButton>> chosenSrcSquareAndDestList = validSquares.get(randSrcSquareAndDestList);
		JToggleButton srcSquare = chosenSrcSquareAndDestList.first;
		int randDstSquare = rand.nextInt(chosenSrcSquareAndDestList.second.size());
		JToggleButton dstSquare = chosenSrcSquareAndDestList.second.get(randDstSquare);
		
		Piece.movePiece(srcSquare, dstSquare);
		
		
		
		
		
		gameOver = true;
	}
	
	
	/**
	 * Calculates and returns all of the squares that the player could move a piece to.
	 * Runs for the computer player, where the computer player will later select one of these
	 * valid moves at random.
	 * @return pieceDestinations: an ArrayList containing pairs of the location (a JToggleButton) 
	 * and the destinations (an ArrayList of JToggleButtons)
	 */
	public static ArrayList<Pair<JToggleButton, ArrayList<JToggleButton>>> findValidSquaresComputer()
	{
		ArrayList<Pair<JToggleButton, ArrayList<JToggleButton>>> validSquares = new ArrayList<>();
		for(int i = 0; i < (blackPieces).size(); i++)
				{
					Piece pieceToCheck = blackPieces.get(i);
					//check the current piece
					validSquares = findValidSquaresHelper(validSquares, pieceToCheck);
				}
		return validSquares;
	}
	
	/**
	 * Calculates and returns all of the squares that the player could move a piece to.
	 * Runs for the computer player, where the computer player will later select one of these
	 * valid moves at random.
	 * @return pieceDestinations: an ArrayList containing pairs of the location (a JToggleButton) 
	 * and the destinations (an ArrayList of JToggleButtons)
	 */
	public static ArrayList<Pair<JToggleButton, ArrayList<JToggleButton>>> findValidSquaresHelper(
			ArrayList<Pair<JToggleButton, ArrayList<JToggleButton>>> validSquares, Piece pieceToCheck)
	{
		JToggleButton pieceLocation = pieceToCheck.getPieceLocation();
		ArrayList<JToggleButton> pieceDestinations = null;
		//find out the type of the piece, then cast it as that type to find the possible destinatons
		if(pieceToCheck instanceof Pawn) {
			pieceDestinations = ((Pawn) pieceToCheck).findPossibleDestinations();} // https://stackoverflow.com/a/106351/8042538
		else if(pieceToCheck instanceof Knight) {
			pieceDestinations = ((Knight) pieceToCheck).findPossibleDestinations();}
		else if(pieceToCheck instanceof Bishop) {
			pieceDestinations = ((Bishop) pieceToCheck).findPossibleDestinations();}
		else if(pieceToCheck instanceof Rook) {
			pieceDestinations = ((Rook) pieceToCheck).findPossibleDestinations();}
		else if(pieceToCheck instanceof Queen) {
			pieceDestinations = ((Queen) pieceToCheck).findPossibleDestinations();}
		else if(pieceToCheck instanceof King) {
			pieceDestinations = ((King) pieceToCheck).findPossibleDestinations();}
		
		if(pieceDestinations.size() > 0) //pieceDestinations will be null if no destinations were found
		{
			Pair<JToggleButton, ArrayList<JToggleButton>> newTuple = new Pair<>(pieceLocation, pieceDestinations);
			validSquares.add(newTuple);
		}
		return validSquares;
	}
	
	
	/**
	 * Selects all of the squares on the board that have a white piece on them.
	 * Runs for the human player, who plays white.
	 */
	public static void toggleSelectWhitePieceButtons(boolean bool1, boolean bool2)
	{
		/*
		 * make a button group to hold the white piece buttons. When one of these buttons is selected,
		 * this will automatically amke the others in the group deselect.
		 */
		ButtonGroup whitePieceButtons = new ButtonGroup();
		
		//iterate the board and enable the buttons with white pieces on them, while disabling all other buttons
		for(int i = 0; i < BoardWindow.getAllSquares().size(); i++)
		{
			JToggleButton btn = BoardWindow.getAllSquares().get(i);
			if(btn.getForeground() == WHITE_COLOUR)
			{
				btn.setEnabled(bool1);
				whitePieceButtons.add(btn);
			}
			else
			{
				btn.setEnabled(bool2);
			}
		}
	}
	
	
	//getters
	public static ArrayList<Piece> getWhitePieces() {
		return whitePieces;}
	public static ArrayList<Piece> getBlackPieces() {
		return blackPieces;}
	public static ArrayList<Piece> getAllPieces() {
		return allPieces;}
	
	
	/**
	 * Instantiate all pieces and start the game, where white goes first, and the human plays white.
	 * @param args
	 */
	public static void main(String[] args)
	{	
		openBoardWindow();
		Pawn whitePawn1 = new Pawn(WHITE_COLOUR, "p1.", BoardWindow.getA2());
		Pawn whitePawn2 = new Pawn(WHITE_COLOUR, "p2.", BoardWindow.getB2());
		Pawn whitePawn3 = new Pawn(WHITE_COLOUR, "p3.", BoardWindow.getC2());
		Pawn whitePawn4 = new Pawn(WHITE_COLOUR, "p4.", BoardWindow.getD2());
		Pawn whitePawn5 = new Pawn(WHITE_COLOUR, "p5.", BoardWindow.getE2());
		Pawn whitePawn6 = new Pawn(WHITE_COLOUR, "p6.", BoardWindow.getF2());
		Pawn whitePawn7 = new Pawn(WHITE_COLOUR, "p7.", BoardWindow.getG2());
		Pawn whitePawn8 = new Pawn(WHITE_COLOUR, "p8.", BoardWindow.getH2());
		Knight whiteKnight1 = new Knight(WHITE_COLOUR, "N1.", BoardWindow.getB1());
		Knight whiteKnight2 = new Knight(WHITE_COLOUR, "N2.", BoardWindow.getG1());
		Bishop whiteBishop1 = new Bishop(WHITE_COLOUR, "B1.", BoardWindow.getC1());
		Bishop whiteBishop2 = new Bishop(WHITE_COLOUR, "B2.", BoardWindow.getF1());
		Rook whiteRook1 = new Rook(WHITE_COLOUR, "R1.", BoardWindow.getA1());
		Rook whiteRook2 = new Rook(WHITE_COLOUR, "R2.", BoardWindow.getH1());
		Queen whiteQueen = new Queen(WHITE_COLOUR, "Q.", BoardWindow.getD1());
		King whiteKing = new King(WHITE_COLOUR, "K.", BoardWindow.getE1());
		Collections.addAll(whitePieces, whitePawn1, whitePawn2, whitePawn3, whitePawn4, 
				whitePawn5, whitePawn6, whitePawn7, whitePawn8, whiteKnight1, whiteKnight2, 
				whiteBishop1, whiteBishop2, whiteRook1, whiteRook2, whiteQueen, whiteKing); //https://stackoverflow.com/a/43457156/8042538
		Pawn blackPawn1 = new Pawn(BLACK_COLOUR, "p1", BoardWindow.getA7());
		Pawn blackPawn2 = new Pawn(BLACK_COLOUR, "p2", BoardWindow.getB7());
		Pawn blackPawn3 = new Pawn(BLACK_COLOUR, "p3", BoardWindow.getC7());
		Pawn blackPawn4 = new Pawn(BLACK_COLOUR, "p4", BoardWindow.getD7());
		Pawn blackPawn5 = new Pawn(BLACK_COLOUR, "p5", BoardWindow.getE7());
		Pawn blackPawn6 = new Pawn(BLACK_COLOUR, "p6", BoardWindow.getF7());
		Pawn blackPawn7 = new Pawn(BLACK_COLOUR, "p7", BoardWindow.getG7());
		Pawn blackPawn8 = new Pawn(BLACK_COLOUR, "p8", BoardWindow.getH7());
		Knight blackKnight1 = new Knight(BLACK_COLOUR, "N1", BoardWindow.getB8());
		Knight blackKnight2 = new Knight(BLACK_COLOUR, "N2", BoardWindow.getG8());
		Bishop blackBishop1 = new Bishop(BLACK_COLOUR, "B1", BoardWindow.getC8());
		Bishop blackBishop2 = new Bishop(BLACK_COLOUR, "B2", BoardWindow.getF8());
		Rook blackRook1 = new Rook(BLACK_COLOUR, "R1", BoardWindow.getA8());
		Rook blackRook2 = new Rook(BLACK_COLOUR, "R2", BoardWindow.getH8());
		Queen blackQueen = new Queen(BLACK_COLOUR, "Q", BoardWindow.getD8());
		King blackKing = new King(BLACK_COLOUR, "K", BoardWindow.getE8());
		Collections.addAll(blackPieces, blackPawn1, blackPawn2, blackPawn3, blackPawn4, 
				blackPawn5, blackPawn6, blackPawn7, blackPawn8, blackKnight1, blackKnight2, 
				blackBishop1, blackBishop2, blackRook1, blackRook2, blackQueen, blackKing);
		Collections.addAll(allPieces, whitePawn1, whitePawn2, whitePawn3, whitePawn4, 
				whitePawn5, whitePawn6, whitePawn7, whitePawn8, whiteKnight1, whiteKnight2, 
				whiteBishop1, whiteBishop2, whiteRook1, whiteRook2, whiteQueen, whiteKing,
				blackPawn1, blackPawn2, blackPawn3, blackPawn4, 
				blackPawn5, blackPawn6, blackPawn7, blackPawn8, blackKnight1, blackKnight2, 
				blackBishop1, blackBishop2, blackRook1, blackRook2, blackQueen, blackKing);
		
		//play the game and get the outcome (win, lose, draw, stalemate)
		String humanPlayer = "white";
		String outcome = playGame(humanPlayer);
		System.out.println(outcome);
		
		
	}
}
