package xsudokux;

import java.util.Scanner;
import java.util.Stack;

public class XsudokuX {
    private static final int SIZE = 9; // Size of the Sudoku grid
    private static int[][] sudoku = {
        {5, 3, 0, 0, 7, 0, 0, 0, 0},
        {6, 0, 0, 1, 9, 5, 0, 0, 0},
        {0, 9, 8, 0, 0, 0, 0, 6, 0},
        {8, 0, 0, 0, 6, 0, 0, 0, 3},
        {4, 0, 0, 8, 0, 3, 0, 0, 1},
        {7, 0, 0, 0, 2, 0, 0, 0, 6},
        {0, 6, 0, 0, 0, 0, 2, 8, 0},
        {0, 0, 0, 4, 1, 9, 0, 0, 5},
        {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };

    private static Stack<Move> moves = new Stack<>(); // Stack to keep track of moves

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isGameRunning = true;

        while (isGameRunning) {
            printSudoku();
            System.out.println("Options: (1) Fill Number, (2) Undo, (3) Clear Spot, (4) Exit");
            int option = in.nextInt();

            switch (option) {
                case 1:
                    fillNumber(in);
                    break;
                case 2:
                    undo();
                    break;
                case 3:
                    clearSpot(in);
                    break;
                case 4:
                    isGameRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }

            if (isSolved(sudoku)) {
                System.out.println("Congratulations, you solved the Sudoku!");
                isGameRunning = false;
            }
        }
    }

    private static void printSudoku() {
        System.out.println("Sudoku game. 9x9 grid. Just fill in the empty spaces.");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (sudoku[i][j] == 0) {
                    System.out.print("- ");
                } else {
                    System.out.print(sudoku[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    private static void fillNumber(Scanner in) {
        System.out.println("Enter the number to place (1-9):");
        int number = in.nextInt();
        System.out.println("Select a spot (1-9 for row, followed by 1-9 for column):");
        int row = in.nextInt() - 1; // Convert to 0-based index
        int column = in.nextInt() - 1; // Convert to 0-based index

        if (row >= 0 && row < SIZE && column >= 0 && column < SIZE && number >= 1 && number <= 9) {
            moves.push(new Move(row, column, sudoku[row][column])); // Store previous value
            sudoku[row][column] = number;
        } else {
            System.out.println("Invalid input. Please try again.");
        }
    }

    private static void undo() {
        if (!moves.isEmpty()) {
            Move lastMove = moves.pop();
            sudoku[lastMove.row][lastMove.column] = lastMove.previousValue;
            System.out.println("Last move undone.");
        } else {
            System.out.println("No moves to undo.");
        }
    }

    private static void clearSpot(Scanner in) {
        System.out.println("Select a spot to clear (1-9 for row, followed by 1-9 for column):");
        int row = in.nextInt() - 1; // Convert to 0-based index
        int column = in.nextInt() - 1; // Convert to 0-based index

        if (row >= 0 && row < SIZE && column >= 0 && column < SIZE) {
            moves.push(new Move(row, column, sudoku[row][column])); // Store previous value
            sudoku[row][column] = 0; // Clear the spot
            System.out.println("Spot cleared.");
        } else {
            System.out.println("Invalid input. Please try again.");
        }
    }

    public static boolean isSolved(int[][] sudoku) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (sudoku[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // Inner class to track moves
    private static class Move {
        int row;
        int column;
        int previousValue;

        Move(int row, int column, int previousValue) {
            this.row = row;
            this.column = column;
            this.previousValue = previousValue;
        }
    }
}