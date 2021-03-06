package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

public class Piece {
	//initialise
	private Color pieceColour;
	private ImageIcon pieceIcon;
	private JToggleButton location;
	
	//constructor
	public Piece(Color tempPieceColour, ImageIcon tempPieceType, JToggleButton tempLocation) {
		pieceColour = tempPieceColour;
		pieceIcon = tempPieceType;
		location = tempLocation;
		//place the piece in its initial position by setting the text of the square to the piece's name
		BoardWindow.setSquareText(location, pieceIcon, pieceColour);
	}
	
	public Piece()
	{
		//
	}
	
	
	/**
	 * Gets called by findValidDests(). Helps find the possible destinations for pieces that
	 * have a range greater than one and so require a loop (aka bishops, rooks and queens).
	 * @param possibleDests
	 * @param allSquares
	 * @param currentSquare
	 * @param opponentColour
	 * @param nextSquareCalculation
	 * @return
	 */
	public ArrayList<JToggleButton> findValidDestsLoop(
			ArrayList<JToggleButton> possibleDests,
			ArrayList<JToggleButton> allSquares,
			JToggleButton currentSquare,
			Color opponentColour,
			int nextSquareCalculation)
	{
		for(int i = 0; i < BoardWindow.BOARD_SIZE; i++)
		{
			try
			{
				int column = (int) Math.ceil((allSquares.indexOf(currentSquare)) % BoardWindow.BOARD_SIZE);
				//these variables check if the pieces is headed for a square that requires *wrap-around* on the board
				boolean is_headed_left = nextSquareCalculation == -9 || nextSquareCalculation == -1 || (nextSquareCalculation == 7);
				boolean is_headed_right = nextSquareCalculation == -7 || nextSquareCalculation == 1 || (nextSquareCalculation == 9); 
				//if the piece is not headed out-of-bounds, continue looking for destinations
				//if we are NOT on the 1st col headed left, or the 8th col headed right, then 
				//  we are not headed out-of-bounds, so continue looking for destinations
				if(!((column == 0 && (is_headed_left)) || (column == 7 && is_headed_right)))
				{
					JToggleButton nextSquare = allSquares.get(allSquares.indexOf(currentSquare)+nextSquareCalculation);
					if(nextSquare.getForeground() == opponentColour)
					{
						possibleDests.add(nextSquare);
						//the piece won't be able to go to any square beyond this one because 
						//  would have to take the piece on this square, which ends the turn
						break;
					}
					if(nextSquare.getIcon() == null)
					{
						possibleDests.add(nextSquare);
						currentSquare = nextSquare; 
					}
					//if the square isn't empty or has an opponent piece, then it must have a same-colour piece,
					//  so break the loop just as we do for the opposite-colour case.
					else
					{
						break;
					}
				}
			}
			catch (IndexOutOfBoundsException e) {
				break;
			}
		}
		return possibleDests;
	}
	
	
	/**
	 * Given a square a piece might be able to move to, checks if that square is a valid destination.
	 * If so, the square is added to possibleDests. Returns possibleDests.
	 * Used for the following pieces: pawn, knight, king
	 * @param possibleDests
	 * @param allSquares
	 * @param currentSquare
	 * @param opponentColour
	 * @param destSquare
	 * @return possibleDests
	 */
	public ArrayList<JToggleButton> testNewDestSquare(
			ArrayList<JToggleButton> possibleDests, 
			ArrayList<JToggleButton> allSquares, JToggleButton currentSquare, 
			Color opponentColour, int destSquareCalculation)
	{
		//[1] surround in a try-catch block for the case the piece is on the edge of the board
		//[2] put each possible destination in a seperate try-catch block because 
		//  if one position is out of bounds, we don't want to skip every single position
		try 
		{   
			//first calculate the possible destination
			JToggleButton destSquare = allSquares.get(allSquares.indexOf(currentSquare)+destSquareCalculation);
			//now find out if that space is a valid destination - it is either empty or has an opponent piece on it
			if(!(this instanceof Pawn))
			{
				
				//destSquare.getForeground() == opponentColour
				//findPiece(destSquare).getPieceColour() == opponentColour
				//TODO: !!!
				if(BoardWindow.isSquareEmpty(destSquare) 
						|| findPiece(destSquare).getPieceColour() == opponentColour) {
					possibleDests.add(destSquare);
				}
			}
			else //if the piece is a pawn, then it can only move into an opponent's square if it is moving diagonally
			{
				boolean is_moving_forward = (destSquareCalculation != BoardWindow.SQUARE_TOPLEFT_CALCULATION 
						&& destSquareCalculation != BoardWindow.SQUARE_TOPRIGHT_CALCULATION
						&& destSquareCalculation != BoardWindow.SQUARE_BOTTOMLEFT_CALCULATION
						&& destSquareCalculation != BoardWindow.SQUARE_BOTTOMRIGHT_CALCULATION);
				boolean is_moving_diagonally = !(is_moving_forward);
				
//				System.out.println("v");
//				System.out.println("1\t" + destSquare.getIcon());
//				System.out.println("2\t" + (destSquare.getIcon() == GameEnvironment.WHITE_SQUARE_ICON || destSquare.getIcon() == GameEnvironment.BLACK_SQUARE_ICON));
//				System.out.println("3\t" + is_moving_forward);
//				System.out.println("4\t" + findPiece(destSquare));
//				System.out.println("5\t" + findPiece(destSquare).getPieceColour());
//				System.out.println("6\t" + (findPiece(destSquare).getPieceColour() == opponentColour));
//				System.out.println("^");
				
				if(BoardWindow.isSquareEmpty(destSquare)
						&& is_moving_forward
						|| findPiece(destSquare).getPieceColour() == opponentColour && is_moving_diagonally) {
					possibleDests.add(destSquare);
				}
			}
		}
		catch (IndexOutOfBoundsException e) {
		}
		return possibleDests;
	}
	
	
	/*
	 * Given (1) the list of all of the pieces and (2) a square that will have a piece on it, 
	 * find which piece is on the given square by iterating the list of pieces and  
	 * searching for the square that is equal to the location of the piece.
	 */
	public static Piece findPiece(JToggleButton srcSquare) //(https://stackoverflow.com/a/17526663/8042538)
	{
		for(Piece p : GameEnvironment.getAllPieces())
		{
			if(p.getPieceLocation().equals(srcSquare))
			{
				return p;
			}
		}
		Piece dummyPiece = new Piece();
		return dummyPiece;
	}
	
	
	/*
	 * Given a source square and a destination square, moves the piece on the source square
	 * to the destination square.
	 */
	public static void movePiece(JToggleButton srcSquare, JToggleButton destSquare, ArrayList<Piece> opponentPieces)
	{
		System.out.println("movePiece");
		
		//remove the piece from the source square
		Piece piece = Piece.findPiece(srcSquare);
		srcSquare.setIcon(null);
		srcSquare.setForeground(null);
		
		//if the destination square had a piece on it, remove that piece from the opponent's list of pieces
		Piece opponentPiece = Piece.findPiece(destSquare);
		if(opponentPiece != null)
		{
			opponentPieces.remove(opponentPiece);
			GameEnvironment.getAllPieces().remove(opponentPiece);
		}
		
		//put it on the destination square
		BoardWindow.setSquareText(destSquare, piece.pieceIcon, piece.pieceColour);
		piece.setLocation(destSquare);
		
		
		//==== this section only makes a difference during the human's turn ====
//		//set the (blue) source square's background colour back to its original colour
//		BoardWindow.setSquareToOriginalColour(srcSquare);
		//iterate the green squares and set their background colours back to their original colour
		ArrayList<JToggleButton> greenSquares = BoardWindow.getValidDests();
		for(int i = 0; i < greenSquares.size(); i++)
		{
			JToggleButton square = greenSquares.get(i);
			BoardWindow.setSquareToOriginalColour(square);
		}
		
		
		//unselect the source button and destination button to get ready for the next move
		System.out.println(srcSquare.isSelected());
		srcSquare.setSelected(false);
		destSquare.setSelected(false);
		System.out.println(srcSquare.isSelected());
		//disable the source square because it will no longer have one of our pieces on it, so cannot be clicked
		srcSquare.setEnabled(false);
		
	}
	
	
	

	public Color getPieceColour() {
		//System.out.println(pieceColour);
		return pieceColour;
		}
	public ImageIcon getPieceIcon() {
		return pieceIcon;}
	public JToggleButton getPieceLocation() {
		return location;}
	
	private void setLocation(JToggleButton destSquare) {
		location = destSquare;}
	
	
	
}
