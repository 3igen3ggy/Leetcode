class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        int MAX = 0;
        int counter = 0;
        int len = heights.length;
        boolean flag = false;
        
        for (int i = 0; i < len; i++) {
        	if (heights[0] != heights[i]) {
        		flag = true;
        		break;
        	}
        }
        
        if (!flag) {
        	return heights[0] * len;
        }
        
        for (int i = 0; i < len; i++) {
        	for(int j = i; j < len; j++) {    		
        		if (heights[j] < heights[i]) break;
        		counter++;
        	}
        	counter--;
        	for (int j = i; j >= 0; j--) {
        		
        		if (heights[j] < heights[i]) break;
        		counter++;
        	}
        	max = heights[i] * counter;
        	counter = 0;
        	if (max > MAX) MAX = max;
        }
        return MAX;
    }
}
