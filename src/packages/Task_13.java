package packages;

import java.util.Scanner;

public class Task_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int og_value = n;

		while (n != 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if (og_value == rev) {
			System.out.println("The given number is palindrome : " +og_value);
		} else {
			System.out.println("Not a Palindrome");
		}

	}

}
