package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JToggleButton;

public class Bishop extends Piece{

	//constructor call
	public Bishop(Color tempPieceColour, String tempPieceType, Pair<JToggleButton, String> tempLocation) {
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
		ArrayList<Pair<JToggleButton, String>> allSquares = BoardWindow.getAllSquares();
		Pair<JToggleButton, String> currentSquare = super.getPieceLocation();
		Color opponentColour;
		
		if(getPieceColour() == Color.WHITE) {
			opponentColour = Color.red;}
		else {
			opponentColour = Color.orange;}
		
		//first calculate the possible destinations
		for(int i = 0; i < BoardWindow.getBoardLength(); i++)
		{
			try
			{
				Pair<JToggleButton, String> squareTopLeft = allSquares.get(allSquares.indexOf(currentSquare)+(-9-i*9));
				//now find out if that space is a valid destination - it is either empty or has an opponent piece on it
				if(squareTopLeft.first.getText().isEmpty() || squareTopLeft.first.getForeground() == opponentColour){
					System.out.println("1");
					possibleDestinations.add(squareTopLeft);}
			}
			catch (IndexOutOfBoundsException e){
			}
		}
		for(int i = 0; i < BoardWindow.getBoardLength(); i++)
		{
			try
			{
				Pair<JToggleButton, String> squareTopRight = allSquares.get(allSquares.indexOf(currentSquare)+(-7-i*7));
				//now find out if that space is a valid destination - it is either empty or has an opponent piece on it
				if(squareTopRight.first.getText().isEmpty() || squareTopRight.first.getForeground() == opponentColour){
					System.out.println("2");
					possibleDestinations.add(squareTopRight);}
			}
			catch (IndexOutOfBoundsException e){
			}
		}
		for(int i = 0; i < BoardWindow.getBoardLength(); i++)
		{
			try
			{
				Pair<JToggleButton, String> squareBottomLeft = allSquares.get(allSquares.indexOf(currentSquare)+(7+i*7));
				//now find out if that space is a valid destination - it is either empty or has an opponent piece on it
				if(squareBottomLeft.first.getText().isEmpty() || squareBottomLeft.first.getForeground() == opponentColour){
					System.out.println("3");
					possibleDestinations.add(squareBottomLeft);}
			}
			catch (IndexOutOfBoundsException e){
			}
		}
		for(int i = 0; i < BoardWindow.getBoardLength(); i++)
		{
			try
			{
				Pair<JToggleButton, String> squareBottomRight = allSquares.get(allSquares.indexOf(currentSquare)+(9+i*9));
				//now find out if that space is a valid destination - it is either empty or has an opponent piece on it
				if(squareBottomRight.first.getText().isEmpty() || squareBottomRight.first.getForeground() == opponentColour){
					System.out.println("4");
					possibleDestinations.add(squareBottomRight);}
			}
			catch (IndexOutOfBoundsException e){
			}
		}

		
//		try
//		{
//			squareTopRight = allSquares.get(allSquares.indexOf(currentSquare)-15);
//			if(squareTopRight.first.getText().isEmpty() || squareTopRight.first.getForeground() == opponentColour){
//				possibleDestinations.add(squareTopRight);}
//			}
//		catch (IndexOutOfBoundsException e){
//		}
//		try
//		{
//			squareBottomLeft = allSquares.get(allSquares.indexOf(currentSquare)-10);
//			if(squareBottomLeft.first.getText().isEmpty() || squareBottomLeft.first.getForeground() == opponentColour){
//				possibleDestinations.add(squareBottomLeft);}
//			}
//		catch (IndexOutOfBoundsException e){
//		}
//		try
//		{
//			squareBottomRight = allSquares.get(allSquares.indexOf(currentSquare)-6);
//			if(squareBottomRight.first.getText().isEmpty() || squareBottomRight.first.getForeground() == opponentColour){
//				possibleDestinations.add(squareBottomRight);}
//			}
//		catch (IndexOutOfBoundsException e){
//		}

		
		return possibleDestinations;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
