package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
	private JFrame masterFrm;
	private static JMenuBar menuBar = new JMenuBar();
	private static JPanel innerBoardPanel = new JPanel();
	private static JTextArea movesTextArea = new JTextArea();
	private static JToggleButton a8 = new JToggleButton();
	private static JToggleButton b8 = new JToggleButton();
	private static JToggleButton c8 = new JToggleButton();
	private static JToggleButton d8 = new JToggleButton();
	private static JToggleButton e8 = new JToggleButton();
	private static JToggleButton f8 = new JToggleButton();
	private static JToggleButton g8 = new JToggleButton();
	private static JToggleButton h8 = new JToggleButton();
	private static JToggleButton a7 = new JToggleButton();
	private static JToggleButton b7 = new JToggleButton();
	private static JToggleButton c7 = new JToggleButton();
	private static JToggleButton d7 = new JToggleButton();
	private static JToggleButton e7 = new JToggleButton();
	private static JToggleButton f7 = new JToggleButton();
	private static JToggleButton g7 = new JToggleButton();
	private static JToggleButton h7 = new JToggleButton();
	private static JToggleButton a6 = new JToggleButton();
	private static JToggleButton b6 = new JToggleButton();
	private static JToggleButton c6 = new JToggleButton();
	private static JToggleButton d6 = new JToggleButton();
	private static JToggleButton e6 = new JToggleButton();
	private static JToggleButton f6 = new JToggleButton();
	private static JToggleButton g6 = new JToggleButton();
	private static JToggleButton h6 = new JToggleButton();
	private static JToggleButton a5 = new JToggleButton();
	private static JToggleButton b5 = new JToggleButton();
	private static JToggleButton c5 = new JToggleButton();
	private static JToggleButton d5 = new JToggleButton();
	private static JToggleButton e5 = new JToggleButton();
	private static JToggleButton f5 = new JToggleButton();
	private static JToggleButton g5 = new JToggleButton();
	private static JToggleButton h5 = new JToggleButton();
	private static JToggleButton a4 = new JToggleButton();
	private static JToggleButton b4 = new JToggleButton();
	private static JToggleButton c4 = new JToggleButton();
	private static JToggleButton d4 = new JToggleButton();
	private static JToggleButton e4 = new JToggleButton();
	private static JToggleButton f4 = new JToggleButton();
	private static JToggleButton g4 = new JToggleButton();
	private static JToggleButton h4 = new JToggleButton();
	private static JToggleButton a3 = new JToggleButton();
	private static JToggleButton b3 = new JToggleButton();
	private static JToggleButton c3 = new JToggleButton();
	private static JToggleButton d3 = new JToggleButton();
	private static JToggleButton e3 = new JToggleButton();
	private static JToggleButton f3 = new JToggleButton();
	private static JToggleButton g3 = new JToggleButton();
	private static JToggleButton h3 = new JToggleButton();
	private static JToggleButton a2 = new JToggleButton();
	private static JToggleButton b2 = new JToggleButton();
	private static JToggleButton c2 = new JToggleButton();
	private static JToggleButton d2 = new JToggleButton();
	private static JToggleButton e2 = new JToggleButton();
	private static JToggleButton f2 = new JToggleButton();
	private static JToggleButton g2 = new JToggleButton();
	private static JToggleButton h2 = new JToggleButton();
	private static JToggleButton a1 = new JToggleButton();
	private static JToggleButton b1 = new JToggleButton();
	private static JToggleButton c1 = new JToggleButton();
	private static JToggleButton d1 = new JToggleButton();
	private static JToggleButton e1 = new JToggleButton();
	private static JToggleButton f1 = new JToggleButton();
	private static JToggleButton g1 = new JToggleButton();
	private static JToggleButton h1 = new JToggleButton();
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
	
	//menu options
	private Boolean doBlood = false;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardWindow window = new BoardWindow();
					window.masterFrm.setVisible(true);
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
		masterFrm.setVisible(true); //show the window
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//master frame with GridBagLayout that holds the menu bar, board, and moves history
		masterFrm = new JFrame();
		masterFrm.setTitle("Chess App");
		masterFrm.setBounds(100, 100, (70*8+70*2), 70*8);
		masterFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gbcMaster = new GridBagLayout();
		gbcMaster.columnWeights = new double[]{masterFrm.getWidth()/10};
		gbcMaster.rowWeights = new double[]{masterFrm.getWidth()/10};
		masterFrm.getContentPane().setLayout(gbcMaster);
		
		
		//menu bar that gets added to masterFrm
		GridBagConstraints gbcMenuBar = new GridBagConstraints();
		gbcMenuBar.gridx = 0;
		gbcMenuBar.gridy = 0;
		gbcMenuBar.gridwidth = 2;
		masterFrm.add(menuBar, gbcMenuBar);
		
		//menus
		JMenu Appearance = new JMenu("Appearance");
		Appearance.setFont(new Font("Tahoma", Font.PLAIN, 11));
		menuBar.add(Appearance);
		JMenu Behaviour = new JMenu("Behaviour");
		Behaviour.setFont(new Font("Tahoma", Font.PLAIN, 11));
		menuBar.add(Behaviour);
		
		//submenus
		
		//menu items
		JMenuItem AppearanceBlood = new JMenuItem("Toggle Blood Stains");
		AppearanceBlood.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Appearance.add(AppearanceBlood);
		AppearanceBlood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBlood = true;
			}
		});
		JMenuItem BehaviourAiDelay = new JMenuItem("Configure AI Delay");
		BehaviourAiDelay.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Behaviour.add(BehaviourAiDelay);
		BehaviourAiDelay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
			}
		});
		
		
		//moves history text box that gets added to masterFrm
		GridBagConstraints gbcMovesTextArea = new GridBagConstraints();
		gbcMovesTextArea.fill = GridBagConstraints.VERTICAL; //make component only expand vertically if resized
		gbcMovesTextArea.gridx = 1;
		gbcMovesTextArea.gridy = 1;
		masterFrm.getContentPane().add(movesTextArea, gbcMovesTextArea);
		movesTextArea.setPreferredSize(new Dimension(140, 560)); //makes the text box take up a specific size even if the text in it doesn't need that much space
