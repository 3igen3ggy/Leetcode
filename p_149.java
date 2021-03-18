import java.util.Arrays;

class Solution {
    public int maxPoints(int[][] points) {
    	int len = points.length;
    	if (len == 1) {
    		return 1;
    	}
    	int max = 0;
    	int counter = 0;		
    	for (int i = 0; i < len; i++) {
    		counter = 1;
    		for (int j = 0; j < len; j++) {
    			if (isOnVertLine(points[i], points[j]) && i != j) {
    				counter++;
    			}
    		}
    		if (counter > max) {
    			max = counter;
    		}
    	}
    	for (int i = 0; i < len - 1; i++) {
    		counter = 0;
    		for (int j = i + 1; j < len; j++) {
    			double[] coeff = coefficients(points[i], points[j]);
    			counter = 0;
    			for (int k = 0; k < len; k++) {

    				if (isOnLine(coeff, points[k])) {
    					counter++;
    				} 
    			}
    			if (counter > max) {
    				max = counter;
    			}
    		}
    	}
        return max;
    }
    
    public double[] coefficients(int[] a, int[] b) {
    	float xa = a[0];
    	float ya = a[1];
    	float xb = b[0];
    	float yb = b[1];
    	double[] coeff = new double[2];
    	double slope = (ya - yb) / (float) (xa - xb);
    	double intercept = ya - slope * xa;
    	coeff[0] = slope;
    	coeff[1] = intercept;
    	return coeff;
    }
    
    public boolean isOnLine(double[] coeff, int[] a) {
    	float d = (float) 0.0001;
    	double gora = coeff[0] * a[0] + coeff[1] + d;
    	double dol = coeff[0] * a[0] + coeff[1] - d;
    	if (a[1] < gora && a[1] > dol) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public boolean isOnVertLine(int[] a, int[]b) {
    	if (a[0] == b[0]) {
    		return true;
    	} else {
    		return false;
    	}
    }
}