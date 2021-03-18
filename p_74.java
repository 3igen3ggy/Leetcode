class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (m == 1) {
        	for (int i = 0; i < n; i++) { 
        		if (matrix[0][i] == target) { 
        			return true;
        		}
        	}
        	return false;
        	
        }
    	if (matrix[0][0] > target) {
    		return false;
    	}
    	
        for (int i = 0; i < m; i++) {
        	if (matrix[i][0] == target) {
        		return true;
        	}
        	if (matrix[i][0] > target) {
        		for (int j = 0; j < n; j++) {
        			if (matrix[i - 1][j] == target) {
        				return true;
        			} else if (matrix[i - 1][j] > target) {
        				return false;
        			}
        		}
        	}
        	for (int j = 0; j < n; j++) {
            	if (matrix[m - 1][j] == target) {
            		return true;
            	}
        }
        
        
        
        }
        return false;
    }
}