//		movesTextArea.setMinimumSize(new Dimension(60, 480));
		movesTextArea.setEditable(false);
		
		
		//panel with GridBagLayout that gets added to masterFrm
		JPanel outerBoardPanel = new JPanel();
		GridBagConstraints gbcOuterBoardPanel = new GridBagConstraints();
		gbcOuterBoardPanel.fill = GridBagConstraints.BOTH;
		gbcOuterBoardPanel.gridx = 0;
		gbcOuterBoardPanel.gridy = 1;
//		gbcOuterBoardPanel.weightx = 1;
//		gbcOuterBoardPanel.weighty = 1;
		masterFrm.getContentPane().add(outerBoardPanel, gbcOuterBoardPanel);
		GridBagLayout gblOuterBoardPanel = new GridBagLayout();
		gblOuterBoardPanel.columnWidths = new int[]{masterFrm.getWidth()/10};
		gblOuterBoardPanel.rowHeights = new int[]{0, masterFrm.getWidth()/10};
		gblOuterBoardPanel.columnWeights = new double[]{masterFrm.getWidth()/10};
		gblOuterBoardPanel.rowWeights = new double[]{0.0, masterFrm.getWidth()/10};
		outerBoardPanel.setLayout(gblOuterBoardPanel);
		outerBoardPanel.setPreferredSize(new Dimension(560, 560));
		
		//panel with GridLayout that holds the buttons of the board
		GridBagConstraints gbcInnerBoardPanel = new GridBagConstraints();
		gbcInnerBoardPanel.gridx = 0;
		gbcInnerBoardPanel.gridy = 1;
		gbcInnerBoardPanel.fill = GridBagConstraints.BOTH;
		outerBoardPanel.add(innerBoardPanel, gbcInnerBoardPanel);
		innerBoardPanel.setLayout(new GridLayout(8, 8, 0, 0));
		
		
		masterFrm.pack();
		masterFrm.setMinimumSize(masterFrm.getSize()); //enable this line to prevent reszing the window to be any smaller
