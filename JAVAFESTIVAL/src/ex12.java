import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		// ������ ���� ���α׷��� �ۼ��Ͻÿ�.
		// N�� X�� �Է� �޴´�.
		// N���� ������ �Է� �޴´�.
		// N���� ���� �� X���� ���� ���� ��� �Ѵ�.
		Scanner scan = new Scanner(System.in);
		System.out.print("N �Է� : ");
		int N = scan.nextInt();
		System.out.print("X �Է� : ");
		int X = scan.nextInt();

		// �Է�
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			System.out.print(i + 1 + "��° ���� �Է� >> ");
			arr[i] = scan.nextInt();
		}

		System.out.print("��� : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
