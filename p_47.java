import java.util.ArrayList;
import java.util.List;

class Solution {
	
	List<Integer> list = new ArrayList<Integer>();
	List<List<Integer>> totalList = new ArrayList<List<Integer>>();
	
    public List<List<Integer>> permuteUnique(int[] nums) {
    	int len = nums.length;
        gen(nums, len);
    	return totalList;
    }
    
    public void gen(int[] nums, int k) {
    	if (k == 1) {
    		list = toList(nums);
    		if (!totalList.contains(list)) totalList.add(list);
    		return;
    	}
    	else {
    		gen(nums, k - 1);
    		for (int i = 0; i < k - 1; i++) {
    			if (k % 2 == 0) swap(nums, i, k - 1);
    			else swap(nums, 0, k - 1);
    			gen(nums, k - 1);
    		}
    	}
    }
    
    public void swap(int[] nums, int a, int b) {
    	int temp = nums[a];
    	nums[a] = nums[b];
    	nums[b] = temp;
    }
    
    public List<Integer> toList(int[] nums) {
    	List<Integer> list = new ArrayList<Integer>();
    	for (int i = 0; i < nums.length; i++) {
    		list.add(nums[i]);
    	}
    	return list;
    }
}
