import java.util.Scanner;

public class ex10������ {

	public static void main(String[] args) {
		// ������

		Scanner scan = new Scanner(System.in);
//		System.out.print("�����Է�>> ");
//		int N = scan.nextInt(); // ���� �Է�
//		int[] B = new int[32]; // �迭 ����
//
//		int i = 0;
//		while (N != 1) { // �Է��� ���� 1�̾ƴ϶��
//			B[i++] = N % 2; // �迭 0���� 1�� �����ϸ鼭 �Է��� ���ڸ� 2�γ��� �������� �迭�� �ִ´�(B����
//			N = N / 2; // �Է��� ���� 2�� ���� ���� ������.
//		}
//		B[i] = N;
//		for (int j = i; j >= 0; --j) {
//			System.out.print(B[j] + " ");
//		}
		System.out.println("�����Է�>> ");
		int N = scan.nextInt();
		int [] B = new int[32];
		
		int i = 0;
		while(N != 1) {
			
				B[i++] = N%2;
				N /= 2;
		}
		B[i] = N;
		for(int j=i; j>=0; j--) {
			System.out.print(B[j]+" ");
		}
		
		
		
		
	}

}
