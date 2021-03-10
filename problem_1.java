package project;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		int[] arr1 = generateArray(1, 100, 10);
		int[] arr2 = generateArray(1, 100, 10);
		int question = findQuestion(arr1, arr2);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(question);
		
		finder(arr1, arr2, question);
	}
	
	public static void finder(int[] arr1, int[] arr2, int question) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] + arr2[j] == question) {
					System.out.println("\nIndices:\nIndex1: " + i + "\nIndex2: " + j);
				}	
			}	
		}	
	}
	
	public static int[] generateArray(int min, int max, int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		arr[i] = (int) ((max - min + 1) * Math.random() + min);	
		}
		
		return arr;
	}
	
	public static int findQuestion(int[] arr1, int[] arr2) {
		int ind1 = (int) (arr1.length * Math.random());
		int ind2 = (int) (arr2.length * Math.random());
		System.out.println("ind1: " + ind1 + ", ind2: " + ind2);
		
		return (arr1[ind1] + arr2[ind2]);
	}
	
}
