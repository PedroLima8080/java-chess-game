package modules.chess.pieces;

import modules.boardgame.Board;
import modules.chess.ChessPiece;
import modules.chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "K";
	}
}
