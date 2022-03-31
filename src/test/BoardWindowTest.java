package test;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.GridLayout;

import javax.swing.JToggleButton;

public class BoardWindowTest {
	//initialise instance variables
	private JFrame frmMaster;
	private static JToggleButton a8 = new JToggleButton("A");
	private static JToggleButton b8 = new JToggleButton("B");
	private static JToggleButton c8 = new JToggleButton("C");
	private static JToggleButton d8 = new JToggleButton("D");
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardWindowTest window = new BoardWindowTest();
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
	public BoardWindowTest() {
		initialize();
		frmMaster.setVisible(true); //show the window
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//master frame with GridBagLayout that holds the board and moves history
		frmMaster = new JFrame();
		frmMaster.setBounds(100, 100, 450, 300);
		frmMaster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gbcMaster = new GridBagLayout();
		gbcMaster.columnWidths = new int[]{0, 0};
		gbcMaster.rowHeights = new int[]{0, 0, 0};
		gbcMaster.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbcMaster.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		frmMaster.getContentPane().setLayout(gbcMaster);
		
		//panel with GridBagLayout that gets added to frmMaster
		JPanel boardContainer = new JPanel();
		GridBagConstraints gbcBoardContainer = new GridBagConstraints();
		gbcBoardContainer.fill = GridBagConstraints.BOTH;
		gbcBoardContainer.gridx = 0;
		gbcBoardContainer.gridy = 0;
		frmMaster.getContentPane().add(boardContainer, gbcBoardContainer);
		GridBagLayout gblBoardContainer = new GridBagLayout();
		gblBoardContainer.columnWidths = new int[]{0, 0};
		gblBoardContainer.rowHeights = new int[]{0, 0};
		gblBoardContainer.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gblBoardContainer.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		boardContainer.setLayout(gblBoardContainer);
		
		//panel with GridLayout that holds the buttons of the board
		JPanel panelBoard = new JPanel();
		GridBagConstraints gbcPanelBoard = new GridBagConstraints();
		gbcPanelBoard.fill = GridBagConstraints.BOTH;
		gbcPanelBoard.gridx = 0;
		gbcPanelBoard.gridy = 0;
		boardContainer.add(panelBoard, gbcPanelBoard);
		panelBoard.setLayout(new GridLayout(8, 8, 0, 0));
		
		panelBoard.add(a8);
		
		panelBoard.add(b8);
		
		panelBoard.add(c8);
		
		panelBoard.add(d8);
	}
}
