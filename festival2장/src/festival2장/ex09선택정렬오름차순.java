package festival2��;

import java.util.Scanner;

public class ex09�������Ŀ������� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] B = new int[5];
		
		for (int i = 0; i < B.length; i++) {
			System.out.print(i+1+"��° �� �Է�: ");
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
		System.out.println("���� ��");
		for (int j = 0; j < B.length; j++) {
			System.out.print(B[j]+"\t");
		}
		
		
		
	}

}
