import java.util.Random;

public class ex17�ߺ����·ζǹ�ȣ {

	public static void main(String[] args) {

		int A[] = new int[6];
		Random rd = new Random();

		for (int i = 0; i < A.length; i++) {
			A[i] = rd.nextInt(99) + 1; // 1 ~ 99������ ����
			for (int j = 0; j < i; j++) {
				if (A[i] == A[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < A.length; i++) {
			System.out.println("����� ���� : " + A[i]);
		}

	}

}
