package packages;

public class Task_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 4;
		int exp = 2;
		int pow = 1;
		for (int i = 1; i <= exp; i++) {
			pow = pow * base;
		}
		System.out.println(pow);
	}

}
