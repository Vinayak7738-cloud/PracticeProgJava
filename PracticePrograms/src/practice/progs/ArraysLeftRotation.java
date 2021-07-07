package com.practice.hackerrank;

import java.util.Scanner;

public class ArraysLeftRotation {
	
	/*Function to left rotate arr[] of size n by d*/
	void leftRotate(int arr[], int d, int n) {
		for(int i = 0; i < d; i++) {
			leftRotateOneByOne(arr, n);
		}
	}
	
	void leftRotateOneByOne(int arr[], int n) {
		int i, temp;
		temp = arr[0];
		for (i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];

		}
		arr[n - 1] = temp;
	}
	
	void printArray(int arr[], int n) {
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of Array");
		int n = sc.nextInt();
		System.out.println("No. of Rotation");
		int d = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the numbers");
		for(int i = 0; i < n; i++) {
			 arr[i] = sc.nextInt();
		}
		System.out.println("Entered Array");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " "); 
		}
		
		System.out.println("\n Left Rotated Array");
		
		ArraysLeftRotation arraysLeftRotation = new ArraysLeftRotation();
		
		arraysLeftRotation.leftRotate(arr, d, n);
		arraysLeftRotation.printArray(arr, n);
	}

}
