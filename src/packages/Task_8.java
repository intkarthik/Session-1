package packages;

import java.util.Scanner;

public class Task_8 {
//check positive /negative/zero using for loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 3;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= count; i++) {
			System.out.println("Enter the number to check +ve or -ve : ");
			int num = sc.nextInt();
			if (num > 0) {
				System.out.println("The given is +ve number : " + num);
			} else if (num < 0) {
				System.out.println("The given is -ve number : " + num);
			} else {
				System.out.println("The given number is equals to zero ");
			}
		}
		count++;
	}

}
