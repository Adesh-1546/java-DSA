package com.basics;

import java.util.Arrays;

public class Move0sEND {
	
	static void move(int arr[]) {
		
		//if array has 0 or 1 elements
		int size=arr.length;
		if(size == 0 || size == 1 ) {
			return;
		}
		
		//logic
		int nz=0 , z=0;
		while (nz < size ) {
			if(arr[nz] != 0 ) {
				int temp = arr[nz];
				arr[nz] = arr[z];
				arr[z] = temp ; 
				nz++;
				z++;
			}else {
				nz++;
			}
		}
		
		System.out.println("A : "+Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int arr[] = {2,0,3,6,5,0,4,8,0,0,4};
		System.out.println("Q : "+Arrays.toString(arr));
		
		Move0sEND.move(arr);
	}

}
