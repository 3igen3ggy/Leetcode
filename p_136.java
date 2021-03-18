class Solution {
    public int singleNumber(int[] nums) {
    	int counter = 0;
    	int sav = 0;
        for (int i = 0; i < nums.length; i++) {
        	counter = 0;
        	for (int j = 0; j < nums.length; j++) {
        		sav = nums[i];
        		if (nums[j] == sav && i != j) {
        			counter++;
        		}
    		}
        	if (counter == 0) {
        		return sav;
        	}
        }
        return -1;
    }
}