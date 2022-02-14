package main;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JToggleButton;

public class BoardWindow {

	private JFrame frame;
	private static JToggleButton a1;
	private static JToggleButton b1;
	private static JToggleButton c1;
	private static JToggleButton d1;
	private static JToggleButton e1;
	private static JToggleButton f1;
	private static JToggleButton g1;
	private static JToggleButton h1;
	private static JToggleButton a2;
	private static JToggleButton b2;
	private static JToggleButton c2;
	private static JToggleButton d2;
	private static JToggleButton e2;
	private static JToggleButton f2;
	private static JToggleButton g2;
	private static JToggleButton h2;
	private static JToggleButton a3;
	private static JToggleButton b3;
	private static JToggleButton c3;
	private static JToggleButton d3;
	private static JToggleButton e3;
	private static JToggleButton f3;
	private static JToggleButton g3;
	private static JToggleButton h3;
	private static JToggleButton a4;
	private static JToggleButton b4;
	private static JToggleButton c4;
	private static JToggleButton d4;
	private static JToggleButton e4;
	private static JToggleButton f4;
	private static JToggleButton g4;
	private static JToggleButton h4;
	private static JToggleButton a5;
	private static JToggleButton b5;
	private static JToggleButton c5;
	private static JToggleButton d5;
	private static JToggleButton e5;
	private static JToggleButton f5;
	private static JToggleButton g5;
	private static JToggleButton h5;
	private static JToggleButton a6;
	private static JToggleButton b6;
	private static JToggleButton c6;
	private static JToggleButton d6;
	private static JToggleButton e6;
	private static JToggleButton f6;
	private static JToggleButton g6;
	private static JToggleButton h6;
	private static JToggleButton a7;
	private static JToggleButton b7;
	private static JToggleButton c7;
	private static JToggleButton d7;
	private static JToggleButton e7;
	private static JToggleButton f7;
	private static JToggleButton g7;
	private static JToggleButton h7;
	private static JToggleButton a8;
	private static JToggleButton b8;
	private static JToggleButton c8;
	private static JToggleButton d8;
	private static JToggleButton e8;
	private static JToggleButton f8;
	private static JToggleButton g8;
	private static JToggleButton h8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardWindow window = new BoardWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BoardWindow() {
		initialize();
		frame.setVisible(true); //show the window
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(8, 8, 0, 0));
		
		a8 = new JToggleButton("");
		a8.setBackground(Color.WHITE);
		frame.getContentPane().add(a8);
		
		b8 = new JToggleButton("");
		b8.setBackground(Color.BLACK);
		frame.getContentPane().add(b8);
		
		c8 = new JToggleButton("");
		c8.setBackground(Color.WHITE);
		frame.getContentPane().add(c8);
		
		d8 = new JToggleButton("");
		d8.setBackground(Color.BLACK);
		frame.getContentPane().add(d8);
		
		e8 = new JToggleButton("");
		e8.setBackground(Color.WHITE);
		frame.getContentPane().add(e8);
		
		f8 = new JToggleButton("");
		f8.setBackground(Color.BLACK);
		frame.getContentPane().add(f8);
		
		g8 = new JToggleButton("");
		g8.setBackground(Color.WHITE);
		frame.getContentPane().add(g8);
		
		h8 = new JToggleButton("");
		h8.setBackground(Color.BLACK);
		frame.getContentPane().add(h8);
		
		a7 = new JToggleButton("");
		a7.setBackground(Color.BLACK);
		frame.getContentPane().add(a7);
		
		b7 = new JToggleButton("");
		b7.setBackground(Color.WHITE);
		frame.getContentPane().add(b7);
		
		c7 = new JToggleButton("");
		c7.setBackground(Color.BLACK);
		frame.getContentPane().add(c7);
		
		d7 = new JToggleButton("");
		d7.setBackground(Color.WHITE);
		frame.getContentPane().add(d7);
		
		e7 = new JToggleButton("");
		e7.setBackground(Color.BLACK);
		frame.getContentPane().add(e7);
		
		f7 = new JToggleButton("");
		f7.setBackground(Color.WHITE);
		frame.getContentPane().add(f7);
		
		g7 = new JToggleButton("");
		g7.setBackground(Color.BLACK);
		frame.getContentPane().add(g7);
		
		h7 = new JToggleButton("");
		h7.setBackground(Color.WHITE);
		frame.getContentPane().add(h7);
		
		a6 = new JToggleButton("");
		a6.setBackground(Color.WHITE);
		frame.getContentPane().add(a6);
		
		b6 = new JToggleButton("");
		b6.setBackground(Color.BLACK);
		frame.getContentPane().add(b6);
		
		c6 = new JToggleButton("");
		c6.setBackground(Color.WHITE);
		frame.getContentPane().add(c6);
		
		d6 = new JToggleButton("");
		d6.setBackground(Color.BLACK);
		frame.getContentPane().add(d6);
		
		e6 = new JToggleButton("");
		e6.setBackground(Color.WHITE);
		frame.getContentPane().add(e6);
		
		f6 = new JToggleButton("");
		f6.setBackground(Color.BLACK);
		frame.getContentPane().add(f6);
		
		g6 = new JToggleButton("");
		g6.setBackground(Color.WHITE);
		frame.getContentPane().add(g6);
		
