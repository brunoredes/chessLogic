package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

	private Color color;

	public ChessPiece(Board board, Color color) {// o board repassa o construtor p/ superClasse
		super(board);// construtor da classe Piece
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}
