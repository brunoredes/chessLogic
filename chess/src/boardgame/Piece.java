package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) { //p criar peça, é necessario criar o board
		this.board = board;
		position = null;
	}

	protected Board getBoard() { //apenas classes do mesmo pacotes podem acessar esse metodo
		return board;
	}
	
	
	
	
	
}
