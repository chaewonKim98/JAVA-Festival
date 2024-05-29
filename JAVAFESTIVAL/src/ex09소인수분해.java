import java.util.Scanner;

public class ex09소인수분해 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("소인수분해 할 수를 입력하세요 : ");
//		int N = scan.nextInt();
//		System.out.print(N+ " = ");
//		for (int i = 2; i <= N; i++) {
//            while (N % i == 0) {
//            	System.out.print(i+"*");
//                N = N/i;
//            	
//            }
//    }
		Scanner sc = new Scanner(System.in);
		System.out.print("소인수 분해 할 수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.print(num + " = ");

		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i);
				num /= i;
				i--;
				if (i < num) {
					System.out.print("*");
				} else {
					break;
				}
			}
		}

	}

}
