package com.basics;

public class CheckSorted {
	
	public static boolean sorting(int arr[]) {
		for(int i=1 ; i<arr.length ; i++) {
			if(arr[i] < arr[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int arr[] = {15,65,23,87,64,85,93,45,12};
		CheckSorted.sorting(arr);
	}

}
