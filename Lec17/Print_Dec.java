package Lec17;

public class Print_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		print(n);

	}

	public static void print(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		print(n - 1);
		
	}

}
