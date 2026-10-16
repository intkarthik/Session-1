package Arrays;

import java.util.Scanner;

public class Learning_array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array = creatingarray();
		sum_array(Array);
		Largest_Array(Array);
		Reverse(Array);
		Count_digit(Array);
		sum_array(Array);
		Product_Array(Array);
		Smallest_Array(Array);
		Print_Even_numbers();
		Print_Odd_numbers();
		System.out.println(Array);
		Palindrome();

	}

	public static int[] creatingarray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the arraysize :");
		int arraysize = sc.nextInt();
		int[] obj = new int[arraysize];

		for (int i = 0; i < obj.length; i++) {
			System.out.println("Enter the number : ");
			obj[i] = sc.nextInt();
		}
		return obj;
	}

	static void sum_array(int[] obj) {
		int sum = 0;
		for (int i = 0; i < obj.length; i++) {
			sum += obj[i];
		}
		System.out.println("The sum of given array is : " + sum);
	}

	static void Largest_Array(int[] obj) {
		int max = obj[0];
		for (int i = 1; i < obj.length; i++) {
			if (obj[i] > max) {
				max = obj[i];
			}
		}
		System.out.println("The Largest number is : " + max);
	}

	static void Reverse(int[] obj) {
		for (int i = obj.length - 1; i >= 0; i--) {
			System.out.print(obj[i] + " ");
		}
		System.out.println();
	}

	static void Count_digit(int[] obj) {
		int count = 0;
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] != 0) {
				count++;
			}
		}
		System.out.println("The count of given array is : " + count);
	}

	static void Sum_Even(int[] obj) {
		int sum = 0;
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] % 2 == 0) {
				sum += obj[i];
			}
		}
		System.out.println("The sum of even number in array : " + sum);
	}

	static void Product_Array(int[] obj) {
		int pro = 1;
		for (int i = 0; i < obj.length; i++) {
			pro *= obj[i];
		}
		System.out.println("The product of given array is " + pro);
	}

	static void Smallest_Array(int[] obj) {
		int min = obj[0];
		for (int i = obj.length - 1; i >= 0; i--) {
			if (obj[i] < min) {
				min = obj[i];
			}
		}
		System.out.println("The given array is small : " + min);
	}

	static void Print_Even_numbers() {
		int start = 10;
		int end = 30;
		System.out.println("Printing the arrays in even");
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	static void Print_Odd_numbers() {
		int[] numbers = { 23, 34, 56, 75, 99 };
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				System.out.print(numbers[i] + " ");
			}
		}
	}

	static void Palindrome() {
		int rev = 0;
		int og_value = rev;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int value = sc.nextInt();

		for (; value != 0;) {
			int rem = value % 10;
			rev = rev * 10 + rem;
			value = value / 10;
		}
		if (og_value == value)
			System.out.println("Palindrome ");
		else
			System.out.println("Not a Palindrome ");
	}
}
