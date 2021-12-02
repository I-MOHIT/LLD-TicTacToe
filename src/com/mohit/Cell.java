package com.mohit;

public class Cell {
    private int row;
    private int col;
    private MoveType moveType;

    public Cell(int row, int col, MoveType moveType) {
        this.row = row;
        this.col = col;
        this.moveType = moveType;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public MoveType getMoveType() {
        return moveType;
    }

    public void setMoveType(MoveType moveType) {
        this.moveType = moveType;
    }
}
