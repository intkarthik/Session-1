package Arrays;

import java.util.Scanner;

public class Learning_array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = CreateArray();
		Count_Even(array);
		Count_Odd(array);
		Largest_Array(array);
		Sum_Even(array);
		Pos_Neg(array);
	}

	static int[] CreateArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		int Array_Size = sc.nextInt();
		int[] obj = new int[Array_Size];

		for (int i = 0; i < obj.length; i++) {
			System.out.println("Enter the number : ");
			obj[i] = sc.nextInt();
		}
		return obj;
	}

	public static void Count_Even(int[] obj) {
		int count = 0;
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println("Counting even numbers : " + count);
	}

	static void Count_Odd(int[] obj) {
		int count = 0;
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] % 2 != 0) {
				count++;
			}
		}
		System.out.println("Counting of odd numbers : " + count);
	}

	static void Largest_Array(int[] obj) {
		int sum = 0;
		for (int i = 0; i < obj.length; i++) {
			sum += obj[i];
		}
		System.out.println("The sum of given array : " + sum);
	}

	static void Sum_Even(int[] obj) {
		int sum = 0;
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] % 2 == 0) {
				sum += obj[i];
			}
		}
		System.out.println("Sum of even numbers in given array : " + sum);
	}

	static void Pos_Neg(int[] obj) {
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] > 0) {
				System.out.println("The given number is Positive ");
			} else if (obj[i] < 0) {
				System.out.println("The given number is Negative ");
			} else
				System.out.println("The given number is zero");
		}
	}
}
