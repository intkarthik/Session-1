package packages;

public class Task_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=921;
		int max=Integer.MAX_VALUE;
		
		while(n!=0) {
			int rem=n%10;
			
			if(rem<max) {
				max=rem;
			}
			n=n/10;
		}
		System.out.println(max);
	}

}
