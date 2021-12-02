# Design a Tic Tac Toe Game

## This is a LLD problem with the specifications laid out as below

### Requirements

1. Design a game of Tic Tac Toe.
2. The game will have 2 players and a board of nxn.
3. Provide a way to launch the game.
4. Players should be able to make the moves turn by turn.
5. If there is a winner or if there are no more moves left, end the game.

#### The entities that can be thought of for the above problem can be -

- User
- Player
- Board (would receive the size of the board to be created from the user)
- Game (would create the board, players and would have the entire algorithm for the Game along with checking for a draw and win)
- Cell (A member of the board, the board will have nxn cells)

---
# Class Diagram
![Alt text](./TicTacToe_ClassDiagram_Updated.jpg?raw=true "Class Diagram")