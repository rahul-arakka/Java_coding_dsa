//https://leetcode.com/problems/valid-sudoku/description/?envType=problem-list-v2&envId=array
//Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
//
//Each row must contain the digits 1-9 without repetition.
//Each column must contain the digits 1-9 without repetition.
//Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
//Note:
//
//A Sudoku board (partially filled) could be valid but is not necessarily solvable.
//Only the filled cells need to be validated according to the mentioned rules.

// This approach only works in case of duplicates in same row or same column and not for duplicates in 3x3 boc matrix.

package code.arrays;

public class ValidSudoku {
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            // Traversing at each ith column and check for duplicates.
            for (int i = 0; i < board.length; i++) {
                Map<Character, Integer> mp = new HashMap<>();
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] == '.')
                        continue;

                    if (mp.getOrDefault(board[i][j], 0) > 0) {
                        System.out.println(board[i][j] + " : " + i + " : " + j);
                        return false;
                    }
                    mp.put(board[i][j], 1);
                }
            }
            // Traversing at each jth row and check for duplicates.
            for (int i = 0; i < board.length; i++) {
                Map<Character, Integer> mp = new HashMap<>();
                for (int j = 0; j < board.length; j++) {
                    if (board[j][i] == '.')
                        continue;

                    if (mp.getOrDefault(board[j][i], 0) > 0) {
                        System.out.println(board[j][i] + " : " + i + " : " + j);
                        return false;
                    }
                    mp.put(board[j][i], 1);
                }
            }
            return true;
        }
    }
}
