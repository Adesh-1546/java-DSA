package com.basics;

import java.util.Arrays;

public class SecondLarge {
	
	public static void brute(int arr[]) {
		Arrays.sort(arr);
		
		int largest = arr[arr.length-1];
		int second = 0;
		for(int i=arr.length-2 ; i >= 0 ; i--) {
			if(arr[i] != largest) {
				second = arr[i];
				break;
			}
		}
		System.out.println("Brute 2nd Large: "+second);
	}
	
	public static void optimal(int arr[]) {
		int largest = arr[0];
		int Slargest = arr[1];
		
		if(arr[1] > arr[0]) {
			largest = arr[1];
			Slargest = arr[0];
		}
		
		for(int i=2 ; i<arr.length ; i++) {
			if(arr[i]> largest) {
				Slargest = largest;
				largest = arr[i];
			}else if(arr[i] > Slargest && arr[i] != largest) {  //handles duplicates
				Slargest = arr[i];
			}
		}
		System.out.println("Optimal 2nd largest: "+Slargest);
		
	}

	public static void main(String[] args) {
		int arr[] = {15,65,23,87,64,85,93,45,12};
		System.out.println(Arrays.toString(arr));
		
		SecondLarge.brute(arr);
		SecondLarge.optimal(arr);

	}
}
