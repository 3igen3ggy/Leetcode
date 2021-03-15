import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
    	int counter = countIn(nums, val);
    	if (counter == 0) {
    		return nums.length;
    	}

    	int sol = 0;
    	while (true) {
    		int find = findIn(nums, val);
        	int not = findNotIn(nums, val);
        	if (find != -1 && not != -1) {
        		if (validate(nums, val, counter)) {
        			sol = nums.length - counter;
        			return sol;
        		} else { 
        			nums = switcher(nums, find, not);
        		}
        	} else if (find == -1 || not == -1) {
        		sol = nums.length - counter;
                return sol;
        	}
    	}
    }
    
    public boolean validate(int[] arr, int val, int counter) {
    	for (int i = 0; i < arr.length - counter; i++) { 
    		if (arr[i] == val) {
    			return false;
    		}
    	}
    	return true;
    }
    
    public int[] switcher(int[] arr, int a, int b) {
    	int aux = arr[a];
    	arr[a] = arr[b];
    	arr[b] = aux;
    	return arr;
    }
    
    public int findNotIn(int[] arr, int val) {
    	for (int i = arr.length - 1; i > 0; i--) {
    		if (arr[i] != val) {
    			return i;
    		}
    	}
    	return -1;
    }
    
    public int findIn(int[] arr, int val) {
    	for (int i = 0; i < arr.length; i++) {
    		if (arr[i] == val) {
    			return i;
    		}
    	}
    	return -1;
    }
    
    public int countIn(int[] arr, int val) {
    	int counter = 0;
    	for (int i = 0; i < arr.length; i++) {
    		if (arr[i] == val) {
    			counter++;;
    		}
    	}
    	return counter;
    }
}