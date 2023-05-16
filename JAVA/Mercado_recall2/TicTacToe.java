import java.util.Scanner;

public class TicTacToe {
private char[][] board = new char[3][3];
private char currentPlayer;

public TicTacToe() {
// initialize the board with empty spaces
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
board[i][j] = ' ';
}
}
// set the current player to X
currentPlayer = 'X';
}

public void play() {
Scanner scanner = new Scanner(System.in);
boolean gameOver = false;

while (!gameOver) {
// display the current state of the board
displayBoard();

// ask the current player for their move
System.out.println("Player " + currentPlayer + ", enter your move (row column):");
int row = scanner.nextInt();
int column = scanner.nextInt();

// make the move if it's valid
if (isValidMove(row, column)) {
board

 
= currentPlayer;

// check if the game is over
if (isGameOver()) {
gameOver = true;
displayBoard();
System.out.println("Player " + currentPlayer + " wins!");
} else if (isBoardFull()) {
gameOver = true;
displayBoard();
System.out.println("It's a tie!");
} else {
// switch to the other player
currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
}
} else {
System.out.println("Invalid move, please try again.");
}
}

scanner.close();
}

private boolean isValidMove(int row, int column) {
// check if the move is within the bounds of the board
if (row < 0 || row > 2 || column < 0 || column > 2) {
return false;
}

// check if the cell is empty
if (board
 
!= ' ') {
return false;
}

return true;
}

private boolean isGameOver() {
// check rows
for (int i = 0; i < 3; i++) {
if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
return true;
}
}

// check columns
for (int i = 0; i < 3; i++) {
if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
return true;
}
}

// check diagonals
if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
return true;
}

if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
return true;
}

return false;
}

private boolean isBoardFull() {
// check if every cell is occupied
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
if (board[i][j] == ' ') {
return false;
}
}
}

return true;
}



