import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        boolean[] arr = new boolean[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] = true;
        }
        System.out.println(Arrays.toString(arr));
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            if (!arr[i]) return i;
        }
        return nums.length;
    }
}
