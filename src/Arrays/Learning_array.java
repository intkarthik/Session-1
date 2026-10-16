package Arrays;

import java.util.Scanner;

public class Learning_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = createarray();
		System.out.println(a);// To print the address
		sum_of_array(a);
		Largest_array(a);
		Reverse_number(a);
		Even_odd(a);
	}

	static int[] createarray() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int arraysize = sc.nextInt();
		int value[] = new int[arraysize];

		for (int i = 0; i < value.length; i++) {
			System.out.println("Enter the value : ");
			value[i] = sc.nextInt();
		}
		return value;
	}

	static void sum_of_array(int[] value) {
		int sum = 0;
		for (int i = 0; i < value.length; i++) {
			sum += value[i];
		}
		System.out.println("The sum of value is :  " + sum);

	}

	static void Largest_array(int[] value) {
		int max = value[0];
		// Scanner sc = new Scanner(System.in);
		for (int i = 1; i < value.length; i++) {
			if (value[i] > max) {
				max = value[i];
			}
		}
		System.out.println("Largest value is : " + max);
	}

	static void Reverse_number(int[] value) {

		for (int i = value.length - 1; i >= 0; i--) {
			System.out.print(value[i] + " ");
		}
		System.out.println();

	}

	static void Even_odd(int[] value) {
		for (int i = 0; i < value.length; i++) {
			if (value[i] % 2 == 0 && value[i] != 0) {
				System.out.println("The given array is even number  : " + value[i]);
			} else if (value[i] != 0)
				System.out.println("The given array is odd number :  " + value[i]);
			else
				System.out.println("Neutral" + value[i]);

		}
	}

}
