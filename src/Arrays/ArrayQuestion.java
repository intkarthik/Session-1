package Arrays;

import java.util.*;

public class ArrayQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int value = sc.nextInt();
		int[] obj = new int[value];

		for (int i = 0; i < obj.length; i++) {
			System.out.println("Enter the number : ");
			obj[i] = sc.nextInt();
		}
		int max = obj[0];
		for (int i = 1; i < obj.length; i++) {
			if (obj[i] > max)
				max = obj[i];
		}
		System.out.println("Largest Array is : " + max);
	}

}
