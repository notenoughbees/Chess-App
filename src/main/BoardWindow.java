package main;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JToggleButton;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;

public class BoardWindow {
	//initialise instance variables
	private JFrame frmChessApp;
	private static JToggleButton a1 = new JToggleButton("");
	private static JToggleButton b1 = new JToggleButton("");
	private static JToggleButton c1 = new JToggleButton("");
	private static JToggleButton d1 = new JToggleButton("");
	private static JToggleButton e1 = new JToggleButton("");
	private static JToggleButton f1 = new JToggleButton("");
	private static JToggleButton g1 = new JToggleButton("");
	private static JToggleButton h1 = new JToggleButton("");
	private static JToggleButton a2 = new JToggleButton("");
	private static JToggleButton b2 = new JToggleButton("");
	private static JToggleButton c2 = new JToggleButton("");
	private static JToggleButton d2 = new JToggleButton("");
	private static JToggleButton e2 = new JToggleButton("");
	private static JToggleButton f2 = new JToggleButton("");
	private static JToggleButton g2 = new JToggleButton("");
	private static JToggleButton h2 = new JToggleButton("");
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
	private static JToggleButton a7 = new JToggleButton("");
	private static JToggleButton b7 = new JToggleButton("");
	private static JToggleButton c7 = new JToggleButton("");
	private static JToggleButton d7 = new JToggleButton("");
	private static JToggleButton e7 = new JToggleButton("");
	private static JToggleButton f7 = new JToggleButton("");
	private static JToggleButton g7 = new JToggleButton("");
	private static JToggleButton h7 = new JToggleButton("");
	private static JToggleButton a8 = new JToggleButton("");
	private static JToggleButton b8 = new JToggleButton("");
	private static JToggleButton c8 = new JToggleButton("");
	private static JToggleButton d8 = new JToggleButton("");
	private static JToggleButton e8 = new JToggleButton("");
	private static JToggleButton f8 = new JToggleButton("");
	private static JToggleButton g8 = new JToggleButton("");
	private static JToggleButton h8 = new JToggleButton("");
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
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardWindow window = new BoardWindow();
					window.frmChessApp.setVisible(true);
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
		frmChessApp.setVisible(true); //show the window
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmChessApp = new JFrame();
		frmChessApp.setTitle("Chess App");
		frmChessApp.setBounds(100, 100, 450, 450);
		frmChessApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChessApp.getContentPane().setLayout(new GridLayout(8, 8, 0, 0));
		
		a8.setBackground(Color.WHITE);
		a8.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(a8);
		
		b8.setBackground(Color.BLACK);
		b8.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(b8);
		
		c8.setBackground(Color.WHITE);
		c8.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(c8);
		
		d8.setBackground(Color.BLACK);
		d8.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(d8);
		
		e8.setBackground(Color.WHITE);
		e8.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(e8);
		
		f8.setBackground(Color.BLACK);
		f8.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(f8);
		
		g8.setBackground(Color.WHITE);
		g8.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(g8);
		
		h8.setBackground(Color.BLACK);
		h8.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(h8);
		
		a7.setBackground(Color.BLACK);
		a7.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(a7);
		
		b7.setBackground(Color.WHITE);
		b7.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(b7);
		
		c7.setBackground(Color.BLACK);
		c7.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(c7);
		
		d7.setBackground(Color.WHITE);
		d7.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(d7);
		
		e7.setBackground(Color.BLACK);
		e7.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(e7);
		
		f7.setBackground(Color.WHITE);
		f7.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(f7);
		
		g7.setBackground(Color.BLACK);
		g7.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(g7);
		
		h7.setBackground(Color.WHITE);
		h7.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(h7);
		
		a6.setBackground(Color.WHITE);
		a6.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(a6);
		
		b6.setBackground(Color.BLACK);
		b6.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(b6);
		
		c6.setBackground(Color.WHITE);
		c6.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(c6);
		
