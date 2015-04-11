package com.shiloop.sudoku;

import com.majestic.solver.SudokuSolver;

/**
 * Created with IntelliJ IDEA
 * Author : skiloop@126.com
 * Time   : 2015/4/11 9:31
 * Project: SudokuSolver-Generator
 * Description:
 */
public class Solver extends SudokuSolver {
    private Sudoku sudoku;

    private Sudoku result;

    /**
     * Sudoku puzzle solver
     *
     * @param board a solvable sudoku puzzle
     */
    public Solver(int[][] board) {
        this(new Sudoku(board));
    }

    public Solver(String data) {
        this(new Sudoku(data));
    }

    public Solver(Sudoku puzzle) {
        super(puzzle.getData());
        this.sudoku = puzzle;
    }

    public Sudoku getSudoku() {
        return sudoku;
    }

    @Override
    public void solve() {
        super.solve();
        result = new Sudoku(getBoard());
    }

    public Sudoku getResult() {
        return result;
    }
}
