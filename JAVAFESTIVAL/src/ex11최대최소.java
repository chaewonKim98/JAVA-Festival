import java.util.Random;

public class ex11�ִ��ּ� {

	public static void main(String[] args) {
		// 8ĭ ũ���� �迭�� �����ϰ� �������� �ʱ�ȭ �� ��
		// ���� ū ���� ���� ���� ���� ����Ͻÿ�
		Random rd = new Random();
		int[] arr = new int[8];
		int max = 0;
		int min = 100;
		System.out.print("�迭�� �ִ� ��� ��: ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
			if (max < arr[i]) {
				max = arr[i];
			} else if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("���� ū ��: " + max);
		System.out.println("���� ���� ��: " + min);
	}

}
