import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prod = new int[len];
        int[] left = new int[len];
        int[] right = new int[len];
        
        left[0] = 1;
        right[len - 1] = 1;

        for (int i = 1; i < len; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        for (int i = len - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < len; i++) {
            prod[i] = left[i] * right[i];
        }
        return prod;
    }
}
