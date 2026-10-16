package packages;

public class Task_21 {
// remove last digit logic 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 987;
		for (; n != 0;) {
			n = n / 10;
			break;
		}
		System.out.println(n);
	}

}
