package festival2��;

import java.util.Scanner;

public class ex06N���ϱ�N {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("N�Է�>> ");
		int N = scan.nextInt();
		int[][] B = new int[N][N];
		int num = 1;
		
		for (int i = 0; i < B.length; i++) {
			if(i%2==0) {
				for (int j = 0; j < B.length; j++) {
					B[i][j] = num;
					num++;
				}
			}else {
				for(int s = B.length-1; s>=0; s--) {
					B[i][s] = num;
					num++;
				}
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
