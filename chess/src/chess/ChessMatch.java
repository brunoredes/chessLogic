package chess;

import boardgame.Board;

//chess core with rules
//quem precisa saber a dimensao do tabuleiro é a classe ChessMatch
//é nesta classe que ele vai saber que o tabuleiro é 8x8
public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
	}
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i = 0; i < board.getRows(); i++) {
			for(int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j); //downcasting no chesspiece para entender isso
																//como uma peça de xadrez
			}
		}
		return mat;
	}
}
