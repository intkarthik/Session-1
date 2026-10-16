package packages;

public class Task_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		last_digit();
		int n = 876;
		while (n > 9) {
			n = n / 10;
		}
		System.out.println(n);
	}
	
	public static void last_digit() {
		int n=987;
		for(;n!=0;) {
			n=n/10;
			break;
		}
		System.out.println(n);
	}

}
