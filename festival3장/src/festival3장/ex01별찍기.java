package festival3��;

import java.util.Scanner;

public class ex01����� {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("�� ����: ");
//		int num = scan.nextInt();
//		
//		for(int i=1;i<=num; i++) {
//			for(int j=num; j>=i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		Scanner scan = new Scanner(System.in);
		System.out.print("�� ����: ");
		int N = scan.nextInt();
		
		for (int i = 1; i <=N; i++) {
			for (int j = N; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
