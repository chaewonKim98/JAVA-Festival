package festival2��;

import java.util.Scanner;

public class ex12�������Ŀ������� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] B = new int[5];
		
		for (int i = 0; i < B.length; i++) {
			System.out.print((i+1)+"��° �� �Է�: ");
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
		System.out.println("���� ��");
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i]+"\t");
		}
		
		
		
		
		
	}

}
