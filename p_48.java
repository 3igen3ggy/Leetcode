class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;      
        for (int i = 0; i <= len / 2; i++) { 
        	for (int j = i; j < len - 1 - i; j++) {
        		System.out.println(i + " " + j);
        		rotSingle(matrix, i, j);
            }
        }
    }
    
    public void rotSingle(int[][] matrix, int i, int j) {
    	int len = matrix.length;  
    	int len1i = len - 1 - i;
    	int len1j = len - 1 - j;
    	int save = matrix[i][j];
    	matrix[i][j] = matrix[len1j][i];
    	matrix[len1j][i] = matrix[len1i][len1j];
    	matrix[len1i][len1j] = matrix[j][len1i];
    	matrix[j][len1i] = save; 
    }
}

    	