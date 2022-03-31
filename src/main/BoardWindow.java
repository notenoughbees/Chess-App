package main;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.GridLayout;

import javax.swing.JToggleButton;

import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;

public class BoardWindow {
	//initialise instance variables
	private JFrame frmMaster;
	private static JPanel panelBoard = new JPanel();
	private static JTextArea movesHistory = new JTextArea();
	private static JToggleButton a1 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton b1 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton c1 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton d1 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton e1 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton f1 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton g1 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton h1 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton a2 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton b2 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton c2 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton d2 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton e2 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton f2 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton g2 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton h2 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton a3 = new JToggleButton("");
	private static JToggleButton b3 = new JToggleButton("");
	private static JToggleButton c3 = new JToggleButton("");
	private static JToggleButton d3 = new JToggleButton("");
	private static JToggleButton e3 = new JToggleButton("");
	private static JToggleButton f3 = new JToggleButton("");
	private static JToggleButton g3 = new JToggleButton("");
	private static JToggleButton h3 = new JToggleButton("");
	private static JToggleButton a4 = new JToggleButton("");
	private static JToggleButton b4 = new JToggleButton("");
	private static JToggleButton c4 = new JToggleButton("");
	private static JToggleButton d4 = new JToggleButton("");
	private static JToggleButton e4 = new JToggleButton("");
	private static JToggleButton f4 = new JToggleButton("");
	private static JToggleButton g4 = new JToggleButton("");
	private static JToggleButton h4 = new JToggleButton("");
	private static JToggleButton a5 = new JToggleButton("");
	private static JToggleButton b5 = new JToggleButton("");
	private static JToggleButton c5 = new JToggleButton("");
	private static JToggleButton d5 = new JToggleButton("");
	private static JToggleButton e5 = new JToggleButton("");
	private static JToggleButton f5 = new JToggleButton("");
	private static JToggleButton g5 = new JToggleButton("");
	private static JToggleButton h5 = new JToggleButton("");
	private static JToggleButton a6 = new JToggleButton("");
	private static JToggleButton b6 = new JToggleButton("");
	private static JToggleButton c6 = new JToggleButton("");
	private static JToggleButton d6 = new JToggleButton("");
	private static JToggleButton e6 = new JToggleButton("");
	private static JToggleButton f6 = new JToggleButton("");
	private static JToggleButton g6 = new JToggleButton("");
	private static JToggleButton h6 = new JToggleButton("");
	private static JToggleButton a7 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton b7 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton c7 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton d7 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton e7 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton f7 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton g7 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton h7 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton a8 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton b8 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton c8 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton d8 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton e8 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton f8 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton g8 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton h8 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static ArrayList<JToggleButton> allSquares = new ArrayList<JToggleButton>();
	public static final int BOARD_LENGTH = 8;
	
	//constants for the position of squares relative to the current square a piece is on
	public static final int SQUARE_TOPLEFT_CALCULATION = -9;
	public static final int SQUARE_TOP_CALCULATION = -8;
	public static final int SQUARE_TOPRIGHT_CALCULATION = -7;
	public static final int SQUARE_LEFT_CALCULATION = -1;
	public static final int SQUARE_RIGHT_CALCULATION = 1;
	public static final int SQUARE_BOTTOMLEFT_CALCULATION = 7;
	public static final int SQUARE_BOTTOM_CALCULATION = 8;
	public static final int SQUARE_BOTTOMRIGHT_CALCULATION = 9;
	
	public static final int SQUARE_KNIGHT_TOPLEFT_CALCULATION = -17;
	public static final int SQUARE_KNIGHT_TOPRIGHT_CALCULATION = -15;
	public static final int SQUARE_KNIGHT_UPPERLEFT_CALCULATION = -10;
	public static final int SQUARE_KNIGHT_UPPERRIGHT_CALCULATION = -6;
	public static final int SQUARE_KNIGHT_LOWERLEFT_CALCULATION = 6;
	public static final int SQUARE_KNIGHT_LOWERRIGHT_CALCULATION = 10;
	public static final int SQUARE_KNIGHT_BOTTOMLEFT_CALCULATION = 15;
	public static final int SQUARE_KNIGHT_BOTTOMRIGHT_CALCULATION = 17;
	
