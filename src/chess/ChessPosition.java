package chess;

import boardgame.Position;

public class ChessPosition {

	private char column;
	private int row;
	
	public ChessPosition(char colimn, int row) {
		if(column < 'a' || column > 'h' || row > 8) {
	}
		this.column = colimn;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	protected Position toPostion() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPostion(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
}