		h6 = new JToggleButton("");
		h6.setBackground(Color.BLACK);
		frame.getContentPane().add(h6);
		
		a5 = new JToggleButton("");
		a5.setBackground(Color.BLACK);
		frame.getContentPane().add(a5);
		
		b5 = new JToggleButton("");
		b5.setBackground(Color.WHITE);
		frame.getContentPane().add(b5);
		
		c5 = new JToggleButton("");
		c5.setBackground(Color.BLACK);
		frame.getContentPane().add(c5);
		
		d5 = new JToggleButton("");
		d5.setBackground(Color.WHITE);
		frame.getContentPane().add(d5);
		
		e5 = new JToggleButton("");
		e5.setBackground(Color.BLACK);
		frame.getContentPane().add(e5);
		
		f5 = new JToggleButton("");
		f5.setBackground(Color.WHITE);
		frame.getContentPane().add(f5);
		
		g5 = new JToggleButton("");
		g5.setBackground(Color.BLACK);
		frame.getContentPane().add(g5);
		
		h5 = new JToggleButton("");
		h5.setBackground(Color.WHITE);
		frame.getContentPane().add(h5);
		
		a4 = new JToggleButton("");
		a4.setBackground(Color.WHITE);
		frame.getContentPane().add(a4);
		
		b4 = new JToggleButton("");
		b4.setBackground(Color.BLACK);
		frame.getContentPane().add(b4);
		
		c4 = new JToggleButton("");
		c4.setBackground(Color.WHITE);
		frame.getContentPane().add(c4);
		
		d4 = new JToggleButton("");
		d4.setBackground(Color.BLACK);
		frame.getContentPane().add(d4);
		
		e4 = new JToggleButton("");
		e4.setBackground(Color.WHITE);
		frame.getContentPane().add(e4);
		
		f4 = new JToggleButton("");
		f4.setBackground(Color.BLACK);
		frame.getContentPane().add(f4);
		
		g4 = new JToggleButton("");
		g4.setBackground(Color.WHITE);
		frame.getContentPane().add(g4);
		
		h4 = new JToggleButton("");
		h4.setBackground(Color.BLACK);
		frame.getContentPane().add(h4);
		
		a3 = new JToggleButton("");
		a3.setBackground(Color.BLACK);
		frame.getContentPane().add(a3);
		
		b3 = new JToggleButton("");
		b3.setBackground(Color.WHITE);
		frame.getContentPane().add(b3);
		
		c3 = new JToggleButton("");
		c3.setBackground(Color.BLACK);
		frame.getContentPane().add(c3);
		
		d3 = new JToggleButton("");
		d3.setBackground(Color.WHITE);
		frame.getContentPane().add(d3);
		
		e3 = new JToggleButton("");
		e3.setBackground(Color.BLACK);
		frame.getContentPane().add(e3);
		
		f3 = new JToggleButton("");
		f3.setBackground(Color.WHITE);
		frame.getContentPane().add(f3);
		
		g3 = new JToggleButton("");
		g3.setBackground(Color.BLACK);
		frame.getContentPane().add(g3);
		
		h3 = new JToggleButton("");
		h3.setBackground(Color.WHITE);
		frame.getContentPane().add(h3);
		
		a2 = new JToggleButton("");
		a2.setBackground(Color.WHITE);
		frame.getContentPane().add(a2);
		
		b2 = new JToggleButton("");
		b2.setBackground(Color.BLACK);
		frame.getContentPane().add(b2);
		
		c2 = new JToggleButton("");
		c2.setBackground(Color.WHITE);
		frame.getContentPane().add(c2);
		
		d2 = new JToggleButton("");
		d2.setBackground(Color.BLACK);
		frame.getContentPane().add(d2);
		
		e2 = new JToggleButton("");
		e2.setBackground(Color.WHITE);
		frame.getContentPane().add(e2);
		
		f2 = new JToggleButton("");
		f2.setBackground(Color.BLACK);
		frame.getContentPane().add(f2);
		
		g2 = new JToggleButton("");
		g2.setBackground(Color.WHITE);
		frame.getContentPane().add(g2);
		
		h2 = new JToggleButton("");
		h2.setBackground(Color.BLACK);
		frame.getContentPane().add(h2);
		
		a1 = new JToggleButton("");
		a1.setBackground(Color.BLACK);
		frame.getContentPane().add(a1);
		
		b1 = new JToggleButton("");
		b1.setBackground(Color.WHITE);
		frame.getContentPane().add(b1);
		
		c1 = new JToggleButton("");
		c1.setBackground(Color.BLACK);
		frame.getContentPane().add(c1);
		
		d1 = new JToggleButton("");
		d1.setBackground(Color.WHITE);
		frame.getContentPane().add(d1);
		
		e1 = new JToggleButton("");
		e1.setBackground(Color.BLACK);
		frame.getContentPane().add(e1);
		
		f1 = new JToggleButton("");
		f1.setBackground(Color.WHITE);
		frame.getContentPane().add(f1);
		
		g1 = new JToggleButton("");
		g1.setBackground(Color.BLACK);
		frame.getContentPane().add(g1);
		
		h1 = new JToggleButton("");
		h1.setBackground(Color.WHITE);
		frame.getContentPane().add(h1);
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
	
	
	public static void setSquareText(JToggleButton square, String text, Color textColour)
	{
		square.setText(text);
		square.setForeground(textColour);
	}
	

}
