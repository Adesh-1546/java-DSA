package com.basics;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static void brute(int arr[]) {
		int n =arr.length;
		
		int temp[] = new int[n];   // new array
		int j=0;   //index for new array
		
		//add 1st element to new array
		temp[j++] = arr[0] ;
		
		for(int i=1 ; i<n ; i++) {
			if(arr[i] != arr[i-1]) {
				temp[j++] = arr[i];
			}
		}
		 System.out.println("Array without duplicates:");
	        for (int i = 0; i < j; i++) {
	            System.out.print(temp[i] + " ");
	        }
	}
	
	public static void optimal(int arr[]) {
		int rd=0;
		
		for(int i=1 ; i<arr.length; i++) {
			if(arr[rd] != arr[i]) {
				rd++;
				arr[rd] = arr[i];  //replace duplicate
			}
		}//rd has the index 
		
		//display
		System.out.print("After removing duplicates: ");
		for(int i=0 ; i<rd ; i++) {
			System.out.print(+arr[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
		System.out.println("Before removing duplicates: "+Arrays.toString(arr));
		
//		RemoveDuplicates.brute(arr);
		RemoveDuplicates.optimal(arr);
		
	
		
	}

}
