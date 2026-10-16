package Arrays;

import java.util.Scanner;

public class Sum_if_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum_of_digits();
		System.out.println("===============");
		user_input();
		System.out.println("===============");
		user_input_1();
		System.out.println("===============");
		int sum = 0;
		int[][] obj = new int[2][2];
		obj[0][0] = 10;
		obj[0][1] = 20;
		obj[1][0] = 30;
		obj[1][1] = 40;

		for (int i = 0; i < obj.length; i++) {
			for (int j = 0; j < obj.length; j++) {
				sum = sum + obj[i][j];
			}
		}
		System.out.println(sum);
	}

	public static void sum_of_digits() {
		int[] value = { 10, 30, 70 };
		int sum = 0;
		for (int i = 0; i < value.length; i++) {
			sum += value[i];
		}
		System.out.println(sum);
	}

	public static void user_input() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		int[] value = new int[2];
		for (int i = 0; i < value.length; i++) {
			System.out.println("Enter the values : ");
			value[i] = sc.nextInt();
			sum += value[i];
		}
		System.out.println(sum);
	}

	public static void user_input_1() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int arraysize = sc.nextInt();
		int value[] = new int[arraysize];
		for (int i = 0; i < value.length; i++) {
			System.out.println("Enter the number : ");
			value[i] = sc.nextInt();
		}
		for (int i = 0; i < value.length; i++) {
			sum += value[i];
		}
		System.out.println(sum);
	}

}
