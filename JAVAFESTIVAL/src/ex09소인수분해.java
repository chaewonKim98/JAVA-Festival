import java.util.Scanner;

public class ex09���μ����� {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("���μ����� �� ���� �Է��ϼ��� : ");
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
		System.out.print("���μ� ���� �� ���� �Է��ϼ��� : ");
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
