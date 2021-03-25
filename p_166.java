import java.util.Arrays;

class Solution {
    public int compareVersion(String version1, String version2) {
        String[] aux1 = version1.split("\\.");
        String[] aux2 = version2.split("\\.");
        System.out.println(Arrays.toString(aux1));
        System.out.println(Arrays.toString(aux2));
        int len1 = aux1.length;
        int len2 = aux2.length;
        int len = 0;
        if (len1 > len2) {
        	len = len1;
        } else {
        	len = len2;
        }
        
        
        for (int i = 0; i < len; i++) {
        	int int1 = 0;
        	int int2 = 0;
        	if (i < len1) {
        		int1 = Integer.parseInt(aux1[i]);
        	}
        	if (i < len2) {
        		int2 = Integer.parseInt(aux2[i]);
        	}       	
        	if (int1 > int2) {
        		return 1;
        	} else if (int1 < int2) {
        		return -1;
        	}
        }
        return 0;
    }
}
