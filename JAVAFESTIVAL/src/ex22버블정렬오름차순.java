import java.util.Arrays;
import java.util.Scanner;

public class ex22�������Ŀ������� {

	public static void main(String[] args) {
		// �������ķ� ��������
		// �Է¹��� ������ �������ش�.
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5]; // 5���� ���� �����.
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "��° �� �Է�>> ");
			int num = scan.nextInt();
			arr[i] = num;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		for (int num : arr) {
			System.out.print(num + " ");
			// for each�� ����Ͻø� �˴ϴ簨���մϴ� �̤̤̤�
			// for(�迭 ���� ����(�ڷ���) ���� ���� : �迭��)
			// ���̽㿡�� for i in arr
			// ������ i�� ���� arr�� ���ҵ��� ������ �Ͱ� ���ٰ� ���ø� �ɰͰ����ϴ�
			// �����ؿ�ФФФФ�
		}

	}

}
