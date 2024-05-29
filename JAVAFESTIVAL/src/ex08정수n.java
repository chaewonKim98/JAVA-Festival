import java.util.Scanner;

public class ex08정수n {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("n입력: ");
		int N = scan.nextInt();
		int sum = 1;
		for(int i=1; i<=N; i++) {
			System.out.print(sum+" ");
			sum+=i;
		}
		

	}

}
