package festival2��;

import java.util.Scanner;

public class ex04N���ϱ�N {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("N�Է�>> ");
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
