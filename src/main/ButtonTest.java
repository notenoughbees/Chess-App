package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonTest {

	private JFrame frame;
	private static JToggleButton btn = new JToggleButton("New toggle button");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		UIManager.put("ToggleButton.select", Color.BLUE);
		SwingUtilities.updateComponentTreeUI(btn);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonTest window = new ButtonTest();
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
	public ButtonTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
//				btn.setForeground(Color.GREEN); //sets the text colour
//				btn.setBackground(Color.RED); //sets the background for when the button is not pushed down
				
			}
		});
		frame.getContentPane().add(btn, BorderLayout.CENTER);
	}

}
