package packages;

import java.util.Scanner;

public class Task_12 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LastDigit();
		int num, rev = 0;

		System.out.println("Enter a number :");
		num = sc.nextInt();

		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("The reverse value is:" + rev);
	}

	static void LastDigit() {
		int num;
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		while (num != 0) {
			System.out.println(num % 10);
			num /= 10;
			System.out.println(num);
		}
	}

}