		d6.setBackground(Color.BLACK);
		d6.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(d6);
		
		e6.setBackground(Color.WHITE);
		e6.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(e6);
		
		f6.setBackground(Color.BLACK);
		f6.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(f6);
		
		g6.setBackground(Color.WHITE);
		g6.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(g6);
		
		h6.setBackground(Color.BLACK);
		h6.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(h6);
		
		a5.setBackground(Color.BLACK);
		a5.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(a5);
		
		b5.setBackground(Color.WHITE);
		b5.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(b5);
		
		c5.setBackground(Color.BLACK);
		c5.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(c5);
		
		d5.setBackground(Color.WHITE);
		d5.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(d5);
		
		e5.setBackground(Color.BLACK);
		e5.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(e5);
		
		f5.setBackground(Color.WHITE);
		f5.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(f5);
		
		g5.setBackground(Color.BLACK);
		g5.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(g5);
		
		h5.setBackground(Color.WHITE);
		h5.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(h5);
		
		a4.setBackground(Color.WHITE);
		a4.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(a4);
		
		b4.setBackground(Color.BLACK);
		b4.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(b4);
		
		c4.setBackground(Color.WHITE);
		c4.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(c4);
		
		d4.setBackground(Color.BLACK);
		d4.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(d4);
		
		e4.setBackground(Color.WHITE);
		e4.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(e4);
		
		f4.setBackground(Color.BLACK);
		f4.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(f4);
		
		g4.setBackground(Color.WHITE);
		g4.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(g4);
		
		h4.setBackground(Color.BLACK);
		h4.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(h4);
		
		a3.setBackground(Color.BLACK);
		a3.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(a3);
		
		b3.setBackground(Color.WHITE);
		b3.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(b3);
		
		c3.setBackground(Color.BLACK);
		c3.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(c3);
		
		d3.setBackground(Color.WHITE);
		d3.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(d3);
		
		e3.setBackground(Color.BLACK);
		e3.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(e3);
		
		f3.setBackground(Color.WHITE);
		f3.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(f3);
		
		g3.setBackground(Color.BLACK);
		g3.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(g3);
		
		h3.setBackground(Color.WHITE);
		h3.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(h3);
		
		a2.setBackground(Color.WHITE);
		a2.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(a2);
		
		b2.setBackground(Color.BLACK);
		b2.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(b2);
		
		c2.setBackground(Color.WHITE);
		c2.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(c2);
		
		d2.setBackground(Color.BLACK);
		d2.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(d2);
		
		e2.setBackground(Color.WHITE);
		e2.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(e2);
		
		f2.setBackground(Color.BLACK);
		f2.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(f2);
		
		g2.setBackground(Color.WHITE);
		g2.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(g2);
		
		h2.setBackground(Color.BLACK);
		h2.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(h2);
		
		a1.setBackground(Color.BLACK);
		a1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(a1);
		
		b1.setBackground(Color.WHITE);
		b1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(b1);
		
		c1.setBackground(Color.BLACK);
		c1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(c1);
		
		d1.setBackground(Color.WHITE);
		d1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(d1);
		
		e1.setBackground(Color.BLACK);
		e1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(e1);
		
		f1.setBackground(Color.WHITE);
		f1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(f1);

		g1.setBackground(Color.BLACK);
		g1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(g1);
		
		h1.setBackground(Color.WHITE);
		h1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmChessApp.getContentPane().add(h1);
		
