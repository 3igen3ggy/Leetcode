class Solution {
    public int[] plusOne(int[] digits) {
    	int len = digits.length;
    	if (areAll9(digits)) {
    		int[] arr = new int[len + 1];
    		arr[0] = 1;
    		for (int i = 1; i < len + 1; i++) {
    			arr[i] = 0;
    		}
    		return arr;
    	} else if (len == 1) {
    		digits[0]++;
    	} else {
    		int sum = digits[len - 1] + 1;
    		int dig = sum % 10;
    		int carry = sum / 10;
    		int i = len - 1;
    		do {
    		digits[i] = dig;
    		sum = digits[i - 1] + carry;
    		dig = sum % 10;
    		carry = sum / 10;
    		i--;
    		} while (carry == 1);
    		digits[i] = dig;
    	}
	    return digits;
    }

    public boolean areAll9(int[] arr) {
    	if (arr.length == 0) {
    		return false;
    	} else {
    		for (int i = 0; i < arr.length; i++) {
    			if (arr[i] != 9) {
    				return false;
    			}
    		}
    		return true;
    	}
    }
}
