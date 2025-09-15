	package com.basics;
	
	import java.util.Arrays;
	
	public class LeftRotateBRUTE {
		
		public static void rotateONE(int arr[]) {
			int temp = arr[0];
			for(int i=1 ; i<arr.length; i++) {
				arr[i-1] = arr[i];
			}
			arr[arr.length-1] = temp;
			
		}
		static void rotate(int arr[] ,int k) {
			k = k % arr.length;
			if(k < 0) {
				k = k + arr.length;
			}
			
			for(int i=1 ; i<k ; i++) {
				rotateONE(arr);
			}
			
			System.out.println("After K rotation: "+Arrays.toString(arr));
		}
		
		
		
	
		
		public static void main(String[] args) {
			int arr[] = {1,2,3,4,5,6};
			System.out.println("Original arr : "+Arrays.toString(arr));
			
			LeftRotateBRUTE.rotate(arr,5);
		}
	
	}
	
