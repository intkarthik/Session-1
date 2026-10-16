package Arrays;

import java.util.Scanner;

public class Max_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int arraysize = sc.nextInt();
		int[] value = new int[arraysize];
		int max = value[0];

		for (int i = 1; i < value.length; i++) {
			max=sc.nextInt();
			if (value[i] > max) {
				max = value[i];
			}
		}
		System.out.println("Largest value is : " +max);
	}

}
