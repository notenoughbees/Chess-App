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
import java.util.HashMap;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;

public class BoardWindow {
	//initialise instance variables
	private JFrame frmMaster;
	private static JPanel panelBoard = new JPanel();
	private static JTextArea movesHistory = new JTextArea();
	private static JToggleButton a8 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton b8 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton c8 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton d8 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton e8 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton f8 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton g8 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton h8 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton a7 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton b7 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton c7 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton d7 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton e7 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton f7 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton g7 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton h7 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton a6 = new JToggleButton("");
	private static JToggleButton b6 = new JToggleButton("");
	private static JToggleButton c6 = new JToggleButton("");
	private static JToggleButton d6 = new JToggleButton("");
	private static JToggleButton e6 = new JToggleButton("");
	private static JToggleButton f6 = new JToggleButton("");
	private static JToggleButton g6 = new JToggleButton("");
	private static JToggleButton h6 = new JToggleButton("");
	private static JToggleButton a5 = new JToggleButton("");
	private static JToggleButton b5 = new JToggleButton("");
	private static JToggleButton c5 = new JToggleButton("");
	private static JToggleButton d5 = new JToggleButton("");
	private static JToggleButton e5 = new JToggleButton("");
	private static JToggleButton f5 = new JToggleButton("");
	private static JToggleButton g5 = new JToggleButton("");
	private static JToggleButton h5 = new JToggleButton("");
	private static JToggleButton a4 = new JToggleButton("");
	private static JToggleButton b4 = new JToggleButton("");
	private static JToggleButton c4 = new JToggleButton("");
	private static JToggleButton d4 = new JToggleButton("");
	private static JToggleButton e4 = new JToggleButton("");
	private static JToggleButton f4 = new JToggleButton("");
	private static JToggleButton g4 = new JToggleButton("");
	private static JToggleButton h4 = new JToggleButton("");
	private static JToggleButton a3 = new JToggleButton("");
	private static JToggleButton b3 = new JToggleButton("");
	private static JToggleButton c3 = new JToggleButton("");
	private static JToggleButton d3 = new JToggleButton("");
	private static JToggleButton e3 = new JToggleButton("");
	private static JToggleButton f3 = new JToggleButton("");
	private static JToggleButton g3 = new JToggleButton("");
	private static JToggleButton h3 = new JToggleButton("");
	private static JToggleButton a2 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton b2 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton c2 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton d2 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton e2 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton f2 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton g2 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton h2 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton a1 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton b1 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton c1 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton d1 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton e1 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton f1 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton g1 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	private static JToggleButton h1 = new JToggleButton(GameEnvironment.WHITE_PAWN_ICON);
	public static ArrayList<JToggleButton> allSquares = new ArrayList<>();
	public static HashMap<JToggleButton, String> squaresMap = new HashMap<>();
	public static final int BOARD_SIZE = 8;
	
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
	private static JToggleButton srcSquare;
	private static JToggleButton destSquare;
	
	private static ArrayList<JToggleButton> validDests = new ArrayList<>();
	
	
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
		GridBagConstraints gbcPanelBoard = new GridBagConstraints();
		gbcPanelBoard.fill = GridBagConstraints.BOTH;
		boardContainer.add(panelBoard, gbcPanelBoard);
		panelBoard.setLayout(new GridLayout(8, 8, 0, 0));
		
