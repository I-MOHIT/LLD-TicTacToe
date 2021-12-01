package com.mohit;

public class Player extends User{
    private final MoveType moveType;

    public Player(String username, MoveType moveType){
        super(username);
        this.moveType = moveType;
    }

    public MoveType getMoveType() {
        return moveType;
    }
}
