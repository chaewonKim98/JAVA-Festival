import java.util.Scanner;

public class ex07�������� {

	public static void main(String[] args) {

		// �ִ����� = ������%ū��
		// �ּҰ���� = �� �ڿ����� �� / �ִ�����
		// min = �ִ� �����
		// max = �ּ� �����
		Scanner scan = new Scanner(System.in);
		int max = 0, min = 0;
		System.out.print("���� 1�Է� : ");
		int num1 = scan.nextInt();
		System.out.print("���� 2�Է� : ");
		int num2 = scan.nextInt();
		for (int i = 2; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				min = i;
			}
		}

		max = num1 * num2 / min;

		System.out.println("�ִ� ����� : " + min);
		System.out.println("�ּ� ����� : " + max);

	}

}
