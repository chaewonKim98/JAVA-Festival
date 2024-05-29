package festival3장;

import java.util.Scanner;

public class ex01별찍기 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("행 개수: ");
//		int num = scan.nextInt();
//		
//		for(int i=1;i<=num; i++) {
//			for(int j=num; j>=i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		Scanner scan = new Scanner(System.in);
		System.out.print("행 개수: ");
		int N = scan.nextInt();
		
		for (int i = 1; i <=N; i++) {
			for (int j = N; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
