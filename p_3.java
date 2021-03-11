class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int mergeLength = nums1.length + nums2.length;
        int[] merge = new int[mergeLength];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (k < mergeLength) {
        	if (i == nums1.length) {
        		merge[k] = nums2[j];
        		k++;
        		j++;
        	} else if (j == nums2.length) {
        		merge[k] = nums1[i];
        		k++;
        		i++;
        	} else if (nums1[i] <= nums2[j]) {
        		merge[k] = nums1[i];
        		k++;
        		i++;
        	} else {
        		merge[k] = nums2[j];
        		k++;
        		j++;
        	}
        }
        
        if (mergeLength % 2 != 0) {
        	return merge[mergeLength / 2];
        } else {
        	return ((merge[mergeLength / 2] + merge[mergeLength / 2 - 1]) / (double) 2);
        }
    }
}
