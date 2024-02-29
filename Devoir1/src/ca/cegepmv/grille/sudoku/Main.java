package ca.cegepmv.grille.sudoku;

public class Main {
    public static void main(String[] args) {
        int[][] sudokuGrid = {
            {5, 3, 0, 0, 0, 0, 0, 0, 0},
            {6, 0, 0, 0, 7, 0, 0, 8, 9},
            {0, 9, 8, 6, 0, 3, 0, 0, 0},
            {8, 0, 0, 0, 0, 0, 1, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 3, 0, 0, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 7, 2, 8, 0},
            {0, 0, 0, 4, 0, 0, 0, 7, 9},
            {0, 0, 0, 0, 8, 0, 0, 0, 0}
        };

        Case[][] cellules = new Case[9][9];

        for (int i = 0; i < cellules.length; i++) {
            for (int j = 0; j < cellules[i].length; j++) {
                int nombre = sudokuGrid[i][j];
                if (nombre != 0){
                    cellules[i][j] = new Case(String.valueOf(nombre), true);
                }
                else {
                    cellules[i][j] = new Case("_", false);
                }
            }
        }

        Board board = new Board(cellules);
        board.demarrerJeu();
    }
}