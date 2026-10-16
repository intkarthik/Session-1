package Arrays_1;

import java.util.Scanner;

public class Array_Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array = CreateArray();
		Sum_Array(Array);
		Count_Even(Array);
		Count_Odd(Array);
		Reverse_array(Array);
	}

	static int[] CreateArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size : ");
		int array = sc.nextInt();
		int[] obj = new int[array];
		for (int i = 0; i < obj.length; i++) {
			System.out.println("Enter the number : ");
			obj[i] = sc.nextInt();
		}
		return obj;
	}

	static void Sum_Array(int[] obj) {
		int sum = 0;
		for (int i = 0; i < obj.length; i++) {
			sum += obj[i];
		}
		System.out.println("The sum of given arrays : " + sum);
	}

	static void Count_Even(int[] obj) {
		int count = 0;
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println("The count of even numbers is  :" + count);
	}

	static void Count_Odd(int[] obj) {
		int count = 0;
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] % 2 != 0) {
				count++;
			}
		}
		System.out.println("The count of odd numbers is  :" + count);
	}

	static void Reverse_array(int[] obj) {
		for (int i = obj.length - 1; i >= 0; i--) {
			System.out.print(obj[i] + " ");
		}
		System.out.println();
	}
}
