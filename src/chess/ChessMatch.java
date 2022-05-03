package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[this.board.getRows()][this.board.getColumns()];
		
		for(int i = 0; i<this.board.getRows(); i++) {
			for(int j = 0; j<this.board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) this.board.getPiece(i, j);
			}
		}
		
		return mat;
	}
}
