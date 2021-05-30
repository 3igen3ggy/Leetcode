class Solution {
    public void gameOfLife(int[][] board) {
        int ilen = board.length;
        int jlen = board[0].length;
        int[][] counts = new int[ilen][jlen];

        for (int i = 0; i < ilen; i++) {
            for (int j = 0; j < jlen; j++) {
                counts[i][j] = countNeighbors(board, i, j);
            }
        }

        for (int i = 0; i < ilen; i++) {
            for (int j = 0; j < jlen; j++) {
                if (board[i][j] == 1 && (counts[i][j] < 2 || counts[i][j] > 3)) board[i][j] = 0;
                if (board[i][j] == 0 && counts[i][j] == 3) board[i][j] = 1;
            }
        }
    }

    public int countNeighbors(int[][] board, int i, int j) {
        int ilen = board.length;
        int jlen = board[0].length;
        int count = 0;

        try {
            if (board[i - 1][j - 1] == 1) count++;
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (board[i - 1][j] == 1) count++;
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (board[i - 1][j + 1] == 1) count++;
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (board[i + 1][j - 1] == 1) count++;
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (board[i + 1][j] == 1) count++;
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (board[i + 1][j + 1] == 1) count++;
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (board[i][j + 1] == 1) count++;
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (board[i][j - 1] == 1) count++;
        } catch (ArrayIndexOutOfBoundsException e) { ;
        }
        return count;
    }
}
