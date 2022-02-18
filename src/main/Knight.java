package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JToggleButton;

public class Knight extends Piece{

	//constructor call
	public Knight(Color tempPieceColour, String tempPieceType, Pair<JToggleButton, String> tempLocation) {
		//superclass constructor call: initialise the superclass instance variables (Big Java p318)
		super(tempPieceColour, tempPieceType, tempLocation);
	}
	
	
//	public void SelectPiece(String pieceType)
//	{
//		
//	}
	
	
	public ArrayList<Pair<JToggleButton, String>> findPossibleDestinations()
	{
		ArrayList<Pair<JToggleButton, String>> possibleDestinations = new ArrayList<>();
		Pair<JToggleButton, String> squareTopLeft;
		Pair<JToggleButton, String> squareTopRight;
		Pair<JToggleButton, String> squareUpperLeft;
		Pair<JToggleButton, String> squareUpperRight;
		Pair<JToggleButton, String> squareLowerLeft;
		Pair<JToggleButton, String> squareLowerRight;
		Pair<JToggleButton, String> squareBottomLeft;
		Pair<JToggleButton, String> squareBottomRight;
		
		ArrayList<Pair<JToggleButton, String>> allSquares = BoardWindow.getAllSquares();
		Pair<JToggleButton, String> currentSquare = super.getPieceLocation();
		Color opponentColour;
		
		if(getPieceColour() == Color.WHITE) {
			opponentColour = Color.red;}
		else {
			opponentColour = Color.orange;}
		
		//put each possible destination in a seperate try-catch block because 
		//  if one position is out of bounds, we don't want to skip every single position
		try 
		{   
			//first calculate the possible destination
			squareTopLeft = allSquares.get(allSquares.indexOf(currentSquare)-17);
			//now find out if that space is a valid destination - it is either empty or has an opponent piece on it
			if(squareTopLeft.first.getText().isEmpty() || squareTopLeft.first.getForeground() == opponentColour){ //TODO: check if this line works
				possibleDestinations.add(squareTopLeft);}
			}
		catch (IndexOutOfBoundsException e){
		}
		try
		{
			squareTopRight = allSquares.get(allSquares.indexOf(currentSquare)-15);
			if(squareTopRight.first.getText().isEmpty() || squareTopRight.first.getForeground() == opponentColour){
				possibleDestinations.add(squareTopRight);}
			}
		catch (IndexOutOfBoundsException e){
		}
		try
		{
			squareUpperLeft = allSquares.get(allSquares.indexOf(currentSquare)-10);
			if(squareUpperLeft.first.getText().isEmpty() || squareUpperLeft.first.getForeground() == opponentColour){
				possibleDestinations.add(squareUpperLeft);}
			}
		catch (IndexOutOfBoundsException e){
		}
		try
		{
			squareUpperRight = allSquares.get(allSquares.indexOf(currentSquare)-6);
			if(squareUpperRight.first.getText().isEmpty() || squareUpperRight.first.getForeground() == opponentColour){
				possibleDestinations.add(squareUpperRight);}
			}
		catch (IndexOutOfBoundsException e){
		}
		try
		{
			squareLowerLeft = allSquares.get(allSquares.indexOf(currentSquare)+6);
			if(squareLowerLeft.first.getText().isEmpty() || squareLowerLeft.first.getForeground() == opponentColour){
				possibleDestinations.add(squareLowerLeft);}
			}
		catch (IndexOutOfBoundsException e){
		}
		try
		{
			squareLowerRight = allSquares.get(allSquares.indexOf(currentSquare)+10);
			if(squareLowerRight.first.getText().isEmpty() || squareLowerRight.first.getForeground() == opponentColour){
				possibleDestinations.add(squareLowerRight);}
			}
		catch (IndexOutOfBoundsException e){
		}
		try
		{
			squareBottomLeft = allSquares.get(allSquares.indexOf(currentSquare)+15);
			if(squareBottomLeft.first.getText().isEmpty() || squareBottomLeft.first.getForeground() == opponentColour){
				possibleDestinations.add(squareBottomLeft);}
			}
		catch (IndexOutOfBoundsException e){
		}
		try
		{
			squareBottomRight = allSquares.get(allSquares.indexOf(currentSquare)+17);
			if(squareBottomRight.first.getText().isEmpty() || squareBottomRight.first.getForeground() == opponentColour){
				possibleDestinations.add(squareBottomRight);}
			}
		catch (IndexOutOfBoundsException e){
		}

		
		return possibleDestinations;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
