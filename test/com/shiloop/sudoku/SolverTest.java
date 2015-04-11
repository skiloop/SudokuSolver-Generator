package com.shiloop.sudoku;

/**
 * Created with IntelliJ IDEA
 * Author : skiloop@126.com
 * Time   : 2015/4/11 9:20
 * Project: SudokuSolver-Generator
 * Description: Sudoku Solver Test
 */
public class SolverTest {
    public static void main(String[] args) {
        String puzzle = "000000102005200804010090060750062000006300000130049000020050070007400503000000209";
        Sudoku sudoku = new Sudoku(puzzle);
        Solver solver = new Solver(sudoku);
        solver.solve();
        solver.getResult().print();
    }
}
