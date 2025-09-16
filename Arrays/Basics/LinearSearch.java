package com.basics;
/*
Problem Statement: Given an array, and an element number the task is to find if number is present in the given array or not.
 If present print the index of the element or print -1.
 */

public class LinearSearch {
	
	static int linear(int arr[], int key) {
		for(int i=0 ; i<arr.length-1 ; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1 ;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,60,80,50,90,100};
		int key = 90 ; 
		
		LinearSearch.linear(arr, key);
		
		 int index = LinearSearch.linear(arr, key);
	        
	     if (index != -1) {
	         System.out.println("Key found at index: " + index);
	     }else{
	            System.out.println("Key not found in the array.");
	     }
		
	}

}

