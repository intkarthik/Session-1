package packages;

import java.util.Scanner;

public class Task_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		n=sc.nextInt();
		for (;n!=0;) {
				n = n / 10;
			count++;
		}
		System.out.println(count);
	}

}