	//for knowing what stage the player is at in making their move
	private static JToggleButton sourceSquare;
	
	private static ArrayList<JToggleButton> validDestinations = new ArrayList<>();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardWindow window = new BoardWindow();
					window.frmMaster.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	//constructor
	public BoardWindow() {
		initialize();
		frmMaster.setVisible(true); //show the window
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//master frame with GridBagLayout that holds the board and moves history
		frmMaster = new JFrame();
		frmMaster.setTitle("Chess App");
		frmMaster.setBounds(100, 100, (70*8+70*2), 70*8);
		frmMaster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gbcMaster = new GridBagLayout();
//		gbcMaster.columnWidths = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}; //{70, 70};
//		gbcMaster.rowHeights = new int[]{100};
		gbcMaster.columnWeights = new double[]{frmMaster.getWidth()/10};
		gbcMaster.rowWeights = new double[]{frmMaster.getWidth()/10};
		frmMaster.getContentPane().setLayout(gbcMaster);
		
		//panel with GridBagLayout that gets added to frmMaster
		JPanel boardContainer = new JPanel();
		GridBagConstraints gbcBoardContainer = new GridBagConstraints();
		//gbcBoardContainer.insets = new Insets(0, 0, 5, 0);
		gbcBoardContainer.fill = GridBagConstraints.BOTH;
		gbcBoardContainer.gridx = 0;
		gbcBoardContainer.gridy = 0;
		frmMaster.getContentPane().add(boardContainer, gbcBoardContainer);
		GridBagLayout gblBoardContainer = new GridBagLayout();
		gblBoardContainer.columnWidths = new int[]{frmMaster.getWidth()/10};
		gblBoardContainer.rowHeights = new int[]{frmMaster.getWidth()/10};
		gblBoardContainer.columnWeights = new double[]{frmMaster.getWidth()/10};
		gblBoardContainer.rowWeights = new double[]{frmMaster.getWidth()/10};
		
//		gbcBoardContainer.weightx = 1;
//		gbcBoardContainer.weighty = 1;
		
		boardContainer.setLayout(gblBoardContainer);
		boardContainer.setPreferredSize(new Dimension(560, 560));
		
		//moves history text box that gets added to frmMaster
		GridBagConstraints gbcMovesHistory = new GridBagConstraints();
		gbcMovesHistory.fill = GridBagConstraints.VERTICAL; //make component only expand vertically if resized
		gbcMovesHistory.gridx = 1;
		gbcMovesHistory.gridy = 0;
		frmMaster.getContentPane().add(movesHistory, gbcMovesHistory);
		//vvv !!!!!!!!!!!!!!!!
		movesHistory.setPreferredSize(new Dimension(140, 560)); //makes the text box take up a specific size even if the text in it doesn't need that much space
//		movesHistory.setMinimumSize(new Dimension(60, 480));
		
		//panel with GridLayout that holds the buttons of the board
		JPanel panelBoard = new JPanel();
		GridBagConstraints gbcPanelBoard = new GridBagConstraints();
		gbcPanelBoard.fill = GridBagConstraints.BOTH;
		boardContainer.add(panelBoard, gbcPanelBoard);
		panelBoard.setLayout(new GridLayout(8, 8, 0, 0));
		
		frmMaster.pack();
		frmMaster.setMinimumSize(frmMaster.getSize()); //enable this line to prevent reszing the window to be any smaller
//		frmMaster.setMinimumSize(new Dimension(480, 480)); //do not let board squares go smaller than 60px
		
		
	    
		a8.setBackground(Color.WHITE);
		panelBoard.add(a8);
		a8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if the user selects this button, it must contain a white piece
				if(sourceSquare == null) {
					findValidDestinationsFromButton(a8);}
				else {
					Piece.movePiece(sourceSquare, a8);
					GameEnvironment.setHasWhiteMoved(true);
					//deselect the valid destinations from the previous move, and reselect the buttons with white pieces
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b8.setBackground(Color.BLACK);
		panelBoard.add(b8);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(b8);}
				else {
					Piece.movePiece(sourceSquare, b8);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c8.setBackground(Color.WHITE);
		panelBoard.add(c8);
		c8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(c8);}
				else {
					Piece.movePiece(sourceSquare, c8);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d8.setBackground(Color.BLACK);
		panelBoard.add(d8);
		d8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(d8);}
				else {
					Piece.movePiece(sourceSquare, d8);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e8.setBackground(Color.WHITE);
		panelBoard.add(e8);
		e8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(e8);}
				else {
					Piece.movePiece(sourceSquare, e8);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f8.setBackground(Color.BLACK);
		panelBoard.add(f8);
		f8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(f8);}
				else {
					Piece.movePiece(sourceSquare, f8);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g8.setBackground(Color.WHITE);
		panelBoard.add(g8);
		g8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(g8);}
				else {
					Piece.movePiece(sourceSquare, g8);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h8.setBackground(Color.BLACK);
		panelBoard.add(h8);
		h8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(h8);}
				else {
					Piece.movePiece(sourceSquare, h8);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a7.setBackground(Color.BLACK);
		panelBoard.add(a7);
		a7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(a7);}
				else {
					Piece.movePiece(sourceSquare, a7);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b7.setBackground(Color.WHITE);
		panelBoard.add(b7);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(b7);}
				else {
					Piece.movePiece(sourceSquare, b7);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c7.setBackground(Color.BLACK);
		panelBoard.add(c7);
		c7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(c7);}
				else {
					Piece.movePiece(sourceSquare, c7);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d7.setBackground(Color.WHITE);
		panelBoard.add(d7);
		d7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(d7);}
				else {
					Piece.movePiece(sourceSquare, d7);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e7.setBackground(Color.BLACK);
		panelBoard.add(e7);
		e7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(e7);}
				else {
					Piece.movePiece(sourceSquare, e7);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f7.setBackground(Color.WHITE);
		panelBoard.add(f7);
		f7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(f7);}
				else {
					Piece.movePiece(sourceSquare, f7);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g7.setBackground(Color.BLACK);
		panelBoard.add(g7);
		g7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(g7);}
				else {
					Piece.movePiece(sourceSquare, g7);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h7.setBackground(Color.WHITE);
		panelBoard.add(h7);
		h7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(h7);}
				else {
					Piece.movePiece(sourceSquare, h7);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a6.setBackground(Color.WHITE);
		panelBoard.add(a6);
		a6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(a6);}
				else {
					Piece.movePiece(sourceSquare, a6);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b6.setBackground(Color.BLACK);
		panelBoard.add(b6);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(b6);}
				else {
					Piece.movePiece(sourceSquare, b6);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c6.setBackground(Color.WHITE);
		panelBoard.add(c6);
		c6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(c6);}
				else {
					Piece.movePiece(sourceSquare, c6);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d6.setBackground(Color.BLACK);
		panelBoard.add(d6);
		d6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(d6);}
				else {
					Piece.movePiece(sourceSquare, d6);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e6.setBackground(Color.WHITE);
		panelBoard.add(e6);
		e6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(e6);}
				else {
					Piece.movePiece(sourceSquare, e6);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f6.setBackground(Color.BLACK);
		panelBoard.add(f6);
		f6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(f6);}
				else {
					Piece.movePiece(sourceSquare, f6);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g6.setBackground(Color.WHITE);
		panelBoard.add(g6);
		g6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(g6);}
				else {
					Piece.movePiece(sourceSquare, g6);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h6.setBackground(Color.BLACK);
		panelBoard.add(h6);
		h6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(h6);}
				else {
					Piece.movePiece(sourceSquare, h6);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a5.setBackground(Color.BLACK);
		panelBoard.add(a5);
		a5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(a5);}
				else {
					Piece.movePiece(sourceSquare, a5);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b5.setBackground(Color.WHITE);
		panelBoard.add(b5);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(b5);}
				else {
					Piece.movePiece(sourceSquare, b5);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c5.setBackground(Color.BLACK);
		panelBoard.add(c5);
		c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(c5);}
				else {
					Piece.movePiece(sourceSquare, c5);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d5.setBackground(Color.WHITE);
		panelBoard.add(d5);
		d5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(d5);}
				else {
					Piece.movePiece(sourceSquare, d5);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e5.setBackground(Color.BLACK);
		panelBoard.add(e5);
		e5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(e5);}
				else {
					Piece.movePiece(sourceSquare, e5);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f5.setBackground(Color.WHITE);
		panelBoard.add(f5);
		f5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(f5);}
				else {
					Piece.movePiece(sourceSquare, f5);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g5.setBackground(Color.BLACK);
		panelBoard.add(g5);
		g5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(g5);}
				else {
					Piece.movePiece(sourceSquare, g5);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h5.setBackground(Color.WHITE);
		panelBoard.add(h5);
		h5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(h5);}
				else {
					Piece.movePiece(sourceSquare, h5);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a4.setBackground(Color.WHITE);
		panelBoard.add(a4);
		a4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(a4);}
				else {
					Piece.movePiece(sourceSquare, a4);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b4.setBackground(Color.BLACK);
		panelBoard.add(b4);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(b4);}
				else {
					Piece.movePiece(sourceSquare, b4);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c4.setBackground(Color.WHITE);
		panelBoard.add(c4);
		c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(c4);}
				else {
					Piece.movePiece(sourceSquare, c4);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d4.setBackground(Color.BLACK);
		panelBoard.add(d4);
		d4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(d4);}
				else {
					Piece.movePiece(sourceSquare, d4);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e4.setBackground(Color.WHITE);
		panelBoard.add(e4);
		e4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(e4);}
				else {
					Piece.movePiece(sourceSquare, e4);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f4.setBackground(Color.BLACK);
		panelBoard.add(f4);
		f4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(f4);}
				else {
					Piece.movePiece(sourceSquare, f4);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g4.setBackground(Color.WHITE);
		panelBoard.add(g4);
		g4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(g4);}
				else {
					Piece.movePiece(sourceSquare, g4);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h4.setBackground(Color.BLACK);
		panelBoard.add(h4);
		h4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(h4);}
				else {
					Piece.movePiece(sourceSquare, h4);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a3.setBackground(Color.BLACK);
		panelBoard.add(a3);
		a3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(a3);}
				else {
					Piece.movePiece(sourceSquare, a3);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b3.setBackground(Color.WHITE);
		panelBoard.add(b3);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(b3);}
				else {
					Piece.movePiece(sourceSquare, b3);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c3.setBackground(Color.BLACK);
		panelBoard.add(c3);
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(c3);}
				else {
					Piece.movePiece(sourceSquare, c3);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d3.setBackground(Color.WHITE);
		panelBoard.add(d3);
		d3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(d3);}
				else {
					Piece.movePiece(sourceSquare, d3);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e3.setBackground(Color.BLACK);
		panelBoard.add(e3);
		e3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(e3);}
				else {
					Piece.movePiece(sourceSquare, e3);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f3.setBackground(Color.WHITE);
		panelBoard.add(f3);
		f3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(f3);}
				else {
					Piece.movePiece(sourceSquare, f3);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g3.setBackground(Color.BLACK);
		panelBoard.add(g3);
		g3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(g3);}
				else {
					Piece.movePiece(sourceSquare, g3);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h3.setBackground(Color.WHITE);
		panelBoard.add(h3);
		h3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(h3);}
				else {
					Piece.movePiece(sourceSquare, h3);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a2.setBackground(Color.WHITE);
		panelBoard.add(a2);
		a2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(a2.isForegroundSet());
				System.out.println(a2.isBackgroundSet());
				System.out.println(a2.getForeground());
				System.out.println(a2.getBackground());
				a2.setBackground(GameEnvironment.SELECTED_COLOUR);
				if(sourceSquare == null) {
					findValidDestinationsFromButton(a2);}
				else {
					Piece.movePiece(sourceSquare, a2);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b2.setBackground(Color.BLACK);
		panelBoard.add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(b2);}
				else {
					Piece.movePiece(sourceSquare, b2);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c2.setBackground(Color.WHITE);
		panelBoard.add(c2);
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(c2);}
				else {
					Piece.movePiece(sourceSquare, c2);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d2.setBackground(Color.BLACK);
		panelBoard.add(d2);
		d2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(d2);}
				else {
					Piece.movePiece(sourceSquare, d2);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e2.setBackground(Color.WHITE);
		panelBoard.add(e2);
		e2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(e2);}
				else {
					Piece.movePiece(sourceSquare, e2);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f2.setBackground(Color.BLACK);
		panelBoard.add(f2);
		f2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(f2);}
				else {
					Piece.movePiece(sourceSquare, f2);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g2.setBackground(Color.WHITE);
		panelBoard.add(g2);
		g2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(g2);}
				else {
					Piece.movePiece(sourceSquare, g2);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h2.setBackground(Color.BLACK);
		panelBoard.add(h2);
		h2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(h2);}
				else {
					Piece.movePiece(sourceSquare, h2);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a1.setBackground(Color.BLACK);
		panelBoard.add(a1);
		a1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(a1);}
				else {
					Piece.movePiece(sourceSquare, a1);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b1.setBackground(Color.WHITE);
		panelBoard.add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(b1);}
				else {
					Piece.movePiece(sourceSquare, b1);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c1.setBackground(Color.BLACK);
		panelBoard.add(c1);
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(c1);}
				else {
					Piece.movePiece(sourceSquare, c1);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d1.setBackground(Color.WHITE);
		panelBoard.add(d1);
		d1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(d1);}
				else {
					Piece.movePiece(sourceSquare, d1);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e1.setBackground(Color.BLACK);
		panelBoard.add(e1);
		e1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(e1);}
				else {
					Piece.movePiece(sourceSquare, e1);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f1.setBackground(Color.WHITE);
		panelBoard.add(f1);
		f1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(f1);}
				else {
					Piece.movePiece(sourceSquare, f1);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g1.setBackground(Color.BLACK);
		panelBoard.add(g1);
		g1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sourceSquare == null) {
					findValidDestinationsFromButton(g1);}
				else {
					Piece.movePiece(sourceSquare, g1);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h1.setBackground(Color.WHITE);
		panelBoard.add(h1);
		h1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkButtons();
				
				if(sourceSquare == null) {
					findValidDestinationsFromButton(h1);}
				else {
					Piece.movePiece(sourceSquare, h1);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		Collections.addAll(allSquares, a8, b8, c8, d8, e8, f8, g8, h8,
				a7, b7, c7, d7, e7, f7, g7, h7, 
				a6, b6, c6, d6, e6, f6, g6, h6,
				a5, b5, c5, d5, e5, f5, g5, h5, 
				a4, b4, c4, d4, e4, f4, g4, h4,
				a3, b3, c3, d3, e3, f3, g3, h3, 
				a2, b2, c2, d2, e2, f2, g2, h2,
				a1, b1, c1, d1, e1, f1, g1, h1);
	}
	
	
	
	public static void checkButtons()
	{
		for(int i = 0; i < allSquares.size(); i++)
		{
			JToggleButton btn = allSquares.get(i);
			System.out.println(btn.isSelected()); //isEnabled() = is the button pressable? aka does it have a white piece on it
		}
	}
	
	
	/**
	 * Runs during white's (the human player's) turn, once they have selected a button.
	 * Given this button, finds the valid destinations from this button for the piece that is on it.
	 * @param srcBtn: The selected button.
	 */
	public static void findValidDestinationsFromButton(JToggleButton srcBtn)
	{
		System.out.println("findValidDestinationsFromButton");
		Piece selectedPiece = Piece.findPiece(GameEnvironment.getWhitePieces(), srcBtn);
		System.out.println(allSquares.indexOf(srcBtn));
		
		//first find the valid destinations
		//TODO: reuse this code from GameEnvironment
		if(selectedPiece instanceof Pawn) {
			validDestinations = ((Pawn) selectedPiece).findValidDestinations();}
		else if(selectedPiece instanceof Knight) {
			validDestinations = ((Knight) selectedPiece).findValidDestinations();}
		else if(selectedPiece instanceof Bishop) {
			validDestinations = ((Bishop) selectedPiece).findValidDestinations();}
		else if(selectedPiece instanceof Rook) {
			validDestinations = ((Rook) selectedPiece).findValidDestinations();}
		else if(selectedPiece instanceof Queen) {
			validDestinations = ((Queen) selectedPiece).findValidDestinations();}
		else if(selectedPiece instanceof King) {
			validDestinations = ((King) selectedPiece).findValidDestinations();}
		
//		for(int i = 0; i < validDestinations.size(); i++)
//		{
//			int dstIndex = allSquares.indexOf(validDestinations.get(i));
//			System.out.println("a destination:" + "\t" + dstIndex);
//		}
		
		//colour the destinations and enable the associated buttons so that they can be clicked as the destination
		for(int i = 0; i < validDestinations.size(); i++)
		{
			JToggleButton btn = validDestinations.get(i);
			btn.setBackground(GameEnvironment.VALID_DESTINATION_COLOUR);
			btn.setEnabled(true);
			sourceSquare = srcBtn;
		}
		
		//disable all buttons with white pieces on them because they are not possible destinations
		GameEnvironment.toggleSelectWhitePieceButtons(false, false, false);
	}
	
	
	public static void setSquareToOriginalColour(JToggleButton square)
	{
		int squareIndex = BoardWindow.getAllSquares().indexOf(square);
		Color squareOriginalColour = null;
		//find out the col
		//  if the col is even, then the distribution of squares is different to if it was odd
		if(squareIndex % 8 == 0 
				|| squareIndex % 8 == 2
				|| squareIndex % 8 == 4
				|| squareIndex % 8 == 6)
		{
			if(squareIndex % 16 == 0
					|| squareIndex % 16 == 2
					|| squareIndex % 16 == 4
					|| squareIndex % 16 == 6)
			{
				squareOriginalColour = GameEnvironment.WHITE_SQUARE_COLOUR;
			}
			else //for when srcSquareIndex % 16 == 8 or 10 or 12 or 14 (or other)
			{
				squareOriginalColour = GameEnvironment.BLACK_SQUARE_COLOUR;
			}		
		}
		
		else //ie: srcSquareIndex % 8 == 1 or 3 or 5 or 7
		{
			if(squareIndex % 16 == 1
					|| squareIndex % 16 == 3
					|| squareIndex % 16 == 5
					|| squareIndex % 16 == 7)
			{
				squareOriginalColour = GameEnvironment.BLACK_SQUARE_COLOUR;
			}
			else //for when srcSquareIndex % 16 == something else
			{
				squareOriginalColour = GameEnvironment.WHITE_SQUARE_COLOUR;
			}		
		}
		square.setBackground(squareOriginalColour);
	}
	
	
	//getters
	public static JToggleButton getA1() {
		return a1;}
	public static JToggleButton getB1() {
		return b1;}
	public static JToggleButton getC1() {
		return c1;}
	public static JToggleButton getD1() {
		return d1;}
	public static JToggleButton getE1() {
		return e1;}
	public static JToggleButton getF1() {
		return f1;}
	public static JToggleButton getG1() {
		return g1;}
	public static JToggleButton getH1() {
		return h1;}
	public static JToggleButton getA2() {
		return a2;}
	public static JToggleButton getB2() {
		return b2;}
	public static JToggleButton getC2() {
		return c2;}
	public static JToggleButton getD2() {
		return d2;}
	public static JToggleButton getE2() {
		return e2;}
	public static JToggleButton getF2() {
		return f2;}
	public static JToggleButton getG2() {
		return g2;}
	public static JToggleButton getH2() {
		return h2;}
	public static JToggleButton getA3() {
		return a3;}
	public static JToggleButton getB3() {
		return b3;}
	public static JToggleButton getC3() {
		return c3;}
	public static JToggleButton getD3() {
		return d3;}
	public static JToggleButton getE3() {
		return e3;}
	public static JToggleButton getF3() {
		return f3;}
	public static JToggleButton getG3() {
		return g3;}
	public static JToggleButton getH3() {
		return h3;}
	public static JToggleButton getA4() {
		return a4;}
	public static JToggleButton getB4() {
		return b4;}
	public static JToggleButton getC4() {
		return c4;}
	public static JToggleButton getD4() {
		return d4;}
	public static JToggleButton getE4() {
		return e4;}
	public static JToggleButton getF4() {
		return f4;}
	public static JToggleButton getG4() {
		return g4;}
	public static JToggleButton getH4() {
		return h4;}
	public static JToggleButton getA5() {
		return a5;}
	public static JToggleButton getB5() {
		return b5;}
	public static JToggleButton getC5() {
		return c5;}
	public static JToggleButton getD5() {
		return d5;}
	public static JToggleButton getE5() {
		return e5;}
	public static JToggleButton getF5() {
		return f5;}
	public static JToggleButton getG5() {
		return g5;}
	public static JToggleButton getH5() {
		return h5;}
	public static JToggleButton getA6() {
		return a6;}
	public static JToggleButton getB6() {
		return b6;}
	public static JToggleButton getC6() {
		return c6;}
	public static JToggleButton getD6() {
		return d6;}
	public static JToggleButton getE6() {
		return e6;}
	public static JToggleButton getF6() {
		return f6;}
	public static JToggleButton getG6() {
		return g6;}
	public static JToggleButton getH6() {
		return h6;}
	public static JToggleButton getA7() {
		return a7;}
	public static JToggleButton getB7() {
		return b7;}
	public static JToggleButton getC7() {
		return c7;}
	public static JToggleButton getD7() {
		return d7;}
	public static JToggleButton getE7() {
		return e7;}
	public static JToggleButton getF7() {
		return f7;}
	public static JToggleButton getG7() {
		return g7;}
	public static JToggleButton getH7() {
		return h7;}
	public static JToggleButton getA8() {
		return a8;}
	public static JToggleButton getB8() {
		return b8;}
	public static JToggleButton getC8() {
		return c8;}
	public static JToggleButton getD8() {
		return d8;}
	public static JToggleButton getE8() {
		return e8;}
	public static JToggleButton getF8() {
		return f8;}
	public static JToggleButton getG8() {
		return g8;}
	public static JToggleButton getH8() {
		return h8;}
	public static ArrayList<JToggleButton> getAllSquares() {
		return allSquares;}
	public static ArrayList<JToggleButton> getValidDestinations() {
		return validDestinations;}
	public static JTextArea getMovesHistory() {
		return movesHistory;}
	
	
	//setters
	public static void setSquareText(JToggleButton square, ImageIcon icon, Color textColour)
	{
		square.setIcon(icon);
		square.setDisabledIcon(icon); //prevents the icon getting greyed out when the button is disabled
		square.setForeground(textColour);
	}

	public static void resetSourceSquare() {
		sourceSquare = null;
	}
	

}
