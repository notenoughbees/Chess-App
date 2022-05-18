package main;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalButtonUI;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;

public class GameEnvironment
{
	final static String LOOKANDFEEL = "Motif"; //Motif GTK System
	final static String THEME = "Ocean";
	
	public final static ImageIcon WHITE_PAWN_ICON = new ImageIcon(GameEnvironment.class.getResource("/img/w_pawn_48px.png"));
	public final static ImageIcon WHITE_KNIGHT_ICON = new ImageIcon(GameEnvironment.class.getResource("/img/w_knight_48px.png"));
	public final static ImageIcon WHITE_BISHOP_ICON = new ImageIcon(GameEnvironment.class.getResource("/img/w_bishop_48px.png"));
	public final static ImageIcon WHITE_ROOK_ICON = new ImageIcon(GameEnvironment.class.getResource("/img/w_rook_48px.png"));
	public final static ImageIcon WHITE_QUEEN_ICON = new ImageIcon(GameEnvironment.class.getResource("/img/w_queen_48px.png"));
	public final static ImageIcon WHITE_KING_ICON = new ImageIcon(GameEnvironment.class.getResource("/img/w_king_48px.png"));
	public final static ImageIcon BLACK_PAWN_ICON = new ImageIcon(GameEnvironment.class.getResource("/img/b_pawn_48px.png"));
	public final static ImageIcon BLACK_KNIGHT_ICON = new ImageIcon(GameEnvironment.class.getResource("/img/b_knight_48px.png"));
	public final static ImageIcon BLACK_BISHOP_ICON = new ImageIcon(GameEnvironment.class.getResource("/img/b_bishop_48px.png"));
	public final static ImageIcon BLACK_ROOK_ICON = new ImageIcon(GameEnvironment.class.getResource("/img/b_rook_48px.png"));
	public final static ImageIcon BLACK_QUEEN_ICON = new ImageIcon(GameEnvironment.class.getResource("/img/b_queen_48px.png"));
	public final static ImageIcon BLACK_KING_ICON = new ImageIcon(GameEnvironment.class.getResource("/img/b_king_48px.png"));
	
	public final static Color WHITE_SQUARE_COLOUR = Color.WHITE;
	public final static Color BLACK_SQUARE_COLOUR = Color.BLACK;
	public final static Color WHITE_PIECE_COLOUR = Color.ORANGE;
	public final static Color BLACK_PIECE_COLOUR = Color.RED;
	public final static Color SELECTED_COLOUR = Color.BLUE;
	public final static Color VALID_DESTINATION_COLOUR = Color.GREEN;
	private static ArrayList<Piece> whitePieces = new ArrayList<>();
	private static ArrayList<Piece> blackPieces = new ArrayList<>();
	private static ArrayList<Piece> allPieces = new ArrayList<>();
	
	private static Integer turnCounter = 1;
	private static boolean hasWhiteMoved = false;
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
		while(gameOver() == false)
		{
			System.out.println("=================================");
			//the human plays white, so they start first
			makeHumanMove();
			writeNotation(turnCounter);
			
			//say that there is no source square anymore in preparation for the next move
			BoardWindow.setSrcSquare(null);
			//BoardWindow.setDestSquare(null);
			
			
			System.out.println("------------------");
			///////////////////////////////////
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// Auto-generated catch block
				e.printStackTrace();
			}
			
			///////////////////////////////////
			
			makeComputerMove(); //TODO: fix writeNotation() printing NULL if makeComputerMove() hasn't run during the turn
			writeNotation(turnCounter);
			turnCounter ++;
			
