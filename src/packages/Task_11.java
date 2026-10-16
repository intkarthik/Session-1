package packages;

import java.util.Scanner;

public class Task_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		int product = 1, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		n = sc.nextInt();

		for (; n != 0;) {
			int rem = n % 10;
			product = product * rem;
			n = n / 10;
		}
		System.out.println(product);
		System.out.println(num / 10);
	}

}
