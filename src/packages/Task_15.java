package packages;

public class Task_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 10, end = 20;
		int count = 0;
		for (int i = start; i <= end; i++) {
			if (i % 2 != 0) {
				count++;
			}
		}
		System.out.println("The count of odd numbers : " + count);
	}

}
