
import java.util.Scanner;

public class ex19�������Ŀ������� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];

		for (int u = 0; u < arr.length; u++) {
			System.out.print(u + 1 + "��° �� �Է�>> ");
			int num = scan.nextInt();
			arr[u] = num;
		}
		for (int Z = 0; Z < arr.length; Z++) {
			int minIndex = Z;
			for (int i = Z + 1; i < arr.length; i++) {
				if (arr[minIndex] > arr[i]) {
					minIndex = i;
				}
				int temp = arr[Z];
				arr[Z] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		System.out.println("���� ��");
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
