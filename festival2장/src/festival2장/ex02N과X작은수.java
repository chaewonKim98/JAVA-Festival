package festival2��;

import java.util.Scanner;

public class ex02N��X������ {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("N �Է�>> ");
//		int N = scan.nextInt();
//		System.out.print("X �Է�>> ");
//		int X = scan.nextInt();
//		int[] B = new int[N];
//		
//		
//		for(int i=0; i<N; i++) {
//			System.out.print(i+1+"��° ���� �Է�>> ");
//			B[i]= scan.nextInt();
//		}
//		System.out.print("���>> ");
//		for(int j=0; j<N; j++) {
//			if(B[j]<X) {
//				System.out.print(B[j]+" ");
//			}
//		}
		Scanner scan = new Scanner(System.in);
		System.out.print("N�Է�>> ");
		int N = scan.nextInt();
		System.out.print("X�Է�>> ");
		int X = scan.nextInt();
		int[] B = new int[N];
		int min = 0;
		for(int i=0; i<B.length; i++) {
			System.out.print(i+1+"��° ���� �Է�>> ");
			int num = scan.nextInt();
			B[i] = num;
		}
		System.out.print("���>> ");
		for (int i = 0; i < B.length; i++) {
			if(B[i]<X) {
				System.out.print(B[i]+" ");
			}
		}

		
		
		
		
		
		
	}

}