//		masterFrm.setMinimumSize(new Dimension(480, 480)); //do not let board squares go smaller than 60px
		
		
	    
		a8.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		a8.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		a8.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(a8);
		a8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if the user selects this button, it must contain a white piece
				if(srcSquare == null) {
					setSrcSquare(a8);
					findValidDestsFromButton(a8);}
				else {
					setDestSquare(a8);
					//we know that opponentPieces here must be the computer/black pieces bc 
					// only the human/white player will be clicking the buttons
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					//deselect the valid destinations from the previous move, and reselect the buttons with white pieces
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b8.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		b8.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(b8);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(b8);
					findValidDestsFromButton(b8);}
				else {
					setDestSquare(b8);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c8.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		c8.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(c8);
		c8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(c8);
					findValidDestsFromButton(c8);}
				else {
					setDestSquare(c8);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d8.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		d8.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(d8);
		d8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(d8);
					findValidDestsFromButton(d8);}
				else {
					setDestSquare(d8);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e8.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		e8.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(e8);
		e8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(e8);
					findValidDestsFromButton(e8);}
				else {
					setDestSquare(e8);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f8.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		f8.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(f8);
		f8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(f8);
					findValidDestsFromButton(f8);}
				else {
					setDestSquare(f8);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g8.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		g8.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(g8);
		g8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(g8);
					findValidDestsFromButton(g8);}
				else {
					setDestSquare(g8);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h8.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		h8.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(h8);
		h8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(h8);
					findValidDestsFromButton(h8);}
				else {
					setDestSquare(h8);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a7.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		a7.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(a7);
		a7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(a7);
					findValidDestsFromButton(a7);}
				else {
					setDestSquare(a7);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b7.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		b7.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(b7);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(b7);
					findValidDestsFromButton(b7);}
				else {
					setDestSquare(b7);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c7.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		c7.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(c7);
		c7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(c7);
					findValidDestsFromButton(c7);}
				else {
					setDestSquare(c7);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d7.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		d7.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(d7);
		d7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(d7);
					findValidDestsFromButton(d7);}
				else {
					setDestSquare(d7);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e7.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		e7.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(e7);
		e7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(e7);
					findValidDestsFromButton(e7);}
				else {
					setDestSquare(e7);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f7.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		f7.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(f7);
		f7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(f7);
					findValidDestsFromButton(f7);}
				else {
					setDestSquare(f7);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g7.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		g7.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(g7);
		g7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(g7);
					findValidDestsFromButton(g7);}
				else {
					setDestSquare(g7);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h7.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		h7.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(h7);
		h7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(h7);
					findValidDestsFromButton(h7);}
				else {
					setDestSquare(h7);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a6.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		a6.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(a6);
		a6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(a6);
					findValidDestsFromButton(a6);}
				else {
					setDestSquare(a6);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b6.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		b6.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(b6);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(b6);
					findValidDestsFromButton(b6);}
				else {
					setDestSquare(b6);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c6.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		c6.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(c6);
		c6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(c6);
					findValidDestsFromButton(c6);}
				else {
					setDestSquare(c6);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d6.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		d6.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(d6);
		d6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(d6);
					findValidDestsFromButton(d6);}
				else {
					setDestSquare(d6);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e6.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		e6.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(e6);
		e6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(e6);
					findValidDestsFromButton(e6);}
				else {
					setDestSquare(e6);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f6.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		f6.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(f6);
		f6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(f6);
					findValidDestsFromButton(f6);}
				else {
					setDestSquare(f6);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g6.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		g6.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(g6);
		g6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(g6);
					findValidDestsFromButton(g6);}
				else {
					setDestSquare(g6);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h6.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		h6.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(h6);
		h6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(h6);
					findValidDestsFromButton(h6);}
				else {
					setDestSquare(h6);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a5.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		a5.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(a5);
		a5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(a5);
					findValidDestsFromButton(a5);}
				else {
					setDestSquare(a5);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b5.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		b5.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(b5);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(b5);
					findValidDestsFromButton(b5);}
				else {
					setDestSquare(b5);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c5.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		c5.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(c5);
		c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(c5);
					findValidDestsFromButton(c5);}
				else {
					setDestSquare(c5);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d5.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		d5.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(d5);
		d5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(d5);
					findValidDestsFromButton(d5);}
				else {
					setDestSquare(d5);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e5.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		e5.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(e5);
		e5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(e5);
					findValidDestsFromButton(e5);}
				else {
					setDestSquare(e5);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f5.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		f5.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(f5);
		f5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(f5);
					findValidDestsFromButton(f5);}
				else {
					setDestSquare(f5);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g5.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		g5.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(g5);
		g5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(g5);
					findValidDestsFromButton(g5);}
				else {
					setDestSquare(g5);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h5.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		h5.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(h5);
		h5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(h5);
					findValidDestsFromButton(h5);}
				else {
					setDestSquare(h5);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a4.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		a4.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(a4);
		a4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(a4);
					findValidDestsFromButton(a4);}
				else {
					setDestSquare(a4);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b4.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		b4.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(b4);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(b4);
					findValidDestsFromButton(b4);}
				else {
					setDestSquare(b4);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c4.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		c4.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(c4);
		c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(c4);
					findValidDestsFromButton(c4);}
				else {
					setDestSquare(c4);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d4.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		d4.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(d4);
		d4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(d4);
					findValidDestsFromButton(d4);}
				else {
					setDestSquare(d4);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e4.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		e4.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(e4);
		e4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(e4);
					findValidDestsFromButton(e4);}
				else {
					setDestSquare(e4);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f4.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		f4.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(f4);
		f4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(f4);
					findValidDestsFromButton(f4);}
				else {
					setDestSquare(f4);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g4.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		g4.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(g4);
		g4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(g4);
					findValidDestsFromButton(g4);}
				else {
					setDestSquare(g4);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h4.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		h4.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(h4);
		h4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(h4);
					findValidDestsFromButton(h4);}
				else {
					setDestSquare(h4);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a3.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		a3.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(a3);
		a3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(a3);
					findValidDestsFromButton(a3);}
				else {
					setDestSquare(a3);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b3.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		b3.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(b3);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(b3);
					findValidDestsFromButton(b3);}
				else {
					setDestSquare(b3);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c3.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		c3.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(c3);
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(c3);
					findValidDestsFromButton(c3);}
				else {
					setDestSquare(c3);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d3.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		d3.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(d3);
		d3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(d3);
					findValidDestsFromButton(d3);}
				else {
					setDestSquare(d3);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e3.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		e3.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(e3);
		e3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(e3);
					findValidDestsFromButton(e3);}
				else {
					setDestSquare(e3);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f3.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		f3.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(f3);
		f3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(f3);
					findValidDestsFromButton(f3);}
				else {
					setDestSquare(f3);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g3.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		g3.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(g3);
		g3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(g3);
					findValidDestsFromButton(g3);}
				else {
					setDestSquare(g3);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h3.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		h3.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(h3);
		h3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(h3);
					findValidDestsFromButton(h3);}
				else {
					setDestSquare(h3);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a2.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		a2.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(a2);
		a2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(a2);
					findValidDestsFromButton(a2);}
				else {
					setDestSquare(a2);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b2.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		b2.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(b2);
					findValidDestsFromButton(b2);}
				else {
					setDestSquare(b2);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c2.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		c2.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(c2);
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(c2);
					findValidDestsFromButton(c2);}
				else {
					setDestSquare(c2);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d2.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		d2.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(d2);
		d2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(d2);
					findValidDestsFromButton(d2);}
				else {
					setDestSquare(d2);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e2.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		e2.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(e2);
		e2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(e2);
					findValidDestsFromButton(e2);}
				else {
					setDestSquare(e2);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f2.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		f2.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(f2);
		f2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(f2);
					findValidDestsFromButton(f2);}
				else {
					setDestSquare(f2);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g2.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		g2.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(g2);
		g2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(g2);
					findValidDestsFromButton(g2);}
				else {
					setDestSquare(g2);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h2.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		h2.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(h2);
		h2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(h2);
					findValidDestsFromButton(h2);}
				else {
					setDestSquare(h2);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		a1.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		a1.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(a1);
		a1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(a1);
					findValidDestsFromButton(a1);}
				else {
					setDestSquare(a1);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		b1.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		b1.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(b1);
					findValidDestsFromButton(b1);}
				else {
					setDestSquare(b1);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		c1.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		c1.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(c1);
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(c1);
					findValidDestsFromButton(c1);}
				else {
					setDestSquare(c1);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		d1.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		d1.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(d1);
		d1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(d1);
					findValidDestsFromButton(d1);}
				else {
					setDestSquare(d1);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		e1.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		e1.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(e1);
		e1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(e1);
					findValidDestsFromButton(e1);}
				else {
					setDestSquare(e1);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		f1.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		f1.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(f1);
		f1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(f1);
					findValidDestsFromButton(f1);}
				else {
					setDestSquare(f1);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		g1.setIcon(GameEnvironment.BLACK_SQUARE_ICON);
		g1.setDisabledIcon(GameEnvironment.BLACK_SQUARE_ICON);
		innerBoardPanel.add(g1);
		g1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(g1);
					findValidDestsFromButton(g1);}
				else {
					setDestSquare(g1);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
					GameEnvironment.setHasWhiteMoved(true);
					GameEnvironment.toggleSelectWhitePieceButtons(true, true, false);}
			}
		});
		
		h1.setIcon(GameEnvironment.WHITE_SQUARE_ICON);
		h1.setDisabledIcon(GameEnvironment.WHITE_SQUARE_ICON);
		innerBoardPanel.add(h1);
		h1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(srcSquare == null) {
					setSrcSquare(h1);
					findValidDestsFromButton(h1);}
				else {
					setDestSquare(h1);
					Piece.movePiece(srcSquare, destSquare, GameEnvironment.getBlackPieces());
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
	}
	
	
	
	/**
	 * Runs during white's (the human player's) turn, once they have selected a button.
	 * Given this button, finds the valid destinations from this button for the piece that is on it.
	 * @param srcBtn: The selected button.
	 */
	public static void findValidDestsFromButton(JToggleButton srcBtn)
	{
		System.out.println("findValidDestsFromButton");
		Piece selectedPiece = Piece.findPiece(srcBtn);
		//System.out.println(allSquares.indexOf(srcBtn));
		
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
		
		for(int i = 0; i < validDests.size(); i++)
		{
			int destIndex = allSquares.indexOf(validDests.get(i));
			System.out.println("a destination:" + "\t" + destIndex);
		}
		
		//colour the destinations and enable the associated buttons so that they can be clicked as the destination
		for(int i = 0; i < validDests.size(); i++)
		{
			JToggleButton btn = validDests.get(i);
			btn.setIcon(GameEnvironment.VALID_DEST_SQUARE_ICON);
			btn.setEnabled(true);	
		}
		
		//disable all buttons with white pieces on them because they are not possible destinations
		GameEnvironment.toggleSelectWhitePieceButtons(false, false, false);
	}
	
	
	public static void setSquareToOriginalColour(JToggleButton square)
	{
		int squareIndex = BoardWindow.getAllSquares().indexOf(square);
		ImageIcon squareOriginalColour = null;
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
				squareOriginalColour = GameEnvironment.WHITE_SQUARE_ICON;
			}
			else //for when srcSquareIndex % 16 == 8 or 10 or 12 or 14 (or other)
			{
				squareOriginalColour = GameEnvironment.BLACK_SQUARE_ICON;
			}		
		}
		
		else //ie: srcSquareIndex % 8 == 1 or 3 or 5 or 7
		{
			if(squareIndex % 16 == 1
					|| squareIndex % 16 == 3
					|| squareIndex % 16 == 5
					|| squareIndex % 16 == 7)
			{
				squareOriginalColour = GameEnvironment.BLACK_SQUARE_ICON;
			}
			else //for when srcSquareIndex % 16 == something else
			{
				squareOriginalColour = GameEnvironment.WHITE_SQUARE_ICON;
			}		
		}
		square.setIcon(squareOriginalColour);
	}
	
	
	/*
	 * Given a square, checks if that square does not have a piece on it 
	 * - IE the icon for it is just a white or black square, rather than a piece.
	 */
	public static boolean isSquareEmpty(JToggleButton s)
	{
		return s.getIcon() == GameEnvironment.WHITE_SQUARE_ICON || 
				s.getIcon() == GameEnvironment.BLACK_SQUARE_ICON;
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
		return movesTextArea;}
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
