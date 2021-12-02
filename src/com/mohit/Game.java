package com.mohit;

public class Game {
    private final Board board;
    private Player[] players;
    private Player currentPlayer;
    private GameStatus gameStatus;
    public int cells;
    private final int numPlayers = 2;
    private int[] arrRow;
    private int[] arrCol;
    private int diagonal_r2l = 0;
    private int diagonal_l2r = 0;

    public Game(Player p1, Player p2, int dimension){
        this.cells = dimension;
        this.players = new Player[numPlayers];
        players[0] = p1;
        players[1] = p2;
        this.board = new Board(dimension);
        this.currentPlayer = players[0];
        this.gameStatus = GameStatus.PLAYING;
        this.arrRow = new int[cells];
        this.arrCol = new int[cells];
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public boolean isValidMove(int row, int col){
        return (row>=0 && row<cells && col>=0 && col<cells && board.cells[row][col]!=null);
    }

    public boolean hasWon(int row, int col){
        if(currentPlayer.getUserId().equals(players[0].getUserId())){
            if(row == col){
                diagonal_l2r++;
            }else if(row+col == cells-1){
                diagonal_r2l++;
            }
            arrRow[row]++;
            arrCol[col]++;

            if(diagonal_l2r == cells || diagonal_r2l == cells || arrRow[row] == cells || arrCol[col] == cells){
                gameStatus = GameStatus.WON;
                System.out.println(currentPlayer.getUserName() + " has won the Game!");
                return true;
            }
        }else{
            if(row == col){
                diagonal_l2r--;
            }else if(row+col == -(cells-1)){
                diagonal_r2l--;
            }
            arrRow[row]--;
            arrCol[col]--;

            if(diagonal_l2r == -cells || diagonal_r2l == -cells || arrRow[row] == -cells || arrCol[col] == -cells){
                gameStatus = GameStatus.WON;
                System.out.println(currentPlayer.getUserName() + " has won the Game!");
                return true;
            }
        }
        return false;
    }

    public boolean hasDrawn(int row, int col){
        if(diagonal_l2r>cells || diagonal_r2l>cells || arrRow[row]>cells || arrCol[col]>cells || diagonal_l2r<-cells || diagonal_r2l<-cells || arrRow[row]<-cells || arrCol[col]<-cells){
            gameStatus = GameStatus.DRAW;
            System.out.println("Game has ended in a draw");
            return true;
        }
        return false;
    }

    public void changeTurn(){
        if(currentPlayer.getUserId().equals(players[0].getUserId())){
            currentPlayer = players[1];
        }else{
            currentPlayer = players[0];
        }
    }

    public boolean play(int row, int col){
        if(gameStatus == GameStatus.PLAYING){
            if(isValidMove(row, col)){
                board.cells[row][col].setMoveType(currentPlayer.getMoveType());
                if(hasWon(row, col)){
                    board.printBoard();
                    return false;
                }else if(hasDrawn(row,col)){
                    board.printBoard();
                    return false;
                }
                changeTurn();
                board.printBoard();
                return true;
            }
            System.out.println(currentPlayer.getUserName() + " Please enter a valid move");
            board.printBoard();
            return false;
        }
        else if(gameStatus == GameStatus.WON){
            System.out.println(currentPlayer.getUserName() + " has already won the Game!");
            board.printBoard();
            return false;
        }else if(gameStatus == GameStatus.DRAW){
            System.out.println("The game ended in a draw between the two players!");
            board.printBoard();
            return false;
        }else{
            board.printBoard();
            return false;
        }
    }
}
