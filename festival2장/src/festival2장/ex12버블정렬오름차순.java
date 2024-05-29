package festival2장;

import java.util.Scanner;

public class ex12버블정렬오름차순 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] B = new int[5];
		
		for (int i = 0; i < B.length; i++) {
			System.out.print((i+1)+"번째 수 입력: ");
			B[i] = scan.nextInt();
		}
		for (int i = 0; i < B.length; i++) {
			for (int j = i+1; j < B.length; j++) {
				if(B[i]>B[j]) {
					int temp = B[i];
					B[i] = B[j];
					B[j] = temp;
				}
			}
		}
		System.out.println("정렬 후");
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i]+"\t");
		}
		
		
		
		
		
	}

}
