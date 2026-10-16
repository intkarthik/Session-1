package packages;

public class Task_5 {
// sum of even numbers using for loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("The sum of even numbers:" + sum);
	}

}
