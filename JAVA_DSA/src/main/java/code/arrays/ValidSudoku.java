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

//This approach works for all test cases with 13ms & beats 27.67%

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

            // Traversing the 3x3 matrix.
            int i = 0, j = 0, n = board.length;
            while (n > 0) {
                Map<Character, Integer> mp = new HashMap<>();
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        if (board[x][y] == '.')
                            continue;

                        if (mp.getOrDefault(board[x][y], 0) > 0) {
                            // System.out.println(board[x][y] + " : "+i + " : "+j);
                            return false;
                        }
                        mp.put(board[x][y], 1);
                    }
                }
                if (i + 3 == board.length && j + 3 == board.length)
                    break;
                if (i + 3 < board.length) {
                    i = i + 3;
                } else {
                    j = j + 3;
                    i = 0;
                }
                n--;
            }


            return true;
        }
    }
}
