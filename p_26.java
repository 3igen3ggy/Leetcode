class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
		int counter = 1;
		int checker = 1;
		int max = nums[0];
		for (int i = 0; i < len - 1; i++) {			
			if (max < nums[i + 1]) {
				max = nums[i + 1];
				rotate(nums, checker, i + 1);
				checker++;
				counter++;			
			}
        }
    	return counter;
    }
    
	public void rotate(int[] arr, int a, int b) {
		int aux = arr[b];
		arr[b] = arr[a];
		arr[a] = aux;
	}
}
