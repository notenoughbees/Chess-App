package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JToggleButton;

public class King extends Piece{

	//constructor call
	public King(Color tempPieceColour, String tempPieceType, Pair<JToggleButton, String> tempLocation) {
		//superclass constructor call: initialise the superclass instance variables (Big Java p318)
		super(tempPieceColour, tempPieceType, tempLocation);
	}
	
	
	public ArrayList<Pair<JToggleButton, String>> findPossibleDestinations()
	{
		ArrayList<Pair<JToggleButton, String>> possibleDestinations = new ArrayList<>();
		Pair<JToggleButton, String> squareTopLeft = null;
		Pair<JToggleButton, String> squareTop = null;
		Pair<JToggleButton, String> squareTopRight = null;
		Pair<JToggleButton, String> squareLeft = null;
		Pair<JToggleButton, String> squareRight = null;
		Pair<JToggleButton, String> squareBottomLeft = null;
		Pair<JToggleButton, String> squareBottom = null;
		Pair<JToggleButton, String> squareBottomRight = null;
		squareTopLeft = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "topLeft");
		squareTop = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "top");
		squareTopRight = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "topRight");
		squareLeft = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "left");
		squareRight = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "Right");
		squareBottomLeft = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "bottomLeft");
		squareBottom = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "bottom");
		squareBottomRight = BoardWindow.getSideSquare(BoardWindow.getAllSquares(), super.getPieceLocation(), "bottomRight");
		if(squareTopLeft.first.getText().isEmpty())
			{possibleDestinations.add(squareTopLeft);}
		if(squareTop.first.getText().isEmpty())
			{possibleDestinations.add(squareTop);}
		if(squareTopRight.first.getText().isEmpty())
			{possibleDestinations.add(squareTopRight);}
		if(squareLeft.first.getText().isEmpty())
			{possibleDestinations.add(squareLeft);}
		if(squareRight.first.getText().isEmpty())
			{possibleDestinations.add(squareRight);}
		if(squareBottomLeft.first.getText().isEmpty())
			{possibleDestinations.add(squareBottomLeft);}
		if(squareBottom.first.getText().isEmpty())
			{possibleDestinations.add(squareBottom);}
		if(squareBottomRight.first.getText().isEmpty())
			{possibleDestinations.add(squareBottomRight);}
		
		return possibleDestinations;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
