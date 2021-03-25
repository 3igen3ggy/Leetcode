import java.util.ArrayList;

class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
    	ArrayList<Integer> numbers = new ArrayList<Integer>();
    	ArrayList<Integer> amounts = new ArrayList<Integer>();
    	for (int i = 0; i < len; i++) {
    		int ind = numbers.indexOf(nums[i]);
    		if (ind == -1) {
    			numbers.add(nums[i]);
    			amounts.add(1);
    		} else if (ind != -1) {
    			amounts.set(ind, amounts.get(ind) + 1);
    		}
    	}
    	int max = 0;
    	int maxind = 0;
    	for (int i = 0; i < amounts.size(); i++) {
    		if (amounts.get(i) > max) {
    			max = amounts.get(i);
    			maxind = i;
    		}
    	}
    	return numbers.get(maxind);
    }
}
