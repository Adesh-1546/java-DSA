package com.basics;

import java.util.Arrays;

public class Largest {

	// Brute --> O(1)
	public static void brute(int arr[]) {

		Arrays.sort(arr);
		System.out.println("Brute Largest: " + arr[arr.length - 1]);
	}

	// Optimal
	public static void optimal(int arr[]) {

		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("Optimal Largest: " + largest);
	}
	

	public static void main(String[] args) {

		int arr[] = { 3, 2, 1, 5, 2 };
		System.out.println(Arrays.toString(arr));

		Largest.brute(arr);
		Largest.optimal(arr);
	}

}