		Collections.addAll(allSquares, a8, b8, c8, d8, e8, f8, g8, h8,
				a7, b7, c7, d7, e7, f7, g7, h7, 
				a6, b6, c6, d6, e6, f6, g6, h6,
				a5, b5, c5, d5, e5, f5, g5, h5, 
				a4, b4, c4, d4, e4, f4, g4, h4,
				a3, b3, c3, d3, e3, f3, g3, h3, 
				a2, b2, c2, d2, e2, f2, g2, h2,
				a1, b1, c1, d1, e1, f1, g1, h1);
	}
	
	
	//getters
	public static JToggleButton getA1()
		{return a1;}
	public static JToggleButton getB1()
		{return b1;}
	public static JToggleButton getC1()
		{return c1;}
	public static JToggleButton getD1()
		{return d1;}
	public static JToggleButton getE1()
		{return e1;}
	public static JToggleButton getF1()
		{return f1;}
	public static JToggleButton getG1()
		{return g1;}
	public static JToggleButton getH1()
		{return h1;}
	public static JToggleButton getA2()
		{return a2;}
	public static JToggleButton getB2()
		{return b2;}
	public static JToggleButton getC2()
		{return c2;}
	public static JToggleButton getD2()
		{return d2;}
	public static JToggleButton getE2()
		{return e2;}
	public static JToggleButton getF2()
		{return f2;}
	public static JToggleButton getG2()
		{return g2;}
	public static JToggleButton getH2()
		{return h2;}
	public static JToggleButton getA3()
		{return a3;}
	public static JToggleButton getB3()
		{return b3;}
	public static JToggleButton getC3()
		{return c3;}
	public static JToggleButton getD3()
		{return d3;}
	public static JToggleButton getE3()
		{return e3;}
	public static JToggleButton getF3()
		{return f3;}
	public static JToggleButton getG3()
		{return g3;}
	public static JToggleButton getH3()
		{return h3;}
	public static JToggleButton getA4()
		{return a4;}
	public static JToggleButton getB4()
		{return b4;}
	public static JToggleButton getC4()
		{return c4;}
	public static JToggleButton getD4()
		{return d4;}
	public static JToggleButton getE4()
		{return e4;}
	public static JToggleButton getF4()
		{return f4;}
	public static JToggleButton getG4()
		{return g4;}
	public static JToggleButton getH4()
		{return h4;}
	public static JToggleButton getA5()
		{return a5;}
	public static JToggleButton getB5()
		{return b5;}
	public static JToggleButton getC5()
		{return c5;}
	public static JToggleButton getD5()
		{return d5;}
	public static JToggleButton getE5()
		{return e5;}
	public static JToggleButton getF5()
		{return f5;}
	public static JToggleButton getG5()
		{return g5;}
	public static JToggleButton getH5()
		{return h5;}
	public static JToggleButton getA6()
		{return a6;}
	public static JToggleButton getB6()
		{return b6;}
	public static JToggleButton getC6()
		{return c6;}
	public static JToggleButton getD6()
		{return d6;}
	public static JToggleButton getE6()
		{return e6;}
	public static JToggleButton getF6()
		{return f6;}
	public static JToggleButton getG6()
		{return g6;}
	public static JToggleButton getH6()
		{return h6;}
	public static JToggleButton getA7()
		{return a7;}
	public static JToggleButton getB7()
		{return b7;}
	public static JToggleButton getC7()
		{return c7;}
	public static JToggleButton getD7()
		{return d7;}
	public static JToggleButton getE7()
		{return e7;}
	public static JToggleButton getF7()
		{return f7;}
	public static JToggleButton getG7()
		{return g7;}
	public static JToggleButton getH7()
		{return h7;}
	public static JToggleButton getA8()
		{return a8;}
	public static JToggleButton getB8()
		{return b8;}
	public static JToggleButton getC8()
		{return c8;}
	public static JToggleButton getD8()
		{return d8;}
	public static JToggleButton getE8()
		{return e8;}
	public static JToggleButton getF8()
		{return f8;}
	public static JToggleButton getG8()
		{return g8;}
	public static JToggleButton getH8()
		{return h8;}
	public static ArrayList<JToggleButton> getAllSquares()
		{return allSquares;}
	
	
	public static void setSquareText(JToggleButton square, String text, Color textColour)
	{
		square.setText(text);
		square.setForeground(textColour);
	}
	

}
