import java.util.Scanner;

public class ex08���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("n�Է�>> ");
		int N = scan.nextInt();
		int num = 1;
		for(int i=1; i<=N; i++) {
			System.out.print(num+" ");
			num+=i;
		}
		
		
	}

}
