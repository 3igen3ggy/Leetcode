class Solution {
    public int trap(int[] height) {
    	int len = height.length;
    	if (len == 0) return 0;
        int maxHeight = findMax(height);
        int water = 0;
        int min = 0;
        int max = 0;
        int[] all = findAll(height, maxHeight);
        
        if (all.length == 1) {
        	min = all[0];
        	max = min;
        } else if (all.length >= 2) {
        	min = all[0];
        	max = all[all.length - 1];
        	water += fillWat(height, min, max);
        }
        while (min > 0) {
        	int oldmin = min;
            min = findSmallerLeft(height, 0, min);
            if (min == -1) {
            	break;
            }
            water += fillWat(height, min, oldmin); 
        }
        while (max < len - 1) {
        	int oldmax = max;
            max = findSmallerRight(height, oldmax, len - 1);
            if (max == -1) {
            	break;
            }
            water += fillWat(height, oldmax, max); 
        }
        return water;
    } 
    
    public int findSmallerLeft(int[] height, int a, int b) {
    	int max = height[b];
    	for (int j = max - 1; j > 0; j--) {
    		for (int i = 0; i < b; i++) {
	        	if (height[i] == j) {
	        		return i;
	        	}
        	}
    	}
    	return -1;
    }
    
    public int findSmallerRight(int[] height, int a, int b) {
    	int max = height[a];
    	for (int j = max - 1; j > 0; j--) {
    		for (int i = height.length - 1; i > a; i--) {
	        	if (height[i] == j) {
	        		return i;
	        	}
        	}
    	}
    	return -1;
    }
    
    public int fillWat(int[] height, int a, int b) {
    	int water = 0;
    	int min = minOf(height[a], height[b]);
    	for (int i = a + 1; i < b; i++) {
    		int rest = min - height[i];
    		if (rest < 0) rest = 0;
    		water += rest;
    	}
    	return water;
    }
    
    public int[] findAll(int[] arr, int val) {
    	int counter = 0;
    	for (int i = 0; i < arr.length; i++) {
    		if (arr[i] == val) {
    			counter++;
    		}
    	}
    	int[] all = new int[counter];
    	counter = 0;
    	for (int i = 0; i < arr.length; i++) {
    		if (arr[i] == val) {
    			all[counter] = i;
    			counter++;
    		}
    	}
    	return all;
    }
    
    public int find(int[] arr, int val) {
    	for (int i = 0; i < arr.length; i++) {
    		if (arr[i] == val) {
    			return i;
    		}
    	}
    	return -1;
    }
    public int findMax(int[] arr) {
    	int max = arr[0];
    	for (int i = 1; i < arr.length; i++) {
    		if (arr[i] > max) {
    			max = arr[i];
    		}
    	}
    	return max;
    } 
    public int minOf(int a, int b) {
    	if (a > b) {
    		return b;
    	} else { 
    		return a;
    	}
    }
}
