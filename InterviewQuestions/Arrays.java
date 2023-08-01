package com.java.src.InterviewQuestions;

import java.util.List;

public class Arrays {

	// Asked in interview	
	static void arraySum(List<Integer> list, int sum, int n) {
		int sumCount = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (list.get(i) + list.get(j) == sum) {
					sumCount++;
					if (sumCount >= 2) {
						System.out.println("Sum Count " + sumCount);
						System.out.println("(" + list.get(i) + ", " + list.get(j) + ")");
						break;
					}
				}
			}
		}
	}

	static void reverse(int arr[], int start, int end) {
		int tmp;

		while (start < end) {
			tmp = arr[start];
			arr[start] = arr[end];
			arr[end] = tmp;
			start++;
			end--;
		}
	}
	
	// Asked in interview
	static void starPrint(int input) {
	      System.out.println("The required pattern is:");
	      
	      for(int i = 1; i<=input/2; i++) {
	        System.out.print("\n");
	        for (int j=i; j>0 ;j--) {
	          System.out.print("*-");
	        }
	      }
	}
	
	static void printArray(int arr[], int size) {
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String[] args) {
		int n = 6, sum = 7;
		List<Integer> list = java.util.Arrays.asList(1,2,1,4,3,5);
		arraySum(list, sum, n);
		
		starPrint(10);
	}
}

// Asked in interview

/*2. find customers name order date product and payment mode type based on orders, products and payment_method 

SELECT customers.first_name, customers.last_name,
orders.order_date, products.product_name, payment_method.payment_type

FROM customers JOIN orders ON order.customer_id = customers.customer_id
JOIN products ON orders.product_id = products.products_id
JOIN payment_method ON orders.payment_method_id = payment_method.payment_method_id*/