			//say that there is no source square anymore in preparation for the next move
			BoardWindow.setSrcSquare(null);
			BoardWindow.setDestSquare(null);
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
	
	
	public static void writeNotation(Integer turnCounter)
	{
		JTextArea box = BoardWindow.getMovesHistory();
		String currentText = box.getText();
		String turnNumber = turnCounter.toString();
		String srcText = BoardWindow.squaresMap.get(BoardWindow.getSrcSquare());
		String destText = BoardWindow.squaresMap.get(BoardWindow.getDestSquare());
		box.setText(currentText + "\n" + turnNumber + ": \t" + srcText + destText);
	}
	
	
	/**
	 * Runs when it is the human player's turn.
	 */
	public static void makeHumanMove()
	{
		setHasWhiteMoved(false);
		toggleSelectWhitePieceButtons(true, true, false); //enable the buttons with white pieces on them and disable all others
		
		//wait for the human player to make a move
		while(hasWhiteMoved == false)
		{
			try {
				Thread.sleep(200);
			}
			catch(InterruptedException e) {
			}
		}
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
//					int possibleDest = BoardWindow.getAllSquares().indexOf(tuple.second.get(j));
//					System.out.println(possibleDest);
//				}
//			}
//		}
//		//
		
		//choose one of the valid moves at random
		//(https://www.codegrepper.com/code-examples/java/how+to+select+a+random+element+from+an+array+in+java)
		Random rand = new Random();
		int randSrcSquareAndDestList = rand.nextInt(validSquares.size());
		Pair<JToggleButton, ArrayList<JToggleButton>> chosenSrcSquareAndDestList = validSquares.get(randSrcSquareAndDestList);
		BoardWindow.setSrcSquare(chosenSrcSquareAndDestList.first);							////
		int randDestSquare = rand.nextInt(chosenSrcSquareAndDestList.second.size());
		BoardWindow.setDestSquare(chosenSrcSquareAndDestList.second.get(randDestSquare));	////
		
		//JToggleButton nextSquare = allSquares.get(allSquares.indexOf(currentSquare)+nextSquareCalculation);
		System.out.println(BoardWindow.getAllSquares().indexOf(BoardWindow.getSrcSquare()));
		System.out.println("SRC,DEST ICONS:\t" + BoardWindow.getSrcSquare().getIcon() + "\t" + BoardWindow.getDestSquare().getIcon());
		//System.out.println("COM MOVE:\t" + BoardWindow.getSrcSquare().getText() + "\t" + BoardWindow.getDestSquare().getText());
		Piece.movePiece(BoardWindow.getSrcSquare(), BoardWindow.getDestSquare(), whitePieces);
		
		Color pieceColour = Piece.findPiece(BoardWindow.getDestSquare()).getPieceColour();
		System.out.println("PIECE COLOUR ON THE SQ:\t" + pieceColour);
		System.out.println("SRC,DEST ICONS 2:\t" + BoardWindow.getSrcSquare().getIcon() + "\t" + BoardWindow.getDestSquare().getIcon());
		System.out.println(pieceColour);
		
		//TODO: !
		//deselect the valid destinations from the previous move, and reselect the buttons with white pieces
		GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);
	}
	
	
	/**
	 * Calculates and returns all of the squares that the player could move a piece to.
	 * Runs for the computer player, where the computer player will later select one of these
	 * valid moves at random.
	 * @return pieceDests: an ArrayList containing pairs of the location (a JToggleButton) 
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
	 * @return pieceDests: an ArrayList containing pairs of the location (a JToggleButton) 
	 * and the destinations (an ArrayList of JToggleButtons)
	 */
	public static ArrayList<Pair<JToggleButton, ArrayList<JToggleButton>>> findValidSquaresHelper(
			ArrayList<Pair<JToggleButton, ArrayList<JToggleButton>>> validSquares, Piece pieceToCheck)
	{
		JToggleButton pieceLocation = pieceToCheck.getPieceLocation();
		ArrayList<JToggleButton> pieceDests = null;
		//find out the type of the piece, then cast it as that type to find the possible destinatons
		if(pieceToCheck instanceof Pawn) {
			pieceDests = ((Pawn) pieceToCheck).findValidDests();} // https://stackoverflow.com/a/106351/8042538
		else if(pieceToCheck instanceof Knight) {
			pieceDests = ((Knight) pieceToCheck).findValidDests();}
		else if(pieceToCheck instanceof Bishop) {
			pieceDests = ((Bishop) pieceToCheck).findValidDests();}
		else if(pieceToCheck instanceof Rook) {
			pieceDests = ((Rook) pieceToCheck).findValidDests();}
		else if(pieceToCheck instanceof Queen) {
			pieceDests = ((Queen) pieceToCheck).findValidDests();}
		else if(pieceToCheck instanceof King) {
			pieceDests = ((King) pieceToCheck).findValidDests();}
		
		if(pieceDests.size() > 0) //pieceDests will be null if no destinations were found
		{
			Pair<JToggleButton, ArrayList<JToggleButton>> newTuple = new Pair<>(pieceLocation, pieceDests);
			validSquares.add(newTuple);
		}
		return validSquares;
	}
	
	
	/**
	 * Selects all of the squares on the board that have a white piece on them.
	 * Runs for the human player, who plays white.
	 * @param enableWhiteButtons: whether to enable buttons with white pieces on them.
	 * @param checkNonwhiteButtons: whether to do something about buttons tat don't have white pieces on them. 
	 * This will be false if checkNonwhiteButtons is also false.
	 * @param enableNonwhiteButtons: whether to enable buttons that don't have wite pieces on them. 
	 * This will only be true if checkNonwhiteButtons is also true.
	 */
	public static void toggleSelectWhitePieceButtons(
			boolean enableWhiteButtons, boolean checkNonwhiteButtons, boolean enableNonwhiteButtons)
	{
		/*
		 * make a button group to hold the white piece buttons. When one of these buttons is selected,
		 * this will automatically make the others in the group deselect.
		 */
		ButtonGroup whitePieceButtons = new ButtonGroup();
		
		//iterate the board and enable the buttons with white pieces on them, while disabling all other buttons
		for(int i = 0; i < BoardWindow.getAllSquares().size(); i++)
		{
			JToggleButton btn = BoardWindow.getAllSquares().get(i);
			if(btn.getForeground() == WHITE_PIECE_COLOUR)
			{
				btn.setEnabled(enableWhiteButtons);
				whitePieceButtons.add(btn);
			}
			else if(checkNonwhiteButtons == true)
			{
				btn.setEnabled(enableNonwhiteButtons);
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
	
	//setters
	public static void setHasWhiteMoved(boolean b) {
		hasWhiteMoved = b;}
	
	
	/**
	 * Instantiate all pieces and start the game, where white goes first, and the human plays white.
	 * @param args
	 */
	public static void main(String[] args)
	{	
		//use the UI Manager to change the default background colour of a toggle button when toggled on
		UIManager.put("ToggleButton.select", GameEnvironment.SELECTED_COLOUR);
		


		
		
		
        String lookAndFeel = null;
        
        if (LOOKANDFEEL != null) {
            if (LOOKANDFEEL.equals("Metal")) {
                lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName();
              //  an alternative way to set the Metal L&F is to replace the 
              // previous line with:
              // lookAndFeel = "javax.swing.plaf.metal.MetalLookAndFeel";
                
            }
            
            else if (LOOKANDFEEL.equals("System")) {
                lookAndFeel = UIManager.getSystemLookAndFeelClassName();
            } 
            
            else if (LOOKANDFEEL.equals("Motif")) {
                lookAndFeel = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
            } 
            
            else if (LOOKANDFEEL.equals("GTK")) { 
                lookAndFeel = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel";
            } 
            
            else {
                System.err.println("Unexpected value of LOOKANDFEEL specified: "
                                   + LOOKANDFEEL);
                lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName();
            }

            try {
                UIManager.setLookAndFeel(lookAndFeel);
                
                // If L&F = "Metal", set the theme
                if (LOOKANDFEEL.equals("Metal")) {
                  if (THEME.equals("DefaultMetal"))
                     MetalLookAndFeel.setCurrentTheme(new DefaultMetalTheme());
                  else if (THEME.equals("Ocean"))
                     MetalLookAndFeel.setCurrentTheme(new OceanTheme());
                  //else
                     //MetalLookAndFeel.setCurrentTheme(new TestTheme());
                     
                  UIManager.setLookAndFeel(new MetalLookAndFeel()); 
                }	
                	
                	
                
            } 
            
            catch (ClassNotFoundException e) {
                System.err.println("Couldn't find class for specified look and feel:"
                                   + lookAndFeel);
                System.err.println("Did you include the L&F library in the class path?");
                System.err.println("Using the default look and feel.");
            } 
            
            catch (UnsupportedLookAndFeelException e) {
                System.err.println("Can't use the specified look and feel ("
                                   + lookAndFeel
                                   + ") on this platform.");
                System.err.println("Using the default look and feel.");
            } 
            
            catch (Exception e) {
                System.err.println("Couldn't get specified look and feel ("
                                   + lookAndFeel
                                   + "), for some reason.");
                System.err.println("Using the default look and feel.");
                e.printStackTrace();
            }
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		for(int i = 0; i < whitePieces.size(); i++)
		{
			Piece piece = whitePieces.get(i);
			JToggleButton btn = piece.getPieceLocation();
			Color pieceColour = piece.getPieceColour();
			if(pieceColour == WHITE_PIECE_COLOUR)
			{
				btn.setUI(new MetalButtonUI()
				{
					protected Color getDisabledTextColor()
					{
						return Color.CYAN;
					}
				});
			}
			if(pieceColour == BLACK_PIECE_COLOUR)
			{
				btn.setUI(new MetalButtonUI()
				{
					protected Color getDisabledTextColor()
					{
						return Color.MAGENTA;
					}
				});
			}
			
		}
		
		
		openBoardWindow();
		Pawn whitePawn1 = new Pawn(WHITE_PIECE_COLOUR, WHITE_PAWN_ICON, BoardWindow.getA2());
		Pawn whitePawn2 = new Pawn(WHITE_PIECE_COLOUR, WHITE_PAWN_ICON, BoardWindow.getB2());
		Pawn whitePawn3 = new Pawn(WHITE_PIECE_COLOUR, WHITE_PAWN_ICON, BoardWindow.getC2());
		Pawn whitePawn4 = new Pawn(WHITE_PIECE_COLOUR, WHITE_PAWN_ICON, BoardWindow.getD2());
		Pawn whitePawn5 = new Pawn(WHITE_PIECE_COLOUR, WHITE_PAWN_ICON, BoardWindow.getE2());
		Pawn whitePawn6 = new Pawn(WHITE_PIECE_COLOUR, WHITE_PAWN_ICON, BoardWindow.getF2());
		Pawn whitePawn7 = new Pawn(WHITE_PIECE_COLOUR, WHITE_PAWN_ICON, BoardWindow.getG2());
		Pawn whitePawn8 = new Pawn(WHITE_PIECE_COLOUR, WHITE_PAWN_ICON, BoardWindow.getH2());
		Knight whiteKnight1 = new Knight(WHITE_PIECE_COLOUR, WHITE_KNIGHT_ICON, BoardWindow.getB1());
		Knight whiteKnight2 = new Knight(WHITE_PIECE_COLOUR, WHITE_KNIGHT_ICON, BoardWindow.getG1());
		Bishop whiteBishop1 = new Bishop(WHITE_PIECE_COLOUR, WHITE_BISHOP_ICON, BoardWindow.getC1());
		Bishop whiteBishop2 = new Bishop(WHITE_PIECE_COLOUR, WHITE_BISHOP_ICON, BoardWindow.getF1());
		Rook whiteRook1 = new Rook(WHITE_PIECE_COLOUR, WHITE_ROOK_ICON, BoardWindow.getA1());
		Rook whiteRook2 = new Rook(WHITE_PIECE_COLOUR, WHITE_ROOK_ICON, BoardWindow.getH1());
		Queen whiteQueen = new Queen(WHITE_PIECE_COLOUR, WHITE_QUEEN_ICON, BoardWindow.getD1());
		King whiteKing = new King(WHITE_PIECE_COLOUR, WHITE_KING_ICON, BoardWindow.getE1());
		Collections.addAll(whitePieces, whitePawn1, whitePawn2, whitePawn3, whitePawn4, 
				whitePawn5, whitePawn6, whitePawn7, whitePawn8, whiteKnight1, whiteKnight2, 
				whiteBishop1, whiteBishop2, whiteRook1, whiteRook2, whiteQueen, whiteKing); //https://stackoverflow.com/a/43457156/8042538
		Pawn blackPawn1 = new Pawn(BLACK_PIECE_COLOUR, BLACK_PAWN_ICON, BoardWindow.getA7());
		Pawn blackPawn2 = new Pawn(BLACK_PIECE_COLOUR, BLACK_PAWN_ICON, BoardWindow.getB7());
		Pawn blackPawn3 = new Pawn(BLACK_PIECE_COLOUR, BLACK_PAWN_ICON, BoardWindow.getC7());
		Pawn blackPawn4 = new Pawn(BLACK_PIECE_COLOUR, BLACK_PAWN_ICON, BoardWindow.getD7());
		Pawn blackPawn5 = new Pawn(BLACK_PIECE_COLOUR, BLACK_PAWN_ICON, BoardWindow.getE7());
		Pawn blackPawn6 = new Pawn(BLACK_PIECE_COLOUR, BLACK_PAWN_ICON, BoardWindow.getF7());
		Pawn blackPawn7 = new Pawn(BLACK_PIECE_COLOUR, BLACK_PAWN_ICON, BoardWindow.getG7());
		Pawn blackPawn8 = new Pawn(BLACK_PIECE_COLOUR, BLACK_PAWN_ICON, BoardWindow.getH7());
		Knight blackKnight1 = new Knight(BLACK_PIECE_COLOUR, BLACK_KNIGHT_ICON, BoardWindow.getB8());
		Knight blackKnight2 = new Knight(BLACK_PIECE_COLOUR, BLACK_KNIGHT_ICON, BoardWindow.getG8());
		Bishop blackBishop1 = new Bishop(BLACK_PIECE_COLOUR, BLACK_BISHOP_ICON, BoardWindow.getC8());
		Bishop blackBishop2 = new Bishop(BLACK_PIECE_COLOUR, BLACK_BISHOP_ICON, BoardWindow.getF8());
		Rook blackRook1 = new Rook(BLACK_PIECE_COLOUR, BLACK_ROOK_ICON, BoardWindow.getA8());
		Rook blackRook2 = new Rook(BLACK_PIECE_COLOUR, BLACK_ROOK_ICON, BoardWindow.getH8());
		Queen blackQueen = new Queen(BLACK_PIECE_COLOUR, BLACK_QUEEN_ICON, BoardWindow.getD8());
		King blackKing = new King(BLACK_PIECE_COLOUR, BLACK_KING_ICON, BoardWindow.getE8());
		//Collections.addAll(blackPieces, blackPawn1, blackPawn2, blackPawn3, blackPawn4,
		//		blackPawn5, blackPawn6, blackPawn7, blackPawn8, blackKnight1, blackKnight2, 
		//		blackBishop1, blackBishop2, blackRook1, blackRook2, blackQueen, blackKing);
		Collections.addAll(blackPieces, blackPawn1);
		Collections.addAll(allPieces, whitePawn1, whitePawn2, whitePawn3, whitePawn4, 
				whitePawn5, whitePawn6, whitePawn7, whitePawn8, whiteKnight1, whiteKnight2, 
				whiteBishop1, whiteBishop2, whiteRook1, whiteRook2, whiteQueen, whiteKing,
				blackPawn1, blackPawn2, blackPawn3, blackPawn4, 
				blackPawn5, blackPawn6, blackPawn7, blackPawn8, blackKnight1, blackKnight2, 
				blackBishop1, blackBishop2, blackRook1, blackRook2, blackQueen, blackKing);
		
		//play the game and get the outcome (win, lose, draw, stalemate)
		String humanPlayer = "white";
		String outcome = playGame(humanPlayer);
		System.out.println("OUTCOME:" + "\t" + outcome);
		
		
		
	}
}
