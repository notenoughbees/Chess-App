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
					setSrcSquare(a8);
					findValidDestsFromButton(a8);}
				else {
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
					setSrcSquare(b8);
					findValidDestsFromButton(b8);}
				else {
					setDestSquare(b8);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c8.setBackground(Color.WHITE);
		panelBoard.add(c8);
		c8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(c8);
					findValidDestsFromButton(c8);}
				else {
					setDestSquare(c8);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d8.setBackground(Color.BLACK);
		panelBoard.add(d8);
		d8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(d8);
					findValidDestsFromButton(d8);}
				else {
					setDestSquare(d8);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e8.setBackground(Color.WHITE);
		panelBoard.add(e8);
		e8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(e8);
					findValidDestsFromButton(e8);}
				else {
					setDestSquare(e8);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f8.setBackground(Color.BLACK);
		panelBoard.add(f8);
		f8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(f8);
					findValidDestsFromButton(f8);}
				else {
					setDestSquare(f8);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g8.setBackground(Color.WHITE);
		panelBoard.add(g8);
		g8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(g8);
					findValidDestsFromButton(g8);}
				else {
					setDestSquare(g8);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h8.setBackground(Color.BLACK);
		panelBoard.add(h8);
		h8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(h8);
					findValidDestsFromButton(h8);}
				else {
					setDestSquare(h8);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a7.setBackground(Color.BLACK);
		panelBoard.add(a7);
		a7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(a7);
					findValidDestsFromButton(a7);}
				else {
					setDestSquare(a7);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b7.setBackground(Color.WHITE);
		panelBoard.add(b7);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(b7);
					findValidDestsFromButton(b7);}
				else {
					setDestSquare(b7);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c7.setBackground(Color.BLACK);
		panelBoard.add(c7);
		c7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(c7);
					findValidDestsFromButton(c7);}
				else {
					setDestSquare(c7);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d7.setBackground(Color.WHITE);
		panelBoard.add(d7);
		d7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(d7);
					findValidDestsFromButton(d7);}
				else {
					setDestSquare(d7);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e7.setBackground(Color.BLACK);
		panelBoard.add(e7);
		e7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(e7);
					findValidDestsFromButton(e7);}
				else {
					setDestSquare(e7);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f7.setBackground(Color.WHITE);
		panelBoard.add(f7);
		f7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(f7);
					findValidDestsFromButton(f7);}
				else {
					setDestSquare(f7);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g7.setBackground(Color.BLACK);
		panelBoard.add(g7);
		g7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(g7);
					findValidDestsFromButton(g7);}
				else {
					setDestSquare(g7);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h7.setBackground(Color.WHITE);
		panelBoard.add(h7);
		h7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(h7);
					findValidDestsFromButton(h7);}
				else {
					setDestSquare(h7);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a6.setBackground(Color.WHITE);
		panelBoard.add(a6);
		a6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(a6);
					findValidDestsFromButton(a6);}
				else {
					setDestSquare(a6);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b6.setBackground(Color.BLACK);
		panelBoard.add(b6);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(b6);
					findValidDestsFromButton(b6);}
				else {
					setDestSquare(b6);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c6.setBackground(Color.WHITE);
		panelBoard.add(c6);
		c6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(c6);
					findValidDestsFromButton(c6);}
				else {
					setDestSquare(c6);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d6.setBackground(Color.BLACK);
		panelBoard.add(d6);
		d6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(d6);
					findValidDestsFromButton(d6);}
				else {
					setDestSquare(d6);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e6.setBackground(Color.WHITE);
		panelBoard.add(e6);
		e6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(e6);
					findValidDestsFromButton(e6);}
				else {
					setDestSquare(e6);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f6.setBackground(Color.BLACK);
		panelBoard.add(f6);
		f6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(f6);
					findValidDestsFromButton(f6);}
				else {
					setDestSquare(f6);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g6.setBackground(Color.WHITE);
		panelBoard.add(g6);
		g6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(g6);
					findValidDestsFromButton(g6);}
				else {
					setDestSquare(g6);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h6.setBackground(Color.BLACK);
		panelBoard.add(h6);
		h6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(h6);
					findValidDestsFromButton(h6);}
				else {
					setDestSquare(h6);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a5.setBackground(Color.BLACK);
		panelBoard.add(a5);
		a5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(a5);
					findValidDestsFromButton(a5);}
				else {
					setDestSquare(a5);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b5.setBackground(Color.WHITE);
		panelBoard.add(b5);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(b5);
					findValidDestsFromButton(b5);}
				else {
					setDestSquare(b5);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c5.setBackground(Color.BLACK);
		panelBoard.add(c5);
		c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(c5);
					findValidDestsFromButton(c5);}
				else {
					setDestSquare(c5);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d5.setBackground(Color.WHITE);
		panelBoard.add(d5);
		d5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(d5);
					findValidDestsFromButton(d5);}
				else {
					setDestSquare(d5);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e5.setBackground(Color.BLACK);
		panelBoard.add(e5);
		e5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(e5);
					findValidDestsFromButton(e5);}
				else {
					setDestSquare(e5);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f5.setBackground(Color.WHITE);
		panelBoard.add(f5);
		f5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(f5);
					findValidDestsFromButton(f5);}
				else {
					setDestSquare(f5);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g5.setBackground(Color.BLACK);
		panelBoard.add(g5);
		g5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(g5);
					findValidDestsFromButton(g5);}
				else {
					setDestSquare(g5);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h5.setBackground(Color.WHITE);
		panelBoard.add(h5);
		h5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(h5);
					findValidDestsFromButton(h5);}
				else {
					setDestSquare(h5);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a4.setBackground(Color.WHITE);
		panelBoard.add(a4);
		a4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(a4);
					findValidDestsFromButton(a4);}
				else {
					setDestSquare(a4);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b4.setBackground(Color.BLACK);
		panelBoard.add(b4);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(b4);
					findValidDestsFromButton(b4);}
				else {
					setDestSquare(b4);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c4.setBackground(Color.WHITE);
		panelBoard.add(c4);
		c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(c4);
					findValidDestsFromButton(c4);}
				else {
					setDestSquare(c4);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d4.setBackground(Color.BLACK);
		panelBoard.add(d4);
		d4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(d4);
					findValidDestsFromButton(d4);}
				else {
					setDestSquare(d4);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e4.setBackground(Color.WHITE);
		panelBoard.add(e4);
		e4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(e4);
					findValidDestsFromButton(e4);}
				else {
					setDestSquare(e4);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f4.setBackground(Color.BLACK);
		panelBoard.add(f4);
		f4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(f4);
					findValidDestsFromButton(f4);}
				else {
					setDestSquare(f4);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g4.setBackground(Color.WHITE);
		panelBoard.add(g4);
		g4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(g4);
					findValidDestsFromButton(g4);}
				else {
					setDestSquare(g4);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h4.setBackground(Color.BLACK);
		panelBoard.add(h4);
		h4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(h4);
					findValidDestsFromButton(h4);}
				else {
					setDestSquare(h4);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a3.setBackground(Color.BLACK);
		panelBoard.add(a3);
		a3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(a3);
					findValidDestsFromButton(a3);}
				else {
					setDestSquare(a3);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b3.setBackground(Color.WHITE);
		panelBoard.add(b3);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(b3);
					findValidDestsFromButton(b3);}
				else {
					setDestSquare(b3);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c3.setBackground(Color.BLACK);
		panelBoard.add(c3);
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(c3);
					findValidDestsFromButton(c3);}
				else {
					setDestSquare(c3);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d3.setBackground(Color.WHITE);
		panelBoard.add(d3);
		d3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(d3);
					findValidDestsFromButton(d3);}
				else {
					setDestSquare(d3);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e3.setBackground(Color.BLACK);
		panelBoard.add(e3);
		e3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(e3);
					findValidDestsFromButton(e3);}
				else {
					setDestSquare(e3);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f3.setBackground(Color.WHITE);
		panelBoard.add(f3);
		f3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(f3);
					findValidDestsFromButton(f3);}
				else {
					setDestSquare(f3);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g3.setBackground(Color.BLACK);
		panelBoard.add(g3);
		g3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(g3);
					findValidDestsFromButton(g3);}
				else {
					setDestSquare(g3);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h3.setBackground(Color.WHITE);
		panelBoard.add(h3);
		h3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(h3);
					findValidDestsFromButton(h3);}
				else {
					setDestSquare(h3);
					Piece.movePiece(srcSquare, destSquare);
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
					setSrcSquare(a2);
					findValidDestsFromButton(a2);}
				else {
					setDestSquare(a2);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b2.setBackground(Color.BLACK);
		panelBoard.add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(b2);
					findValidDestsFromButton(b2);}
				else {
					setDestSquare(b2);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c2.setBackground(Color.WHITE);
		panelBoard.add(c2);
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(c2);
					findValidDestsFromButton(c2);}
				else {
					setDestSquare(c2);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d2.setBackground(Color.BLACK);
		panelBoard.add(d2);
		d2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(d2);
					findValidDestsFromButton(d2);}
				else {
					setDestSquare(d2);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e2.setBackground(Color.WHITE);
		panelBoard.add(e2);
		e2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(e2);
					findValidDestsFromButton(e2);}
				else {
					setDestSquare(e2);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f2.setBackground(Color.BLACK);
		panelBoard.add(f2);
		f2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(f2);
					findValidDestsFromButton(f2);}
				else {
					setDestSquare(f2);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g2.setBackground(Color.WHITE);
		panelBoard.add(g2);
		g2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(g2);
					findValidDestsFromButton(g2);}
				else {
					setDestSquare(g2);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h2.setBackground(Color.BLACK);
		panelBoard.add(h2);
		h2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(h2);
					findValidDestsFromButton(h2);}
				else {
					setDestSquare(h2);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a1.setBackground(Color.BLACK);
		panelBoard.add(a1);
		a1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(a1);
					findValidDestsFromButton(a1);}
				else {
					setDestSquare(a1);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b1.setBackground(Color.WHITE);
		panelBoard.add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(b1);
					findValidDestsFromButton(b1);}
				else {
					setDestSquare(b1);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c1.setBackground(Color.BLACK);
		panelBoard.add(c1);
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(c1);
					findValidDestsFromButton(c1);}
				else {
					setDestSquare(c1);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d1.setBackground(Color.WHITE);
		panelBoard.add(d1);
		d1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(d1);
					findValidDestsFromButton(d1);}
				else {
					setDestSquare(d1);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e1.setBackground(Color.BLACK);
		panelBoard.add(e1);
		e1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(e1);
					findValidDestsFromButton(e1);}
				else {
					setDestSquare(e1);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f1.setBackground(Color.WHITE);
		panelBoard.add(f1);
		f1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(f1);
					findValidDestsFromButton(f1);}
				else {
					setDestSquare(f1);
					Piece.movePiece(srcSquare, destSquare);
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g1.setBackground(Color.BLACK);
		panelBoard.add(g1);
		g1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(g1);
					findValidDestsFromButton(g1);}
				else {
					setDestSquare(g1);
					Piece.movePiece(srcSquare, destSquare);
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
					setSrcSquare(h1);
					findValidDestsFromButton(h1);}
				else {
					setDestSquare(h1);
					Piece.movePiece(srcSquare, destSquare);
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
	/*
	 * If given a JToggleButton, sets srcSquare. If given NULL, resets srcSquare.
	 */
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

	
	

}
