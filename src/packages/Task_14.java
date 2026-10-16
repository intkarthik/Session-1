package packages;

import java.util.Scanner;

public class Task_14 {
// count of even numbers 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting number : ");
		int num = sc.nextInt();
		System.out.println("Enter the Ending number : ");
		int num1 = sc.nextInt();
		for (int i = num; i <= num1; i++) {
			if (i % 2 == 0) {
				count++;
			}
		}
		System.out.println("The count of even numbers : " + count);
	}

}
