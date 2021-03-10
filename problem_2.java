package project;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		int[] arr1 = generateArray(1, 9, 3);
		int[] arr2 = generateArray(1, 9, 3);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(getNumber(arr1));
		System.out.println(getNumber(arr2));
		
		int aux = getNumber(arr1) + getNumber(arr2);
		int[] ans = export(aux);
		
		System.out.println(aux);
		System.out.println(Arrays.toString(ans));
	}
	
	public static int[] export(int aux) {
		int d = (int) Math.log10(aux) + 1;
		int[] ans = new int[d];
		
		for (int i = 0; i < d; i++) {
			ans[i] = digit(aux, i);
		}
		
		return ans;
	}
	
	public static int[] generateArray(int min, int max, int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		arr[i] = (int) ((max - min + 1) * Math.random() + min);	
		}
		
		return arr;
	}
	
	public static int getNumber(int[] arr) {
		int sum = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			sum += arr[i] * (int) Math.pow(10, i);
		}
		return sum;
	}
	
	public static int digit(int n, int d) {
		String aux = String.valueOf(n);
		return Integer.parseInt(String.valueOf(aux.charAt(d)));
	}
}
