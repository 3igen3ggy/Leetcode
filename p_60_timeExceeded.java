import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
	
	List<String> list = new ArrayList<String>();
	
    public String getPermutation(int n, int k) {
    	int[] arr = new int[n];
    	for (int i = 0; i < n; i++) {
    		arr[i] = i + 1;
    	}
    	int len = arr.length;
        gen(arr, len);
        Collections.sort(list);
    	return list.get(k - 1);
    }
    
    public void gen(int[] nums, int k) {
    	if (k == 1) {
    		String aux2 = toString(nums);
    		list.add(aux2);
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
    
    public String toString(int[] nums) {
    	String aux = "";
    	for (int i = 0; i < nums.length; i++) {
    		aux = aux.concat(String.valueOf(nums[i]));
    	}
    	return aux;
    }
}
