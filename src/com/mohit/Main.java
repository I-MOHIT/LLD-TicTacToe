package com.mohit;

public class Main {

    public static Game launchGame(Player p1, Player p2, int dimension){
        return new Game(p1,p2,dimension);
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("Starting execution of the project");

        Player p1 = new Player("ABCD", MoveType.X);
        Player p2 = new Player("EFGH", MoveType.O);

        System.out.println("Game 1");
        Game game1 = launchGame(p1,p2,3);
        game1.play(0,0);
        game1.play(0,1);
        game1.play(0,2);
        game1.play(1,1);
        game1.play(1,0);
        game1.play(2,1);
        game1.play(2,2);

        System.out.println("Game 2");
        Game game2 = new Game(p1,p2,4);
        game2.play(0,0);
        game2.play(0,1);
        game2.play(1,1);
        game2.play(1,0);
        game2.play(2,2);

        System.out.println("Ending execution of the project");

    }
}