		frmMaster.pack();
		frmMaster.setMinimumSize(frmMaster.getSize()); //enable this line to prevent reszing the window to be any smaller
//		frmMaster.setMinimumSize(new Dimension(480, 480)); //do not let board squares go smaller than 60px
		
		
		a8.setText("a8");
		b8.setText("b8");
		c8.setText("c8");
		d8.setText("d8");
		e8.setText("e8");
		f8.setText("f8");
		g8.setText("g8");
		h8.setText("h8");
		a7.setText("a7");
		b7.setText("b7");
		c7.setText("c7");
		d7.setText("d7");
		e7.setText("e7");
		f7.setText("f7");
		g7.setText("g7");
		h7.setText("h7");
		a6.setText("a6");
		b6.setText("b6");
		c6.setText("c6");
		d6.setText("d6");
		e6.setText("e6");
		f6.setText("f6");
		g6.setText("g6");
		h6.setText("h6");
		a5.setText("a5");
		b5.setText("b5");
		c5.setText("c5");
		d5.setText("d5");
		e5.setText("e5");
		f5.setText("f5");
		g5.setText("g5");
		h5.setText("h5");
		a4.setText("a4");
		b4.setText("b4");
		c4.setText("c4");
		d4.setText("d4");
		e4.setText("e4");
		f4.setText("f4");
		g4.setText("g4");
		h4.setText("h4");
		a3.setText("a3");
		b3.setText("b3");
		c3.setText("c3");
		d3.setText("d3");
		e3.setText("e3");
		f3.setText("f3");
		g3.setText("g3");
		h3.setText("h3");
		a2.setText("a2");
		b2.setText("b2");
		c2.setText("c2");
		d2.setText("d2");
		e2.setText("e2");
		f2.setText("f2");
		g2.setText("g2");
		h2.setText("h2");
		a1.setText("a1");
		b1.setText("b1");
		c1.setText("c1");
		d1.setText("d1");
		e1.setText("e1");
		f1.setText("f1");
		g1.setText("g1");
		h1.setText("h1");
	    
