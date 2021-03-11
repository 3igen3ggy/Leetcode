class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
        	if (!isUnique(row(board, i)) || !isUnique(column(board, i))) {
        		return false;
        	}
        }
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
        		if (!isUnique(square(board, i, j))) {
        			return false;
        		}
        	}
        }
        return true;
    }
    
    public boolean isUnique(int[] arr) {
    	for (int i = 0; i < 8; i++) {
    		for (int j = i + 1 ; j < 9; j++) {
    			if ((arr[i] == arr[j]) && (arr[i] != 0 || arr[j] != 0)) {
    				return false;
    			}
    		}
    	}
    	return true;
    }
    
    public int[] square(char[][] board, int y, int x) {
    	int[] sq = new int[9];
    	int k = 0;
    	for (int i = 0; i < 3; i++) {
    		for (int j = 0; j < 3; j++) {
        		if (board[i + 3 * y][j + 3 * x] == '.') {
        			sq[k] = 0;
        			k++;
        		} else {
    			sq[k] = Integer.parseInt(String.valueOf(board[i + 3 * y][j + 3 * x]));
    			k++;
        		}
    		}
    	}
    	return sq;
    }
    
    public int[] row (char[][] board, int i) {
    	int[] aux = new int[9];
    	for (int j = 0; j < 9; j++) {
    		if (board[i][j] == '.') {
    			aux[j] = 0;
    		} else {
    			aux[j] = Integer.parseInt(String.valueOf(board[i][j]));
    		}
    		
    	}
    	return aux;
    }
    
    public int[] column(char[][] board, int j) {
    	int[] aux = new int[9];
    	for (int i = 0; i < 9; i++) {
    		if (board[i][j] == '.') {
    			aux[i] = 0;
    		} else {
    			aux[i] = Integer.parseInt(String.valueOf(board[i][j]));
    		}
    	}
    	return aux;
    }
}
