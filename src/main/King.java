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
		Pair<JToggleButton, String> squareTopLeft;
		Pair<JToggleButton, String> squareTop;
		Pair<JToggleButton, String> squareTopRight;
		Pair<JToggleButton, String> squareLeft;
		Pair<JToggleButton, String> squareRight;
		Pair<JToggleButton, String> squareBottomLeft;
		Pair<JToggleButton, String> squareBottom;
		Pair<JToggleButton, String> squareBottomRight;
		
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
