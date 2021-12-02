package com.mohit;

public class Board {
    public Cell[][] cells;
    private final int numCells;

    public Board(int numCells) {
        this.numCells = numCells;
        cells = new Cell[numCells][numCells];
        initializeBoard();
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public void printBoard(){
        System.out.println("--------------------");
        for(int i=0;i<numCells;i++){
            for(int j=0;j<numCells;j++){
                if(cells[i][j].getMoveType()==null){
                    System.out.print(" | " + " " + " | ");
                }else{
                    System.out.print(" | " + cells[i][j].getMoveType() + " | ");
                }
            }
            System.out.println();
            System.out.println("--------------------");
        }
    }

    public void initializeBoard(){
        for(int i=0;i<numCells;i++){
            for(int j=0;j<numCells;j++){
                cells[i][j] = new Cell(i,j,null);
            }
        }
        System.out.println("GAME STARTS NOW!");
        printBoard();
    }
}
