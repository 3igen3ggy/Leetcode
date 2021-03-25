import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len = nums.length;
    	ArrayList<Integer> numbers = new ArrayList<Integer>();
    	ArrayList<Integer> amounts = new ArrayList<Integer>();
    	List<Integer> moreThan = new ArrayList<Integer>();
    	for (int i = 0; i < len; i++) {
    		int ind = numbers.indexOf(nums[i]);
    		if (ind == -1) {
    			numbers.add(nums[i]);
    			amounts.add(1);
    		} else if (ind != -1) {
    			amounts.set(ind, amounts.get(ind) + 1);
    		}
    	}
    	for (int i = 0; i < amounts.size(); i++) {
    		if (amounts.get(i) > len / 3) {
    			moreThan.add(numbers.get(i));
    		}
    	}
    	return moreThan;
    }
}
