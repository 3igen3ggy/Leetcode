import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        int m = matrix.length;
        int n = matrix[0].length;
        int cellsAmount = n * m;
        int counter = 0;
        
        int top = 0;
        int bot = 0;
        int left = 0;
        int right = 0;
        
        while (counter != cellsAmount) {
        	for (int i = left; i < n - right; i++) {
        		list.add(matrix[top][i]);
        		counter++;
        	}
        	top++;
        	
        	if (counter == cellsAmount) return list;
        	
        	for (int i = top; i < m - bot; i++) {
        		list.add(matrix[i][n - right - 1]);
        		counter++;
        	}
        	right++;
        	
        	if (counter == cellsAmount) return list;
        	
        	for (int i = n - right - 1; i >= left; i--) {
        		list.add(matrix[m - bot - 1][i]);
        		counter++;
        	}
        	bot++;
        	
        	if (counter == cellsAmount) return list;
        	
        	for (int i = m - bot - 1; i >= top; i--) {
        		list.add(matrix[i][left]);
        		counter++;
        	}
        	left++;
        	
        	if (counter == cellsAmount) return list;
        	
        }
        return list;
    }
}
