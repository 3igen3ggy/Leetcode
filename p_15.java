import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    	int len = nums.length;
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	if (len < 3) return list;
        Arrays.sort(nums); 
        for (int i = 0; i < len - 2; i++) {
        	int j = i + 1;
        	int k = len - 1;
        	if (i == 0 || nums[i] != nums[i - 1]) {
            	while (j < k) {
            		int sum = nums[i] + nums[j] + nums[k];
            		if (sum == 0) {
            			list.add(List.of(nums[i], nums[j], nums[k]));
            			while (j < k && nums[j] == nums[j + 1]) j++;
            			while (j < k && nums[k] == nums[k - 1]) k--;
            			j++;
            			k--;
            		}
            		else if (sum < 0) {
            			j++;
            		} else if (sum > 0) {
            			k--;
            		}
            	}
        	}
        }
        return list;
    }
}
