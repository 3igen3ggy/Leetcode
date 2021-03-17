class Solution {
    public void sortColors(int[] nums) {
        boolean change = true;
        while (change) {
        	change = false;
        	for (int i = 0; i < nums.length - 1; i++) {
        		if (nums[i + 1] < nums[i]) {
        			int aux = nums[i];
        			nums[i] = nums[i + 1];
        			nums[i + 1] = aux;
        			change = true;
        		}
        	}
        }
    }
}