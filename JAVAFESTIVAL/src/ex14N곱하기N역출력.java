import java.util.Scanner;

public class ex14N���ϱ�N����� {

	public static void main(String[] args) {
		// ���� N�� �Է¹޾� N * N �迭��
		// ������ ���� ���ڸ� �����ϰ� ����Ͻÿ�
		// 1 4 7
		// 2 5 8
		// 3 6 9
		Scanner scan = new Scanner(System.in);
		System.out.print("N�Է�>> ");
		int N = scan.nextInt();
		int[][] arr = new int[N][N];
		int num = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[j][i] = num;
				num++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
