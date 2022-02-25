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
		Color opponentColour;
		ArrayList<Pair<JToggleButton, String>> allSquares = BoardWindow.getAllSquares();
		Pair<JToggleButton, String> currentSquare = super.getPieceLocation();
		
		if(getPieceColour() == Color.WHITE) {
			opponentColour = Color.red;}
		else {
			opponentColour = Color.orange;}
		
		System.out.println(possibleDestinations);
		
//		//if go from top to bottom //filter out topleft, topright, upperleft, upperright
//		
//		//if go from inner top to bottom //fiter out topleft, topright
//			
//		
//		//outer top to bottom
//		if (allSquares.get(allSquares.indexOf(currentSquare) - possibleDestSqr) = x)
//		{
//			do upperleft, upperright, lowerleft, lowerright, bottomleft, bottomright
//		}
//		//outer bottom to top
//		//inner top to bottom
//		//inner bottom to top
//		//outer left to right
//		//outer right to left
//		//inner left to right
//		//inner right to left
		
		
		int i = allSquares.indexOf(currentSquare);
		//outer top to bottom
		if(i % 8 == i)
			System.out.println("AAA");
		{
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_LOWERLEFT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_LOWERRIGHT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMLEFT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
							currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMRIGHT_CALCULATION);
		}
		//inner top to bottom
		if((i % 8) + 8 == i)
			System.out.println("aaa");
		{
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_LOWERLEFT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_LOWERRIGHT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMLEFT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
							currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMRIGHT_CALCULATION);
			
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_UPPERLEFT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_UPPERRIGHT_CALCULATION);
		}
		//outer bottom to top
		if((i % 8) + 56 == i)
			System.out.println("BBB");
		{
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPLEFT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPRIGHT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_UPPERLEFT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_UPPERRIGHT_CALCULATION);
		}
		//inner bottom to top
		if((i % 8) + 48 == i)
			System.out.println("bbb");
		{
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_LOWERLEFT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_LOWERRIGHT_CALCULATION);
		}
		//outer left to right
		if((int) allSquares.indexOf(currentSquare)/8+1 == 1)
			System.out.println("CCC");
		{
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPLEFT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_UPPERLEFT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_LOWERLEFT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMLEFT_CALCULATION);
		}
		//inner left to right
		if((int) allSquares.indexOf(currentSquare)/8+1 == 2)
			System.out.println("ccc");
		{
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPRIGHT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMRIGHT_CALCULATION);
		}
		//outer right to left
		if((int) allSquares.indexOf(currentSquare)/8+1 == 8)
			System.out.println("DDD");
		{
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPRIGHT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_UPPERRIGHT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_LOWERRIGHT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMRIGHT_CALCULATION);
		}
		//inner right to left
		if((int) allSquares.indexOf(currentSquare)/8+1 == 7)
			System.out.println("ddd");
		{
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPLEFT_CALCULATION);
			possibleDestinations = testNewDestinationSquare(possibleDestinations, allSquares, 
					currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMLEFT_CALCULATION);
		}
		
		
		
//		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
//				currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPLEFT_CALCULATION);
//		System.out.println(possibleDestinations);
//		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
//				currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_TOPRIGHT_CALCULATION);
//		System.out.println(possibleDestinations);
//		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
//				currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_UPPERLEFT_CALCULATION);
//		System.out.println(possibleDestinations);
//		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
//				currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_UPPERRIGHT_CALCULATION);
//		System.out.println(possibleDestinations);
//		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
//				currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_LOWERLEFT_CALCULATION);
//		System.out.println(possibleDestinations);
//		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
//				currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_LOWERRIGHT_CALCULATION);
//		System.out.println(possibleDestinations);
//		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
//				currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMLEFT_CALCULATION);
//		System.out.println(possibleDestinations);
//		possibleDestinations = super.testNewDestinationSquare(possibleDestinations, allSquares, 
//				currentSquare, opponentColour, BoardWindow.SQUARE_KNIGHT_BOTTOMRIGHT_CALCULATION);
//		System.out.println(possibleDestinations);
		System.out.println("================================");
		System.out.println(possibleDestinations);
		return possibleDestinations;
	}
	
	
	
	
	
	
	
	
	
	

}
