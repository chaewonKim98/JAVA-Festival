import java.util.Scanner;

public class ex13N���ϱ�N {

	public static void main(String[] args) {
		// ���� N�� �Է¹޾�
		// N * N �迭�� ������ ���� ���ڸ� �����ϰ� ����Ͻÿ�

		Scanner scan = new Scanner(System.in);
		System.out.print("N�Է�>> ");
		int N = scan.nextInt();

		int[][] arr = new int[N][N];
		int sum = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sum;
				sum++;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