		a8.setBackground(Color.WHITE);
		panelBoard.add(a8);
		a8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if the user selects this button, it must contain a white piece
				if(srcSquare == null) {
					findValidDestsFromButton(a8);}
				else {
					//TODO: USE THIS CODE
					setDestSquare(a8);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					//deselect the valid destinations from the previous move, and reselect the buttons with white pieces
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b8.setBackground(Color.BLACK);
		panelBoard.add(b8);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(b8);}
				else {
					Piece.movePiece(srcSquare, b8);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c8.setBackground(Color.WHITE);
		panelBoard.add(c8);
		c8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(c8);}
				else {
					Piece.movePiece(srcSquare, c8);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d8.setBackground(Color.BLACK);
		panelBoard.add(d8);
		d8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(d8);}
				else {
					Piece.movePiece(srcSquare, d8);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e8.setBackground(Color.WHITE);
		panelBoard.add(e8);
		e8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(e8);}
				else {
					Piece.movePiece(srcSquare, e8);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f8.setBackground(Color.BLACK);
		panelBoard.add(f8);
		f8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(f8);}
				else {
					Piece.movePiece(srcSquare, f8);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g8.setBackground(Color.WHITE);
		panelBoard.add(g8);
		g8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(g8);}
				else {
					Piece.movePiece(srcSquare, g8);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h8.setBackground(Color.BLACK);
		panelBoard.add(h8);
		h8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(h8);}
				else {
					Piece.movePiece(srcSquare, h8);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a7.setBackground(Color.BLACK);
		panelBoard.add(a7);
		a7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(a7);}
				else {
					Piece.movePiece(srcSquare, a7);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b7.setBackground(Color.WHITE);
		panelBoard.add(b7);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(b7);}
				else {
					Piece.movePiece(srcSquare, b7);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c7.setBackground(Color.BLACK);
		panelBoard.add(c7);
		c7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(c7);}
				else {
					Piece.movePiece(srcSquare, c7);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d7.setBackground(Color.WHITE);
		panelBoard.add(d7);
		d7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(d7);}
				else {
					Piece.movePiece(srcSquare, d7);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e7.setBackground(Color.BLACK);
		panelBoard.add(e7);
		e7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(e7);}
				else {
					Piece.movePiece(srcSquare, e7);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f7.setBackground(Color.WHITE);
		panelBoard.add(f7);
		f7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(f7);}
				else {
					Piece.movePiece(srcSquare, f7);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g7.setBackground(Color.BLACK);
		panelBoard.add(g7);
		g7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(g7);}
				else {
					Piece.movePiece(srcSquare, g7);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h7.setBackground(Color.WHITE);
		panelBoard.add(h7);
		h7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(h7);}
				else {
					Piece.movePiece(srcSquare, h7);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a6.setBackground(Color.WHITE);
		panelBoard.add(a6);
		a6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(a6);}
				else {
					Piece.movePiece(srcSquare, a6);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b6.setBackground(Color.BLACK);
		panelBoard.add(b6);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(b6);}
				else {
					Piece.movePiece(srcSquare, b6);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c6.setBackground(Color.WHITE);
		panelBoard.add(c6);
		c6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(c6);}
				else {
					Piece.movePiece(srcSquare, c6);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d6.setBackground(Color.BLACK);
		panelBoard.add(d6);
		d6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(d6);}
				else {
					Piece.movePiece(srcSquare, d6);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e6.setBackground(Color.WHITE);
		panelBoard.add(e6);
		e6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(e6);}
				else {
					Piece.movePiece(srcSquare, e6);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f6.setBackground(Color.BLACK);
		panelBoard.add(f6);
		f6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(f6);}
				else {
					Piece.movePiece(srcSquare, f6);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g6.setBackground(Color.WHITE);
		panelBoard.add(g6);
		g6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(g6);}
				else {
					Piece.movePiece(srcSquare, g6);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h6.setBackground(Color.BLACK);
		panelBoard.add(h6);
		h6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(h6);}
				else {
					Piece.movePiece(srcSquare, h6);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a5.setBackground(Color.BLACK);
		panelBoard.add(a5);
		a5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(a5);}
				else {
					Piece.movePiece(srcSquare, a5);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b5.setBackground(Color.WHITE);
		panelBoard.add(b5);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(b5);}
				else {
					Piece.movePiece(srcSquare, b5);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c5.setBackground(Color.BLACK);
		panelBoard.add(c5);
		c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(c5);}
				else {
					Piece.movePiece(srcSquare, c5);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d5.setBackground(Color.WHITE);
		panelBoard.add(d5);
		d5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(d5);}
				else {
					Piece.movePiece(srcSquare, d5);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e5.setBackground(Color.BLACK);
		panelBoard.add(e5);
		e5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(e5);}
				else {
					Piece.movePiece(srcSquare, e5);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f5.setBackground(Color.WHITE);
		panelBoard.add(f5);
		f5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(f5);}
				else {
					Piece.movePiece(srcSquare, f5);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g5.setBackground(Color.BLACK);
		panelBoard.add(g5);
		g5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(g5);}
				else {
					Piece.movePiece(srcSquare, g5);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h5.setBackground(Color.WHITE);
		panelBoard.add(h5);
		h5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(h5);}
				else {
					Piece.movePiece(srcSquare, h5);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a4.setBackground(Color.WHITE);
		panelBoard.add(a4);
		a4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(a4);}
				else {
					Piece.movePiece(srcSquare, a4);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b4.setBackground(Color.BLACK);
		panelBoard.add(b4);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(b4);}
				else {
					Piece.movePiece(srcSquare, b4);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c4.setBackground(Color.WHITE);
		panelBoard.add(c4);
		c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(c4);}
				else {
					Piece.movePiece(srcSquare, c4);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d4.setBackground(Color.BLACK);
		panelBoard.add(d4);
		d4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(d4);}
				else {
					Piece.movePiece(srcSquare, d4);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e4.setBackground(Color.WHITE);
		panelBoard.add(e4);
		e4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(e4);}
				else {
					Piece.movePiece(srcSquare, e4);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f4.setBackground(Color.BLACK);
		panelBoard.add(f4);
		f4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(f4);}
				else {
					Piece.movePiece(srcSquare, f4);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g4.setBackground(Color.WHITE);
		panelBoard.add(g4);
		g4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(g4);}
				else {
					Piece.movePiece(srcSquare, g4);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h4.setBackground(Color.BLACK);
		panelBoard.add(h4);
		h4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(h4);}
				else {
					Piece.movePiece(srcSquare, h4);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a3.setBackground(Color.BLACK);
		panelBoard.add(a3);
		a3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(a3);}
				else {
					Piece.movePiece(srcSquare, a3);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b3.setBackground(Color.WHITE);
		panelBoard.add(b3);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(b3);}
				else {
					Piece.movePiece(srcSquare, b3);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c3.setBackground(Color.BLACK);
		panelBoard.add(c3);
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(c3);}
				else {
					Piece.movePiece(srcSquare, c3);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d3.setBackground(Color.WHITE);
		panelBoard.add(d3);
		d3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(d3);}
				else {
					Piece.movePiece(srcSquare, d3);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e3.setBackground(Color.BLACK);
		panelBoard.add(e3);
		e3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(e3);}
				else {
					Piece.movePiece(srcSquare, e3);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f3.setBackground(Color.WHITE);
		panelBoard.add(f3);
		f3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(f3);}
				else {
					Piece.movePiece(srcSquare, f3);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g3.setBackground(Color.BLACK);
		panelBoard.add(g3);
		g3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(g3);}
				else {
					Piece.movePiece(srcSquare, g3);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h3.setBackground(Color.WHITE);
		panelBoard.add(h3);
		h3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(h3);}
				else {
					Piece.movePiece(srcSquare, h3);
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
				if(srcSquare == null) {
					findValidDestsFromButton(a2);}
				else {
					Piece.movePiece(srcSquare, a2);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b2.setBackground(Color.BLACK);
		panelBoard.add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(b2);}
				else {
					Piece.movePiece(srcSquare, b2);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c2.setBackground(Color.WHITE);
		panelBoard.add(c2);
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(c2);}
				else {
					Piece.movePiece(srcSquare, c2);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d2.setBackground(Color.BLACK);
		panelBoard.add(d2);
		d2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(d2);}
				else {
					Piece.movePiece(srcSquare, d2);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e2.setBackground(Color.WHITE);
		panelBoard.add(e2);
		e2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(e2);}
				else {
					Piece.movePiece(srcSquare, e2);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f2.setBackground(Color.BLACK);
		panelBoard.add(f2);
		f2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(f2);}
				else {
					Piece.movePiece(srcSquare, f2);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g2.setBackground(Color.WHITE);
		panelBoard.add(g2);
		g2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(g2);}
				else {
					Piece.movePiece(srcSquare, g2);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h2.setBackground(Color.BLACK);
		panelBoard.add(h2);
		h2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(h2);}
				else {
					Piece.movePiece(srcSquare, h2);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a1.setBackground(Color.BLACK);
		panelBoard.add(a1);
		a1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(a1);}
				else {
					Piece.movePiece(srcSquare, a1);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b1.setBackground(Color.WHITE);
		panelBoard.add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(b1);}
				else {
					Piece.movePiece(srcSquare, b1);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c1.setBackground(Color.BLACK);
		panelBoard.add(c1);
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(c1);}
				else {
					Piece.movePiece(srcSquare, c1);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d1.setBackground(Color.WHITE);
		panelBoard.add(d1);
		d1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(d1);}
				else {
					Piece.movePiece(srcSquare, d1);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e1.setBackground(Color.BLACK);
		panelBoard.add(e1);
		e1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(e1);}
				else {
					Piece.movePiece(srcSquare, e1);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f1.setBackground(Color.WHITE);
		panelBoard.add(f1);
		f1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(f1);}
				else {
					Piece.movePiece(srcSquare, f1);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g1.setBackground(Color.BLACK);
		panelBoard.add(g1);
		g1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					findValidDestsFromButton(g1);}
				else {
					Piece.movePiece(srcSquare, g1);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h1.setBackground(Color.WHITE);
		panelBoard.add(h1);
		h1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkButtons();
				
				if(srcSquare == null) {
					findValidDestsFromButton(h1);}
				else {
					Piece.movePiece(srcSquare, h1);
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
		
		//TODO: map buttons to their names (for use in notation)
		//use hashmap instead of treemap because JToggleButtons are not comparable, but they need to be if put in treemap
		Integer buttonIndex = 0;
		String letters = "abcdefgh";
		String numbers = "87654321";
		for(int i = 0; i < BOARD_SIZE; i++)
		{
			String numberName = numbers.substring(i, i + 1);
			
			for(int j = 0; j < BOARD_SIZE; j++)
			{
				String letterName = letters.substring(j, j + 1);
				
				JToggleButton squareButton = allSquares.get(buttonIndex);
				// the letter will go a-b-c-d-e-f-g-h-a..., while the number will go 8-8-8-8-8-8-8-8-7...
				String squareName = letterName + numberName;
				squaresMap.put(squareButton, squareName);
				
				buttonIndex ++;
			}
		}
		
	
//		System.out.println("allSquares:");
//		for(int i = 0; i < allSquares.size(); i++)
//		{
//			System.out.println(allSquares.get(i));
//		}
//		
//		System.out.println("squaresMap:");
//		for(int i = 0; i < squaresMap.size(); i++)
//		{
//			System.out.println(squaresMap.get(allSquares.get(i)));
//		}
		
		
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
	public static void findValidDestsFromButton(JToggleButton srcBtn)
	{
		System.out.println("findValidDestsFromButton");
		Piece selectedPiece = Piece.findPiece(GameEnvironment.getWhitePieces(), srcBtn);
		System.out.println(allSquares.indexOf(srcBtn));
		
		//first find the valid destinations
		//TODO: reuse this code from GameEnvironment
		if(selectedPiece instanceof Pawn) {
			validDests = ((Pawn) selectedPiece).findValidDests();}
		else if(selectedPiece instanceof Knight) {
			validDests = ((Knight) selectedPiece).findValidDests();}
		else if(selectedPiece instanceof Bishop) {
			validDests = ((Bishop) selectedPiece).findValidDests();}
		else if(selectedPiece instanceof Rook) {
			validDests = ((Rook) selectedPiece).findValidDests();}
		else if(selectedPiece instanceof Queen) {
			validDests = ((Queen) selectedPiece).findValidDests();}
		else if(selectedPiece instanceof King) {
			validDests = ((King) selectedPiece).findValidDests();}
		
//		for(int i = 0; i < validDests.size(); i++)
//		{
//			int destIndex = allSquares.indexOf(validDests.get(i));
//			System.out.println("a destination:" + "\t" + destIndex);
//		}
		
		//colour the destinations and enable the associated buttons so that they can be clicked as the destination
		for(int i = 0; i < validDests.size(); i++)
		{
			JToggleButton btn = validDests.get(i);
			btn.setBackground(GameEnvironment.VALID_DESTINATION_COLOUR);
			btn.setEnabled(true);	
		}
		
		setSrcSquare(srcBtn);
		
		//disable all buttons with white pieces on them because they are not possible destinations
		GameEnvironment.toggleSelectWhitePieceButtons(false, false, false);
	}
	
	
	public static void setSquareToOriginalColour(JToggleButton square)
	{
		int squareIndex = BoardWindow.getAllSquares().indexOf(square);
		Color squareOriginalColour = null;
		//find out the col
		//  if the col is even, then the distribution of squares is different to if it was odd
		if(squareIndex % BOARD_SIZE == 0 
				|| squareIndex % BOARD_SIZE == 2
				|| squareIndex % BOARD_SIZE == 4
				|| squareIndex % BOARD_SIZE == 6)
		{
			if(squareIndex % (BOARD_SIZE*2) == 0
					|| squareIndex % (BOARD_SIZE*2) == 2
					|| squareIndex % (BOARD_SIZE*2) == 4
					|| squareIndex % (BOARD_SIZE*2) == 6)
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
	public static ArrayList<JToggleButton> getAllSquares() {
		return allSquares;}
	public static ArrayList<JToggleButton> getValidDests() {
		return validDests;}
	public static JTextArea getMovesHistory() {
		return movesHistory;}
	public static JToggleButton getSrcSquare() {
		if(srcSquare != null)
		{
			return srcSquare;
		}
		else
		{
			//for first move of the game
			return null;
		}
	}
	public static JToggleButton getDestSquare() {
		return destSquare;}
	
	
	//setters
	public static void setSrcSquare(JToggleButton square) {
		srcSquare = square;}
	
	public static void setDestSquare(JToggleButton square) {
		destSquare = square;}
	
	public static void setSquareText(JToggleButton square, ImageIcon icon, Color textColour) 
	{
		square.setIcon(icon);
		square.setDisabledIcon(icon); //prevents the icon getting greyed out when the button is disabled
		square.setForeground(textColour);
	}

	public static void resetSrcSquare() {
		setSrcSquare(null);
	}

	
	

}
