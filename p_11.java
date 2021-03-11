class Solution {
    public int maxArea(int[] height) {
    	int max = 0;
    	int i = 0;
    	int j = height.length - 1;
        int surf;
    	while (i != j ) { 
        	surf = min(height[i], height[j]) * (j - i);
        	if (surf > max) {
        		max = surf;
        	}
        	if (height[i] > height[j]) {
        		j--;
        	} else {
        		i++;
        	}
    	}
        return max;
    }
    
    public int min(int a, int b) {
    	if (a > b) {
    		return b;
    	} else {
    		return a;
    	}
    }
}
