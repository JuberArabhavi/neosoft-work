package com.java.src.InterviewQuestions;

public class Array {
	
	public static void main(String arg []) {
		final int size = 4;
		int arr[] = new int[size];
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Enter the elements with size " + size);
		
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		
	}
}
