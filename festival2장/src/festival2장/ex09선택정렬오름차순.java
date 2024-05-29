package festival2장;

import java.util.Scanner;

public class ex09선택정렬오름차순 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] B = new int[5];
		
		for (int i = 0; i < B.length; i++) {
			System.out.print(i+1+"번째 수 입력: ");
			B[i] = scan.nextInt();
		}		
		
		for(int Z=0; Z<B.length; Z++) {
			int minindex = Z;
			for(int i=Z+1; i<B.length; i++) {
				if(B[minindex]>B[i]) {
					minindex = i;
				}
				int temp = B[Z];
				B[Z] = B[minindex];
				B[minindex] = temp;
			}
		}
		System.out.println("정렬 후");
		for (int j = 0; j < B.length; j++) {
			System.out.print(B[j]+"\t");
		}
		
		
		
	}

}
