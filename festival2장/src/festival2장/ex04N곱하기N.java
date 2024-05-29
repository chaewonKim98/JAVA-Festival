package festival2장;

import java.util.Scanner;

public class ex04N곱하기N {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("N입력>> ");
		int N =  scan.nextInt();
		int[][] B = new int[N][N];
		int num = 1;
		
		for(int i=0; i<B.length; i++) {
			for (int j = 0; j < B.length; j++) {
				B[j][i] = num;
				num++;
			}
		}
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B.length; j++) {
				System.out.print(B[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
