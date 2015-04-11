package com.shiloop.sudoku;

/**
 * Created with IntelliJ IDEA
 * Author : skiloop@126.com
 * Time   : 2015/4/11 9:27
 * Project: SudokuSolver-Generator
 * Description: Sudoku Puzzle
 */
public class Sudoku {

    private int[][] data;

    public Sudoku(int[][] data) {
        this.data = data;
    }

    public Sudoku(String str) {
        this(parse(str));
    }

    public static int[][] parse(String sudokuString) {
        int size = (int) Math.sqrt(sudokuString.length());
        int[][] data = new int[size][size];
        int r = 0;
        int c = 0;
        int i = 0;
        while (i < sudokuString.length()) {
            data[r][c] = sudokuString.charAt(i) - '0';
            i++;
            c++;
            if (c == size) {
                c = 0;
                r++;
            }
        }
        return data;
    }

    public int[][] getData() {
        return data;
    }

    public void print() {
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                System.out.print(data[r][c]);
            }
            System.out.println();
        }
    }


}
