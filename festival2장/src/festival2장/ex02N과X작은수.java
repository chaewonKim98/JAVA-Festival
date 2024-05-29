package festival2장;

import java.util.Scanner;

public class ex02N과X작은수 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("N 입력>> ");
//		int N = scan.nextInt();
//		System.out.print("X 입력>> ");
//		int X = scan.nextInt();
//		int[] B = new int[N];
//		
//		
//		for(int i=0; i<N; i++) {
//			System.out.print(i+1+"번째 정수 입력>> ");
//			B[i]= scan.nextInt();
//		}
//		System.out.print("결과>> ");
//		for(int j=0; j<N; j++) {
//			if(B[j]<X) {
//				System.out.print(B[j]+" ");
//			}
//		}
		Scanner scan = new Scanner(System.in);
		System.out.print("N입력>> ");
		int N = scan.nextInt();
		System.out.print("X입력>> ");
		int X = scan.nextInt();
		int[] B = new int[N];
		int min = 0;
		for(int i=0; i<B.length; i++) {
			System.out.print(i+1+"번째 정수 입력>> ");
			int num = scan.nextInt();
			B[i] = num;
		}
		System.out.print("결과>> ");
		for (int i = 0; i < B.length; i++) {
			if(B[i]<X) {
				System.out.print(B[i]+" ");
			}
		}

		
		
		
		
		
		
	}

}
