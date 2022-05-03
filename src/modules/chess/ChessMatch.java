package modules.chess;

import modules.boardgame.Board;
import modules.boardgame.Position;
import modules.chess.pieces.Rook;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
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
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(0, 0));
		board.placePiece(new Rook(board, Color.WHITE), new Position(0, 1));
		board.placePiece(new Rook(board, Color.WHITE), new Position(0, 2));
	}
}
